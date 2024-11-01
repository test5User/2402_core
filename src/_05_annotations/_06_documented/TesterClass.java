package _05_annotations._06_documented;

public class TesterClass {
    //Создали 2 аннотации, одну из них пометили @Documented,
    //создали 2 метода, пометив их разными аннотациями
    //генерируем javaDoc

    @TestDocumented(doTest = "Hello doc with annotation")
    public void doSomeDocumented(){
        System.out.println("Test for annotation with '@Documented'");
    }

    @TestNotDocumented(doTestNo = "Hello doc without annotation")
    public void doSomeNotDocumented(){
        System.out.println("Test for annotation without '@Documented'");
    }
}
