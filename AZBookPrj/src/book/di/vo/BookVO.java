package book.di.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

//@Component("book")
public class BookVO {
	private int seq;
	private String title;
	private String author;
	private String summary;
	private int page;
	private Date createTime;
	
	public BookVO() {
	}
		
	public BookVO(String title, String author, String summary, int page) {
		super();
		this.title = title;
		this.author = author;
		this.summary = summary;
		this.page = page;
	}

	public BookVO(int seq, String title, String author, String summary, int page) {
		super();
		this.seq = seq;
		this.title = title;
		this.author = author;
		this.summary = summary;
		this.page = page;
	}



	public BookVO(String title, String author, String summary, int page, Date createTime) {
		super();
		this.title = title;
		this.author = author;
		this.summary = summary;
		this.page = page;
		this.createTime = createTime;
	}



	public BookVO(int seq, String title, String author, String summary, int page, Date createTime) {
		super();
		this.seq = seq;
		this.title = title;
		this.author = author;
		this.summary = summary;
		this.page = page;
		this.createTime = createTime;
	}



	public int getSeq() {
		return seq;
	}



	public void setSeq(int seq) {
		this.seq = seq;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public String getSummary() {
		return summary;
	}



	public void setSummary(String summary) {
		if(summary != null){
			this.summary = summary;
		}else {
			this.summary = "";
		}
		
	}



	public int getPage() {
		return page;
	}



	public void setPage(int page) {
		this.page = page;
	}



	public Date getCreateTime() {
		return createTime;
	}



	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}



	public String print() {
		return "book print()";
	}



	@Override
	public String toString() {
		return "BookVO [seq=" + seq + ", title=" + title + ", author=" + author + ", summary=" + summary + ", page="
				+ page + ", createTime=" + createTime + "]";
	}


	
}
