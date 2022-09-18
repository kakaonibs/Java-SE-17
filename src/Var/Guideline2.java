package src.Var;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//Minimize the scope of local variable

public class Guideline2 {

    public static void main(String[] args) {
        var stringList = new HashSet<String>();//ArrayList<String>();

        // ... 100 lines of code ...

        stringList.add("MUST_BE_PROCESSED_LAST");

        for (var string : stringList) {
            System.out.println(string);
        }
    }
}