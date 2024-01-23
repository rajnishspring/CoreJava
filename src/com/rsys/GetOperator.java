package com.rsys;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GetOperator {
public static void main(String[] args) {
	String s="plusmultiplyminusmultiplyplusminusdivideplusminusmultiplyplusdivideminusmultiplymultiplyDividePlusMiNusDiVidepLus";
System.err.println(s.substring(0,4));
int start=0;
int end=4;
String x="";
for(int i=0;i<s.length();)
{
if(s.substring(i,i+4).equalsIgnoreCase("plus"))
{
	x=x+"+";
	i=i+4;
	System.err.println(i);
	System.out.println(x);
}
else if(s.substring(i,i+4+1).equalsIgnoreCase("minus"))
{
	x=x+"-";
	i=i+4+1;
	System.out.println(i);
	System.out.println(x);
}
else if(s.substring(i,i+4+2).equalsIgnoreCase("divide"))
{
	x=x+"/";
	i=i+4+2;
	System.out.println(i);
	System.out.println(x);
}
else if(s.substring(i,i+4+4).equalsIgnoreCase("multiply"))
{
	x=x+"*";
	i=i+4+4;
	System.out.println(i);
	System.out.println(x);
}
}
System.err.println(x);

/*
 * for(String sd:st) { System.out.println(sd); }
 */


int ar[]= {1,2,2,5,4,5,5};
List l1=Arrays.asList(ar);
Set l=Arrays.asList(ar).stream().filter(i -> Collections.frequency(l1, i) > 1).collect(Collectors.toSet());
System.out.println(l);
//Arrays.stream(ar).distinct().forEach(nm->System.out.println(nm));;
/*for(int mss:ms)
	System.out.println(mss);
}*/
}}
