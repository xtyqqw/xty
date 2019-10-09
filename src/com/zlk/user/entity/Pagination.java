package com.zlk.user.entity;
/**
 * 封装分页条件
 * 
 * */

import java.util.List;

public class Pagination {

	/**数据封装*/
	private List<?> list;
	/**当前页*/
	private Integer currentPage;
	/**每页显示条数*/
	private Integer pageSize;
	/**总条数*/
	private Integer totalCount;
	/**总页数*/
	private Integer totalPage;
	/**起始页*/
	private Integer startPage;



	/**如果有条件查询在依次类推添加属性(2-3)，超出的话建议继承某个公共类*/
	public List<?> getList() {
		return list;
	}
	public void setList(List<?> list) {
		this.list = list;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public Integer getStartPage() {
		return startPage;
	}

	public void setStartPage(Integer startPage) {
		this.startPage = startPage;
	}
	public Pagination(List<?> list, Integer currentPage, Integer pageSize, Integer totalCount, Integer totalPage) {
		this.list = list;
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.totalCount = totalCount;
		this.totalPage = totalPage;
	}
	public Pagination() {
	}
	
	
	
}
