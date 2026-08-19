import java.time.*;
import java.time.format.*;
import java.time.temporal.*;
class Solution {
    public int daysBetweenDates(String date1, String date2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate start = LocalDate.parse(date1,formatter);
        LocalDate end = LocalDate.parse(date2,formatter);
        long days = ChronoUnit.DAYS.between(start,end);
       return (int) Math.abs(days);
        
    }
}