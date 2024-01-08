//Nate Phillips, professor for COMP 142

//These statements are import statements-they pull in functionality you may want to use.
//For example, this package lets you use the *scanner.*

class forLoop
{
    public static void main(String[] args)
    {
        int i = 0;
        String roundCount = "Round # ";

        while (i < 20)
        {
            System.out.println(i);

            i = i + 3;
        }

        for(int j = 0; j < 5; j++)
        {
            System.out.println(j+1);
        }

        i = 3;
        while(i >= 0)
        {
            roundCount = roundCount + "I ";

            for(int k = 0; k < 5; k++)
            {
                System.out.println(roundCount + k);
            }

            i--;
        }
    }
}