package com.jobhub.board.service;

import java.util.List;
import java.util.Map;

import com.jobhub.board.dto.BoardDto;
import com.jobhub.board.dto.CommentDto;
import com.jobhub.personal.dto.PersonalMemberDto;

public interface BoardService {

	PersonalMemberDto personalMemberExist(String pId, String pPwd);
	
	List<BoardDto> boardSelectList(Map<String, Object> map);
	
//	public List<BoardDto> boardSelectList(int start, int end, int perNo);
	
	public int boardSelectTotalCount(Map<String, Object> map);
	
	public void boardInsertOne(BoardDto boardDto) throws Exception;
	
	public Map<String, Object> boardSelectOne(int no);
	
	public void boardUpdateOne(BoardDto boardDto);
	
	public int boardDeleteOne(int no);
	
	public void increaseViews(int no);
	
	public List<CommentDto> readReply(int bNo);
	
}
