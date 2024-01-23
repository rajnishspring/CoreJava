package com.hash;

public class WithOutHashCode {
private int a=20;
private String b;
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public String getB() {
	return b;
}
public void setB(String b) {
	this.b = b;
}
@Override
public String toString() {
	return "WithOutHashCode [a=" + a + ", b=" + b + "]";
}

}
