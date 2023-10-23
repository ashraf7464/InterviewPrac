package InterviewPrep;

import org.testng.annotations.Test;

import java.util.*;

public class ListSetDemo {

@Test
    public void listPractice(){


        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 1, 4, 5, 6, 6, 7, 8, 8));
        Set<Integer> set = new HashSet<Integer>(list);
        list.clear();
        list.addAll(set);

        System.out.println(set);
    }
}
