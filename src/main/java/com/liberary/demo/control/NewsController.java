package com.liberary.demo.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liberary.demo.dto.ResultSetOfError;
import com.liberary.demo.entity.News;
import com.liberary.demo.service.NewsService;
import com.liberary.demo.utils.ResultUtil;

/**微信小程序实际使用的后端控制层
 * @author ly
 *
 */
@Controller
@RequestMapping("/news")
public class NewsController {
	@Autowired
	private NewsService newsService;
	
	/**
	 * @param model
	 * @param pageNum 当前欲前往的页数
	 * @param pageSize 每页设置的数据条目
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@ResponseBody
	@RequestMapping(value="/getNewsList",method=RequestMethod.GET)
	public ResultSetOfError<News> getNewsList(Model model,
			@RequestParam(defaultValue = "1") Integer pageNum,
			@RequestParam(defaultValue = "2") Integer pageSize){
		//分页查询,startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
		PageHelper.startPage(pageNum, pageSize);
		List<News>news=newsService.getNewsList();
		PageInfo<News> pageInfo = new PageInfo<News>(news,pageSize);
		model.addAttribute("pageInfo", pageInfo);
		 //获得当前页
	    model.addAttribute("pageNum", pageInfo.getPageNum());
	    //获得一页显示的条数
	    model.addAttribute("pageSize", pageInfo.getPageSize());
	    //是否是第一页
	    model.addAttribute("isFirstPage", pageInfo.isIsFirstPage());
	    //获得总页数
	    model.addAttribute("totalPages", pageInfo.getPages());
	    //是否是最后一页
	    model.addAttribute("isLastPage", pageInfo.isIsLastPage());
	    return ResultUtil.success(model);
	}
	
	/**根据id查询对应的新闻表信息
	 * @param id 要查询的新闻id号码
	 * @return JSON类型的指定新闻id的新闻表信息
	 */
	@SuppressWarnings("unchecked")
	@ResponseBody
	@RequestMapping(value="/getNewsByNewsId",method=RequestMethod.GET)
	public ResultSetOfError<News> getNewsByNewsId(@RequestParam("newsId")Integer newsId){
		News news=newsService.getNewsByNewsId(newsId);
		return ResultUtil.success(news);
	}
}
