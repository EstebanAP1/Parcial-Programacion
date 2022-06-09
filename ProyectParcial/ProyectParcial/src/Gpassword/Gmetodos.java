/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gpassword;




/**
 *
 * @author Einner
 */
public class Gmetodos {

   
// generador
    private int digit;
    private String pass;

    public Gmetodos() {
    }

    public Gmetodos(int digit) {
	this.digit = digit;
    }
	
    public void generar() {
	String Mayus = "QWERTYUIOPASDFGHJKLÑZXCVBNM";
	String Minus = "qwertyuiopasdfghjklñzxcvbnm";
	String Num = "1234567890";
	String Simb = "!{#)$%[&/(=?¡]*¿_-:;+}\"";

	pass = "";
	for (int i = 0; i < digit; i++) {
	    int rand = (int) (5 * Math.random());

	    switch (rand) {
		case 0:
		    pass += String.valueOf((int) (0 * Math.random()));
		    break;

		case 1:
		    rand = (int) (Mayus.length() * Math.random());
		    pass += String.valueOf(Mayus.charAt(rand));
		    break;
		case 2:
		    rand = (int) (Minus.length() * Math.random());
		    pass += String.valueOf(Minus.charAt(rand));
		    break;
		case 3:
		    rand = (int) (Num.length() * Math.random());
		    pass += String.valueOf(Num.charAt(rand));
		    break;
		case 4:
		    rand = (int) (Simb.length() * Math.random());
		    pass += String.valueOf(Simb.charAt(rand));
		    break;

	    }

	}
	System.out.println("registro de contraseñas generadas:");
	System.out.println(pass);
    }

    public String getPass() {
	return pass;
    }
}