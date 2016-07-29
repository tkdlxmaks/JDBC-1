package kr.ac.sungkyul.bookmall.dao.test;

import java.util.List;

import kr.ac.sungkyul.bookmall.dao.BookDao;
import kr.ac.sungkyul.bookmall.vo.BookVo;

public class BookDaoTest {

	public static void main(String[] args) {
		//testBookDaoInsert();
		testBookDaoGetList();
	}

	public static void testBookDaoGetList(){
		BookDao dao = new BookDao();
		List<BookVo> list = dao.getList();
		
		for( BookVo vo : list ) {
			System.out.println( vo );
		}		
	}

	public static void testBookDaoInsert(){
		BookDao dao = new BookDao();

		BookVo vo = new BookVo();
		vo.setTitle( "향연" );
		vo.setRate( 1 );
		vo.setAuthorNo( 1L );
		dao.insert(vo);
		
		vo = new BookVo();
		vo.setTitle( "맹자" );
		vo.setRate( 1 );
		vo.setAuthorNo( 3L );
		dao.insert(vo);		
	}
}
