package Reservation.util.bean;

import java.io.Serializable;
import java.util.List;
//封装分页信息的bean
public class Page implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final int DEFAULT_PAGE_SIZE = 10;
	public static final int DEFAULT_PAGE_NUM = 0;

	private List<?> data;
	//总行数（数据库里面总共的行数）
	private int totalRow;
	//总共是多少页
	private int totalPage;
	private int pageNum;
	private int pageSize;
	//以下四个是构造方法1
	public Page(int totalRow) {
		this(totalRow, DEFAULT_PAGE_NUM);
	}
	//2
	public Page(int totalRow, int pageNum) {
		this(totalRow, pageNum, DEFAULT_PAGE_SIZE);
	}
	//3
	public Page(int totalRow, int pageNum, int pageSize) {
		this.totalPage = (totalRow%pageSize==0 ? totalRow/pageSize : totalRow/pageSize+1);
		this.pageNum = (pageNum == 0 ? 1 : pageNum);
		this.pageSize = pageSize;
		this.totalRow = totalRow;
	}
	//4
	public Page(int totalRow, int pageNum, int pageSize, List<?> data) {
		this.totalPage = (totalRow%pageSize==0 ? totalRow/pageSize : totalRow/pageSize+1);
		this.pageNum = (pageNum == 0 ? 1 : pageNum);
		this.pageSize = pageSize;
		this.totalRow = totalRow;
		this.data = data;
	}
	//根据页码计算下一次查找的起点（1*10+1）
	public static int countOffset(final int pageNum) {
		return DEFAULT_PAGE_SIZE * (pageNum-1);
	}
	//同上在制定Pagesize的情况下
	public static int countOffset(final int pageSize, final int pageNum) {
		return pageSize*(pageNum-1);
	}
    //访问器方法
	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}

	public int getTotalRow() {
		return totalRow;
	}

	public void setTotalRow(int totalRow) {
		this.totalRow = totalRow;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
