package com.allendowney.thinkdast;

import java.util.LinkedList;
import java.util.List;

public class ListClientExample {
	@SuppressWarnings("rawtypes")
	private List<Integer> list;

	@SuppressWarnings("rawtypes")
	public ListClientExample() {
		list = new LinkedList<>();
	}

	@SuppressWarnings("rawtypes")
	public List getList() {
		return list;
	}

	public static void main(String[] args) {
		ListClientExample lce = new ListClientExample();
		@SuppressWarnings("rawtypes")
		List<Integer> list = lce.getList();
		System.out.println(list);
	}
}
