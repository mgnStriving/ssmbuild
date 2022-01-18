package com.mgn.service;

import com.mgn.dao.BookMapper;
import com.mgn.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class BookServiceImpl implements BookService{


	//service调dao层 组合Dao
	private BookMapper bookMapper;
	public void setBookMapper(BookMapper bookMapper) {
		this.bookMapper = bookMapper;
	}

	public int addBook(Books books) {
		return bookMapper.addBook(books);
	}

	public int deleteBookById(int id) {
		return bookMapper.deleteBookById(id);
	}

	public int updateBook(Books books) {
		return bookMapper.updateBook(books);
	}

	public Books queryBookById(int id) {
		return bookMapper.queryBookById(id);
	}

	public List<Books> queryAllBook() {
		return bookMapper.queryAllBook();
	}

	public Books queryBookByName(String bookName) {
		return bookMapper.queryBookByName(bookName);
	}
}
