package com.jobhub.board.service;

import java.util.List;
import java.util.Map;

import com.jobhub.board.dto.BoardDto;
import com.jobhub.personal.dto.PersonalMemberDto;

public interface BoardService {

	PersonalMemberDto personalMemberExist(String pId, String pPwd);
	
	List<BoardDto> boardSelectList();
	
	public void boardInsertOne(BoardDto boardDto) throws Exception;
	
	public Map<String, Object> boardSelectOne(int no);
}
