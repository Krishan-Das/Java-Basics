public class Variables_and_DataTypes_01 {
    public static void main(String[] args) {

        // This is a Single Line comment

        /*
        Multiline
        Comment
        can be written like this.....
         */

        // Java is a purely Object Oriented Programming Language




//        # data Types ********************************************************************************************
        // ## Integer type number can store in (byte, short, int)

//  ### byte    -->  it can be store (-128 to 127).  and byte datatype takes 1 byte in memory to store number
        byte num = -128;   // Note: 128,129,...  -129, -130,-131....  can't be store in byte
        byte num2 = 127;
        System.out.println(num);

//  ### short   --> It takes 2 byte
        short num3 = 32767;  // 32768 (Store nahi kiya ja sakta)

//  ### int   --> It takes 4 byte
        int num4 = 32768;

//  ### long   --> it takes 8 byte and can store very long number
        long num5 = 6353655645566464635l;   // l is mendatory..      34 -wrong / 34l -correct.
        System.out.println(num5);




//        *********************************************************************************************
            //  ## Floating (decimal/ point number can be store in (float, double)

//  ###  float    --> It takes 4 byte
        float num6 = 2255f;      // float a = 2; --> error  //  float a = 2f; --> correct. f is mendatory.
        System.out.println(num6);

//  ### double   --> it takes 8 byte and can store big floating value.
        double num7 = 3554531.34;   // double num6 = 35564.54d  d likhne se ya na likhnese koi fadk nahi padta. by default d
        System.out.println(num7);





//        *********************************************************************************************
        //  ## Charactors ---  Alphabet (a,b,c ......)

//  ### char     --> takes 2 byte and can store charactors
        char ch = 'A';
        System.out.println(ch);




//        **********************************************************************************************
        // We can use also   "var"
        var a = 52;   // int a = 52
        System.out.println(a);
        var b = 463.24f;  // float b = 463.24f;
        System.out.println(b);
        var name = "Krishan Das";     //String name = "Krishan Das";
        System.out.println(name);






    }
}
