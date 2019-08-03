package pl.sda.filewriter;

/**
 * Hello world!
 *
 */
public class App 
{

    static class Task1 implements Runnable {


        @Override
        public void run() {

          //  FileWriterSingelton fileWriterSingelton = FileWriterSingelton.getInstance();
          //  fileWriterSingelton.write("tomektotomek","data.txt");
            SingeltonEnum fileWriterSingelton = SingeltonEnum.INSTANCE;
            fileWriterSingelton.write("tuuuuuuuuttttttttuuuuuu2","data.txt");
        }
    }

    static class Task2 implements Runnable{

        @Override
        public void run() {
            //FileWriterSingelton fileWriterSingelton = FileWriterSingelton.getInstance();
            //fileWriterSingelton.write("tuuuuuuuuttttttttuuuuuu2","data.txt");

            SingeltonEnum fileWriterSingelton = SingeltonEnum.INSTANCE;
            fileWriterSingelton.write("tomek2","data.txt");
        }
    }

    static class Task3 implements Runnable {


        @Override
        public void run() {

            for (int i = 0; i < 1000; i++) {
                System.out.println("Wątek3: "+ i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Task4 implements Runnable {


        @Override
        public void run() {

            for (int i = 0; i < 1000; i++) {
                System.out.println("Wątek4: "+ i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main( String[] args )
    {
       Task1 task1 = new Task1();
       Task2 task2 = new Task2();
       Thread thread1 = new Thread(task1);
       Thread thread2 = new Thread(task2);
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();
        Thread thread3 = new Thread(task3);
        Thread thread4 = new Thread(task4);
       thread1.start();
       thread2.start();
      // thread3.start();
       //thread4.start();

      // FileWriterSingelton fileWriterSingelton = FileWriterSingelton.getInstance();
      //  FileWriterSingelton fileWriterSingelton2 = FileWriterSingelton.getInstance();
       // FileWriterSingelton fileWriterSingelton3 = FileWriterSingelton.getInstance();


    }
}
