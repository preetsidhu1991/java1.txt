package Holman;

public class ArrayConcept {
    // these are one dimensional array.
	/* their are two disadvantages of these array.
	    1 size is fixed:- static array-- to overcome these problem we use collections--these are arraylist, hashtable.
	                                                                     this call dynamic array
	    2  it stores only similar data types. To overcome these disadvantages we use object array.*/
	public static void main(String[] args) {
		
		                          // array concept:- array are used to similar data types in an array variable.
		int i[]= new int[4];     //declaration of array. if their are n number of values in array the 
		 i[0]=10;                // lower bound will 0 and the upper bound will n-1
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[2]); // print the value of an array.
		        //find the length of an array.
		System.out.println(i.length);
// print all the values of an array:- use for loop
 //for(int q=0;q<i.length;q++);{
   
//System.out.println(i[q]);
 
	//System.out.println(i[4]);    arrayindexoutofboundexception
	//double array
	double d[] = new double[3];
		d[0]=22.33;
		d[1]=55.66;
		d[2]=77;
		
		System.out.println(d[1]);
		//char array
		char c []= new char[3];
		c[0]=2;
		c[1]='g';
		c[2]='h';
		System.out.println(c[1]);
		System.out.println(c.length); // how to print all the values of char array?
		//boolean array
		boolean b[]= new boolean[2];
		b[0]=true;
		b[1]=false;
		System.out.println(b[0]);
		System.out.println(b.length);
		// string array
		String s[]= new String[3];
		s[0]="test";
		s[1]="hello";
		s[2]="world";
		System.out.println(s[1]);
		// Object array:- to overcome the problem of similar data type values we use the object array
		// in object array we can store different data type values.
		// Object is a class so O will always capital.
		Object o[]= new Object[5];
		o[0]="harpreet";
		o[1]=27;
		o[2]=80.99;
		o[3]='f';
		o[4]="12/29/1990";
		System.out.println(o[1]);
		
	}
	

}
