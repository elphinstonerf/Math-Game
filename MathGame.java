/*
 * Math Practice Game
 * Author: Richard Elphinstone
 * Used to grow understanding of javax.swing
 * Modifications: 12/21/2021
 * 	Initialization of project.
 * 	Ran through differences in parameters of showInputDialog.
 */

import javax.swing.*;

import javax.swing.JOptionPane;


public class MathPractice {
	public static void main(String[] args) {
		int firstNumber = (int) (Math.random()*10 + 1);
		int secondNumber = (int) (Math.random()*10 +1);
		int userAnswer = 0;
		int correctAnswer = firstNumber + secondNumber;
		int count = 1;
		
		System.out.println("The Complete Math Problem is: ");
		System.out.println(firstNumber + " + " + secondNumber + " = " + correctAnswer);
		
		while (userAnswer != correctAnswer) {
			String response = JOptionPane.showInputDialog(null,
					"Please Solve the Math Problem\n" + firstNumber
					+ " + " + secondNumber + " = ?", "Math Problems!", 3);
			userAnswer = Integer.parseInt(response);
			JOptionPane.showMessageDialog(null, "" + userGuesses(userAnswer, correctAnswer, count));
			count ++;
		}
	}
	
	// Loop for User Answer options.
	public static String userGuesses(int userAnswer, int correctAnswer, int count) {
		if (userAnswer <= 0 || userAnswer > 100) {
			return "That is not a number you can use!!\n" + "Total Guesses so far: " + count;
		}
		else if (userAnswer == correctAnswer) {
			return "That is the Correct Answer!!!\n" + "Total Guesses: " + count;
		}
		else if (userAnswer > correctAnswer) {
			return "That is not the correct Answer.\nHint: Your answer was too high.\n"
					+ "Total Guesses so far: " + count;
		}
		else if (userAnswer < correctAnswer) {
			return "That is not the correct Answer.\nHint: Your answer was too low.\n"
					+ "Total Guesses so far: " + count;
		}
		else {
			return "That is not the correct Answer.\nTotal Guesses so far: " + count;
		}
	}
}
