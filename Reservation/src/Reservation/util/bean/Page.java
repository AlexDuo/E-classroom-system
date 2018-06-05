package Reservation.util.bean;

import java.io.Serializable;
import java.util.List;
//��װ��ҳ��Ϣ��bean
public class Page implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final int DEFAULT_PAGE_SIZE = 10;
	public static final int DEFAULT_PAGE_NUM = 0;

	private List<?> data;
	//�����������ݿ������ܹ���������
	private int totalRow;
	//�ܹ��Ƕ���ҳ
	private int totalPage;
	private int pageNum;
	private int pageSize;
	//�����ĸ��ǹ��췽��1
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
	//����ҳ�������һ�β��ҵ���㣨1*10+1��
	public static int countOffset(final int pageNum) {
		return DEFAULT_PAGE_SIZE * (pageNum-1);
	}
	//ͬ�����ƶ�Pagesize�������
	public static int countOffset(final int pageSize, final int pageNum) {
		return pageSize*(pageNum-1);
	}
    //����������
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
