public class teste {

    public static void  main(String[] args){
        String foo = "This,that,other";
        String[] split = foo.split(",");

        //System.out.println(split.toString());

        for (String s: split){
            System.out.println(s);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            sb.append(split[i]);
            if (i != split.length - 1) {
                sb.append(" ");
            }
        }
        String joined = sb.toString();

//        System.out.print(joined);
    }
}
