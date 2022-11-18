public class Main {

    private boolean checkDimension(CLIQUEUnit other, int e){
        for (int i=0,j=0; i<e; i++, j+=2){
            if (dims[i] != other.dims[i]
            || bounds[j] != other.bounds[j]
            || bounds[j+1] != bounds[j+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}