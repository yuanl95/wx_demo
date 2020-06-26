package com.liberary.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liberary.demo.dao.NewsDao;
import com.liberary.demo.entity.News;
import com.liberary.demo.service.NewsService;
/**新闻类的业务层实现类
 * @author ly
 *
 */
@Service
public class NewsServiceImpl implements NewsService {
	
	@Autowired
	private NewsDao newsDao;
	
	@Override
	public List<News> getNewsList() {
		// TODO Auto-generated method stub
		return newsDao.getNewsList();
	}

	@Override
	public News getNewsByNewsId(Integer newsId) {
		// TODO Auto-generated method stub
		return newsDao.getNewsByNewsId(newsId);
	}

}
