package com.springioc.autowire.byConstructor.beans;

public class User {

	private Car car1;

	public User(Car car1) {
		this.car1 = car1;
	}

	public Car getCar1() {
		return car1;
	}

	public void setCar1(Car car1) {
		this.car1 = car1;
	}

}
