/**
 *
 * @author Rubas
 */
public class StackExerciseBalanceParaentheses {
    
    
    public static boolean balPar(String text){
        System.out.println(text.toCharArray());
        boolean isValid = true;
        Stack<String> stack = new Stack<String>();
        
        String openingBracket = "(";
        String closingBracket = ")";
           
        char openingBracketChar = openingBracket.charAt(0);
        char closingBracketChar = closingBracket.charAt(0);

        
        for (char ch: text.toCharArray()) {
           //System.out.println(ch);

           if(openingBracketChar == ch){
                stack.push(Character.toString(ch));
           }
           
           if(closingBracketChar == ch){
               if(stack.empty()){
                   isValid = false;
               } else {
                   stack.pop();
               }
           }
           
           System.out.println(stack.toString());
        }

        if(stack.empty()){
            return isValid;
        } else {
            return false;
        }
    }
    
    
    
}