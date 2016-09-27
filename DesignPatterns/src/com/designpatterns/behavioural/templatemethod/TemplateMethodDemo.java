package com.designpatterns.behavioural.templatemethod;

public class TemplateMethodDemo {

	public static void main(String[] args) {
		Genralization algorithm = new Specialization();
		algorithm.solution();
	}
}
