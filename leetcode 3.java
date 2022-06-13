Given a string s, find the length of the longest substring without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // do sliding and maintain a frequesncy of char
        int i=0,j=0;
        int max=0;
        int []hashset=new int[128];//default filled with 0
        while(j<s.length()){
            char singlechar=s.charAt(j);
            hashset[singlechar]++; //hashset[asciivaluefhcar]
                //hashset['a']---hashset[97]++=0+1
            while(hashset[singlechar]>1){
                //char appear more than more
                char leftchar=s.charAt(i);
                hashset[leftchar]--;
                i++;//slide the window
                
            }
            
            max=Math.max(max,j-i+1);
            j++;
        }
       return max; 
    }
}
