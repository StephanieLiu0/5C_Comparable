/**
  Represent a date
 */
public class Date implements Comparable {
    private int y,m,d;
    

    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }

    /**
      @return  a negative integer, zero, or a positive integer
     */
    public int compareTo( Object otherObj) {
        if (y > (int) ((Date) otherObj).y)
	    return 1;
	else if (y < (int) ((Date) otherObj).y)
	    return -1;
	else {
	    if (m > (int) ((Date) otherObj).m)
		return 1;
	    else if (m < (int) ((Date) otherObj).m)
		return -1;
	    else if (d > (int) ((Date) otherObj).d)
		return 1;
	    else if (d < (int) ((Date) otherObj).d)
		return -1;
	    else return 0;
	}
    }

}
