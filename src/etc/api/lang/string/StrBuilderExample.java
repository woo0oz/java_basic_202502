package etc.api.lang.string;

public class StrBuilderExample {
    public static void main(String[] args) {

        String str = "Hello";
        System.out.println(str.hashCode());

        str = "HelloWorld";
        System.out.println(str.hashCode());

        str = "Hello~~";
        System.out.println(str.hashCode());

        System.out.println("===================================");

        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
        System.out.println("sb의 주소값 = " + sb.hashCode());

        // 문자열을 맨 끝에 추가하는 메서드 : append (문자열)
        sb.append(" world");
        System.out.println(sb);
        System.out.println("sb의 주소값 = " + sb.hashCode()); // 기존 객체를 그대로 이용해서 추가

        // 문자열을 특정 인덱스에 삽입하는 메서드 : insert(인덱스, 문자열)

        sb.insert(6, "my ");
        System.out.println(sb);
        System.out.println("sb의 주소값 = " + sb.hashCode()); // 기존 객체를 그대로 이용해서 추가

        // 특정 인덱스 범위의 문자열을 교체하는 메서드 : replace(begin, end[미만], 문자열)

        sb.replace(6,8, "your");
        System.out.println(sb);

        // 문자열 내의 특정 단어를 삭제하는 메서드 delete (begin, end)

        sb.delete(6,11);
        System.out.println(sb);

        System.out.println(sb.reverse()) ; // 문자열을 역순으로 배치


    }
}
