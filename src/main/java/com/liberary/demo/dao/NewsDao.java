package com.liberary.demo.dao;

import java.util.List;

import com.liberary.demo.entity.News;

/**与数据库相关的Dao层接口
 * @author ly
 *
 */
public interface NewsDao {
	
	/**获取新闻列表
	 * @return
	 */
	public List<News> getNewsList();
	
	/**获取编号为id的新闻信息
	 * @param id 编号
	 * @return
	 */
	public News getNewsById(Integer id);
	
	/**获取新闻编号为newsId的新闻信息
	 * @param newsId 新闻编号
	 * @return
	 */
	public News getNewsByNewsId(Integer newsId);
}
