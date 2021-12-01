package lab8;

public class main {
    static float c1S() {
        Cube cube1 = new Cube();
        cube1.a = 4;
        return cube1.getSurface();
    }

    static float c1V() {
        Cube cube1 = new Cube();
        cube1.a = 4;
        return cube1.getVolume();
    }

    static float c2S() {
        Cube cube2 = new Cube();
        cube2.a = 5;
        return cube2.getSurface();
    }

    static float c2V() {
        Cube cube2 = new Cube();
        cube2.a = 5;
        return cube2.getVolume();
    }

    static float par1S() {
        Parallelepiped par1 = new Parallelepiped();
        par1.a = 3;
        par1.b = 5;
        par1.c = 4;
        return par1.getSurface();
    }

    static float par1V() {
        Parallelepiped par1 = new Parallelepiped();
        par1.a = 3;
        par1.b = 5;
        par1.c = 4;
        return par1.getVolume();
    }

    static float par2S() {
        Parallelepiped par2 = new Parallelepiped();
        par2.a = 3;
        par2.b = 5;
        par2.c = 4;
        return par2.getSurface();
    }

    static float par2V() {
        Parallelepiped par2 = new Parallelepiped();
        par2.a = 3;
        par2.b = 5;
        par2.c = 4;
        return par2.getVolume();
    }

    static float sph1S() {
        Sphere sphere1 = new Sphere();
        sphere1.r = 5;
        return sphere1.getSurface();
    }

    static float sph1V() {
        Sphere sphere1 = new Sphere();
        sphere1.r = 5;
        return sphere1.getVolume();
    }

    static float sph2S() {
        Sphere sphere2 = new Sphere();
        sphere2.r = 5;
        return sphere2.getSurface();
    }

    static float sph2V() {
        Sphere sphere2 = new Sphere();
        sphere2.r = 5;
        return sphere2.getVolume();
    }

    public static void main(String[] args) {
        System.out.println(GeometricBodyController.biggestVolume());
        System.out.println(GeometricBodyController.biggestSurface());
    }
}
