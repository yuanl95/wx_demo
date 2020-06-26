package com.liberary.demo.entity;

import java.util.Date;


/**新闻类
 * @author ly
 *
 */
public class News {
	//编号
	private Integer id;
	//新闻编号
	private Integer newsId;
	//新闻标题
	private String title;
	//新闻图片
	private String poster ;
	//新闻日期
	private Date addDate;
	//新闻内容
	private String content;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	
	public Date getAddDate() {
		return addDate;
	}
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getNewsId() {
		return newsId;
	}
	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}
	@Override
	public String toString() {
		return "News [id=" + id + ", newsId=" + newsId + ", title=" + title + ", poster=" + poster + ", addDate="
				+ addDate + ", content=" + content + "]";
	}


	
	                   
}
