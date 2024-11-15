public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addMinutes = Integer.parseInt(args[1]);

        int newTimeAllMinutes = hours * 60 + minutes + addMinutes;
        int totalHours = newTimeAllMinutes / 60;
        int newTimeHour = totalHours % 24;
        int newTimeMinutes = newTimeAllMinutes - (totalHours * 60);

        System.out.printf("%02d:%02d\n", newTimeHour,newTimeMinutes);
    }
}
