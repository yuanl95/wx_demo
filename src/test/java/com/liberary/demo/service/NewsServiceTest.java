package com.liberary.demo.service;


import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.liberary.demo.entity.News;
@RunWith(SpringRunner.class)
@SpringBootTest
class NewsServiceTest {
	private Logger log=LoggerFactory.getLogger(NewsServiceTest.class);
	@Autowired
	private NewsService newsService;
	@Test
	void testGetNewsList() {
		List<News>list=newsService.getNewsList();
		for (News news : list) {
			log.info("新闻{}",news);
		}
	}

	@Test
	void testGetNewsByNewsId() {
		Integer newsId=356412;
		News  news=newsService.getNewsByNewsId(newsId);
		log.info("{}",news);
	}

}
