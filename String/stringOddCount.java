/*
Given an integer n, return a string with n characters such that each character in such string occurs an odd number of times.
The returned string must contain only lowercase English letters. If there are multiples valid strings, return any of them.  
 
Example 1:
Input: n = 4
Output: "pppz"
Explanation: "pppz" is a valid string since the character 'p' occurs three times and the character 'z' occurs once.
Note that there are many other valid strings such as "ohhh" and "love".
*/

class Solution {
    public String generateTheString(int n) {
        String str = "";
        if(n%2!=0){
            for(int i = 0; i<n; i++)
             str+= 'a';
        }else{
            for(int i =0; i<n-1; i++)
                str+='a';
             str+='b';
        }
        return str;
    }
    
        
}
