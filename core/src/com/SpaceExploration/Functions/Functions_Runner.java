package com.SpaceExploration.Functions;


import com.SpaceExploration.Functions.MouseUpdate;



public class Functions_Runner {
	
	private static MouseUpdate mouse;
	
	public Functions_Runner(){
		//set class variables
		mouse = new MouseUpdate();
	}
	
	//runs all functions in this package on update
	public void update(){
		
		mouse.setMousePos();
	}
}
