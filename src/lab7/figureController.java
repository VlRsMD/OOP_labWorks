package lab7;

import java.util.ArrayList;

public class figureController {
    static float getMaxArea() {
        ArrayList<Float> listA = new ArrayList<Float>();
        listA.add(task2.rect1A());
        listA.add(task2.rect2A());
        listA.add(task2.tr1A());
        listA.add(task2.tr2A());
        listA.add(task2.sqr1A());
        listA.add(task2.sqr2A());
        listA.add(task2.circleA());
        Float min = listA.get(0);
        Float max = listA.get(0);
        int n = listA.size();
        int i;
        for (i = 1; i < n; i++) {
            if (listA.get(i) > max) {
                max = listA.get(i);
            }
        }
        return max;
    }
    static float getMaxPerimeter() {
        ArrayList<Float> listP = new ArrayList<Float>();
        listP.add(task2.rect1P());
        listP.add(task2.rect2P());
        listP.add(task2.tr1P());
        listP.add(task2.tr2P());
        listP.add(task2.sqr1P());
        listP.add(task2.sqr2P());
        listP.add(task2.circleP());
        Float min = listP.get(0);
        Float max = listP.get(0);
        int n = listP.size();
        int i;
        for (i = 1; i < n; i++) {
            if (listP.get(i) > max) {
                max = listP.get(i);
            }
        }
        return max;
    }
}

