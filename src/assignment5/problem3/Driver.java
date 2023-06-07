package assignment5.problem3;

public class Driver {
    public static void main(String[] args) {
        Figure[] figures = {
                new UpwardHat(),
                new UpwardHat(),
                new DownwardHat(),
                new FaceMaker(),
                new Vertical()
        };
        for (Figure f : figures) {
            f.getFigure();
        }
        System.out.println();
        for (Figure f1 : figures) {
            if (f1 instanceof DownwardHat) {
                System.out.print("DownwardHat: ");
            } else if (f1 instanceof UpwardHat) {
                System.out.print("UpwardHat: ");
            } else if (f1 instanceof FaceMaker) {
                System.out.print("FaceMaker: ");
            } else {
                System.out.print("Vertical: ");
            }
            f1.getFigure();
            System.out.println();
        }
    }
}
