package enum2;

public class Main {
    public static void main(String[] args) {
        Level level = Level.MEDIUM;
        Level[] allLevels = Level.values();
        for(Level x : allLevels){
            System.out.printf("%s=%d\n", x.name(),x.ordinal());
        }

        Level findLevel = Level.valueOf("LOW");
        System.out.println(findLevel);
        System.out.println(Level.LOW == Level.valueOf("LOW"));

        switch (level){
            case LOW:
                System.out.println("낮은 레벨");
                break;
            case MEDIUM:
                System.out.println("중간 레벨");
                break;
            case HIGH:
                System.out.println("높은 레벨");
                break;
        }
        System.out.println(Level.valueOf("MEDIUM"));
    }
}