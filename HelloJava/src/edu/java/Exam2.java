package edu.java;

public class Exam2 {
//	Q.2 1부터 1000까지의 홀수들의 합을 출력하는 Exam
	public static void main(String[] args) {
	int sum=0;
		for(int i =0 ; i<=1000;i++) {
			if(i%2==1) {
				sum +=i;
			}
		}
		System.out.println(sum);
	}
}
