package com.sufow.util.compute;

public class ComputeUtils {

	public int  getAndValue(int parama,int paramb){
		return  (parama & paramb);
	}
	
	public int  getOrValue(int parama,int paramb){
		return  (parama | paramb);
	}
	
	public static void main(String[] args) {
		System.out.println(new ComputeUtils().getAndValue(2, 4));
		System.out.println(new ComputeUtils().getOrValue(2, 1));
	}
}
