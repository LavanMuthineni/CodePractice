public class RemovingSpecialCharacter{
    
    public static void main(String args[]){
        
        String s1 ="Tt$*e*ch#wa$ve0";
        
        for(int i=0;i<s1.length();i++){
            char currentChar = s1.charAt(i);
            if(('a'<=currentChar && currentChar <= 'z' ) ||(currentChar >='A' && currentChar<='Z')|| (currentChar >='0' && currentChar<='9')) {
                System.out.print(s1.charAt(i));
            }      
            
        }
        
        
        
    }
}