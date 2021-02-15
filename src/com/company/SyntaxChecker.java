package com.company;

import java.util.ArrayList;

public class SyntaxChecker {


    OperatorsCharacteristics operatorsCharacteristics = new OperatorsCharacteristics();

    /*---Methods----*/


    public ArrayList<Character> checkSyntax(ArrayList<Character> list) {

        int count=0;
        char o1;
        char o2;

        if (list.size() > 1) {
            for (int i = 0; i < list.size(); i++) {
                if (!operatorsCharacteristics.isNumeric(list.get(i).toString()) && count<1) {
                    count=1;
                    o1=list.get(i);
                    System.out.println(" dublication");

                }
                else
                {
                    o2=list.get(i);



                }
            }
            return list;

        } else {
            return list;

        }


    }

    private void checkOperator(ArrayList<Character> input, int i) {
        Character pre = input.get(i--);
        Character post = input.get(i);

        if (!operatorsCharacteristics.isNumeric(pre.toString()) && !operatorsCharacteristics.isNumeric(post.toString())) {
//            if (pre == '+' && post == '+') {
//                input.remove(i);
//                input.remove(i - 1);
//                input.add('+');
//                System.out.println(" operator overload ++");
//            } else if (pre == '+' && post == '-') {
//                input.remove(i);
//                input.remove(i - 1);
//                input.add('-');
//
//            } else if (pre == '-' && post == '+') {
//                input.remove(i);
//                input.remove(i - 1);
//                input.add('-');
//
//            } else {
//                input.remove(i);
//                input.remove(i - 1);
//                input.add('+');
//
//            }

            System.out.println(" dublication");


        }


    }

}
