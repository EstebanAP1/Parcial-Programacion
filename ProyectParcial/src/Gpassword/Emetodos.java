package Gpassword;

import javax.crypto.*;
import javax.crypto.spec.*;
import javax.swing.JOptionPane;

public class Emetodos {
//
//    public static void main(String [] args){
////        System.out.println("Hola Mundo");
//        
//        String clave_insegura = JOptionPane.showInputDialog("digite contraseña");
//	
//
////        for(int i = 0; i < 10; i++){
//            setCifrado(clave_insegura);
//            byte[] clave_segura = getCifrado();
//	    System.out.println("");
//	    System.out.println("contraseña encriptada:");
//            System.out.println(clave_segura);
//	    System.out.println("");
//	    System.out.println("contraseña desencriptada:");
//	    System.out.println(clave_insegura);
//	    System.out.println("");
//     
//    }

    public void setCifrado(String key){
        String clave = key;

        byte[] keyData = clave.getBytes();

        SecretKeySpec ks = new SecretKeySpec(keyData, "Blowfish");

        try{
    
            Cipher cp = Cipher.getInstance("Blowfish");

            cp.init(Cipher.ENCRYPT_MODE, ks);

            secureKey = cp.doFinal(clave.getBytes());

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public byte[] getCifrado(){
        return secureKey;
    }

    private byte[] secureKey;

}