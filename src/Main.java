public class Main {

    public static void main(String[] args) {
        String[] authors = {"Magda"};

        StringBuilder abba = new StringBuilder();
        abba.append("(");

        for(int i = 0; i < authors.length; i++){
            abba.append(authors[i]);
            if(i < authors.length - 1) {
                abba.append(" and ");
            }
        }
        abba.append(")");

        System.out.println(abba.toString());

    }
}
