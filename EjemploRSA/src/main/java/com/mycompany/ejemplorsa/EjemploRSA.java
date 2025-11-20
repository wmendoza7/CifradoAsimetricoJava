package com.mycompany.ejemplorsa;

/**
 *
 * @author wamp9
 */

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import javax.crypto.Cipher;


public class EjemploRSA {

    public static void main(String[] args) {
        try {
            // GENERAR CLAVES RSA
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
            keyGen.initialize(2048);
            KeyPair pair = keyGen.generateKeyPair();

            PublicKey publicKey = pair.getPublic();
            PrivateKey privateKey = pair.getPrivate();

            System.out.println("Claves generadas correctamente.");

            // MENSAJE A CIFRAR
            String mensaje = "Este es un mensaje cifrado con RSA.";
            System.out.println("\nMensaje original: " + mensaje);

            // CIFRADO CON CLAVE PÚBLICA
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);

            // MENSAJE CIFRADO
            byte[] mensajeCifradoBytes = cipher.doFinal(mensaje.getBytes());
            String mensajeCifrado = Base64.getEncoder().encodeToString(mensajeCifradoBytes);
            System.out.println("\nMensaje cifrado:");
            System.out.println(mensajeCifrado);
            

            // DESCIFRADO CON CLAVE PRIVADA
            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            byte[] mensajeDescifrado = cipher.doFinal(mensajeCifradoBytes);

            System.out.println("\nMensaje descifrado: " + new String(mensajeDescifrado));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
