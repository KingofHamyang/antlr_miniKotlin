import java.util.*;
class output {
public static void main ( String[] args)  { 
class StringLength {
Integer StringLength ( Object obj )  { 
if ( obj instanceof String  ) {
return ((String )obj).length() ;
}
 
return null ;

}
}

System.out.println( new StringLength().StringLength( "String"  )  ) ;
System.out.println( new StringLength().StringLength( 123  )  ) ;
}
}
