package book.di.vo;

import org.springframework.stereotype.Component;

@Component("book")
public class BookVO {
	private int seq;
	private String title;
	private String author;
	private String summary;
	private int page;
	
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
		this.summary = summary;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String print() {
		return "book print()";
	}

	@Override
	public String toString() {
		return "Books [seq=" + seq + ", title=" + title + ", author=" + author + ", summary=" + summary + ", page=" + page
				+ "]";
	}

	
}
