package lab1.task1;

public class Task1 {
    public static void main(String[] args) {
        //1st monitor
        Monitor monitor1 = new Monitor();
        monitor1.color = "green";
        monitor1.dimension = 15;
        monitor1.resolution  = 1080;

        //2nd monitor
        Monitor monitor2 = new Monitor();
        monitor2.color = "blue";
        monitor2.dimension = 16;
        monitor2.resolution  = 1080;

        //compare 2 monitors
        if (monitor1.color == monitor2.color) System.out.println("Monitors have the same color");
        else System.out.println("Monitors have different colors");

        if (monitor1.dimension == monitor2.dimension) System.out.println("Monitors have the same dimension");
        else System.out.println("Monitors have different dimensions");

        if (monitor1.resolution == monitor2.resolution) System.out.println("Monitors have the same resolution");
        else System.out.println("Monitors have different resolutions");

    }
}
