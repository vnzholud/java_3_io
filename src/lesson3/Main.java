package lesson3;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//Работа с файлами
//        File file = new File("1/a.txt");
//        System.out.println(file.length());
//        System.out.println(file.isFile());
//        System.out.println(file.isDirectory());
//        System.out.println(file.getAbsolutePath());
//        file.renameTo(new File("1/a.txt"));
//        System.out.println(file.exists());

//Создание файлов и дирректорий
//        File file = new File("1/2/3/4");
////        System.out.println(file.mkdir());
//        System.out.println(file.mkdirs());

// Сравниваем пути

//        File file2 = new File("C:\\Users\\Fedor\\IdeaProjects\\java_3_02032021\\1\\a.txt");
//        System.out.println(file2.exists());
//        System.out.println(file.getAbsoluteFile().equals(file2.getAbsoluteFile()));
//        System.out.println(file.getAbsolutePath().equals(file2.getAbsolutePath()));

//Какой объем памяти есть?
//        System.out.println(file.getUsableSpace());
//        System.out.println(file.getFreeSpace());
//        System.out.println(file.getTotalSpace());

//        System.out.println(file.getCanonicalFile());
        //Создание нового файла
//        System.out.println(file.createNewFile());

//Файлы в дирректории (использование фильтра для показа)
//        File file = new File("./src/lesson1");
//        System.out.println(Arrays.toString(file.list()));
////        System.out.println(Arrays.toString(file.listFiles()));
//
////        FileFilter filter = f -> f.isFile();
////
////        System.out.println(Arrays.toString(file.listFiles(filter)));
//        System.out.println(Arrays.toString(file.listFiles(f->f.getName().startsWith("Box"))));




//Чтение из файла по-байтово
//        FileInputStream in = new FileInputStream("1/a.txt");
//
//        in.close();

//        try (FileInputStream in = new FileInputStream("1/a.txt")) {
//            int x;
//            while ((x = in.read()) > -1) {
//                System.out.print((char) x);
//            }
//        }

//        byte[] arr = new byte[8];
//        try (FileInputStream in = new FileInputStream("1/a.txt")) {
//            while (in.read(arr)>-1) {
//                System.out.print(new String(arr));
//            }
//        }

//        byte[] arr = new byte[8];
//        int l;
//        try (FileInputStream in = new FileInputStream("1/a.txt")) {
//            while ((l = in.read(arr)) > -1) {
//                System.out.print(new String(Arrays.copyOf(arr, l)));
//            }
//        }

//Запись в файл
//        try(FileOutputStream out = new FileOutputStream("1/b.txt")){
////            out.write(65);
////            out.write(new byte[]{65,66,67,68});
//            out.write("java core".getBytes());
//        }


//        try (InputStreamReader in =
//                     new InputStreamReader(new FileInputStream("1/a.txt"),
//                             StandardCharsets.UTF_8)) {
//            int x;
//            while ((x = in.read()) > -1) {
//                System.out.print((char) x);
//            }
//        }

//Чтение с использованием буфера(экономия ресурсов операционной системы)
//        try (InputStreamReader in =
//                     new InputStreamReader(
//                             new BufferedInputStream(new FileInputStream("1/a.txt")),
//                             StandardCharsets.UTF_8)) {
//            int x;
//            while ((x = in.read()) > -1) {
//                System.out.print((char) x);
//            }
//        }


//        RandomAccessFile raf = new RandomAccessFile("1/a.txt", "rw");
////        String s1 = raf.readLine();
////        System.out.println(s1);
////
////        raf.seek(12);
////        String s2 = raf.readLine();
////        System.out.println(s2);
////
////        raf.seek(0);
////        String s3 = raf.readLine();
////        System.out.println(s3);
//
//        raf.seek(2);
//        raf.writeBytes("ff");
//
//        raf.close();

//Запись и считывание объектов
//        Cat cat = new Cat("Bars", "red", 5);
//        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("1/cat.txt"));
//        out.writeObject(cat);
//        out.close();

       ObjectInputStream in = new ObjectInputStream(new FileInputStream("1/cat.txt"));
        Cat catFromFile = (Cat) in.readObject();
        in.close();

        System.out.println(catFromFile);

    }
}
