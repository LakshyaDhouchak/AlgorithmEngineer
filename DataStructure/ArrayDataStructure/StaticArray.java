package ArrayDataStructure;

import java.util.Scanner;
public class StaticArray {
    // calling the Scanner
    Scanner input = new Scanner(System.in);

    // define the properties
    int size;
    int[] arr;
    int index;

    // calling the Constructor
    public StaticArray(){
        size = 5;
        arr = new int[size];
        index = -1;
    }

    // define the IsEmpty() methord
    public void IsEmpty(){
        if(index == -1){
            System.out.println("The array is Empty");
        }
        else{
            System.out.println("The array is not Empty");
        }
    }

    // define the Display() methord
    public void Display(){
        System.out.println("The element present in an array is:");
        for(int i=0;i<=index;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // define the MaxElement() methord
    public void MaxElement(){
        int max = arr[0];
        for(int i=1;i<size;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The max element present in array is: "+max);
    }

    // define the MinElement() methord
    public void MinElement(){
        int min = arr[0];
        for(int i=1;i<size;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("The min element present in array is: "+min);
    }

    // define the Get() methord
    public void GetElement(){
        System.out.println("Enter the index of element:");
        int index = input.nextInt();
        if(index>=size && index>=0){
            System.out.println("SORRY!! .Index is greater than size of an array");
        }
        else{
            System.out.println("The data at index "+ index+" is: "+arr[index]);
        }
    }

    // define the Set() methord
    public void SetElement(){
        System.out.println("Enter the index of element:");
        int index = input.nextInt();
        if(index>=size && index>=0){
            System.out.println("SORRY!! .Index is greater than size of an array");
        }
        else{
            System.out.println("Enter the  new data to be updated:");
            int data = input.nextInt();
            arr[index] = data;
            System.out.println("Element is Updated SuccessFully!!");
        }
    }

    // define the Insert() methord
    public void Insert(){
        if(index!=size-1){
            index++;
            System.out.println("Enter the data to be inserted:");
            int data  = input.nextInt();
            arr[index] = data;
        }
        else{
            System.out.println("SORRY !! can't insert Index is greater than size of an array");
        }    
    }

    // define the Delete() methord
    public void Delete(){
        System.out.println("*************CHOICE**************\n"+
                           "   Case 1: Delete in starting\n"+
                           "   Case 2: Delete in end\n"+
                           "   Case 3: Delete in middle\n"+
                           "*********************************");
        System.out.println("Enter the choice:");
        int choice = input.nextInt();
        
        switch(choice){
            case 1:
                for(int i=0;i<=index;i++){
                    arr[i] =arr[i+1];
                }
                index--;
                System.out.println("Starting element is removed successfully");
                break;
            case 2:
                index--;
                System.out.println("The end element is removed successfully");    
                break;
            case 3:
                System.out.println("Enter the index of element to be removed:");
                int index1 = input.nextInt();
                if(index1<=index){
                    for(int i = index1;i<=index;i++){
                        arr[i] = arr[i+1];
                    }
                    index--;
                    System.out.println("The middle element is removed successfully");
                } 
                else{
                    System.out.println("SORRY !! Index out of bound");
                } 
        }          
    }
}
