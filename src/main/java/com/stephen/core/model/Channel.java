package com.stephen.core.model;

import java.util.LinkedList;
import java.util.List;

import com.stephen.core.model.base.BaseChannel;
import static com.stephen.common.web.Constants.PROJ;

public class Channel extends BaseChannel {

	public List<Channel> getNodeList() {
		LinkedList<Channel> list = new LinkedList<Channel>();
		Channel node = this;
		while (node != null) {
			list.addFirst(node);
			node = node.getParent();
			System.out.println(node);
		}
		System.out.println("list size:"+list.size());
		return list;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return super.getChannelExt().getChannelName();
	}

	public String getUrl() {
		return PROJ + getChannelPath() + INDEX;
	}
}