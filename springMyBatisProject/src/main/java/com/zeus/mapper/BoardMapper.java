package com.zeus.mapper;

import java.util.List;

import com.zeus.domain.Board;

public interface BoardMapper {
	public int create(Board Board) throws Exception;
	public Board read(Board Board) throws Exception;
	public int update(Board board) throws Exception;
	public int delete(Board Board) throws Exception;
	public List<Board> list() throws Exception;
	public List<Board> boardSearch(Board board) throws Exception;
	
}
