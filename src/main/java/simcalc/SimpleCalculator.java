package simcalc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimpleCalculator {
	private int result=0;
	
	public void add(int x,int y){
	result = x+y;
	}
	public void sub(int x,int y){
		result = x-y;
		}

	
	public void mul(int x,int y){
		result = x*y;
	}

	public void div(int x,int y){

		if(y!=0)//�и� 0�ΰ�� 
		result = x/y;
	}
	public void inc(int x){
		result += x;
	}
	public void dnc(int x){
		result -= x;
	}
	public int getResult(){
		return result;
	}

}
