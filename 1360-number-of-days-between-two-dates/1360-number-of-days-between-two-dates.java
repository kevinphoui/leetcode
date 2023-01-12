class Solution {
    public int daysBetweenDates(String date1, String date2) {
        int year1 = Integer.parseInt(date1.substring(0,4));
        int month1 = Integer.parseInt(date1.substring(5, 7));
        int day1 = Integer.parseInt(date1.substring(8, 10));
        int year2 = Integer.parseInt(date2.substring(0,4));
        int month2 = Integer.parseInt(date2.substring(5, 7));
        int day2 = Integer.parseInt(date2.substring(8, 10));
        int daysIn1 = 0;
        int daysIn2 = 0;
        
        // add amount of days in year
        daysIn1 = getTotalDays(year1, month1, day1);
        daysIn2 = getTotalDays(year2, month2, day2);

        //System.out.println("Days in Date 1: " + daysIn1);
        //System.out.println("Days in Date 2: " + daysIn2);
        
        // absolute value of days from date2 - date1
        return Math.abs(daysIn2 - daysIn1);
    }
    

    
    
    
    /**
    * Gets the total number of days based on the date given
    */
    public int getTotalDays(int year, int month, int day) {
        int totalDays = 0;  // number to be returned
        int daysEachMonth[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};  // days in each month
        boolean finalYearLeap = false;
        // add amount of days in year
        for (int currYear = 0; currYear < year; currYear++) {
            if (currYear % 100 == 0 && currYear % 400 == 0) {
                totalDays++;
            } else if (currYear % 4 == 0 && currYear % 100 != 0) {
                totalDays++;
            }
            totalDays += 365;
        }
        
        if (((year % 4 == 0 && year % 100 != 0) ||(year % 100 == 0 && year % 400 == 0))  && ((month >= 2 && day >=29) || (month > 2))) {
            totalDays++;
        }
        
        // add amount of days in month
        for (int i = 1; i < month; i++) {
            totalDays += daysEachMonth[i];
        }
        
        // add amount of days
        totalDays += day; 
        
        
        return totalDays;
    }
    
}