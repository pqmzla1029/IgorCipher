/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSS.ownCipher;

/**
 *
 * @author Igor
 */
public class Decryption {
    
    String ct="";
        private String decryptString(String key)
    {
        System.out.println("DECRYPTION");
        String pt="";
        char p,k,c;

        for(int i=0;i<ct.length();i++)
        {
        c=(char)(((int)ct.charAt(i))-65);
        k=(char)(key.charAt(i)-65);
        int x=(c-k)%26;
        if(x<0)
            x=x+26;
        p=(char)(x);
        //System.out.println(p);
        p=(char)(p+97);
       // System.out.println((c-k)%26);
        pt=pt+p;
        }
        System.out.println("Plain Text - "+pt);
        return pt;
    }
        
    public void output(String cipherText,String key)
    {
        ct=cipherText;
        String plainText=decryptString(key);
    }
}
