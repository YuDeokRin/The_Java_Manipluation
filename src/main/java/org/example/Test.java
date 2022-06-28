package org.example;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

//샘플 클래스 정보
//클래스 객체를 사용하기 위해서 가져온다.
class  Student {
    private String name;
    private int roll_No;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRoll_No() {
        return roll_No;
    }
    public void setRoll_No(int roll_No) {
        this.roll_No = roll_No;
    }

}


// JVM에 의해 생성된 클래스 유형 객체의 작업을 보여주는 java 프로그램 메모리의 .class 파일을 나타낸다.
public class Test {

    public static void main(String[] args) {
        Student s1 = new Student();


        Class c1 = s1.getClass();

        //package에 경로 -> FQCN (Fully Qualified Class Name)
        System.out.println(c1.getName());

        //배열의 모든 메소드 가져오기 ()
        Method m[] = c1.getDeclaredMethods();
        for (Method method : m) {
            System.out.println(method.getName());
        }

        //배열의 모든 필드 가져오기 (name, roll_No)
        Field f[] = c1.getDeclaredFields();
        for (Field field : f) {
            System.out.println(field.getName());

        }
    }
}
