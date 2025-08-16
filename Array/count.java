package Array;
import java.util.*;
/**  
  *Define a class to delacre a character array to store n characters into an array and perform the follwoing:
  *1.Count total characters in Uppercase
  *2. Count total number of vowels and consonant in the array
 */
class count
{
    public static void main()
    {
        Scanner c=new Scanner(System.in);
        System.out.println("Enter the element number");
        int n=c.nextInt();
        char array[]=new char[n];
        int upper=0,vowel=0,consonent=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the elements");
            array[i]=c.next().charAt(0);
        }
        for(int i=0;i<n;i++)
        {
            
            if(Character.isUpperCase(array[i])==true)
            upper++;
            if(array [i]=='a'||array [i]=='e'||array [i]=='i'||array [i]=='o'||array [i]=='u'||array [i]=='A'||array [i]=='E'||array [i]=='I'||array [i]=='O'||array [i]=='U')
            vowel++;
            else
            consonent ++;
        }
        System.out.println("There are "+upper+ " upper case letters");
        System.out.println("There are "+vowel+ " vowels");
        System.out.println("There are "+consonent+ " consonants");
        c.close();
    }
}
    