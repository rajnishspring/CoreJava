package com.rsys;

public class CountVowel {
public static void main(String[] args) {
	String str = "this Is a String ThaT Has VoWels iN iT. Can YOU count HOW many? Is the answer 50? I hOpe NOT.";
int count =0;
int count1 =0;
String a[]=str.split("");
for(String s:a)
{
	System.out.println(s);
	if(s.equalsIgnoreCase("a")||s.equalsIgnoreCase("e")||s.equalsIgnoreCase("i")||s.equalsIgnoreCase("o")||s.equalsIgnoreCase("u"))
count1++;

}
System.err.println(count1++);
	for(char c:str.toCharArray())
{
	if(c=='a'||c=='e'||c=='a'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
	{
		count++;
	}

}
	System.out.println(count);

}
}
