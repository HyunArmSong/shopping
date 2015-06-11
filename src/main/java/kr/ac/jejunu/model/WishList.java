package kr.ac.jejunu.model;

public class WishList {
	private String userId;
	private int boardNum;

	public WishList() {
		super();
	}

	public WishList(String userId, int boardNum) {
		super();
		this.userId = userId;
		this.boardNum = boardNum;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

}
