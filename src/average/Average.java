/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package average;

/**
 *
 * @author Deepanshu Arora,2023
 * this is my new file

 */
public class Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
	
	double answer = 0;
		for(int i=0; i<args.length; i++) {
		String arg = args[i];
      	 answer += Double.parseDouble(arg);
	
	
		}
		System.out.println("Average is "+answer/args.length);
	}

    }


