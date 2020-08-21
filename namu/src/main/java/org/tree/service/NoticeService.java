package org.tree.service;

import java.util.List;

import org.tree.domain.Criteria;
import org.tree.domain.NoticeVO;

public interface NoticeService {
	
	public void register(NoticeVO notice);
	public NoticeVO get(Long bno);
	public boolean modify(NoticeVO notice);
	public boolean remove(Long bno);
	//public List<BoardVO> getList();
	public List<NoticeVO> getList(Criteria cri);
	// p 323 전체 데이터 개수 처리
	public int getTotal(Criteria cri);
	
}
