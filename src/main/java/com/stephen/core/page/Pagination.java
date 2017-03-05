package com.stephen.core.page;

import java.util.List;

public class Pagination extends SimplePage implements Paginable {

	public Pagination() {

	}

	public Pagination(int pageno, int pagesize, int totalcount, List<?> list) {
		super(pagesize, pageno, totalcount);
		this.list = list;
	}

	public int getFirstResult() {
		return (pageNo - 1) * pageSize;
	}

	private List<?> list;

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}
}
