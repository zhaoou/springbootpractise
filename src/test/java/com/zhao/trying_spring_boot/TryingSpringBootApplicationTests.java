package com.zhao.trying_spring_boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zhao.trying_spring_boot.model.Quote;
import com.zhao.trying_spring_boot.persistense.QuoteRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TryingSpringBootApplicationTests {

	@Autowired
	QuoteRepository repo;
	
	@Test
	public void contextLoads() {
		Quote q = new Quote("this is spring boot", "Michael");
		
		System.out.println(q.getId());
		repo.save(q);
		System.out.println(q);
		System.out.println(q.getId());
	}

}
