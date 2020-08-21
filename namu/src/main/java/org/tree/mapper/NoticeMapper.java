package org.tree.mapper;

import java.util.List;

import org.tree.domain.NoticeVO;
import org.tree.domain.Criteria;

public interface NoticeMapper {

	public List<NoticeVO> getList();
	public List<NoticeVO> getListWithPaging(Criteria cri);
	public void insert(NoticeVO notice);
	public void insertSelectKey(NoticeVO notice);
	public NoticeVO read(Long bno);
	public int delete(Long bno);
	public int update(NoticeVO notice);
	public int getTotalCount(Criteria cri);
	
}
