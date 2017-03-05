package com.stephen.core.page;

public interface Paginable {

	public int getTotalCount();

	public int getTotalPage();

	public int getPageSize();

	public int getCurrentPage();

	public boolean isFirstPage();

	public boolean isLastPage();

	public int getPrePage();

	public int getNextPage();
}
