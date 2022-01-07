class Solution {
    public String reformatDate(String date) {
        //String x = "";
        String[] month = {"x", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        
    
        
        // splits date
        String[] input = date.split(" ");
        //System.out.println(Arrays.toString(input));
        
        //day
        input[0] = input[0].replaceAll("[^0-9]", ""); // day
        input[0] = String.format("%02d" , Integer.parseInt(input[0]));
        
        
        // month
        input[1] = ""+java.util.Arrays.asList(month).indexOf(input[1]);
        input[1] = String.format("%02d" , Integer.parseInt(input[1]));

                        // year        month        day
        return input[2]+"-"+input[1]+"-"+input[0];
        //return output;
    }
}