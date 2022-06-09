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
    
    public void generarMayusMinusNum() {
	String Mayus = "QWERTYUIOPASDFGHJKLÑZXCVBNM";
	String Minus = "qwertyuiopasdfghjklñzxcvbnm";
	String Num = "1234567890";
	
	pass = "";
	for (int i = 0; i < digit; i++) {
	    int rand = (int) (4 * Math.random());
	    
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
	    }
	}
    }
    
    public void generarMayusMinusSimb () {
	String Mayus = "QWERTYUIOPASDFGHJKLÑZXCVBNM";
	String Minus = "qwertyuiopasdfghjklñzxcvbnm";
	String Simb = "!{#)$%[&/(=?¡]*¿_-:;+}\"";

	pass = "";
	for (int i = 0; i < digit; i++) {
	    int rand = (int) (4 * Math.random());

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
		    rand = (int) (Simb.length() * Math.random());
		    pass += String.valueOf(Simb.charAt(rand));
		    break;

	    }

	}
    }
    
    public void generarMayusNumSimb() {
	String Mayus = "QWERTYUIOPASDFGHJKLÑZXCVBNM";
	String Num = "1234567890";
	String Simb = "!{#)$%[&/(=?¡]*¿_-:;+}\"";

	pass = "";
	for (int i = 0; i < digit; i++) {
	    int rand = (int) (4 * Math.random());

	    switch (rand) {
		case 0:
		    pass += String.valueOf((int) (0 * Math.random()));
		    break;

		case 1:
		    rand = (int) (Mayus.length() * Math.random());
		    pass += String.valueOf(Mayus.charAt(rand));
		    break;
		case 2:
		    rand = (int) (Num.length() * Math.random());
		    pass += String.valueOf(Num.charAt(rand));
		    break;
		case 3:
		    rand = (int) (Simb.length() * Math.random());
		    pass += String.valueOf(Simb.charAt(rand));
		    break;
	    }
	}
    }
    
    public void generarMinusNumSimb() {
	String Minus = "qwertyuiopasdfghjklñzxcvbnm";
	String Num = "1234567890";
	String Simb = "!{#)$%[&/(=?¡]*¿_-:;+}\"";

	pass = "";
	for (int i = 0; i < digit; i++) {
	    int rand = (int) (4 * Math.random());

	    switch (rand) {
		case 0:
		    pass += String.valueOf((int) (0 * Math.random()));
		    break;
		case 1:
		    rand = (int) (Minus.length() * Math.random());
		    pass += String.valueOf(Minus.charAt(rand));
		    break;
		case 2:
		    rand = (int) (Num.length() * Math.random());
		    pass += String.valueOf(Num.charAt(rand));
		    break;
		case 3:
		    rand = (int) (Simb.length() * Math.random());
		    pass += String.valueOf(Simb.charAt(rand));
		    break;

	    }

	}
    }
    
    public void generarMayusMinus() {
	String Mayus = "QWERTYUIOPASDFGHJKLÑZXCVBNM";
	String Minus = "qwertyuiopasdfghjklñzxcvbnm";

	pass = "";
	for (int i = 0; i < digit; i++) {
	    int rand = (int) (3 * Math.random());

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
	    }

	}
    }
    
    public void generarMayusNum() {
	String Mayus = "QWERTYUIOPASDFGHJKLÑZXCVBNM";
	String Num = "1234567890";

	pass = "";
	for (int i = 0; i < digit; i++) {
	    int rand = (int) (3 * Math.random());

	    switch (rand) {
		case 0:
		    pass += String.valueOf((int) (0 * Math.random()));
		    break;
		case 1:
		    rand = (int) (Mayus.length() * Math.random());
		    pass += String.valueOf(Mayus.charAt(rand));
		    break;
		case 2:
		    rand = (int) (Num.length() * Math.random());
		    pass += String.valueOf(Num.charAt(rand));
		    break;

	    }

	}
    }
    
    public void generarMayusSimb() {
	String Mayus = "QWERTYUIOPASDFGHJKLÑZXCVBNM";
	String Simb = "!{#)$%[&/(=?¡]*¿_-:;+}\"";

	pass = "";
	for (int i = 0; i < digit; i++) {
	    int rand = (int) (3 * Math.random());

	    switch (rand) {
		case 0:
		    pass += String.valueOf((int) (0 * Math.random()));
		    break;

		case 1:
		    rand = (int) (Mayus.length() * Math.random());
		    pass += String.valueOf(Mayus.charAt(rand));
		    break;
		case 2:
		    rand = (int) (Simb.length() * Math.random());
		    pass += String.valueOf(Simb.charAt(rand));
		    break;

	    }

	}
    }
    
    public void generarMinusNum() {
	String Minus = "qwertyuiopasdfghjklñzxcvbnm";
	String Num = "1234567890";

	pass = "";
	for (int i = 0; i < digit; i++) {
	    int rand = (int) (3 * Math.random());

	    switch (rand) {
		case 0:
		    pass += String.valueOf((int) (0 * Math.random()));
		    break;
		case 1:
		    rand = (int) (Minus.length() * Math.random());
		    pass += String.valueOf(Minus.charAt(rand));
		    break;
		case 2:
		    rand = (int) (Num.length() * Math.random());
		    pass += String.valueOf(Num.charAt(rand));
		    break;

	    }

	}
    }
    
    public void generarMinusSimb() {
	String Minus = "qwertyuiopasdfghjklñzxcvbnm";
	String Simb = "!{#)$%[&/(=?¡]*¿_-:;+}\"";

	pass = "";
	for (int i = 0; i < digit; i++) {
	    int rand = (int) (3 * Math.random());

	    switch (rand) {
		case 0:
		    pass += String.valueOf((int) (0 * Math.random()));
		    break;
		case 1:
		    rand = (int) (Minus.length() * Math.random());
		    pass += String.valueOf(Minus.charAt(rand));
		    break;
		case 2:
		    rand = (int) (Simb.length() * Math.random());
		    pass += String.valueOf(Simb.charAt(rand));
		    break;

	    }

	}
    }
    
    public void generarNumSimb() {
	String Num = "1234567890";
	String Simb = "!{#)$%[&/(=?¡]*¿_-:;+}\"";

	pass = "";
	for (int i = 0; i < digit; i++) {
	    int rand = (int) (3 * Math.random());

	    switch (rand) {
		case 0:
		    pass += String.valueOf((int) (0 * Math.random()));
		    break;
		case 1:
		    rand = (int) (Num.length() * Math.random());
		    pass += String.valueOf(Num.charAt(rand));
		    break;
		case 2:
		    rand = (int) (Simb.length() * Math.random());
		    pass += String.valueOf(Simb.charAt(rand));
		    break;

	    }

	}
    }
    
    public void generarMayus() {
	String Mayus = "QWERTYUIOPASDFGHJKLÑZXCVBNM";
	
	int rand;
	pass = "";
	for (int i = 0; i < digit; i++) {
	    rand = (int) (Mayus.length() * Math.random());
	    pass += String.valueOf(Mayus.charAt(rand));
	}
    }
    
    public void generarMinus() {
	String Minus = "qwertyuiopasdfghjklñzxcvbnm";
	
	int rand;
	pass = "";
	for (int i = 0; i < digit; i++) {
	    rand = (int) (Minus.length() * Math.random());
	    pass += String.valueOf(Minus.charAt(rand));
	}
    }
    
    public void generarNum() {
	String Num = "1234567890";
	
	int rand;
	pass = "";
	for (int i = 0; i < digit; i++) {
	    rand = (int) (Num.length() * Math.random());
	    pass += String.valueOf(Num.charAt(rand));
	}
    }
    
    public void generarSimb() {
	String Simb = "!{#)$%[&/(=?¡]*¿_-:;+}\"";
	
	int rand;
	pass = "";
	for (int i = 0; i < digit; i++) {
	    rand = (int) (Simb.length() * Math.random());
	    pass += String.valueOf(Simb.charAt(rand));
	}
    }

    public String getPass() {
	return pass;
    }
}