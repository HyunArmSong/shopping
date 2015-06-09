package kr.ac.jejunu.model;

public class Product {

	private int boardNum;
	private String title;
	private int price;
	private String seller;
	private String content;
	private String imgUrl;

	public Product() {
		super();
	}

	public Product(int boardNum, String title, int price, String seller, String content, String imgUrl) {
		super();
		this.boardNum = boardNum;
		this.title = title;
		this.price = price;
		this.seller = seller;
		this.content = content;
		this.imgUrl = imgUrl;
	}

	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

}
