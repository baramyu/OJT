package com.ta9.mymvc.service;



import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ta9.mymvc.dao.BoardDAO;
import com.ta9.mymvc.vo.BoardVO;;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;
	
	// 게시글 작성
	@Override
	public void write(BoardVO boardVO) throws Exception {
		dao.write(boardVO);
	}

}