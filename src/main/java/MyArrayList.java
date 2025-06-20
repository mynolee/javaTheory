public class MyArrayList {
    private int[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    public MyArrayList() {
        data = new int[DEFAULT_CAPACITY];
        size = 0;
    }
    public static void main(String[] args){
        MyArrayList arrayList = new MyArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList);// [1, 2, 3]
        arrayList.contains(3); // 3이 존재하는지 확인

        arrayList.delete(2); // 2를 삭제
        System.out.println(arrayList);// [1, 2]

    }

    private void add(int value) {
        data[size++] = value;
    }
    private boolean contains(int value) {
        for(int i = 0; i<size;i++){
            if (data[i] == value) return true;
        }
        return false;
    }
    private void delete(int value) {
        for(int i = value; i<size-1;i++){
            data[i] = data[i+1];
        }
        size--;
    }
    public String toString() {
        if (size == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(data[i]).append(", ");
        }
        sb.append(data[size - 1]).append("]");
        return sb.toString();
    }
}
