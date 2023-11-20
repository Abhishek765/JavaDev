/**
 ** annotations are a form of metadata that can be added to Java source code to
 ** provide information about the code to the compiler, runtime, or other tools.
 */
class A {
    public void showTheDataWhichIsBelongsToThisClass() {
        System.out.println("in A show");
    }
}

class B extends A {

    @Override
    public void showTheDataWhichIsBelongsToThisClass() {
        System.out.println("in B show");
    }

}

public class AnnotationsExample {
    public static void main(String[] args) {

        B b = new B();
        b.showTheDataWhichIsBelongsToThisClass();

    }

}
