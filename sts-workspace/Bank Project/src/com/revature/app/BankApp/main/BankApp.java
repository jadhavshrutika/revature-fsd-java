package com.revature.app.BankApp.main;

import com.revature.app.BankApp.menu.MainMenu;

public class BankApp {
	
	public static void main(String[] args) {
	MainMenu menu = new MainMenu("Main Menu");
		menu.displayMenuAndCaptureSelection();
	}


}
