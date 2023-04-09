package LeetCodeProblems;

public class BookCalendar {
    public static void main(String args[]){
        int[][] bookings = {{10, 20}, {15, 25}, {20, 30}};

        MyCalendar booking = new MyCalendar();
        for (int i = 0; i < bookings.length; i ++){
            System.out.println(booking.book(bookings[i][0],bookings[i][1]));
        }
    }
}
