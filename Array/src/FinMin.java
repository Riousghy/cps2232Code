

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FinMin {
    public static void main(String[] args) {
        String[]array={"red","green","blue"};

        //ASCIIcode: red=114+101+100
//                      green=103+114+101+110
//                      blue=98+108+117+101
        System.out.println(java.util.Collections.min(new ArrayList<String>(Arrays.asList(array))));

    }
}
