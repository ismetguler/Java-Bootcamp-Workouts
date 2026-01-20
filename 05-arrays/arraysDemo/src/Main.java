public class Main {
    public static void main(String[] args) {
    String student1="İsmet";
    String student2="Ali"; // We dont want this code.

    String[] students=new String[5];
    students[0]="İsmet";
    students[1]="Ali";
    students[2]="Sevde";
    students[3]="Zeynep";
    students[4]="Güler";

    for(int i=0;i<students.length;i++){
        System.out.println(students[i]);
    }//Eğer ki 5 tane öğrenci nesnesi oluşturup 5 öğrenci
        // oluşturmazsak geri kalan öğrencileri NULL yapar.

        double [] myNumbers={1.2,2.3,3.4,4.5};
        double total=0;
        for(double number:myNumbers){
            total = total+number;
            System.out.println(number);
        }   System.out.println("Total Numbers: "+total);

        String [] myNames={"İsmet","Sevde","Güler"};
        String totalNames="";
        for(String name:myNames){
            totalNames=totalNames+name;
            System.out.println(name);
        }System.out.println("Total Names : "+totalNames);


    }

}