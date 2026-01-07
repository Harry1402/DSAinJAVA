import java.util.*;

public class Maz1 {

    static int maxConsetutiveOne(int[] arr ,int N){
        int one = 0;
        int one_and_zero =0 ;
        int ret = 0;

        for(int num : arr ){
            if(num == 1){
                one++;
                one_and_zero++;
            }
            else{
                one_and_zero=one+1;
                one = 0;
            }
            ret =Math.max(one_and_zero, ret);
            ret=MAth.m
        }
        return ret ;

    }

    public static void main(String[] args) {
        int [] arr ={ 1,0,0,1,1,0,1};
        int N = arr.length;
        System.out.println(maxConsetutiveOne(arr, N));


        
        
    }
    
}
