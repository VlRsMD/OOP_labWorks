package lab8;

import java.util.ArrayList;

public class GeometricBodyController {
    static float biggestVolume() {
        ArrayList<Float> list1 = new ArrayList<Float>();
        list1.add(main.c1V());
        list1.add(main.c2V());
        list1.add(main.par1V());
        list1.add(main.par2V());
        list1.add(main.sph1V());
        list1.add(main.sph2V());
        Float min = list1.get(0);
        Float max = list1.get(0);
        int n = list1.size();
        int i;
        for (i = 1; i < n; i++) {
            if (list1.get(i) > max) {
                max = list1.get(i);
            }
        }
        return max;
    }

    static float biggestSurface() {
        ArrayList<Float> list2 = new ArrayList<Float>();
        list2.add(main.c1S());
        list2.add(main.c2S());
        list2.add(main.par1S());
        list2.add(main.par2S());
        list2.add(main.sph1S());
        list2.add(main.sph2S());
        Float min = list2.get(0);
        Float max = list2.get(0);
        int n = list2.size();
        int i;
        for (i = 1; i < n; i++) {
            if (list2.get(i) > max) {
                max = list2.get(i);
            }
        }
        return max;
    }
}
