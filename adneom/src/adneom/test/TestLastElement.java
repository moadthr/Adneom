package adneom.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import adneom.main.ADNEOM;

/**
 * this test case try to check if the last element is included in the result list
 *
 * @author Mouad Tahiri
 */
public class TestLastElement {

    @Test
    public void test() {
        ADNEOM adneom = new ADNEOM();
        List<Integer> test = new ArrayList<>(); 
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        test.add(6);
        List<List<Integer>> result= adneom.partition(test, 3);
        List<Integer> element = result.get(result.size()-1);
        assertEquals(element.get(element.size()-1),test.get(test.size()-1)); 
    }

}
