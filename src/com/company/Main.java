package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static int solution(int[] A){
        int N=A.length;
        int result=0;
        Set<Integer> hashSet=new HashSet<>();
        for(int a :A){
            hashSet.add(a);
        }
        for(int i=1;i<=A.length;i++){
            if(!hashSet.contains(i)){
                result=i;
                break;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        int []A={1, 3, 6, 4, 1, 2};
        System.out.println("Missing Number is : "+solution(A));
    }


    /*
Missing Interger
Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
}
