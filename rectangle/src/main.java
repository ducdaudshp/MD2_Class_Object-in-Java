import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        double width=input.nextDouble();
        System.out.println("Nhập chiều rộng: ");
        double height=input.nextDouble();
        rectangle HCN = new rectangle(width,height);
        System.out.println("Kết quả \n"+HCN.display());
        System.out.println("Chu vi hình chữ nhật: "+HCN.getPerimeter());
        System.out.println("Diện tích hình chữ nhật: "+HCN.getArea());
    }
}
