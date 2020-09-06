// Java Program to Convert String to Date
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class a34{
    public static void main(String args[]){
    String datetoday = "2020-09-02";
    LocalDate date = LocalDate.parse(datetoday,DateTimeFormatter.ISO_DATE);
    System.out.println(date);        
    }
}

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

// public class TimeString {

//     public static void main(String[] args) {
//         String string = "July 25, 2017";

//         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
//         LocalDate date = LocalDate.parse(string, formatter);

//         System.out.println(date);
//     }
// }