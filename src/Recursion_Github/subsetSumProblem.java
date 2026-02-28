package Recursion_Github;

public class subsetSumProblem {
    public static void main(String[] args) {
    int  arr[] = {3, 34, 4, 12, 5, 2};
    int sum = 9;
    System.out.println("count : "+subset(arr,sum,0));
    }
        static int subset(int arr[],int sum, int counter)
        {
            if(sum == 0)
            {
                return 1;
            }
            if(counter == arr.length )
            {
                return 0;
            }
            return(subset(arr,sum-arr[counter],counter+1)+subset(arr,sum,counter+1));
        }
    }