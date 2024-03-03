public class RomanNumeral {


    public String convert(int number) {

            if(number<1 || number >3999)
            {
                throw new IllegalArgumentException("Number out of range (1 to 3999)");
            }

            StringBuilder result=new StringBuilder();

            int [] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
            String [] romanLetters={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

            for(int i=0;i< values.length;i++)
            {
                while(number>=values[i])
                {

                    result.append(romanLetters[i]);
                    number-=values[i];
                }

            }

            return result.toString();



    }
}
