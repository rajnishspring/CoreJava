package org.clone;

public class Main {
public static void main(String[] args) throws CloneNotSupportedException {
	Parent p=new Parent(1,"ram");
	Object o=p.clone();
	Parent p1=(Parent)o;
	System.out.println(p.equals(p1));
	System.out.println(p==p1);
	System.out.println(p);
	System.out.println(p1);
	Child c=new Child(1,"kids new");
	
	Parent1 pp=new Parent1(12,"parent",c);
	System.out.println(pp);
	Parent1 pp1=(Parent1) pp.clone();
	pp1.getChild().setSchool("new Kids");
	System.out.println(pp);
	System.err.println(pp1);
}
}
