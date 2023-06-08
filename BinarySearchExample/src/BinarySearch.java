import java.util.Scanner;

public class BinarySearch {

    public static int B_Search(int [] data, int guess, int start, int end){
        start = 0;
        end = data.length-1;
        int count = 0;
        while(start <= end){
         
            int mid = (start + end) /2;
            count ++;
            if(data[mid] == guess){
                System.out.println("I counted " + count + " times");
                return mid;
                
            }

            else if(data[mid] > guess){
                end = mid - 1;
            }

            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {

        System.out.print("Search here:");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        scanner.close();

        int [] data ={100, 200, 300, 400};

        for(int x:data){

            System.out.println(x);
        }
        int index = B_Search(data, guess, 0 ,data.length-1);

        if(index != -1){
            
            System.out.println("found at " + index);
        }
        else{
            System.out.println("not found");
        }
    }
}   
    

