package java.dz6;

public class CountInt implements Comparable {
    Integer numInt ;

    public CountInt(Integer i) {
        this.numInt = i ;
    }

    @Override
    public int compareTo(Object o) {
        if (this.numInt==0) return 0 ;
        else if (this.numInt%2==0) return -1 ;
        else return 1 ;
    }
}