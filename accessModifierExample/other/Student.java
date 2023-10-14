package accessModifierExample.other;

public class Student {
    private int marks = 4;

    /**
     * this is only accessible within the package other, to access outside the
     * package we need to make it public
     */
    public static void main(String[] args) {
        ProtectedExample example = new ProtectedExample();
        System.out.println(example.protectedMarks); // Protected Members can be accessible within the package
    }
}
