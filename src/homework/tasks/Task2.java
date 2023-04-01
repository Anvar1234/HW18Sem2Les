package homework.tasks;

import java.io.*;

public class Task2 {
    public static void usingStringBuilding() throws Exception {
        //Построчное чтение файла
        BufferedReader br = new BufferedReader(new FileReader("certification_results.json"));
        String str = "";
        String[] strArray1 = new String[0];
        String[] strArray2 = new String[0];
        StringBuilder sb1 = new StringBuilder();

        while ((str = br.readLine()) != null) {
            strArray1 = str.split(", "); //3 элемента
        }
        br.close();

        for (String item1 : strArray1) {
            strArray2 = item1.split(","); //9 элементов всего, но в цикле по 3шт

            for (String item2 : strArray2) {
                if (item2.split(":")[0].trim().replaceAll("[\"{}\\[\\]]", "").equals("фамилия")) {
                    sb1.append("Студент ")
                            .append(item2.split(":")[1].replaceAll("[\"{}\\[\\]]", ""));
                }
                if (item2.split(":")[0].trim().replaceAll("[\"{}\\[\\]]", "").equals("оценка")) {
                    sb1.append(" получил(-а) ")
                            .append(item2.split(":")[1].replaceAll("[\"{}\\[\\]]", ""));
                }
                if (item2.split(":")[0].trim().replaceAll("[\"{}\\[\\]]", "").equals("предмет")) {
                    sb1.append(" по предмету ")
                            .append(item2.split(":")[1].replaceAll("[\"{}\\[\\]]", ""))
                            .append("\n");
                }
            }
        }
        System.out.println(sb1);
    }


    //Старый вариант
//    public static void usingStringBuilding() throws Exception {
//        //Построчное чтение файла
//        BufferedReader br = new BufferedReader(new FileReader("certification_results.json"));
//        String str;
//        String lN = "";
//        String grade = "";
//        String subject = "";
//        while ((str = br.readLine()) != null) {
//            String[] strArray = str.split(",");
//            for (int i = 0; i < strArray[i].length(); i++){
//                if(i == 0){
//                    lN = (strArray[i].split(":"))[1];
//                } else if (i == 1) {
//                    grade = (strArray[i].split(":"))[1];
//                } else {
//                    subject = (strArray[i].split(":"))[1];
//                }
//                System.out.printf("Студент [%s] получил [%s] по предмету [%s] \n", lN, grade, subject);
//            }
//        }
//        br.close();
//
//    }
}
