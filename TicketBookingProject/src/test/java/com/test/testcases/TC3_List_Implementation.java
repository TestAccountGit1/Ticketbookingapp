package com.test.testcases;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;

public class TC3_List_Implementation {
	
	@Test
	public void arrayListClass()
	{
		
		List<String> list1 = new ArrayList<String>();
		list1.add("Automation");
		list1.add("Testing");
		
		System.out.println(list1);	
		
	}
	
	
	public void linkedListClass()
	{
		List<String> list2 = new LinkedList<String>();
		
	}

}
