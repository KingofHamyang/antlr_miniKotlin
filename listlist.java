import java.util.*;
class Main{
static String feeling ( String day )  { 
switch (day ) {
case "Mon" : return "sad" ;
case "Sat" : return "happy" ;
default : return "bad" ;
}
 
}
public static void main ( String[] args)  { 
System.out.println( "Wednesday is " + (feeling( "Wed"  ) )  ) ;
System.out.println( "Saturday is " + (feeling( "Sat"  ) )  ) ;
}
}

