    public static String caesarCipher(String s, int k) {
          String lower = "abcdefghijklmnopqrstuvwxyz";
       String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String word = "";
       for(int i =0;i<s.length();i++){  
                if(Character.isAlphabetic(s.charAt(i)) && Character.isLowerCase(s.charAt(i))){
                  int next =   (lower.indexOf(s.charAt((i)))+k)%26;
                  word+=  lower.charAt(next);
                }else if(Character.isAlphabetic(s.charAt(i)) && Character.isUpperCase(s.charAt(i))){
                     int next =  (upper.indexOf(s.charAt((i)))+k)%26;
                  word+=  upper.charAt(next);
                }else{
                  word+=  s.charAt(i);
                }
       }
           
        
        return word;
    }
