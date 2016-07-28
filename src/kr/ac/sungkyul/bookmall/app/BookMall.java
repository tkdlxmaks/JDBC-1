package kr.ac.sungkyul.bookmall.app;

import java.util.List;

import kr.ac.sungkyul.bookmall.dao.AuthorDao;
import kr.ac.sungkyul.bookmall.vo.AuthorVo;

public class BookMall {

	public static void main(String[] args) {
		testAuthorDaoGetList();
		
	}

	public static void testAuthorDaoGetList(){
		AuthorDao dao = new AuthorDao();
		List<AuthorVo> list = dao.getList();
		
		for( AuthorVo vo : list ) {
			System.out.println( vo );
		}
	}
}
