import java.util.*;

//You will be given an array of numbers.
// You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.


public class Program {
    public static void main(String[] args) {
        int[] array = {3,4,1,99,31,53,64,12,32,7,15};
        ArrayList<Integer> odd = new ArrayList<>();
        int n=array.length;
        for(int i=0;i<n;i++){
            if(array[i]%2==1){
                odd.add(array[i]);
            }
        }
        int j=0;
        Collections.sort(odd);
        for(int i=0;i<n;i++){
            if(array[i]%2==1){
                array[i]=odd.get(j);
                j++;
            }
        }

        for (int print : array){
            System.out.println(print);
        }

    }
}