import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralConverterTest {
//
//      @Test
//
//     void shouldReturnEmptyStringIfNullValueIsPassed()
//      {
//          RomanNumeral roman=new RomanNumeral();
//
//          assertEquals(null,roman.convert(0));
//
//      }

//      @Test
//      void shouldThrowExceptionIfNumberIsInDecimal(){
//          RomanNumeral roman=new RomanNumeral();
//
//          assertThrows(
//                  IllegalArgumentException.class,()->{
//                      roman.convert(1.2);
//                  }
//          );
//      }

      @Test
     void shouldThrowWExceptionIfNumberIsOutOfRange(){

          RomanNumeral roman=new RomanNumeral();
          assertThrows(IllegalArgumentException.class,()->{
              roman.convert(4000);
          });

          assertThrows(IllegalArgumentException.class,()->{
              roman.convert(0);
          });

      }

      @Test
       void shouldReturnRomanNumberForOne()
      {
          RomanNumeral roman=new RomanNumeral();
          assertEquals("I",roman.convert(1));
      }

    @Test
    void shouldReturnRomanNumberForAny()
    {
        RomanNumeral roman=new RomanNumeral();
        assertEquals("CXXI",roman.convert(121));
        assertEquals("MMDCCCLVI",roman.convert(2856));
        assertEquals("XXXVII",roman.convert(37));
        assertEquals("MMMCMXCVIII",roman.convert(3998));
    }



}
