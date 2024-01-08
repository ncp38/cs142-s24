//Nate Phillips, professor for COMP 142

class classPractice
{
    public static void main(String[] args)
    {
        //Example 1 - Summing an array
        int[] input = {1,2,3, 11};

        //How do we call sumArray and print out the result?
        System.out.println(sumArray(input));

        //Example 2 - Reverse Print
        String[] input2 = {"Egg", "Brown", "The"};
        reversePrint(input2);
    }

    static int sumArray(int[] x)
    {
        int output = 0;

        for(int i = 0; i< x.length; i++)
        {
            output+=x[i];
        }
        return output;
    }

    public static void reversePrint(String[] input)
    {
        int i = input.length;
        while (i > 0)
        {
            System.out.println(input[i-1] +" ");
            i--;
        }
    }
}