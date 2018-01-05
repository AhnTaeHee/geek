package net.pinnode.study.mvc.sample.service;

import java.util.List;

import net.pinnode.study.mvc.sample.dto.Diary;

public interface DiaryService {

	//개수
	public int getTotalCount() throws Exception;
	//상세보기
	public Diary read(int num)throws Exception;
	//작성
	public void write(Diary diary)throws Exception;
	//수정
	public void update(Diary diary)throws Exception;
	//삭제
	public void delete(Diary diary)throws Exception;
	
	public List<Diary> list()throws Exception;
}
