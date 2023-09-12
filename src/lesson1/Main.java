package lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30));
        int x = getFirstElement(nums);


//        Collections.copy();
    }

    public static <T> T getFirstElement(List<T> list){
        return list.get(0);
    }

    public static double sumOfList(List<? extends Number> nums) {
        double d = 0.0;
        for (int i = 0; i < nums.size(); i++) {
            d+= nums.get(i).doubleValue();
        }
        return d;
    }


    private static void exBoxWithNumbers() {
        BoxWithNumbers<Float> floatBox1 = new BoxWithNumbers<>(10.0f, 20.0f, 30.0f);
        BoxWithNumbers<Float> floatBox2 = new BoxWithNumbers<>(10.0f, 20.0f, 30.0f);

        System.out.println("avg floatBox1 = " + floatBox1.avg());
        System.out.println("avg floatBox2 = " + floatBox2.avg());
        System.out.println(floatBox1.sameAvg(floatBox2));

        BoxWithNumbers<Integer> integerBox = new BoxWithNumbers<>(10, 20, 30);
        System.out.println("avg integerBox = " + integerBox.avg());
        System.out.println(floatBox1.sameAvg(integerBox));
    }

    private static void exBoxGen() {
        BoxGen<Integer> box1 = new BoxGen<>(10);
        BoxGen<Integer> box2 = new BoxGen<>(20);

        box1.setObj(12);

        int sum = box1.getObj() + box2.getObj();
        System.out.println(sum);

        BoxGen<String> boxStr = new BoxGen<>("java");
        boxStr.getObj();
    }

    private static void exSimpleBox() {
        SimpleBox box1 = new SimpleBox(10);
        SimpleBox box2 = new SimpleBox(20);

        ////
        box1.setObj(50);

        ////

        if (box1.getObj() instanceof Integer && box2.getObj() instanceof Integer) {
            int sum = (int) box1.getObj() + (int) box2.getObj();
            System.out.println(sum);
        }
    }
}
