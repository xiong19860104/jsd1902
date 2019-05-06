package jsd18091;

import jsd1809.Teacher;

public class Student  {
	public static void main(String[] args) {
		int x=10;
		int y=sum(x);
		System.out.println(y);
		//µ¥Àı
		
	}
	//10
	public static int sum(int x){
		if(x==1){
			return 1;     //sum(9)
		}
		int y=x+sum(x-1);//10+9+
		return y ;
	}
	
	

}
