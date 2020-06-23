package ex;

import java.util.ArrayList;

import FourUI.Connect;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		Connect conn = new Connect();
		ArrayList<String> ac = conn.select("select * from departments", "hr", "hr", 3);
		
	}

}
