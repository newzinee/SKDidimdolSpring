package book.di.dao;

import java.util.List;

import book.di.vo.BookVO;


public interface BookDao {
	public BookVO read(int seq);

	public List<BookVO> readAll();

	public void insert(BookVO book);

	public void update(BookVO book);

	public void delete(int seq);

}
