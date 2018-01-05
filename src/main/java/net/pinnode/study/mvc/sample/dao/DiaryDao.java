package net.pinnode.study.mvc.sample.dao;

import java.util.List;

import net.pinnode.study.mvc.sample.dto.Diary;

public interface DiaryDao {

	public int selectTotalCount() throws Exception;

	public Diary read(int num) throws Exception;
	
	public void write(Diary diary) throws Exception;
	
	public void update(Diary diary) throws Exception;
	
	public void delete(Diary diary) throws Exception;
	
	public List<Diary> list()throws Exception;
}
