package com.feicui.model;
/**
 * ��ҳ��ʵ��
 * @author Administrator
 *
 */
public class PageBean {
	//ÿҳ����ʾ�ļ�¼�� 
	private Integer pageSize;
	//��ʾ��ҳ��
	private Integer page;
	//�ܼ�¼��
	private Integer count;
	
	//ƫ����
	private Integer pageNum;
	
	//��ҳ��
	private Integer pageCount;
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		System.out.println(page);
		System.out.println(page == null || page < 1);
		if(page == null || page < 1){
			this.page = 1;
		}else if(page > pageCount){
			this.page = pageCount;
		}else{
			this.page = page;
		}
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	//��ҳ��
	public void setPageCount() {
		//��ҳ�� = �ܼ�¼�� / ÿҳ��ʾ�ļ�¼��
		if(count % pageSize == 0){
			pageCount = count / pageSize;
		}else{
			pageCount = count / pageSize + 1;
		}
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum() {
		pageNum = (page - 1) * pageSize;
	}
	
	public PageBean() {
	}
	/**
	 * 
	 * @param pageSize			ÿҳ��ʾ�ļ�¼��
	 * @param page				��ʾ��ҳ��
	 * @param count				�ܼ�¼��
	 */
	public PageBean(Integer pageSize,Integer page,Integer count) {
		this.pageSize = pageSize;
		this.count = count;
		//��ҳ��
		setPageCount();
		//ҳ��
		setPage(page);
		//
		setPageNum();
	}
	
	
	
	
	

}
