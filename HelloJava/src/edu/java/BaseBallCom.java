package edu.java;

public class BaseBallCom {

	int com = (int) (Math.random() * 899+100);
	int com1 = com / 100;
	int com2 = com / 10 % 10;
	int com3 = com % 10;
	char[] coml = new char[3];

	BaseBallCom(int com1, int com2, int com3, char[] coml) {
		this.com1=com1;
		this.com2=com2;
		this.com3=com3;
		this.coml=coml;
	}



	boolean comcon(int com) {

		if (com1 == com2 || com1 == com3 || com2 == com3) {
			return false;
		}

		else {
			coml[0] = (char) com1;
			coml[1] = (char) com2;
			coml[2] = (char) com3;
			return true;
		}
	}
	
}
