package com.ta9.mymvc.dao;

import com.ta9.mymvc.vo.BoardVO;

public interface BoardDAO {

	// 게시글 작성
	public void write(BoardVO boardVO) throws Exception;
}