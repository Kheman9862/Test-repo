//Java program to add two dates

// The java.util.Calendar.add() adds or subtracts the specified amount of time (amount) to the given calendar field (field), based on the calendar's rules.
// public abstract void add(int field,int amount)

import java.util.Calendar;

public class a41{
    public static void main(String args[]){
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        Calendar cTotal = (Calendar) c1.clone();

        cTotal.add(Calendar.YEAR,c2.get(Calendar.YEAR));
        cTotal.add(Calendar.MONTH, c2.get(Calendar.MONTH) + 1); // Zero-based months
        cTotal.add(Calendar.DATE, c2.get(Calendar.DATE));
        cTotal.add(Calendar.HOUR_OF_DAY, c2.get(Calendar.HOUR_OF_DAY));
        cTotal.add(Calendar.MINUTE, c2.get(Calendar.MINUTE));
        cTotal.add(Calendar.SECOND, c2.get(Calendar.SECOND));
        cTotal.add(Calendar.MILLISECOND, c2.get(Calendar.MILLISECOND));

        System.out.format("%s + %s = %s", c1.getTime(), c2.getTime(), cTotal.getTime());

    }
}
