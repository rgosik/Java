package com.example.jdbcdemo.service;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.*;
import java.util.List;

import org.junit.Test;

import com.example.jdbcdemo.domain.Ball;

public class BallManagerTest {
	
	
	BallManagerJDBC ballManager = new BallManagerJDBC();
	
	private final static String NAME_1 = "Koszykowa";
	private final static int YEAROFPRODUCTION_1 = 1990;
	private final static double PRICE_1 = 60;
	
	private final static String NAME_2 = "Siatkowa";
	private final static int YEAROFPRODUCTION_2 = 1992;
	private final static double PRICE_2 = 50;
	
	private final static String NAME_3 = "Nozna";
	private final static int YEAROFPRODUCTION_3 = 1999;
	private final static double PRICE_3 = 40;
	
	private final static String NAME_4 = "Plazowa";
	private final static int YEAROFPRODUCTION_4 = 2003;
	private final static double PRICE_4 = 30;
	
	@Test
	public void checkConnection(){
		assertNotNull(ballManager.getConnection());
	}
	
	//@Test
	public void checkAdding(){
		
		Ball ball = new Ball(NAME_1, YEAROFPRODUCTION_1, PRICE_1);
		
		ballManager.clearBalls();
		assertEquals(1,ballManager.addBall(ball));
		
		List<Ball> balls = ballManager.getAllBalls();
		Ball ballRetrieved = balls.get(0);
		double epsilion = 1;
		assertEquals(NAME_1, ballRetrieved.getName());
		assertEquals(YEAROFPRODUCTION_1, ballRetrieved.getYearOfProduction());
		assertEquals(PRICE_1, ballRetrieved.getPrice(), epsilion);
	}
	@Test
	public void checkAddAll(){
		ballManager.clearBalls();
		
		Ball ball1 = new Ball(NAME_1, YEAROFPRODUCTION_1,PRICE_1);
		Ball ball2 = new Ball(NAME_2, YEAROFPRODUCTION_2,PRICE_2);
		Ball ball3 = new Ball(NAME_3, YEAROFPRODUCTION_3,PRICE_3);
		Ball ball4 = new Ball(NAME_4, YEAROFPRODUCTION_4,PRICE_4);
				
		List<Ball> balls = new ArrayList<>();
		balls.add(ball1);
		balls.add(ball2);
		balls.add(ball3);
		balls.add(ball4);
		
		ballManager.addAllBalls(balls);
		int size = ballManager.getAllBalls().size();
		System.out.println(ballManager.getAllBalls().get(3).getName());
		assertThat(size, either(is(4)).or(is(0)));
	}
}
