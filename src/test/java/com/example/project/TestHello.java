package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestHello {

   Hello t = new Hello();
	@Test
	public void testAdd() 
	{
		assertEquals(25, t.add(10, 15));
	}
}
