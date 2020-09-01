package colorcoder;

public class Main {
    public static void main(String[] args) {

        Utils utilsObj = new Utils();
        System.out.println(utilsObj.toString());

        Tests.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        Tests.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
    
        Tests.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        Tests.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
    }
}
