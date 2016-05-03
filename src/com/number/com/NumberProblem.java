package com.number.com;

public class NumberProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     
		int k=3;
		int j=5;
		Boolean m=false;
		Boolean z=false;
		for(int i=0;i<=100;i++)
		{
			m=check(i,k);
			if(i%3 ==0 || m==true )
			{
				System.out.println(i+"Foo");
			}
			z=check(i,j);
			if(i%5==0|| z==true)
			{
				System.out.println(i+"bar");
			}
			m=false;
			z=false;
			
		}
		
		
		

	}
	
	
	
	public static Boolean check(int i,int num)
	{
		
		Integer u = new Integer(i);
		String s = u.toString();
		Integer numf=new Integer(num);
       String nn= numf.toString();
       if(s.contains(nn))
    	   return true;
       else 
    	   return false;
		
		
		
		
	}

}
