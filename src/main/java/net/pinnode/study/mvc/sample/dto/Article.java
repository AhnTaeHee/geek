package net.pinnode.study.mvc.sample.dto;

public class Article {

	private int articleNo;
	private String title;
	private String contents;
	private int view;
	private String insertDatetime;
	private String updateDatetime;
	
	// Join Data Member
	private int memberNo;
	private String memberName;
	
	public int getArticleNo() {
		return articleNo;
	}
	public void setArticleNo(int articleNo) {
		this.articleNo = articleNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	public String getInsertDatetime() {
		return insertDatetime;
	}
	public void setInsertDatetime(String insertDatetime) {
		this.insertDatetime = insertDatetime;
	}
	public String getUpdateDatetime() {
		return updateDatetime;
	}
	public void setUpdateDatetime(String updateDatetime) {
		this.updateDatetime = updateDatetime;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
}
