// Lop Time (constructors) & set/get methods
public class Time {
    private int hour;
    private int minute;
    private int second;

    // Constructor default
    public Time() {
        setTime(0, 0, 0);
    }

    // Constructor chi co gio
    public Time(int h) {
        setTime(h, 0, 0);
    }

    // Constructor gio + phut
    public Time(int h, int m) {
        setTime(h, m, 0);
    }

    // Constructor gio + phut + giay
    public Time(int h, int m, int s) {
        setTime(h, m, s);
    }

    // Gan toan bo thoi gian
    public Time setTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
        return this;
    }

    // Gan gio (0–23)
    public Time setHour(int h) {
        hour = (h >= 0 && h < 24) ? h : 0;
        return this;
    }

    // Gan phut (0–59)
    public Time setMinute(int m) {
        minute = (m >= 0 && m < 60) ? m : 0;
        return this;
    }

    // Gan giay (0-59)
    public Time setSecond(int s) {
        second = (s >= 0 && s < 60) ? s : 0;
        return this;
    }

    // Getter
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // In ra chuoi (gio-phut-giay)
    @Override
    public String toString() {
        int displayHour = (hour == 0 || hour == 12) ? 12 : hour % 12;
        String ampm = (hour < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", displayHour, minute, second, ampm);
    }
}