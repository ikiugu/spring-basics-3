package com.ikiugu.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Sadness all over!!!";
	}

}
