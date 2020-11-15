package com.ta9.mymvc.service;

import com.ta9.mymvc.vo.BoardVO;

public interface BoardService {

	// 게시글 작성
	public void write(BoardVO boardVO) throws Exception;
	
}