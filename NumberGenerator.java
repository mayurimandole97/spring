package com.test.model;

public class NumberGenerator {
 Integer randomNumber;
 public Integer getNumber()
 {
	 return (int) (Math.random()* 100);
 }
}
