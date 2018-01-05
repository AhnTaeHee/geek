package net.pinnode.study.mvc.sample.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository //dao를 스프링에 인식시키기위해
public class ArticleDaoImpl implements ArticleDao {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int selectTotalCountt() throws Exception {
		
		return sqlSession.selectOne("article.selectTotalCount");
	}

}
