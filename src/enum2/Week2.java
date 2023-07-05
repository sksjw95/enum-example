package enum2;

public enum Week2 {
    MONDAY("월요일","mon"),
    TUESDAY("화요일","tue"),
    WEDNESDAY("수요일","wed"),
    THURSDAY("목요일","thu"),
    FRIDAY("금요일","fri"),
    SATURDAY("토요일","sat"),
    SUNDAY("일요일","sun");

    private String korean;
    private String english;

    Week2(String korean, String english){
        this.korean = korean;
        this.english = english;
    }
    public String getKorean(){
        return korean;
    }
    public String getEnglish(){
        return english;
    }
}
