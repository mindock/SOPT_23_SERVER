package org.sopt.seminar3.lombok;

public class Main {
    public static void main(String... args) {
        Test test = new Test();

        //@Data가 다양한 메소드를 자동으로 만들어준다.
        TestData testData = new TestData();
        testData.getEmail();
        testData.setUserIdx(0);
        testData.toString();
    }
}
