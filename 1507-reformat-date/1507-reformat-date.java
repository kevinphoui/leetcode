class Solution {
    public String reformatDate(String date) {
        // splits date
        String[] input = date.split(" ");
        
        switch(input[1]){
                case "Jan":
                    input[1] = "01";
                    break;
                case "Feb":
                    input[1] = "02";
                    break;
                case "Mar":
                    input[1] = "03";
                    break;
                case "Apr":
                    input[1] = "04";
                    break;
                case "May":
                    input[1] = "05";
                    break;
                case "Jun":
                    input[1] = "06";
                    break;
                case "Jul":
                    input[1] = "07";
                    break;
                case "Aug":
                    input[1] = "08";
                    break;
                case "Sep":
                    input[1] = "09";
                    break;
                case "Oct":
                    input[1] = "10";
                    break;
                case "Nov":
                    input[1] = "11";
                    break;
                case "Dec":
                    input[1] = "12";
                    break;
        }
        
        //day
        input[0] = input[0].replaceAll("[^0-9]", ""); // day
        input[0] = String.format("%02d" , Integer.parseInt(input[0]));
    

                // year        month        day
        return input[2]+"-"+input[1]+"-"+input[0];
    }
}