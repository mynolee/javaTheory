public class javaArrayListExMain {
    public static void main(String[] args) { javaArrayListEx list = new javaArrayListEx();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        System.out.println("addLast");
        list.add(3, "addLast");
        System.out.println(list);

        System.out.println("addFirst");
        list.add(0, "addFirst");
        System.out.println(list);

        Object removed1 = list.remove(4);
        System.out.println("remove(4)="+ removed1);
        System.out.println(list);

        Object removed2 = list.remove(0);
        System.out.println("remove(0)=" + removed2);
        System.out.println(list);
    }
}
