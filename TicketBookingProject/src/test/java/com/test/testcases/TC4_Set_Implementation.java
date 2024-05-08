package com.test.testcases;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class TC4_Set_Implementation {
	
	public void hashSetClass() {
	Set<String> set1 = new HashSet<String>();
	

}


@Test
public void linkedHashSetClass() {
	
	Set<String> ls = new LinkedHashSet<String>();
	ls.add("test1");
	System.out.println(ls);
}}