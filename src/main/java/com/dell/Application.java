package com.dell;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dell.entity.Book;
import com.dell.repo.BookRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		
	BookRepo bean =	ctxt.getBean(BookRepo.class);
		Book b = new Book();
	/*	b.setBookId(121);
		b.setBookName("hi java");
		b.setBookPrice(12345.0);
		bean.save(b);
		*/
		
		Optional<Book> findById = bean.findById(121);
		
		System.out.println(findById.get());
		
		
		System.out.println("Record Inserted..............");
	}

}
