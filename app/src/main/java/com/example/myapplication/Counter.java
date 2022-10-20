package com.example.myapplication;

import java.util.*;

public class Counter {
    ArrayList<Integer> inputtedNumber;

    public Counter(ArrayList<Integer> inputtedNumber) {
        this.inputtedNumber = inputtedNumber;
    }

    public String calcMost(int searchingFor) {
        if(inputtedNumber.size() > 2 ) {
            List<Integer> nums = new ArrayList<>();
            for (int i = 0; i < inputtedNumber.size() - 1; i++) {
                if (searchingFor == inputtedNumber.get(i)) {
                    nums.add(inputtedNumber.get(i + 1));
                }
            }
            int ctr = 0;
            StringBuilder tempReturner = null;
            while (ctr != 38) {
                tempReturner.append(itterateover(ctr, nums));
                ctr++;
            }
            return tempReturner +"\n Кол-во набранных " + nums.size();
        }
        else {
            return "Недостаточно данных";
        }
    }

    private String itterateover(int num, List<Integer> nums) {
        int count = 0;
        for(int i = 0; i < nums.size();i++) {
            if(num == nums.get(i)) {
                count++;
            }
        }
        if(count > 0 && count < 3) {
            return "  [Число : " + num + " =Есть :" + count + " |] \t";
        }
        if(count > 3) {
            return "  [Число : " + num + " =Бинго  :" + count + " |] \t";
        }
        else {
            return "  Число : " + num + " =Кол-Во : X |  \t";
        }

    }

    public String findScenario(int num, List<Integer> nums) {
        TreeMap<Integer,String> tempScenario = new TreeMap<>();
        int scenarioCounter = 0;
        if (nums.size() > 3) {
            for(int i = 3; i < nums.size();i++) {
                if (nums.get(i) == num) {
                    String tempHere = nums.get(i-2) + " " + nums.get(i-1)  + " " + nums.get(i);
                    tempScenario.put(scenarioCounter,tempHere);
                }
            }
        }
        return tempScenario.toString();
    }

    public StringBuilder numbersToShow() {
        StringBuilder tempSaver = new StringBuilder(" ");
        if (inputtedNumber.size() < 10) {
            for (Integer integer : inputtedNumber) {
                tempSaver.append(integer).append(" ");
            }
        }
        else if (inputtedNumber.size() > 10) {
            int from =
        }
        return tempSaver;
    }
}
