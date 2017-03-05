package com.stephen.core.page;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class SimplePage implements Paginable {

	public SimplePage() {
		// TODO Auto-generated constructor stub
	}

	public SimplePage(int no,int size, int totalCount) {
		setPageNo(no);
		setPageSize(size);
		setTotalCount(totalCount);
		int tp = getTotalPage();
		if (getPageNo() > tp) {
			setPageNo(tp);
		}
	}

	@Override
	public int getTotalCount() {
		return totalCount;
	}

	@Override
	public int getTotalPage() {
		// TODO Auto-generated method stub
		int pagesum = getTotalCount() / getPageSize();
		if (getTotalCount() == 0 || getTotalCount() % getPageSize() != 0) {
			pagesum++;
		}
		return pagesum;
	}

	@Override
	public int getPageSize() {
		// TODO Auto-generated method stub
		return pageSize;
	}

	@Override
	public int getCurrentPage() {
		// TODO Auto-generated method stub
		return pageNo;
	}

	@Override
	public boolean isFirstPage() {
		// TODO Auto-generated method stub
		return getCurrentPage() <= 1;
	}

	@Override
	public boolean isLastPage() {
		// TODO Auto-generated method stub
		return getCurrentPage() >= getTotalPage();
	}

	@Override
	public int getPrePage() {
		// TODO Auto-generated method stub
		if (isFirstPage()) {
			return 1;
		}
		return getCurrentPage() - 1;
	}

	@Override
	public int getNextPage() {
		// TODO Auto-generated method stub
		if (isLastPage()) {
			return getCurrentPage();
		}
		return getCurrentPage() + 1;
	}

	protected int totalCount = 0;
	protected int pageSize = 5;
	protected int pageNo = 1;

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		if (pageNo < 1) {
			this.pageNo = 1;
		} else {
			this.pageNo = pageNo;
		}
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
}
