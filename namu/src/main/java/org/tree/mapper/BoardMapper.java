package org.tree.mapper;

import java.util.List;

import org.tree.domain.BoardVO;
import org.tree.domain.Criteria;

public interface BoardMapper {

	public List<BoardVO> getList();
	public List<BoardVO> getListWithPaging(Criteria cri);
	public void insert(BoardVO notice);
	public void insertSelectKey(BoardVO notice);
	public BoardVO read(Long bno);
	public int delete(Long bno);
	public int update(BoardVO notice);
	public int getTotalCount(Criteria cri);
	
}
