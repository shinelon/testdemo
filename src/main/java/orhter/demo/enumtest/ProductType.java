package orhter.demo.enumtest;
//package demo.enumtest;
//
//public enum ProductType{
//
//	lft(2, "t", "乐富通"), lfb(3, "b", "乐富宝"), zyt(4, "y", "掌易通");
//	
//	private final int productId_int;
//	private final String productId_String;
//	private final String name;
//
//	private ProductType(int productId_int, String productId_String, String name) {
//		this.productId_int = productId_int;
//		this.productId_String = productId_String;
//		this.name = name;
//	}
////	
//	public static int getIntIdByString(String StringId) {
//		for (ProductType pt : ProductType.values()) {
//			if (pt.getProductId_String().equals(StringId)) {
//				return pt.getProductId_int();
//			}
//		}
//		return Integer.parseInt(StringId);
//	}
//	
//	public int getProductId_int() {
//		return productId_int;
//	}
//
//	public String getProductId_String() {
//		return productId_String;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	@Override
//	public String toString() {
//		return String.format("%s_%s_%s", productId_int,productId_String,name) ;
//	}
//		　　
//}
