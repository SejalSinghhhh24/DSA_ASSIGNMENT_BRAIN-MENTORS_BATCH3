Given a positive integer n, find the smallest integer which has exactly the same digits existing in the integer n and is greater in value than n. If no such positive integer exists, return -1.

Note that the returned integer should fit in 32-bit integer, if there is a valid answer but it does not fit in 32-bit integer, return -1.

 

Example 1:

Input: n = 12
Output: 21
Example 2:

Input: n = 21
Output: -1
 

Constraints:

1 <= n <= 231 - 1



class Solution {
    public int nextGreaterElement(int n) {
        String s=Integer.toString(n);
        char[] a=new char[s.length()];
        a=s.toCharArray();
        int i=a.length-2;
        while(i>=0&&a[i]>=a[i+1]){
i--;}
        if(i==-1)
            return -1;
        int k=a.length-1;
        while(a[i]>=a[k]){
            k--;
        }
        char t=a[i];
        a[i]=a[k];
        a[k]=t;
        
        String r="";
        for(int j=0;j<=i;j++){
            r+=a[j];
        }
        for(int j=a.length-1;j>i;j--){
            r+=a[j];
        }
        long ans=Long.parseLong(r);
        if(ans<=Integer.MAX_VALUE)
            return (int) ans;
        return -1;
    }
}
