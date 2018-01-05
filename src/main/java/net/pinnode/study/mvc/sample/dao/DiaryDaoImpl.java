package net.pinnode.study.mvc.sample.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.pinnode.study.mvc.sample.dto.Diary;

@Repository
public class DiaryDaoImpl implements DiaryDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int selectTotalCount() throws Exception {
		
		return sqlSession.selectOne("diary.selectTotalCount");
	}
	
	//글상세
	@Override
	public Diary read(int num) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("diary.read");
	}

	//글작성
	@Override
	public void write(Diary diary) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert("diary.write");
	}

	//글수정
	@Override
	public void update(Diary diary) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update("diary.update");
		
	}

	//글삭제
	@Override
	public void delete(Diary diary) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete("diary.delete");
		
	}

	@Override
	public List<Diary> list() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("diary.list");
	}
	
	//list
	
	
	

}
