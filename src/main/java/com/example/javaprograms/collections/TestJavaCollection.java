package com.example.javaprograms.collections;
import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestJavaCollection{
    public static void main(String args[]){
//Creating HashSet and adding elements
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        set.add(null);
        set.add("");
//Traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        Optional op = Optional.of("sagar");
        System.out.println(op);

        List<String> ls = Stream.of("sagar","yadav").map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(ls);
        List<List<Integer>> ls1 = Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4));
        System.out.println(ls1.stream().flatMap(Collection::stream).collect(Collectors.toList()));
        ls.stream().forEach((s) -> System.out.println(s));

        //sequential stream
        List<String> st= Arrays.asList("sagar", "n","i","c","e");
        st.stream().forEach(System.out::print);
        System.out.println("sequential stream");
        st.stream().parallel().forEachOrdered(System.out::print);

        System.out.println("-------------------------------");
        List<String> list=new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        list.add("Aman");
        List upperCaseList = list.stream().map((a)-> a.equals("Ravi")? a.replace(a,"sagar"):a).collect(Collectors.toList());
        List filterList = list.stream().filter((a) -> a.equals("Aman")).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(upperCaseList);
        System.out.println(filterList);
    }
}