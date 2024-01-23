package org.nic.digitalsignature;

import java.io.*;  
import java.security.*;  
import java.security.spec.*;  
public class VerifyDigitalSignature  
{  
public static void main(String args[])   
{  
/* Verify a DSA signature */  
try  
{  
/* import encoded public key */  
FileInputStream keyfis = new FileInputStream("E:\\Digital Signature\\publickey.txt");  
byte[] encKey = new byte[keyfis.available()];    
keyfis.read(encKey);  
keyfis.close();  
X509EncodedKeySpec pubKeySpec = new X509EncodedKeySpec(encKey);  
KeyFactory keyFactory = KeyFactory.getInstance("DSA", "SUN");  
PublicKey pubKey = keyFactory.generatePublic(pubKeySpec);  
/* input the signature bytes */  
FileInputStream sigfis = new FileInputStream("E:\\Digital Signature\\signature.txt");  
byte[] sigToVerify = new byte[sigfis.available()];   
sigfis.read(sigToVerify );  
sigfis.close();  
/* create a Signature object and initialize it with the public key */  
Signature sig = Signature.getInstance("SHA1withDSA", "SUN");  
sig.initVerify(pubKey);  
/* Update and verify the data */  
FileInputStream datafis = new FileInputStream("E:\\Digital Signature\\policy.pdf");  
BufferedInputStream bufin = new BufferedInputStream(datafis);  
byte[] buffer = new byte[200];  
int len;  
while (bufin.available() != 0)   
{  
len = bufin.read(buffer);  
sig.update(buffer, 0, len);  
};  
bufin.close();  
boolean verifies = sig.verify(sigToVerify);  
System.out.println("signature verifies: " + verifies);  
}   
catch (Exception e)   
{  
System.err.println("Caught exception " + e.toString());  
};  
}  
}  
