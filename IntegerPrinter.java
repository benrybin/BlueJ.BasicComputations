 import java.lang.Math;


public class IntegerPrinter {

    public String printIntegerAsBinary(int value){
        String ans = Integer.toBinaryString(value);
        return ans; 
    }

    public String printIntegerAsOctal(int value){
        
        String ansOctal = Integer.toOctalString(value);
        return ansOctal;
    }

    public String printIntegerAsHexadecimal(int value){
        String ansHex = Integer.toHexString(value);
        return ansHex;
    }

    public static void main(String[] args){

    }
}
