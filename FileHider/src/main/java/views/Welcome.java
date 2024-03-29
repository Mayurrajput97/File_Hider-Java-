package views;

import java.io.*;
public class Welcome {
	public void welcomeScreen() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to the App ");
		System.out.println("Press 1 To Login ");
		System.out.println("Press 2 To Signup ");
		System.out.println("Press 0 To exit ");
		int choice = 0;
		try {
			choice = Integer.parseInt(br.readLine());
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		switch(choice ) {
		case 1 : login();
		case 2 : signUp();
		case 0 : System.exit(0);
		}
	}

	private Object signUp() {
		return null;
	}

	private Object login() {
		return null;
	}
}
