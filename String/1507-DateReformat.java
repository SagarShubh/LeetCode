import java.text.SimpleDateFormat;
class Solution {
    public String reformatDate(String date) {
         try {
            date = date.replaceAll("st|nd|th|rd", "");
            return new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("dd MMM yyyy").parse(date));
        } catch (Exception ignore) {
            
        }
        return null;
        
    }
}
