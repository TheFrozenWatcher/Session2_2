package Session_2;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//    Vòng lặp for
//        for (int i=1; i<10;i+=1){
//            System.out.println("Giá trị hiện tại của i là "+ i);
//        }
//        //  While/ do while
//        int number = 3;
//        while (number<5){System.out.print("Số "+ number); number++;}

        //        Ex1: Tính tổng các số chẵn trong mảng
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Nhập khoảng cần tính tổng (bắt đầu): ");
//        int start = scanner.nextInt();
//
//        System.out.println("Nhập khoảng cần tính tổng (kết thúc): ");
//        int end = scanner.nextInt();
//
//        int sum = 0;
//
//        for (int i = start; i <= end; i++) {
//            // Kiểm tra nếu số là số chẵn
//            if (i % 2 == 0) {
//                sum += i; // Thêm số chẵn vào tổng
//            }
//        }
//
//        System.out.println("Tổng các số chẵn trong khoảng từ " + start + " đến " + end + " là: " + sum);
//
//        scanner.close();

//        Ex2: Hiển thị các loại hình
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            choice = scanner.nextInt();
            if (choice == 4) {
                System.out.println("Bạn đã chọn thoát khỏi chương trình. Cảm ơn và xin chào tạm biệt!");
                break;
            } else {
                switch (choice) {
                    case 1:
                        System.out.println("Vẽ hình chữ nhật");
                        System.out.println("Nhập chiều dài");
                        float height = scanner.nextFloat();
                        System.out.println("Nhập chiều rộng");
                        float width = scanner.nextFloat();
                        for (int i = 0; i < height; i++) {
                            for (int j = 0; j < width; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        ;
                        break;
                    case 2:
                        System.out.println("2. In hình tam giác vuông góc vuông ở 4 góc khác nhau:");
                        System.out.println("a. Trên cùng bên trái (top-left)");
                        System.out.println("b. Trên cùng bên phải( top-right)");
                        System.out.println("c.Dưới cùng bên trái( bottom-left)");
                        System.out.println("d. Dưới cùng bên phải(bottom-right)");
                        String key = scanner.next();
                        switch (key) {
                            case "a":
                                System.out.println("Nhập cạnh góc vuông");
                                float a = scanner.nextFloat();
                                for (float i = a; i > 0; i--) {
                                    for (float j = 0; j < i; j++) {
                                        System.out.print("*");
                                    }
                                    System.out.println();
                                }
                                ;
                                break;
                            case "b":
                                System.out.println("Nhập cạnh góc vuông");
                                float b = scanner.nextFloat();
                                for (float i = b; i > 0; i--) {
                                    float j = b - i;
                                    do {
                                        System.out.print(" ");
                                        j--;
                                    } while (j >= 0);
                                    System.out.print("*");
                                }
                                System.out.println();
                                ;
                                break;
                            case "c":
                                System.out.println("Nhập cạnh góc vuông");
                                float c = scanner.nextFloat();
                                for (float i = 0; i < c; i++) {
                                    for (float j = 0; j < i; j++) {
                                        System.out.print("*");
                                    }
                                    System.out.println();
                                }
                                ;
                                break;
                            case "d":
                                System.out.println("Nhập cạnh góc vuông");
                                float d = scanner.nextFloat();
                                for (float i = 0; i < d; i++) {
                                    for (float j = 0; j < i; j++) {
                                        System.out.print("*");
                                    }
                                    System.out.println();
                                }
                                ;
                            case "4":
                                System.out.println("Thoát chương trình!");
                                break;

                            default:
                                System.out.println("Invalid choice. Please enter a valid option.");
                        }

                }
            }
        }
        while (choice != 4);

    }

////        Ex3: In số nguyên tố nhỏ hơn 100
//
//        for (int i=2;i<100;i++){
//            boolean check=true;
//            for (int j=2;j<i;j++){
//                if (i%j==0){
//                    check=false;
//                    break;
//                };
//            }
//            if (check){
//                System.out.println("Số nguyên tố "+ i);
//            }
//        }

//          Ex 4:Hiển thị các số nguyên tố đầu tiên
//        int count = 1;
//
//        for (int i = 2; i < 100; i++) {
//            boolean check = true;
//
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    check = false;
//                    break;
//                }
//            }
//
//            if (check) {
//                System.out.println("Số nguyên tố thứ " + count + " là " + i);
//                count++;
//
//                if (count > 20) {
//                    break;
//                }
//            }
//        }

////        Ex5: Tìm số nguyên dương nhỏ nhất chia hết cho
////5,7 và 11
//        boolean check=false;
//        for (int i=1;i>0;i++){
//            if (i%5==0 && i%7==0 && i%11==0){
//                System.out.print(i);
//                check=true;
//            };
//            if (check){
//                break;
//            }
//        }

////        Ex 6: Tạo menu chức năng
//          Scanner scanner = new Scanner(System.in);
//          int choice;
//        do {
//            System.out.println("Nhập chức năng");
//            choice = scanner.nextInt();
//
//            if (choice == 4) {
//                System.out.println("Bạn đã chọn thoát khỏi chương trình. Cảm ơn và xin chào tạm biệt!");
//                break;
//            }
//
//            int key = choice;
//            System.out.println("Nhập số để kiểm tra");
//            float number = scanner.nextFloat();
//
//            switch (key) {
//                case 1:
//                    if (number % 2 == 0) {
//                        System.out.println(number + " là số chẵn");
//                    } else {
//                        System.out.println(number + " là số lẻ");
//                    }
//                    break;
//                case 2:
//                    if (number < 2) {
//                        System.out.println(number + " không là số nguyên tố");
//                    } else {
//                        boolean check = true;
//                        for (int i = 2; i < number; i++) {
//                            if (number % i == 0) {
//                                check = false;
//                                break;
//                            }
//                        }
//                        if (check) {
//                            System.out.println(number + " là số nguyên tố");
//                        } else {
//                            System.out.print(number + " không là số nguyên tố");
//                        }
//                    }
//                    break;
//                case 3:
//                    if (number % 3 == 0) {
//                        System.out.println(number + " chia hết cho 3");
//                    } else {
//                        System.out.println(number + " không chia hết cho 3");
//                    }
//                    break;
//                default:
//                    System.out.println("Nhập sai lựa chọn");
//                    break;
//            }
//        } while (choice != 4);
//
//        scanner.close();

//              Ex7: Tạo ứng dụng tính chu vi và diện tích các loại hình
//        Scanner scanner = new Scanner(System.in);
//
//        int choice;
//
//        do {
//            System.out.println("Nhập chức năng" + "\n1. Tính chu vi và diện tích hình chữ nhật." +
//                    "\n2.Tính chu vi và diện tích hình tam giác" +
//                    "\n3.Tính chu vi và diện tích hình tròn." +
//                    "\n4.Thoát"
//            );
//            choice = scanner.nextInt();
//            if (choice == 4) {
//                System.out.println("Thoát chương trình");
//                System.exit(0);
//            }
//            switch (choice) {
//                case 1:
//                    System.out.println("Tính chu vi và diện tích hình chữ nhật.");
//                    System.out.println("Nhập chiều dài");
//                    float height = scanner.nextFloat();
//                    System.out.println("Nhập chiều rộng");
//                    float width = scanner.nextFloat();
//                    if (height<0||width<0){
//                        System.out.println("Độ dài cạnh không hợp lệ");
//                    } else {
//                        System.out.println("Chu vi hình chữ nhật: " + (height + width) * 2);
//                        System.out.println("Diện tích hình chữ nhật: " + height * width);
//                    };
//                    break;
//                case 2:
//                    System.out.println("Tính chu vi và diện tích hình tam giác.");
//                    System.out.println("Nhập cạnh a");
//                    float a = scanner.nextFloat();
//                    System.out.println("Nhập cạnh b");
//                    float b = scanner.nextFloat();
//                    System.out.println("Nhập cạnh c");
//                    float c = scanner.nextFloat();
//                    if (a + b <= c || a + c <= b || b + c <= a) {
//                        System.out.println("Độ dài cạnh không hợp lệ");
//                    } else {
//                        float p = (a + b + c) / 2;
//                        System.out.println("Chu vi hình tam giác: " + p * 2);
//                        System.out.println("Diện tích hình tam giác: " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
//                    }
//                    break;
//                case 3:
//                    System.out.println("3.Tính chu vi và diện tích hình tròn.");
//                    System.out.println("Nhập bán kính");
//                    float r = scanner.nextFloat();
//                    if (r<0){
//                        System.out.println("Độ dài cạnh không hợp lệ");
//                    } else {
//                        System.out.println("Chu vi hình tròn: " + Math.PI * r * 2);
//                        System.out.println("Diện tích hình tròn: " + Math.PI * r * r);
//                    }
//                    break;
//                default:
//                    System.out.println("Lựa chọn không hợp lệ");
//                    break;
//            }
//        } while (choice != 4);

//      Ex8:  Xác thực dữ liệu sử dụng vòng lặp
//        Scanner scanner = new Scanner(System.in);
//        do {
//            System.out.println("Tính chu vi và diện tích hình tam giác.");
//            System.out.println("Nhập cạnh a");
//            float a = scanner.nextFloat();
//            System.out.println("Nhập cạnh b");
//            float b = scanner.nextFloat();
//            System.out.println("Nhập cạnh c");
//            float c = scanner.nextFloat();
//            if (a + b <= c || a + c <= b || b + c <= a) {
//                System.out.println("Độ dài cạnh không hợp lệ");
//            } else {
//                float p = (a + b + c) / 2;
//                System.out.println("Chu vi hình tam giác: " + p * 2);
//                System.out.println("Diện tích hình tam giác: " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
//            }
//        } while (true);

}

}