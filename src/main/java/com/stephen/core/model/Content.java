package com.stephen.core.model;

import java.util.Date;

import com.stephen.core.model.base.BaseContent;

public class Content extends BaseContent {
	public String getTitle() {
		return getContentExt().getTitle();
	}

	public String getKeywords() {
		return getContentExt().getShortTitle();
	}

	public String getDescription() {
		return getContentExt().getDescription();
	}

	public String getEditDate() {
		return getContentExt().getReleaseDate().toString();
	}
	public String getAuthor(){
		return getContentExt().getAuthor();
	}
	public String getType(){
		return getTypeId().toString();
	}

}