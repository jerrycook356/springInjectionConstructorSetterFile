package com.cookjerry.springTry;

public class HappyFortuneService implements FortuneService {

	private String[] fortunes = {"you are going to have a great day",
			"today you will be lucky","today you will get money"};
	
	
	@Override
	public String getFortune() {
		double x = (int)(Math.random()*(1-fortunes.length-1)+1)+1;
		return fortunes[(int)x];
	}

}
