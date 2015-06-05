package kr.ac.jejunu;

public class Product {

	private String productImg;
	private String productName;
	private String productPrice;
	private String seller;
	
	public Product(String productImg, String productName, String productPrice, String seller) {
		super();
		this.productImg = productImg;
		this.productName = productName;
		this.productPrice = productPrice;
		this.seller = seller;
	}
	
	public String getProductImg() {
		return productImg;
	}
	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
}
