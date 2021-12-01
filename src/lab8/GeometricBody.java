package lab8;

import lab8.GeometricBody;

public class GeometricBody {
    public static int a;
    public static int b;
    public static int c;
    public static int n;
    public float getSurface() {
        return n * a * a;
    }
    public float getVolume() {
        return a * b * c;
    }
}

class Cube extends GeometricBody {
    @Override
    public float getSurface() {
        return 6 * a * a;
    }
    @Override
    public float getVolume() {
        return a * a * a;
    }
}

class Sphere extends GeometricBody {
    public static int r;
    public static float pi = (float) 3.14;
    @Override
    public float getSurface() {
        return 4 * pi * r * r;
    }
    @Override
    public float getVolume() {
        return 4/3 * pi * r * r * r;
    }
}

class Parallelepiped extends GeometricBody {
    @Override
    public float getSurface() {
        return 2 * (a*b + b*c + a*c);
    }
    @Override
    public float getVolume() {
        return a * b * c;
    }
}