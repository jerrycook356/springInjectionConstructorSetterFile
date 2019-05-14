package com.cookjerry.springTry;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	
	public static void main(String[] args) {
		Coach theCoach;
		//crate spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from container
		theCoach = context.getBean("myBaseballCoach",BaseballCoach.class);
		//use methods on bean
		System.out.println("workout is "+theCoach.getDailyWorkout());
		System.out.println("fortune is "+theCoach.getDailyFortune());
		//close context
		
		
		System.out.println();
		System.out.println("track coach uses setter injection");
		Coach trackCoach;
		//get bean from container
		trackCoach = context.getBean("myTrackCoach",TrackCoach.class);
		//use methods on bean
		System.out.println("workout from track coach = "+trackCoach.getDailyWorkout());
		System.out.println("fortune from track coach = "+trackCoach.getDailyFortune());
		
		
		System.out.println();
		System.out.println("Cricket coach uses setter injection and literal injection of values");
		Coach cricketCoach;
		//get bean from container
		cricketCoach = context.getBean("myCricketCoach",CricketCoach.class);
		//use methods on bean
		System.out.println("cricket = "+cricketCoach.getDailyWorkout());
		System.out.println("cricket = "+cricketCoach.getDailyFortune());
		
		//using literal injection
		System.out.println("email = "+cricketCoach.getEmailAddress());
		System.out.println("team name = "+cricketCoach.getTeam());
		
		System.out.println();
		System.out.println("Football coach uses setter injection for fortune and file for email and team name");
		Coach footballCoach;
		//get bean from container
		footballCoach = context.getBean("myFootballCoach",FootballCoach.class);
		System.out.println("football coach workout = "+footballCoach.getDailyWorkout());
		System.out.println("football coach fortune = "+footballCoach.getDailyFortune());
		System.out.println("football coach email = "+footballCoach.getEmailAddress());
		System.out.println("football coach team name = "+footballCoach.getTeam());
		context.close();
		
	}

}
