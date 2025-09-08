public class TestTime {
    public static void testtime() {
        Time t1 = new Time(); // 00:00:00
        Time t2 = new Time(20, 3 ,45); //20:03:45

        t1.setHour(7).setMinute(32).setSecond(23);

        System.out.println("t1 is " + t1);
        System.out.println("t2 is " + t2); 
    }
}