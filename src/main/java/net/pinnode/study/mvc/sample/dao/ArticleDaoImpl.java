package net.pinnode.study.mvc.sample.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleDaoImpl implements ArticleDao {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int selectTotalCount() throws Exception {
		
		return sqlSession.selectOne("article.selectTotalCount");
	}

}
