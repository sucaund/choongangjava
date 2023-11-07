package edu.java;

public class JavaVariable {
//static Member variable
static int si=1;
//non-static Member variable
//자동초기화
int nsi=1;

//static Member method
static int add (int i,int j) {
//	int i,int j :add메소드의 지역변수
	return i+j;}


//non-static Member method
int mul (int i,int j) {
	return i*j;}


class A{}
class B extends A{}
}
