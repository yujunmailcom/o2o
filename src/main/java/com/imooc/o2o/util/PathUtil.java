package com.imooc.o2o.util;

//import org.omg.CORBA.PRIVATE_MEMBER;
//import org.springframework.context.support.StaticApplicationContext;

public class PathUtil {
	private static String seperator = System.getProperty("file.separator");
	public static String getImageBasePath() {
		
		String os = System.getProperty("os.name");
		String bathPath = "";
		if(os.toLowerCase().startsWith("win")){
			bathPath = "D:/projectdev/image";
		} else{
			bathPath = "/home/yujun/image";
		}
		bathPath = bathPath.replace("/", seperator);
		return bathPath;
	}
	public static String getShopImagePath(long shopId) {
		String imagePath = "/upload/item/shop" + shopId + "/";
		return imagePath.replace("/", seperator);
	}
}
