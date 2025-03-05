package etc.api.time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("date.getMonth() = " + date.getMonth());

        System.out.println("===========================================");

        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);

        LocalTime nowTime = LocalTime.now();
        System.out.println("nowTime = " + nowTime);

        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime = " + nowDateTime);

        System.out.println("===========================================");

        // 특정 날짜와 시간 정보 얻기
        LocalDateTime beginDate = LocalDateTime.of(2022, 7, 1, 9, 0, 0);
        System.out.println("beginDate = " + beginDate);

        // 연,월,일 따로 추출
        LocalDateTime localDateTime = LocalDateTime.now();
        int year = localDateTime.getYear();

        // 문자 형태의 월 리턴 (month 라는 열거형 타입이 리턴)
        Month month = localDateTime.getMonth();
        System.out.println("month = " + month);


        // 정수  형태의 월 리턴
        int monthValue = localDateTime.getMonthValue();
        System.out.println("monthValue = " + monthValue);

        // 일 추출
        int dayOfMonth = localDateTime.getDayOfMonth();
        System.out.println("dayOfMonth = " + dayOfMonth); // 한 달 중에 몇 일 째 냐 ?

        // 요일 추출
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek); // 1주일 중에 몇 일 째 냐 ?


        // 지금으로 부터 3일 뒤
        LocalDateTime d3 = localDateTime.plusDays(3);
        System.out.println("d3 = " + d3);


        // 지금으로 부터 3일 뒤
        // 메서드의 호출행위는 return 값으로 봐도 됨.
        LocalDateTime d4 = localDateTime
                            .plusYears(1)
                            .plusMonths(2)
                            .plusDays(7);   // 메서드 체이닝

        System.out.println("d4 = " + d4);

        // 지금으로부터 2개월 23일 전
        LocalDateTime d5 = localDateTime.minusMonths(2).minusDays(23);
        System.out.println("d5 = " + d5);


        // 사이 날짜 연산
        LocalDate b = LocalDate.of(2020,12,30);
        LocalDate f = LocalDate.of(2022,9,14);

        long between = ChronoUnit.DAYS.between(b,f);
        System.out.println("between = " + between);


        System.out.println("===========================================");

        System.out.println(localDateTime);
        
        // 날짜 포맷 변경하기

        DateTimeFormatter dtf =
        DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초 ㅋㅋㅋ");
        // hh -> 12시간 제 ,  HH -> 24시간제

        // 준비한 DateTimeFormatter 객체를 format() 의 매개값으로 전달
        String formatDate = localDateTime.format(dtf);
        System.out.println("formatDate = " + formatDate);
        
        
        
        
        
        








    }
}








