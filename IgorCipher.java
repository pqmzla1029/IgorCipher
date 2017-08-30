/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSS.ownCipher;
import CSS.ownCipher.Decryption;
import CSS.ownCipher.Encryption;
import CSS.ownCipher.MatrixOperations;
import java.util.Scanner;
/**
 *
 * @author Igor
 */
public class IgorCipher {
    
    static int keymatrix[][];
    static int linematrix[];
    static int resultmatrix[];
    static String resultString="";
    static String string="";
    
   private void matrixMethod(String line,String keyx)
    {
         String inverseKey="";
        MatrixOperations obj = new MatrixOperations();
        Scanner sc = new Scanner(System.in);
   
        String key="whatupnig";

        double sq = Math.sqrt(key.length());
        if (sq != (long) sq)

            System.out.println("Invalid key length!!! Does not form a square matrix...");

        else

        {

            int s = (int) sq;
            System.out.println("ENCODING  :");
            if (obj.check(key, s))
            {
                System.out.println("Result:");
                obj.breakInputString(line, s);
                inverseKey = obj.findCofactor(keymatrix, s);
            }

            System.out.println("CT= "+resultString);
            System.out.println("");
            
            Matrix2Operations mo=new Matrix2Operations();
            String keyy=keyx.substring(2);
            String ct=mo.perform(resultString,keyy);
            ct=mo.perform(ct,keyy);
            System.out.println(ct);
            ct=mo.rperform(ct,keyy);
            ct=mo.rperform(ct,keyy);
            System.out.println(ct);
            int end=resultString.length();
            ct=ct.substring(0, end);
            System.out.println(ct);
            
            System.out.println("DECCODING  :");
            if (obj.check(inverseKey, s))
            {
                System.out.println("Result:");
                obj.breakInputString(ct.toLowerCase(), s);
                obj.findCofactor(keymatrix, s);
            }
        }
    }
    
    public static void main(String[] args)
    {
        String key;
        String full="";
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter String And Key");
//        full=sc.nextLine();
//        for(int i=0;i<full.length();i=i+5)
//        {
        //Scanner sc=new Scanner(System.in);
        Encryption en=new Encryption();
        Decryption dec=new Decryption();
        IgorCipher ig=new IgorCipher();
        
        key=en.inputString();
        
        //key=en.inputString(full.substring(i,i+5));
        System.out.println(string+"-"+key+"-");
//        en.inputString();
//        System.out.println("Enter String And Key");
//        string=sc.nextLine();
//        key=sc.nextLine();
        
        //System.out.println(string+" + "+key);
        ig.matrixMethod(string.toLowerCase(),key);
        System.out.println(resultString);
        String temp=resultString.toUpperCase();
        String s=temp.substring((key.length()+1), (2*key.length() +1));
        System.out.println(s);
        dec.output(s,key);
        }
        
    
    
}
