package com.nuri.vo;

public class ExamVO {

	public String ori_title;
	public String title;
	public String contents;
	
	public ExamVO() {}

	public ExamVO(String title, String contents) {
		this.title = title;
		this.contents = contents;
	}
	
	public ExamVO(String ori_title, String title, String contents) {
		super();
		this.ori_title = ori_title;
		this.title = title;
		this.contents = contents;
	}

	public String getOri_title() {
		return ori_title;
	}

	public void setOri_title(String ori_title) {
		this.ori_title = ori_title;
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
	
}
