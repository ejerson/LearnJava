package com.edgedevelop.importstatement;

import java.util.*;
import static java.util.Collections.sort;

public class Import {
    public static void main(String[] args) {

    }
    public List <String> copyAndSortList(List <String> original) {
        List <String> list = new ArrayList<String>(original);
        sort(list);
        return list;
    }
}
