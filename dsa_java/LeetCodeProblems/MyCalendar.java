package LeetCodeProblems;

import java.util.TreeMap;

public class MyCalendar {
    TreeMap<Integer, Integer> calendar = new TreeMap<>();
    public void MyCalendar() {

    }

    public boolean book(int start, int end){
        if (calendar.floorEntry(start) != null && start < calendar.floorEntry(start).getValue()){
            return false;
        }
        if (calendar.ceilingEntry(start) != null && end > calendar.ceilingEntry(start).getKey()){
            return false;
        }
        calendar.put(start, end);
        return true;
    }
}
