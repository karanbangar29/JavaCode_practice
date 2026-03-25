package com.coffeeshop.collections;

import java.util.Calendar;
import java.util.Stack;

public class StringEx {
    public static void main(String[] args) {
        System.out.println(isValidBrace("()"));
        System.out.println(isValidBrace("()[]{}"));
        System.out.println(isValidBrace("(]"));
        System.out.println(isValidBrace("([])"));
        System.out.println(isValidBrace("([)]"));
        System.out.println(isValidBrace("("));

    }
    public static boolean isValidBrace(String s){
        Stack<Character> stack=new Stack<>();
        for (char ch: s.toCharArray()){
            if (ch == '(' || ch=='{'  || ch == '['){
               stack.push(ch);

            }else {
                if (stack.isEmpty()) return false;
                char top=stack.pop();
                if((ch==')' && top != '(') ||
                        (ch=='}' && top !='{')||
                        (ch==']'  && top !='[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

/*
Example 1:
Input: s = "()"
Output: true
Example 2:
Input: s = "()[]{}"
Output: true
Example 3:
Input: s = "(]"
Output: false
Example 4:
Input: s = "([])"
Output: true
Example 5:
Input: s = "([)]"
Output: false

 */