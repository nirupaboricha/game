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
public class Project1 {

 



	private String input;
	private String output;
	
	//Standard Constructor used in program
	public Project1(String input){
		input = this.input;
		output = random();
	}
	
	protected String getOutput(){
		return output;
	}
	
 //Finds the winner through every possible situation 
  protected String winner(String input, String output){
	if(output.equals(input)){
		return "It was a draw!";
	}
	
	else if(output.equals("rock") && input.equals("paper")){
		return "Congrats, you win. Computer played rock";
	}
	
	else if(output.equals("rock") && input.equals("scissors")){
		return "Oh no, you lost. Computer played rock";

	}
	else if(output.equals("scissors") && input.equals("paper")){
		return "Oh no, you lost. Computer played scissors";

	}
	
	else if(output.equalsIgnoreCase("scissors") && input.equals("rock")){
		return "Congrats, you win. Computer played scissors";

	}
	else if(output.equals("paper") && input.equals("scissors")){
		return "Congrats, you win. Computer played paper";

	}
	
	else if(output.equals("paper")&& input.equals("rock")){
		return "Oh no, you lost. Computer played paper";

	}
	
	else{
		return "Congrats. You broke the program!";
	}
	}
  //makes sure the input by the user is valid
  protected boolean isValidInput(String input){
	  boolean x = true;
	  if(input == null){
		  x = false;
	  }
	  else if(!input.equals("rock")&& !input.equals("paper") && !input.equals("scissors")){
		  x = false;
	  }
	 
	  return x;
  }
//randomly generates an output (to act as the "computer" in the game)
	protected String random() {
		int random = (int)(Math.random()*100);
			
			if(random <= 33){
				return "rock";
			}
			
			else if(random > 33 && random <= 66){
				return "paper";
			}
			
			else{
				return "scissors";
			}
		
		
		}
	
	protected void reset(){
		input = null;
		output = null;
	}
}