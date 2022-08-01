import java.io.*;
import java.util.ArrayList;
import java.util.List;
  
public class Append {
  
    public static void main(String[] args)
    {
        
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(2);
        list1.add(6);
        list1.add(8);
        list1.add(4);
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(9);
        list2.add(0);
        list2.add(7);
        list2.add(1);
        List<Integer> concatenated_list= new ArrayList<Integer>();
        concatenated_list.addAll(list1);
        concatenated_list.addAll(list2);
  
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("Appended list: "+ concatenated_list);
    }
}
