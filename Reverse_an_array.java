import java.util.Scanner;
public class Reverse_an_array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt(); 
        int[] a = new int[n];
        for(int i=0; i<a.length; i++){
            System.out.print("Enter the "+(i+1)+"th value of the array:");
            a[i] = sc.nextInt();
        }
        System.out.println("Before array reversed:");
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        int start = 0 , end = a.length-1;
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        System.out.println("After array reversed:");
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}