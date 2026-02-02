package solid_principle;

public class SRP {

    private static SRP srp;
    private static final Object mutex = new Object();

    private SRP() {
    }

    public static SRP getInstance() {

        synchronized (mutex) {
            if (srp == null) {
                srp = new SRP();
            }
        }
        return srp;
    }

}