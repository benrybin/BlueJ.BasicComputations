 


import java.math.*;
 

public class Factorial {

    public BigInteger factorialOf(Integer value){
       BigInteger ans = new BigInteger("1");
        
       
       //BigInteger value2 = value;
        for(int i =1;i <= value;i++){
            
            ans = ans.multiply(BigInteger.valueOf(i));
           
           
     
}
return ans;
}
}
