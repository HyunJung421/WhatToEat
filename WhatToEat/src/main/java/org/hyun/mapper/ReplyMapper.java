package org.hyun.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.hyun.domain.Criteria;
import org.hyun.domain.ReplyVO;

public interface ReplyMapper {

	// 등록
	public int insert(ReplyVO vo);

	// 조회
	public ReplyVO read(Long rno);

	// 삭제
	public int delete(Long rno);

	// 수정
	public int update(ReplyVO reply);
	
	// 댓글 페이징
	public List<ReplyVO> getListWithPaging(
			@Param("cri") Criteria cri,
			@Param("bno") Long bno);
}
