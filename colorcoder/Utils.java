package colorcoder;

// import java.util.ArrayList;
// import java.util.List;

public class Utils {
    public String toString() {
    	String colorsManual="";
    	
    	for(int num=1; num<26; num++) {
            String colorPairStr = Getters.GetColorFromPairNumber(num).ToString();
    		colorsManual += num +": "+ colorPairStr+"\n";
    	}
    	return colorsManual;
    }
    
    // public static List<Object> fromIndex(int index){
    //     List<Object> lstObject = new ArrayList<Object>();
    //     for(MajorColor color: MajorColor.values()) {
    //         if(color.getIndex() == index) {
    //             lstObject.add(color);
    //         }
    //     }
    //     for(MinorColor color: MinorColor.values()) {
    //         if(color.getIndex() == index) {
    //             lstObject.add(color);
    //         }
    //     }
    //     return lstObject;
    // }
}