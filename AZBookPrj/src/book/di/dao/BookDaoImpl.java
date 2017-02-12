package book.di.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import book.di.vo.BookVO;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {

	@Autowired
	SqlSession session;
	
	@Override
	public BookVO read(int seq) {
		BookVO book = session.selectOne("bookNS.selectBookByseq", seq);
		return book;
	}

	@Override
	public List<BookVO> readAll() {
		List<BookVO> bookList = session.selectList("selectBooks");
		return bookList;
	}

	@Override
	public void insert(BookVO book) {
		int insertRecordCnt = session.insert("insertBook", book);
		System.out.println("삽입된 수: "+insertRecordCnt);
	}

	@Override
	public void update(BookVO book) {
		int updateRecordCnt = session.update("updateBookByseq", book);
		System.out.println("수정된 수: " + updateRecordCnt);
	}

	@Override
	public void delete(int seq) {
		int deleteRecordCnt = session.delete("deleteBookByseq", seq);
		System.out.println("삭제된 수: " + deleteRecordCnt);
	}
	
}
