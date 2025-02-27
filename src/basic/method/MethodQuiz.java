package basic.method;
import java.util.Arrays;

public class MethodQuiz {

    static String[] foods = {"chicken" , "pasta" , "beef"};

    // 배열내부 한눈에 보기
    static void printFoods(){
        System.out.println(Arrays.toString(foods));
    }

    // foods 배열에서 특정 데이터의 인덱스를 반환
    // 메서드 이름 : indexOf , 매개변수: 음식이름(String)
    static int indexOf(String searchFood){
        for (int i = 0; i < foods.length; i++) {
            if (searchFood.equals(foods[i])) {
                return i;
            }
            }
        return -1 ;   // 값이 없을떄
        }


    public static void main(String[] args) {
        printFoods();

    }

}


