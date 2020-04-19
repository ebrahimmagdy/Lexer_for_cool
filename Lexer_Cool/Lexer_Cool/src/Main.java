public class Main {
    public static void main(String[] args){
        String file = "src/good.cl";
        if(args.length >= 1)
            file = args[0];
        Execution ex = new Execution(file);
    }
}