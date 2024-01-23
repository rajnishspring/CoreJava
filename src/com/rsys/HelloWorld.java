package com.rsys;

class HelloWorld {
    public static void main(String[] args) {
    //System.out.println("Hello, World!");
        String str = "plusminusdividemultiplyplusdivideplusminus";
        System.out.println(secondRep(str));
    }
    
    public static String secondRep(String str){
       int n= str.length();
       String result = "";
       String PLUS = "plus";
       String MINUS = "minus";
       String DIVIDE = "divide";
       String MULTIPLY = "multiply";
       
      // "plusminusdividemultiplyplusdivideplusminus";
        String res = "" ;
        for(int i=0; i<n; i++){
                res += str.charAt(i);
                //System.out.println(res);
                if(res.equals(PLUS)){
                    result += "+";
                    res = "";
                }
                else if(res.equals(MINUS)){
                    result += "-";
                    res = "";
                }
                else if(res.equals(DIVIDE)){
                    result += "/";
                    res = "";
                }
                else if(res.equals(MULTIPLY)){
                    result += "*";
                    res = "";
                }
        }
       return result;
    }
}
