package org.peronal;

import java.util.*;
import java.util.ArrayList;

public class Linkes {
    public List<String> al = new ArrayList<>();
    public List<String> ll = new LinkedList<>();
    public List<String> vec = new Vector<>();
    public List<String> stack = new Stack<>();

    public void setAL(){
        System.out.println(this.al);
        this.al.add(0,"1");  // adds 1 at 0 index
        this.al.add(1,"2");  // adds 2 at 1 index
        this.al.add(2,"3");  // adds 2 at 1 index
        this.al.add(3,"4");  // adds 2 at 1 index
        this.al.add(4,"5");  // adds 2 at 1 index
        this.al.add(5,"6");  // adds 2 at 1 index
        System.out.println(this.al);  // [1, 2]
    }
    public <E> List<E>  rm(List<E> a, int x){
        a.remove(2);
        return a;
    }

}
