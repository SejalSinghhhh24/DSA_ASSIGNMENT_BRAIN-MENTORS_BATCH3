class GfG
 {
	String encode(String str)
	{
        int c=1;str=str+" "; 
        String s="";
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                c++;
            }
            else{
                s+=str.charAt(i)+Integer.toString(c);
                c=1;
                
            }
        }
        return s;
	}
	
 }
