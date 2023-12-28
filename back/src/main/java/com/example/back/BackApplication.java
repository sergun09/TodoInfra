package com.example.back;

import com.example.back.dao.PostRepository;
import com.example.back.exception.ChampNullException;
import com.example.back.exception.ChampVideException;
import com.example.back.modele.Post;
import com.example.back.service.PostService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.SpringVersion;

import java.util.Collection;
import java.util.logging.Logger;

@SpringBootApplication
public class BackApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackApplication.class, args);
	}

	@Bean
	public CommandLineRunner seedData(PostService postService, PostRepository postRepository)
	{
		return (args ->
		{
			if (postRepository.count() == 0)
			{
				try {
					postService.addPost("Description 1", "Autheur 1");
					postService.addPost("Description 2", "Autheur Jean-Michel");
					postService.addPost("Description 3", "Autheur Patrick");

					postService.getAllPosts().forEach(System.out::println);


				} catch (ChampNullException | ChampVideException e) {
					throw new RuntimeException(e);
				}

			}
        });
	}

}