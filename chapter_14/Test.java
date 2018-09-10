package chapter_14;

public class Test {
	//Статични свойства на класа:
	private static double version=0.1;
	private static String vendor="Sun Microsystems";
	
	public static double getVersion() {
		return version;
	}
	public static void setVersion(double version) {
		Test.version = version;
	}
	public static String getVendor() {
		return vendor;
	}
	public static void setVendor(String vendor) {
		Test.vendor = vendor;
	}
	
	

}
