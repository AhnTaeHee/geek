package net.pinnode.study.mvc.sample.dto;

public class Diary {

	private int num;           //글번호
	private String id;         //사용자id
	private String content;    //내용
	private String diary_date; //일기날짜
	private String write_date; //쓴날짜
	private String update_date;//수정날짜
	private String del_yn;     //삭제여부
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDiary_date() {
		return diary_date;
	}
	public void setDiary_date(String diary_date) {
		this.diary_date = diary_date;
	}
	public String getWrite_date() {
		return write_date;
	}
	public void setWrite_date(String write_date) {
		this.write_date = write_date;
	}
	public String getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}
	public String getDel_yn() {
		return del_yn;
	}
	public void setDel_yn(String del_yn) {
		this.del_yn = del_yn;
	}
}
