 
import java.lang.Math;

public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        Integer ans = 0;
        if (integers[0] > integers[1] && integers[0] > integers[2]){
            ans = integers[0];
        }else if (integers[0] < integers[1] && integers[1] > integers[2]){
            ans = integers[1];
        }else{
            ans = integers[2];
        }
        return ans;
}

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int test1;
        int test2;
        int ans;
        test1 = Math.max(integers[0],integers[1]);
        test2 = Math.max(integers[1],integers[2]);
        if(test1 > test2){
            ans = test1;
    }else{
        ans = test2;
}
return ans;
}
}
