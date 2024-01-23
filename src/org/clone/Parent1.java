package org.clone;


import java.util.Objects;

public class Parent1 implements Cloneable {
	private int id;
	private String name;
	private Child child;
	public Parent1(int id, String name, Child child) {
		super();
		this.id = id;
		this.name = name;
		this.child = child;
	}
	public Parent1() {
		super();
	}
	@Override
	public String toString() {
		return "Parent1 [id=" + id + ", name=" + name + ", child=" + child + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	/*	Parent1 p=(Parent1)super.clone();
		Child cc=(Child) child.clone();
		p.setChild(cc);
		return p;*/
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Child getChild() {
		return child;
	}
	public void setChild(Child child) {
		this.child = child;
	}
	
}

