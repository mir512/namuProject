package org.tree.service;

import java.util.List;

import org.tree.domain.Criteria;
import org.tree.domain.NoticeVO;

public interface NoticeService {
	
	public void register(NoticeVO notice);
	public NoticeVO get(Long n_code);
	public boolean modify(NoticeVO notice);
	public boolean remove(Long n_code);
	public List<NoticeVO> getList(Criteria cri);
	public int getTotal(Criteria cri);
	
}
