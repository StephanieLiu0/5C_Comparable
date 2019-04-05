/**
  exercise Comparable types
 */

public class UserOfComparability {

    public static void main(String[] commandLine) {
        System.out.println( System.lineSeparator()
                          + "Point comparisons");

        // Point vs. itself
        Point p0 = new Point( 3., 4.);
        reportRelationship( "Point vs. itself", p0, p0, "0");

        // Point vs. its reflection about y = x
        reportRelationship( "Point vs. its reflection about y = x"
                          , p0, new Point( 4., 3.), "0");

        // Point vs. point closer to origin
        reportRelationship( "Point vs. point closer to origin", p0
                          , new Point( 1., 2.), "positive int");

        // Point vs. distant point
        reportRelationship( "Point vs. distant point", p0
                          , new Point( 100., 2.), "negative int");
        System.out.println( "---- end of Point comparisons ----");
        
        System.out.println( System.lineSeparator()
                          + "Date comparisons");

	// Date vs. itself
	Date today = new Date ( 2019, 04, 04);
	reportRelationship( "Date vs. itself", today, today, "0");

	// Date vs. my birthday
	reportRelationship( "Date vs. my birthday", today, new Date ( 2002, 12, 16), "positive int");

	// Date vs. tomorrow
	reportRelationship( "Date vs. tomorrow", today, new Date ( 2019, 04, 05), "negative int");

	System.out.println( "---- end of Date comparisons ----");
        
        // System.out.println( System.lineSeparator()
        //                   + "Dog comparisons");

	// IncomparableDog retriever = new IncomparableDog();
	// IncomparableDog husky = new IncomparableDog();

	// reportRelationship ( "Retriever vs. husky", retriever,
	// 		     husky, "compiler error");
	
	System.out.println( "---- end of IncomparableDog comparisons ----");

        // System.out.println( System.lineSeparator()
        //                   + "Point and Date comparisons");

	// reportRelationship ( "Point vs. Date", p0, today, "JVM error");

	System.out.println( "---- end of Point and Date comparisons ----");

    }


    /**
      Print the results of comparing two entities.
     */
    private static void reportRelationship 
      ( String description
      , Comparable a
      , Comparable b
      , String expect
      ) {
        System.out.println( description);

        // check 
        System.out.println(
            a + " compareTo " + b + ": "
          + a.compareTo( b)
            /* eventually expecting a compiler warning: 
              warning: [unchecked] unchecked call to compareTo(T) as a member of the raw type Comparable
              where T is a type-variable:
                T extends Object declared in interface Comparable
             */
          
          + " ...expecting " + expect
          + System.lineSeparator());
     }
}
