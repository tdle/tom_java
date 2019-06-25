public class SpeedConverter {

    public static long twoMilesPerHour(double kilometresPerHour) {

        if (kilometresPerHour < 0) {
            return -1;
        }

        return Math.round(kilometresPerHour / 1.609);
    }
}
