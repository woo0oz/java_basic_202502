// java.lang 출신은 굳이 import 할 필요가 없다. -> JVM 이 자동으로 붙여주기 떄문.

package etc.api.lang.obj;

import java.util.Objects;


// 클론 메서드를 오버라이딩 했다면 Cloneable 인터페이스를 구현해야 합니다.
public class Person implements Cloneable  {

    // 필드
    private String name;
    private int age;

    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // toString() : 객체의 정보(필드) 를 문자열 형태로 리턴.
    // object 가 물려주는 toString 은 패키지 + 클래스이름 + 주소값 -> 쓸 일이 잘 없다
    // 대부분 오버라이딩 해서 쓰는  편

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // private 로 가려진 두개 필드에 대한 getter / setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // equals & hashcode

    //equals를 오버라이딩 할 때는 hashCode도 함께 오버라이딩을 진행해 주시는 것이 좋습니다.
    //equals를 재 정의한다는 것은 내가 원하는 방식의 동등 비교를 하겠다는 것이기 때문에
    //hashcode의 값도 그에 맞게 같이 재 정의가 되어야 합니다. (hash 주소를 equals에 맞게 정의)

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // 주소값이 같다면 같은 객체다!
        if (obj instanceof Person) {
            Person p = (Person) obj; // obj 의 주소를 넘겨준다.
            if (p.age == this.age && p.name.equals(this.name)) return true;  // name, age 둘 다 같은지?
        }
        return false; // Person 타입을 가질 수 없다면 동등 비교 할 의미가 없음!
    }

    @Override
    public int hashCode() {   // equals가 override 된다면 hashcode 도 overriding 해야한다 !!
        return Objects.hash(name, age);
    }


    @Override
    protected void finalize() throws Throwable {
        // 생성된 객체가 소명될 때 자동으로 호출되는 메서드 (garbage collector 가 실행될떄)
        super.finalize();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {  // 객체 복사 메서드
        return super.clone();
    }
}

