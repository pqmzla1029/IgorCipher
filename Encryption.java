
package CSS.ownCipher;

import java.util.Scanner;

/**
 *
 * @author Igor
 */
public class Encryption {
    
    
    String ct="";
    public String inputString()
    //public void inputString()
    {
        String sentence="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        sentence=sc.nextLine();
        sentence=sentence.toLowerCase();
        String key=encryptString(sentence);
        return key;
    }

    private String encryptString(String sentence)
    {
        
        System.out.println("ENCRYPTION");
        String key;
        char p,k,c;
        key=generateKey(sentence.length());
        System.out.println("KEY  - "+key);
        for(int i=0;i<sentence.length();i++)
        {
        p=(char)(((int)sentence.charAt(i))-97);
        k=(char)(key.charAt(i)-65);
        c=(char)((p+k)%26);
        c=(char)(c+65);
        //System.out.println(c);
        ct=ct+c;
        }
        System.out.println("Cyper Text - "+ct);
        IgorCipher.string=ct;
        return key;
    }



    private String generateKey(int stringLength) {
        String key="";
        char[] r=new char[stringLength];
        int lower=0;
        int upper=25;
        int count=0,flag=0;
        while(stringLength>0)
        {
            flag=0;
        char randomAlphabet = (char)(((int)((Math.random() * (upper - lower)+lower)))+65);
        for(int i=1;i<count;i++)
        {
            if(r[count]==randomAlphabet)
            {
                flag=1;
            }
        }
        if (flag==1)
        {
            continue;
        }
        r[count]=randomAlphabet;


        //System.out.print(randomAlphabet);

        key=key+randomAlphabet;
        stringLength=stringLength-1;
        count++;
        }
        System.out.println("Input Size - "+count);//Key Size
         //for(int i=0;i<count;i++)
           // System.out.print(r[i]);
        //System.out.println();
        return key;
    }
    
    
    
}
