package com.ludumdarejam.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestTest {

	@Test
	public void failer() {
		fail("Not yet implemented");
	}
	
	@Test
	public void passer() {
		
	}
	
	@Test
	public void error() {
		ArrayList<Object> list = null;
		list.add(new Object());
	}
}
