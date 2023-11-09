package LearningBasicJava.String;

public class Anagram {
    public static void main(String[] args) {

        String a= "acct";
        String b= "act";
        boolean isAnagram= false;
        if(a.length()!=b.length())
            System.out.println("not anagram");
        else
        {
            for(int i=0;i<a.length();i++)
            { char c=a.charAt(i);
                isAnagram= false;
                for (int j=0;j<b.length();j++)
                {
                    if(b.charAt(j)==c)
                    {
                        isAnagram=true;
                        break;
                    }
                }
                if(!isAnagram)
                    break;

            }

            if(isAnagram)
                System.out.println("anagram");
            else
                System.out.println("not anagram");
        }
    }
}
