public class RomanNumerals {

    public static void intToRoman(int num)
    {
        System.out.println("Integer: " + num);
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman = new StringBuilder();
        for(int i=0;i<values.length;i++)
        {
            while(num >= values[i])
            {
                num = num - values[i];
                roman.append(romanLetters[i]);
            }
        }
        System.out.println("Roman Numerals: " + roman.toString());
    }

    public static void main(String args[]){
        intToRoman(7);
        intToRoman(22);
        intToRoman(777);
        intToRoman(1567);

    }
}
