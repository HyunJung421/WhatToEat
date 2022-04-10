package org.hyun.service;

import java.util.List;

import org.hyun.domain.Criteria;
import org.hyun.domain.ReplyVO;

public interface ReplyService {
	
	// 등록
	public int register(ReplyVO vo);
	
	// 조회
	public ReplyVO get(Long rno);
	
	// 삭제
	public int remove(Long rno);
	
	// 수정
	public int modify(ReplyVO vo);
	
	// 댓글 페이징
	public List<ReplyVO> getList(Criteria cri, Long bno);
	
}
