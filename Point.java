/**
  Represent a point, using Cartesian coordinates
 */
public class Point implements Comparable {
    private double xcor;
    private double ycor;
    
    /**
      @return  a negative integer, zero, or a positive integer
      depending on whether this Point is closer, 
      equidistant, or farther than the Point referred to
      by the parameter.
     */
    public int compareTo( Object otherObj){
        double thisDistance = Math.sqrt( Math.pow( xcor,2)
					 + Math.pow( ycor,2));
	double otherDistance = Math.sqrt( Math.pow( ((Point) otherObj).xcor,2)
					  + Math.pow( ((Point) otherObj).ycor,2));
	if (thisDistance < otherDistance) return -1;
	else if (thisDistance == otherDistance) return 0;
	else return 1;
    }

    // -------- previously-written code ----------
    // constructor
    public Point( double xcor, double ycor) {
        this.xcor = xcor;
        this.ycor = ycor;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        return "(" + xcor + "," + ycor + ")"; 
    }

}
