package heapsort;
import java.util.*; 

public class Array {
    int[] Arr;
    int size; 
    Scanner input = new Scanner(System.in); 
    
    Array(int size){
        this.size = size; 
        Arr = new int[size]; 
        for (int i = 0; i < size; i++){
            Arr[i] = 0; 
        }
    }
    
    void SetArray(){
        for (int i = 0; i < size; i++){
            Arr[i] = input.nextInt(); 
        }
    }
    
    void SetIndex(int Index, int value){
        Arr[Index] = value; 
    }
    
    int GetIndex(int i){
        return Arr[i]; 
    }
    
    void PrintfArray(){
        for (int i = 0; i < size; i++){
            System.out.print(Arr[i] + " ");
        }
    }
}
