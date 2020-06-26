package com.liberary.demo.dao;


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
class NewsDaoTest {
	private Logger log=LoggerFactory.getLogger(NewsDaoTest.class);
	@Autowired
	private NewsDao newsDao; 
	@Test
	void testGetNewsList() {
		List<News>list=newsDao.getNewsList();
		for (News news : list) {
			log.info("{}",news);
		}
	}

	@Test
	void testGetNewsById() {
		Integer id=1;
		News news=newsDao.getNewsById(id);
		log.info("新闻{}",news);
	}

	@Test
	void testGetNewsByNewsId() {
		Integer newsId=356412;
		News news=newsDao.getNewsByNewsId(newsId);
		log.info("新闻{}",news);
	}

}
