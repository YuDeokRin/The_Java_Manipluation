package org.example;


/*
    메모리
        -메소드 : 메소드 영역에는 클래스 수준의 정보 (클래스 이름, 부모 클래스 이름, 메소드, 변수)저장. 공유 자원이다.

        -힙  : 인스턴스,객체(클래스타입 객체)

        -스택 : 스택 영역에는 쓰레드 마다 런타임 스택을 만들고, 그 안에 메소드 호출을 스택 프레임이라 부르는 블럭으로 쌓는다.
 */

public class App {
    Book book = new Book(); // 북이라는 것을 레퍼런스를 하면 링크하는 과정에서 심볼릭 레퍼런스이다.
                            // App 코드를 읽더라고 실제 레퍼런스를 가리키는건 아니다. 논리적인 레퍼런스이다.

    static String name = "YudeokRin";
    //or static block
    static {
        name = "deokRin";
    }

    public static void main( String[] args ) {
        ClassLoader classLoader = App.class.getClassLoader();

        // jdk.internal.loader.ClassLoaders$AppClassLoader@512ddf17 -> AppClassLoader
        System.out.println(classLoader);

        //jdk.internal.loader.ClassLoaders$PlatformClassLoader@d041cf -> AppClassLoader의 부모는 PlatformCLassLoader이다.
        System.out.println(classLoader.getParent());

        //null  PlatformClassLoader의 부모(bootstrap)는 있긴있는데, 볼수는없다 이유는 : 네이티브 코드로 구현이 되어 있고 각기 다른 VM을 갖고 있어서이다.
        System.out.println(classLoader.getParent().getParent());

    }
}
