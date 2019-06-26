public class BarkingDog {
    public static boolean shouldWakeUp (boolean barking, int hourOfDay){

    if (barking) {
        barking  = hourOfDay < 8 || hourOfDay > 22;
    }
    if (hourOfDay < 0 || hourOfDay > 23) {
        barking = false;
    }

        return barking;
    }
}
