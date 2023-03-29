package com.dell.repo;

import org.springframework.data.repository.CrudRepository;

import com.dell.entity.Book;

public interface BookRepo extends CrudRepository<Book, Integer>{
	
	

}
