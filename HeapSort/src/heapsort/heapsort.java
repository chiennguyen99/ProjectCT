package heapsort;


public class heapsort {
    Array A; 
    heapsort(int size){
        A = new Array(size); 
        A.SetArray();
    }
    void Swap(int i, int j){
        int temp = A.GetIndex(i); 
        A.SetIndex(i, A.GetIndex(j));
        A.SetIndex(j, temp);
    }
    void down(int Index, int MaxIndex){
        int i = Index; 
        int j = 2*i + 1; 
        while (j <= MaxIndex){
            int k = j + 1; 
            if (k <= MaxIndex && A.GetIndex(k) > A.GetIndex(j)){
                j = k; 
            }
            if (A.GetIndex(i) < A.GetIndex(j)){
                Swap(i, j); 
                i = j; 
                j = 2*i + 1; 
            }else {
                break; 
            }
        }
    }
    void handling(){
        int k = A.size - 1; 
        for (int i = k/2 - 1; i >= 0; i--){
            down(i, k); 
        }
        for (int i = k; i >= 1; i--){
            Swap(0, i); 
            down(0, i - 1); 
        }
    }
    void print(){
        A.PrintfArray();
    }
}
