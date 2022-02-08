package task4;

public class EndlessStreamOfRandomIntegers {
    private double a, m;
    private int c;
    private long seed;

    public EndlessStreamOfRandomIntegers(double a, double m, int c) {
        this.a = a;
        this.m = m;
        this.c = c;
    }

    public EndlessStreamOfRandomIntegers random(long seed) {
        this.seed = seed;
        return this;
    }


    public long next() {
         long nextNum = (long) ((a * seed + c) % m);

    return nextNum ;
}


}
