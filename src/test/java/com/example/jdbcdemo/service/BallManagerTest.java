package com.example.jdbcdemo.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.example.jdbcdemo.domain.Ball;

public class BallManagerTest {
	
	
	BallManagerJDBC ballManager = new BallManagerJDBC();
	
	private final static String NAME_1 = "Zenek";
	private final static int YEAROFPRODUCTION_1 = 1990;
	private final static double PRICE_1 = 120;
	
	@Test
	public void checkConnection(){
		assertNotNull(ballManager.getConnection());
	}
	
	@Test
	public void checkAdding(){
		
		Ball ball = new Ball(NAME_1, YEAROFPRODUCTION_1, PRICE_1);
		
		ballManager.clearBalls();
		assertEquals(1,ballManager.addBall(ball));
		
		List<Ball> balls = ballManager.getAllBalls();
		Ball ballRetrieved = balls.get(0);
		
		assertEquals(NAME_1, ballRetrieved.getName());
		assertEquals(YEAROFPRODUCTION_1, ballRetrieved.getYearOfProduction());
		
	}

}
