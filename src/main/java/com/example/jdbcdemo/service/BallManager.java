package com.example.jdbcdemo.service;

import java.util.List;

import com.example.jdbcdemo.domain.Ball;

public interface BallManager {
	
	public int addBall(Ball ball);
	public List<Ball> getAllBalls();

}
