package oop.encap.good;

public class MyBirth {

    // 외부에서 변수에 직접 접근할 수 없도록 필드에 private 제한을 붙임
    private int year;
    private int month;
    private int day;

    /*
      # setter method
     1. setter는 숨겨진 변수에 값을 저장하기 위한 메서드 입니다.

     2. 메서드 내부에 데이터 유효성 검증 로직을 작성하여
      적절한 데이터만 멤버변수에 저장시키고, 접근제한자는
      public으로 설정하여 외부에서 누구나 사용할 수 있게 합니다.

     3. 메서드 이름은 일반적으로 set + 필드이름 으로 설정합니다.
     */

    public void SetYear(int year) {  // setYear : 메서드
        if(year < 1900 || year > 2025) {
            System.out.println("잘못된 연도 입력입니다");
            return;
        }
        this.year = year; // 객체를 이용해서 setYear 를 부른 것이므로
    }

    public int getYear(){
        return this.year;
    }

    /*
     - month와 day의 setter / getter 메서드를 선언하세요.
     - month: 1 ~ 12
     - day: 1 ~ 31
     - getter 메서드는 따로 비밀번호 등 권한 검사 없이
      바로 return 속성값 해 주세요.
     */


    public int getMonth() {
        return month; // this.month 가 생략되어 있다 1!!
        // 의미 : getMonth 를 불러온 그 객체의 month 를 return 해야 한다 !
    }

    public void setMonth(int month) {
        if(month < 1 || month > 12) {
            System.out.println("잘못된 월 입력입니다");
            return;
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day < 1 || day > 31) {
            System.out.println("잘못된 일 입력입니다");
            return;}
        else {
            if (this.month == 0){
                System.out.println("일자를 입력하기 위해서는 월 입력이 선행되어야 합니다");
                return;
            }
            isValidateMonth(day);
        }
        
        
        
        this.day = day;
    }

    private void isValidateMonth(int day) {  // 외부에서 부를 필요가 없으므로 private
    }
    /*
     # getter method

     1. getter는 숨겨진 변수의 값을 참조할 때 사용하는 메서드입니다.

     2. setter와 마찬가지로 public제한을 통해 외부에 메서드를 공개하고,
      이름은 일반적으로 get + 멤버변수이름 으로 지정합니다.
     */

}
