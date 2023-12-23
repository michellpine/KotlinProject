package javaExercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Interview {

     public static Map<String, String> fillCharacterTypes() {
         Map<String, String> characterTypes  = new HashMap<String, String>();
         characterTypes.put("{", "}");
         characterTypes.put("[", "]");
         characterTypes.put("(", ")");
         return characterTypes;
     }

     public static boolean isBalanced(String line) {
         Stack<String> stackChar = new Stack<>();
         char[] characters = line.toCharArray();
         for (int i=0; i<characters.length; i++) {
             if (fillCharacterTypes().containsKey(String.valueOf(characters[i]))) {
                 stackChar.push(String.valueOf(characters[i]));
             } else if (stackChar.empty()) {
                 return false;
             } else if(fillCharacterTypes().containsValue(String.valueOf(characters[i]))) {
                 String lastCharacter = stackChar.pop();
                 if (!fillCharacterTypes().get(lastCharacter).equals(String.valueOf(characters[i]))) {
                     return false;
                 }
             }
         }

         return stackChar.size() <= 0;
     }
}



/*

{}[]() - balanced
[()] - balanced

[) - not balanced
{[}] - not balanced

]() - not balance




 */
