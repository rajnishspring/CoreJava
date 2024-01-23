package com.rsys;

public class NonRepeating {
public static void main(String[] args) {
	//System.out.println("Hello, World!");
    String str = "sumitkumar";
    System.out.println(str.length());
    System.out.println(secondRep(str));
}

public static char secondRep(String str){
    char res=' ';
    int count =0;
    for(int i=0;i<str.length()-1;i++){
        res = str.charAt(i);
        boolean flag = true;
        for(int j=i+1;j<str.length();j++){
            if(str.charAt(j)==str.charAt(i)){
                flag = false;
                break;
            }
        }
        if(flag == true){
            count +=1;
            if (count == 2){
             res = str.charAt(i);
             break;
            }
        }
    }
    return res;
}
}
