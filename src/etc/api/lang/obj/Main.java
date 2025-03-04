package etc.api.lang.obj;

public class Main {
    public static void main(String[] args) {

        Person kim = new Person("김춘식", 30);
        Person hong = new Person("김춘식", 30);


        System.out.println(kim.toString());
        System.out.println(kim);

        // 오버라이딩 전 : 주소값
        // 오버라이딩 후 : 객체에 대한 필드 값 정보

        // 객체타입의 변수를 출력하거나 값을 얻을 떄는
        // 뒤에 자동으로 .toString() 이 붙어서 진행 (Object 가 물려주는 메서드)


        System.out.println(kim.equals(hong)); // name 과 age 가 같은가?




        System.out.println(kim.hashCode());
        System.out.println(hong.hashCode());

        Person park = new Person("박영희", 100);

        try {
            Person clonePerson = (Person) park.clone();
            System.out.println(clonePerson);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


    }

}
