package org.tree.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.tree.domain.Criteria;
import org.tree.domain.NoticeVO;
import org.tree.mapper.NoticeMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class NoticeServiceImpl implements NoticeService {
	
	private NoticeMapper mapper;

	@Override
	public void register(NoticeVO notice) {
		log.info("> notice register....");
		mapper.insertSelectKey(notice);
	}

	@Override
	public NoticeVO get(Long bno) {
		log.info("> notice get....");
		return mapper.read(bno);
	}

	@Override
	public boolean modify(NoticeVO notice) {
		log.info("> notice modify....");
		return mapper.update(notice) == 1;
	}

	@Override
	public boolean remove(Long bno) {
		log.info("> notice remove....");
		return mapper.delete(bno) == 1;
	}

	@Override
	public List<NoticeVO> getList(Criteria cri) {
		log.info("> notice getList....");
		return mapper.getListWithPaging(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		log.info("> notice getTotal....");
		return mapper.getTotalCount(cri);
	}

}
