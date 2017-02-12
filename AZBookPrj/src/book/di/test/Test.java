package book.di.test;


import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Ignore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import book.di.dao.BookDao;
import book.di.vo.BookVO;

public class Test {
	//bean container 역할
	ApplicationContext context;
	Calendar cal;
	
	@Before
	public void init() {
		context = new GenericXmlApplicationContext("config/beans.xml");
		cal = Calendar.getInstance();
	}
	
	@org.junit.Test 
	public void dao() {
		BookDao dao = context.getBean("bookDao", BookDao.class);
//		BookVO book = dao.read(1);
//		System.out.println(book);
		
		//select all
		List<BookVO> bookList;
//		bookList = dao.readAll();
//		System.out.println(bookList);
		
//		dao.insert(new BookVO("조선왕조실록", "설민석", "역사를 공부하자", 100, new Date(cal.getTimeInMillis())));
//		dao.insert(new BookVO("미움받을 용기", "기시미이치로", "힘내자 청춘아", 336, new Date(cal.getTimeInMillis())));
//		dao.insert(new BookVO("미움받을 용기2", "기시미이치로", "힘내자 청춘아", 336, new Date(cal.getTimeInMillis())));
//		List<BookVO> bookList = dao.readAll();
//		System.out.println(bookList);

		dao.update(new BookVO(15, "gigigi", "유진", "얄야얄", 50));
		bookList = dao.readAll();
		System.out.println(bookList);

//		dao.delete(5);
//		bookList = dao.readAll();
//		System.out.println(bookList);
		
	}
	
	@org.junit.Test @Ignore
	public void sql() {
		SqlSession session = context.getBean("sqlSession", SqlSession.class);
		
		//select
//		BookVO book = session.selectOne("bookNS.selectBookByseq", 2);
//		System.out.println(book);
//		List<BookVO> list = session.selectList("bookNS.selectBooks");
//		for (BookVO books : list) {
//			System.out.println(books);
//		}
		
		//insert
//		Calendar cal = Calendar.getInstance();
//		cal.add(Calendar.YEAR, 1);
//		int result = session.insert("bookNS.insertBook",
//				new BookVO("조선왕조실록", "설민석", "역사를 공부하자", 100, new Date(cal.getTimeInMillis())));
//		System.out.println(result);
//		List<BookVO> list = session.selectList("bookNS.selectBooks");
//		for (BookVO books : list) {
//			System.out.println(books);
//		}
		
//		int result = session.update("bookNS.updateBookByseq", 
//				new BookVO(3, "유유", "ii", "역사를 공부하자", 10));
//		System.out.println(result);
//		List<BookVO> list = session.selectList("bookNS.selectBooks");
//		for (BookVO books : list) {
//			System.out.println(books);
//		}
	}
	
	@org.junit.Test @Ignore
	public void mybatis() {
		System.out.println(context.getBean("sqlSessionFactory").getClass().getName());
		System.out.println(context.getBean("sqlSession").getClass().getName());
	}
	
	@org.junit.Test @Ignore
	public void book() {
		BookVO book = context.getBean("book", BookVO.class);
		System.out.println(book.print());
	}
	
	@org.junit.Test @Ignore
	public void db() {
		DataSource ds = context.getBean("dataSource", DataSource.class);
		try {
			System.out.println(ds.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
