public class javaLinkedListMain {
    public static void main(String[] args) {
        javaLinedListEx<String> stringList = new javaLinedListEx<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        String string = stringList.get(0);
        System.out.println("string = " + string);
        javaLinedListEx<Integer> intList = new javaLinedListEx<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        Integer integer = intList.get(0);
        System.out.println("integer = " + integer);
    }
}