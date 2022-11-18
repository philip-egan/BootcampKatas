public class Main {

    @Override
    public double[] computeMean(){
        // Not supported except for singletons.
        return points.size() == 1 ? points.get(1) : null;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}