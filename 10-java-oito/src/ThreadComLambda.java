public class ThreadComLambda {

    public static void main(String[] args) {

        //Sem lambda
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando um Runnable");
            }
        }).start();

        //Com lambda
        new Thread(() -> System.out.println("Executando um Runnable")).start();
    }
}
