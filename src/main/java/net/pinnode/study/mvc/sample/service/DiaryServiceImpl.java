package net.pinnode.study.mvc.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.pinnode.study.mvc.sample.dao.DiaryDao;
import net.pinnode.study.mvc.sample.dto.Diary;

@Service("DiaryService")
public class DiaryServiceImpl implements DiaryService {
	
	@Autowired
	private DiaryDao diaryDao;

	@Override
	public int getTotalCount() throws Exception {
		
		return diaryDao.selectTotalCount();
	}

	@Override
	public Diary read(int num) throws Exception {
		// TODO Auto-generated method stub
		return diaryDao.read(num);
	}

	@Override
	public void write(Diary diary) throws Exception {
		// TODO Auto-generated method stub
		diaryDao.write(diary);
	}

	@Override
	public void update(Diary diary) throws Exception {
		// TODO Auto-generated method stub
		diaryDao.update(diary);
		
		
	}

	@Override
	public void delete(Diary diary) throws Exception {
		// TODO Auto-generated method stub
		diaryDao.delete(diary);
	}

	@Override
	public List<Diary> list() throws Exception {
		// TODO Auto-generated method stub
		return diaryDao.list();
	}
}
