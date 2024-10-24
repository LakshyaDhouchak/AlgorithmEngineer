package ArrayDataStructure;

import java.util.Scanner;
public class ArrayList {
    // calling the Scanner
    Scanner input =  new Scanner(System.in);

    // define the properties
    int capacity;
    int[] arr;
    int index;

    // define the constructor
    public ArrayList(int initialCapacity){
        this.capacity = initialCapacity;
        arr = new int[initialCapacity];
        index = 0;
    }

    // define the Create() methord
    public void Create(){
        if(index == capacity){
            Resize();
        }
        System.out.println("Enter the data to be inserted:");
        int data = input.nextInt();
        arr[0] = data;
        index++;
    }

    // define the Display() methord
    public void Display(){
        System.out.println("The element present in an array is:");
        for(int i=0;i<index;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // define the MaxElement() methord
    public void MaxElement(){
        int max = arr[0];
        for(int i=1;i<index;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The max element present in array is:"+max);
    }

    // define the MinElement() methord
    public void MinElement(){
        int min = arr[0];
        for(int i=1;i<index;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("The min element present in array is:"+min);
    }

    // define the isEmpty() methord
    public void IsEmpty(){
        if(index == 0){
            System.out.println("The ArrayList is empty");
        }
        else{
            System.out.println("The ArrayList is not empty");
        }
    }

    // define the getElement() methord
    public void getElement(){
        System.out.println("Enter the index of element:");
        int index1 = input.nextInt();
        if(index1<index&& index1>=0){
            System.out.println("The element at index "+index1+" is: "+arr[index1]);
        }
        else{
            System.out.println("SORRY !! Index is greater than size of an array");
        }
    }

    // define the setElement() methord
    public void setElement(){
        System.out.println("Enter the index of element:");
        int index1 = input.nextInt();
        if(index1>=index && index1>=0){
            System.out.println("SORRY!! .Index is greater than size of an array");
        }
        else{
            System.out.println("Enter the  new data to be updated:");
            int data = input.nextInt();
            arr[index1] = data;
            System.out.println("Element is Updated SuccessFully!!");
        }
    }

    // define the Resize() methord
    public void Resize(){
        capacity = 2*capacity;
        int[] dup =  new int[capacity];
        System.arraycopy(arr,0,dup,0,index);
        arr = dup;
        dup = null;
    }

    // define the insert() methord
    public void Insert(){
        System.out.println("***********CHOICE***********\n"+
                           "  Case 1: Insert in start\n"+
                           "  Case 2: Insert in end\n"+
                           "  Case 3: Insert in middle\n"+
                           "*****************************");
        System.out.println("Enter the choice:");
        int choice = input.nextInt();
        switch(choice){
            case 1:
                if(index == capacity){
                    Resize();
                }
                System.out.println("Enter the data to be inserted:");
                int data = input.nextInt();
                for(int i=index-1;i>=0;i--){
                    arr[i+1]= arr[i];
                }
                arr[0] = data;
                index++;
                break;
            case 2:
                if(index == capacity){
                    Resize();
                } 
                System.out.println("Enter the data to be inserted:");
                data = input.nextInt();  
                arr[index] = data;
                index++;
                break;
            case 3:
                System.out.println("Enter the index at which new data is inserted:");
                int index1 = input.nextInt();
                if(index1<index&&index1>=0){
                    if(index == capacity){
                        Resize();
                    }
                    System.out.println("Enter the data to be inserted:");
                    data = input.nextInt();
                    for(int i=index-1;i>=index1;i--){
                        arr[i+1] = arr[i];
                    }
                    arr[index1] = data;
                    index++;
                }
                else{
                    System.out.println("SORRY !! Index out of bounds");
                } 
                break; 
            default:
                System.out.println("SORRY!! No such choice available");  
                break;    
        }                   
    }

    // define the Delete() methord
    public void Delete(){
        System.out.println("***********CHOICE***********\n"+
                           "  Case 1: Delete in start\n"+
                           "  Case 2: Delete in end\n"+
                           "  Case 3: Delete in middle\n"+
                           "*****************************");
        System.out.println("Enter the choice:");
        int choice = input.nextInt();
        switch(choice){
            case 1:
                for(int i=0;i<index;i++){
                    arr[i] = arr[i+1];
                }
                System.out.println("Element is removed Successfully");
                index--;
                break;
            case 2:
                index--;
                System.out.println("Element is removed Succesfully");
                break;
            case 3:
                System.out.println("Enter the index of element to removed:");
                int index1 = input.nextInt();
                if(index1<index&&index1>=0){
                    for(int i=index1;i<index;i++){
                        arr[i] = arr[i+1];
                    }
                    index--;
                    System.out.println("Element is removed Successfully");
                    
                }
                else{
                    System.out.println("SORRY !! Index out of bounds");
                } 
                break;
            default:
                System.out.println("SORRY!! No such choice available");
                break;                   
        }
    }
}
