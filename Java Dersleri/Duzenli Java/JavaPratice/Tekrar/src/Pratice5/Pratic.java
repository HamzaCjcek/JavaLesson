package Pratice5;

import java.util.ArrayList;
import java.util.List;

public class Pratic {
    public static void main(String[] args) {
        String[] input={"John","Brad","Ange","Sofia","Emily"};
        String[] input2={"sofia","brad","grace","emily","hazel"};
        List<String> Output=new ArrayList<>();
        for (int i = 0; i < input.length ; i++) {
            for (int j = 0; j < input2.length ; j++) {
                if (input[i].equalsIgnoreCase(input2[j]))
                {
                    Output.add(input[i]);
                }
            }
        }
        System.out.println(Output);
    }
}
