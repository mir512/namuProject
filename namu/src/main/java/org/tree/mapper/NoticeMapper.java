package org.tree.mapper;

import java.util.List;

import org.tree.domain.NoticeVO;
import org.tree.domain.Criteria;

public interface NoticeMapper {

	public List<NoticeVO> getList();
	public List<NoticeVO> getListWithPaging(Criteria cri);
	public void insert(NoticeVO board);
	public void insertSelectKey(NoticeVO board);
	public NoticeVO read(Long bno);
	public int delete(Long bno);
	public int update(NoticeVO board);
	public int getTotalCount(Criteria cri);
	
}
