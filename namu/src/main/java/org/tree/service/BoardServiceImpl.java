package org.tree.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.tree.domain.BoardVO;
import org.tree.domain.Criteria;
import org.tree.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	private BoardMapper mapper;

	@Override
	public void register(BoardVO board) {
		log.info("> board register....");
		mapper.insertSelectKey(board);
	}

	@Override
	public BoardVO get(Long b_code) {
		log.info("> board get....");
		return mapper.read(b_code);
	}

	@Override
	public boolean modify(BoardVO board) {
		log.info("> board modify....");
		return mapper.update(board) == 1;
	}

	@Override
	public boolean remove(Long b_code) {
		log.info("> board remove....");
		return mapper.delete(b_code) == 1;
	}

	@Override
	public List<BoardVO> getList(Criteria cri) {
		log.info("> board getList....");
		return mapper.getListWithPaging(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		log.info("> board getTotal....");
		return mapper.getTotalCount(cri);
	}

}
