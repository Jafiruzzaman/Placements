package Operators;

public class operators {
    public static void main(String[] args) {
        System.out.println("operators in java");
        /*
        There are 6 type of Operator's in java
        1. assignment operator ==> =,+=,-=,*=,/=,%=
        2. arithmetic operator ==> +,-,*,/%
        3. relational operator ==> >,>=,<,<=,==,!=
        4. logical operator ==> &&,|| !
        5. bitwise operator ==> ^,|,<<,>>
        6. unary operator
         */

//        1. assignment operator ==> =,+=,-=,*=,/=,%=
        int a = 10;
        int b= 5;
        System.out.println(a+=b);
        System.out.println(a-=b);
        System.out.println(a*=b);
        System.out.println(a/=b);
        System.out.println(a%=b);

//        2. arithmetic operator ==> +,-,*,/%
        System.out.println("The sum of a + b is "+(a+b));
        System.out.println("The sum of a - b is "+(a-b));
        System.out.println("The sum of a * b is "+(a*b));
        System.out.println("The sum of a / b is "+(a/b));
        System.out.println("The sum of a % b is "+(a%b));

//        3. relational operator ==> >,>=,<,<=,==,!=
        System.out.println("is 15 is greater than 5 "+(a>b));
        System.out.println("is 15 is greater than or equals to 5 "+(a>=b));
        System.out.println("is 15 is greater than 5 "+(a<b));
        System.out.println("is 15 is less than or equals to 5 "+(a<=b));
        System.out.println("is 15 is equals to 5 "+(a==b));
        System.out.println("is 15 is not equals to 5 "+(a!=b));

//        4. logical operator ==> &&,|| !
        System.out.println("a is > b or a == b "+((a>b)&&(a==b)));
        System.out.println("a is > b or a == b "+((a>b)||(a==b)));
        System.out.println("it turn false to "+(!false));

//        5. bitwise operator ==> ^,|,<<,>>
        System.out.println("15 & 5 is "+(a&b));
        System.out.println("15 | 5 is "+(a|b));
        System.out.println("15 ^ 5 is "+(a^b));
    }

}
