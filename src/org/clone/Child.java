package org.clone;

public class Child implements Cloneable {

	private int age;
	private String school;
	public Child(int age, String school) {
		super();
		this.age = age;
		this.school = school;
	}
	@Override
	public String toString() {
		return "Child [age=" + age + ", school=" + school + "]";
	}
	public Child() {
		super();
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
