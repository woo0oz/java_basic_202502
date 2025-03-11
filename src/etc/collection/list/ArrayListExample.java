package etc.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        /*
             # ArrayList
             - 배열과 다르게 크기가 자동으로 조절되는 자료구조 클래스.
             - 배열과 유사한 형태이기 때문에 순차적으로 데이터에 접근하기가 좋다.
             - 인덱스를 활용하며, 객체의 중복 저장을 허용한다.
         */


//        String[] nick = new String[50]; // 배열의 선언

//        ArrayList<String> nick = new ArrayList<>();
        //리스트 : 클래스 기반
        // <> -> 제네릭 (타입의 형식을 지정하여 타입 안정성을 꾀하기 위한 문법)
        // 제네릭을 안쓰면 타입 상관없이 모든 객체에 대해 받아줄 수 있음 (Object)

        List<String> nick = new ArrayList<>();
        // 변수의 타입은 List

        // add (객체) : 리스트에 객체를 추가하는 메서드
        nick.add("멍멍이");

        String str = "야옹이";
        nick.add(str);

        nick.add(new String("개구리"));

        nick.add("짹쨱이");
        nick.add("야옹이");
        System.out.println("nick = " + nick);


        // add(인덱스, 객체) : 원하는 위치에 객체 삽입
        nick.add(3, "어흥이");
        System.out.println("nick = " + nick);


        // get(인덱스, 객체) : 리스트 내부의 객체를 참조
        String name = nick.get(3);
        System.out.println("name = " + name);
        System.out.println("nick = " + nick.size());


        // set(인덱스, 수정할 객체) : 리스트 내부의 객체를 수정
        nick.set(2,"삐약이");
        System.out.println("nick = " + nick);

        // 리스트 반복문 처리
        for (int i =0 ; i < nick.size(); i++) {
            System.out.println(nick.get(i));
        }

        System.out.println("_______________________________________________");

        // 향상 for문 -> 항상 배열 내부를 전체 순회해야 함.
        for (String s : nick) {
            System.out.print(s);
        }

        // contains(객체) : 리스트 내의 객체의 존재 유무를 파악
        System.out.println(nick.contains("삐약이"));


        // indexOf(객체) : 특정 객체의 인덱스 탐색, 없으면 -1 리턴
        int idx = nick.indexOf("개구리");
        System.out.println("개구리의 인덱스 : " + idx);

        // remove(객체 or 인덱스) : 리스트 내부 객체 삭제
        nick.remove("야옹이");
        nick.remove(0);

        System.out.println("nick = " + nick);


        // clear() : 리스트 내부요소 전체 삭제
        nick.clear();
        System.out.println("nick = " + nick);

        System.out.println("_______________________________________________");

        /*
        컬렉션 객체들은  Collections 의 기능을 사용할 수 있습니다.
        Collections 는 컬렉션 객체들의 부가 기능들을 제공합니다.
        */
        List<Integer> score = new ArrayList<>();
        score.add(65);  // auto boxing -> 으로 인해 new Integer 를 안써도 됨 !


        // 한번에 객체 다수 추가하기

        Collections.addAll(score, 1,2,3,4,5,6,7,8);
        System.out.println("score = " + score);







































    }
}
