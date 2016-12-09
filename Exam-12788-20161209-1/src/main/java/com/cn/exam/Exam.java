package com.cn.exam;
/**
 * 计算101~200的素数的个数
 * @author admin
 *
 */

public class Exam {
	 public static boolean yanzheng(int num) { 
		  for(int i = 2; i <= Math.sqrt(num); i++) {
		   if(num % i == 0) {
		    return false;
		   }
		  }
		  return true;
		 }
		 public static void main(String[] args) {
			  int count=0;
			  for(int j = 101; j <= 200; j++) {
				   if(Exam.yanzheng(j)) {
				    count++;
				   }
			  } 
			  System.out.print("素数个数为"+count+"个素数     ");
			  System.out.print("\n分别为：");
			  for(int j = 101; j <= 200; j++) {
				   if(Exam.yanzheng(j)) {
					   System.out.print(j+",");
				   }
			  }
		 }

	
}
	