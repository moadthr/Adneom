package adneom.main;

import java.util.ArrayList;
import java.util.List;

/**
 * This class has the implementation of the function <b>partition</b> 
 * 
 *
 * @author Mouad Tahiri
 */
public class ADNEOM {
	
   public static void main(String[] args) {        
   // here is an exemple to print the sub-lists to the console
        ADNEOM adneom = new ADNEOM();
        List<Integer> test = new ArrayList<>(); 
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        test.add(6);
        List<List<Integer>> result = adneom.partition(test,2);
        for(List<Integer> l:result){
            System.out.print("[");
            for(int i:l){
                System.out.print(i);
            }
            System.out.println("]\n");
        }
    } 
    public List<List<Integer>> partition(List<Integer> list , int size){
        List<List<Integer>> result = new ArrayList<>();        
        for(int i=0; i<list.size();i=i+size){
            if(i+size> list.size()){
                result.add(list.subList(i,list.size()));
            }
            else{
            result.add(list.subList(i,i+size));
            }
        }
        return result;
    }
  
}
