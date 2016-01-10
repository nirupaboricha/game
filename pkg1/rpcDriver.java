/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1;

/**
 *
 * @author nirup
 */
import javax.swing.*;
public class rpcDriver {

	public static void main(String[] args) {	
		
		String playAgain = "yes";
		while(playAgain.equals("yes")){
			String input = JOptionPane.showInputDialog("Rock, Paper, Scissors, shoot!"
					+ " Enter either rock, paper, or scissors");
			if(input!= null){
				input = input.toLowerCase();
			
			
				Project1 x = new Project1(input);
				if(x.isValidInput(input) == false){
					JOptionPane.showMessageDialog(null, "You input an invalid answer. Resetting program now",
					"Rock Paper Scissors", 
					JOptionPane.PLAIN_MESSAGE);
					x.reset();
			}
			else{
				x.winner(input, x.getOutput());
			
				JOptionPane.showMessageDialog(null, x.winner(input, x.getOutput()), "Rock Paper Scissors", 
				JOptionPane.PLAIN_MESSAGE);
			
				String playAgainChoice = JOptionPane.showInputDialog("Will you like to play again? Please"
					+ " enter yes "
					+ "if you want to keep playing");
			 
				if(playAgainChoice!= null){
				 playAgain = playAgainChoice.toLowerCase();
				 x.reset();
				}
			 
				else{
				 playAgain = "no";
				}
			 
			}
		}
			else{
				playAgain = "no";
			}
		}
		//Message box that only shows up when game/program is complete and user wishes not to play anymore, or presses "cancel" 
		JOptionPane.showMessageDialog(null, "Thanks for playing", "Rock Paper Scissors", 
				JOptionPane.PLAIN_MESSAGE);

	}
	
		
}
