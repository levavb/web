package web;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class q4 {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int size;
		while(true)
		{
			System.out.println("Enter a number (between 1-50): ");
			size = input.nextInt();
		
			if(size > 50 || size < 1)
			{
				System.out.println("ERROR: The number is not between 1-50 Try again");
			} else {
				break;
			}
		}
		PrintWriter writer = new PrintWriter("q4.html", "UTF-8");
		writer.println("<html>\n<head>\n<title>levav butbul q4</title>\n</head>\n<body>");
		
		double percent = 100.0/size;
		
		for(int i=0; i < size ;i++)
		{
			if((i%3) == 0)
			{
				writer.println("<div style=\"width: "+ percent +"%; height: 100%; background-color: #0026ff; float: right;\"> </div>");
			}
			else if((i%3) == 1)
			{
				writer.println("<div style=\"width: "+ percent +"%; height: 100%; background-color: #00ff21; float: right;\"> </div>");
			}
			else if((i%3) == 2)
			{
				writer.println("<div style=\"width: "+ percent +"%; height: 100%; background-color: #ff0000; float: right;\"> </div>");
			}
		}
		
		writer.println("</body>\n</html>");
		writer.close();

	}

}
