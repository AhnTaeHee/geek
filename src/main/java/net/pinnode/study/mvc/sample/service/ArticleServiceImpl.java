package net.pinnode.study.mvc.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.pinnode.study.mvc.sample.dao.ArticleDao;

@Service
public class ArticleServiceImpl implements ArticleService {
	
	@Autowired
	private ArticleDao articleDao;

	@Override
	public int getTotalCount() throws Exception {
		
		return articleDao.selectTotalCount();
	}
}
