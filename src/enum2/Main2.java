package enum2;

public class Main2 {
    public static void main(String[] args) {
        Week2 today = Week2.MONDAY;
        Week2 holiday = null;
        System.out.println(holiday);
        System.out.println(today == Week2.MONDAY);
        System.out.println(today.name());
        System.out.println(Week2.MONDAY.ordinal());
        System.out.println(Week2.SUNDAY.ordinal());
        System.out.println(today.ordinal());
        System.out.println(today.compareTo(Week2.SATURDAY));
        System.out.println(Week2.SATURDAY.compareTo(Week2.TUESDAY));
        Week2[] days = Week2.values();
        for(Week2 day : days){
            System.out.printf("%s(%s,%s)\n",day.name(),day.getKorean(),day.getEnglish());
        }
    }
}