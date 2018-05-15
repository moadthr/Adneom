package adneom.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import adneom.main.ADNEOM;

/**
 * This test case check the size of each sub-list wich should be lower then the second parameter 
 * that we pass to the function partition
 *
 * @author Mouad Tahiri
 */

public class TestSize {    
    @Test
    public void test() {
        ADNEOM adneom = new ADNEOM();
        List<Integer> test = new ArrayList<>(); 
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        List<List<Integer>> result = adneom.partition(test, 3);
        for(List<Integer> l:result){
            assertTrue("the sub-lists size is lower then 3",l.size()<=3 );
        }        
    }
  

}
