package task1;

import names.NamesGenerator;


public class PrintOddIndexNames {
    public static void main(String[] args) {

        NamesGenerator namesGenerator = new NamesGenerator();

        StringBuilder strOdd =  new StringBuilder();
        StringBuilder strEven =  new StringBuilder();
        namesGenerator
                .generator(25)
                .stream()
                .filter(s -> s.getPosition() % 2 != 0)
                .forEach(s -> strOdd.append( s.getPosition()+ ". " + s.getName() + " "));
        String resultOdd =  strOdd.substring(0, strOdd.length()-1);
        System.out.println(resultOdd);

        namesGenerator
                .generator(25)
                .stream()
                .filter(s -> s.getPosition() % 2 == 0)
                .forEach(s -> strEven.append( s.getPosition()+ ". " + s.getName() + " "));
        String resultEven =  strEven.substring(0, strEven.length()-1);
        System.out.println(resultEven);


    }
}
