public class Main {

    public String getStrippedSubstring(){
        int sstart = start, ssend = end;
        while(sstart < ssend){
            char c = input.charAt(sstart);
            if (c == ' ' || c == '\n' || c == '\r' || c == '\t') {
                break;
            }
            ++sstart;
        }
        ....
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}