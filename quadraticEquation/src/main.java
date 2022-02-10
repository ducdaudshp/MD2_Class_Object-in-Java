import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập a= ");
        double a=input.nextDouble();
        System.out.print("Nhập b= ");
        double b=input.nextDouble();
        System.out.print("Nhập c= ");
        double c=input.nextDouble();
        quadrticEquation PTB2 = new quadrticEquation(a,b,c);
        System.out.println("Kết quả \n");
        System.out.println("Delta = "+ PTB2.getDiscriminant());
        if (PTB2.getDiscriminant()<0){
            System.out.println("PT vô nghiệm");
        }
        else if (PTB2.getDiscriminant()==0){
            System.out.print("PT có nghiệm kép: "+PTB2.getRoot1());
        }
        else{
            System.out.println("PT có 2 nghiệm phân biệt");
            System.out.printf("Nghiệm x1 của PT là: %.2f" ,PTB2.getRoot1());
            System.out.println();
            System.out.printf("Nghiệm x2 của PT là: %.2f" ,PTB2.getRoot2());
        }
    }
}
