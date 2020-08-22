package org.tree.service;

import java.util.List;

import org.tree.domain.BoardVO;
import org.tree.domain.Criteria;

public interface BoardService {
	
	public void register(BoardVO board);
	public BoardVO get(Long b_code);
	public boolean modify(BoardVO board);
	public boolean remove(Long b_code);
	public List<BoardVO> getList(Criteria cri);
	public int getTotal(Criteria cri);
	
}
