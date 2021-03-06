package com.albion.text.reverse;

import java.util.Arrays;

import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class ReverseStringVowels {

	public String reverseVowels(String s) {
		String vowelsString = "aeiouAEIOU";

		Stack<Character> reversedVowelStack = new Stack<>();
		Character[] charObjectArray = vowelsString.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
		Set<Character> vowelSet = new TreeSet<>(Arrays.asList(charObjectArray));

		for(char c: s.toCharArray()){
			if(vowelSet.contains(c)){
				reversedVowelStack.push(c);
			}
		}

		char[] outputChars = s.toCharArray();
		for(int i = 0; i<outputChars.length; i++){
			if(vowelSet.contains(outputChars[i])){
				outputChars[i] = reversedVowelStack.pop();
			}
		}

		String output = new String(outputChars);
		return output;
	}
}
