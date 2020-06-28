import java.util.Random;
import javax.swing.JOptionPane;

public class Main{


    public static void main(String[] args) {
        String[] roster = {"Abby Troung", "Ahmed Mujtaba", "Azeez Temitope Olanrewaju","Deep",
                "Diming chu", "Dongshuo Li", "Honorinicy", "Jason", "Junyu liu", "Kelly Liu",
                "Kinjan", "Kun Li", "Muhammed Umar", "Oaz", "PQ", "Prithviatani", "Richard", "Sahil Slngh Shandhu",
                "Samuel Yang", "Scott Jhou", "Shahbaz Mansahia", "Shahriar Kabir", "Shakur", "Shrina Patel", "Siyu Qiu",
                "Siyu Lei", "Sumid", "Tao", "Trivediakshay", "Yan Huang", "Zhaosaitong"};

        Random rand = new Random();
        int randNum = rand.nextInt(roster.length);


        String randStudent = roster[randNum];
        JOptionPane.showMessageDialog(null, randStudent);

        System.out.println(randStudent);
        

    }
};







