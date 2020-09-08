package com.training.jenkins.runner;

public class runners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = 1;
		for(int i=0;i<=10;i++) {
			if(i>0)
				ans = ans * i;
			System.out.println("Factorial of "+ i + " is " + ans+ "\n");
		}
	}

}
