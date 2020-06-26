package com.liberary.demo.service;

import java.util.List;

import com.liberary.demo.entity.News;

/**新闻类业务层接口
 * @author ly
 *
 */
public interface NewsService {
	
	/**获取新闻列表
	 * @return
	 */
	public List<News> getNewsList();
	

	/**根据newsId获取新闻信息
	 * @param newsId
	 * @return
	 */
	public News getNewsByNewsId(Integer newsId);
}
