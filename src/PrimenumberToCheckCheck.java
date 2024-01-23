public class PrimenumberToCheckCheck {
 
 public static void main(String[] args) {
  int remainder;
  boolean isPrime=true;
  int numberToCheck=17; // Enter the numberToCheckber you want to check for prime
        
  for(int i=2;i<=numberToCheck/2;i++)
  {
            
     if(numberToCheck%i==0)
     {
        isPrime=false;
        break;
     }
  }
  if(isPrime)
     System.out.println(numberToCheck + " is a Prime numberToCheckber");
  else
     System.out.println(numberToCheck + " is not a Prime numberToCheckber");
    }
  }
