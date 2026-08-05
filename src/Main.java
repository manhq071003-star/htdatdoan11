package main;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("========================================");
            System.out.println(" HỆ THỐNG ĐẶT ĐỒ ĂN KÝ TÚC XÁ ");
            System.out.println("========================================");
            System.out.println("1. Xem danh sách món ăn");
            System.out.println("2. Tìm món ăn");
            System.out.println("3. Thêm vào giỏ hàng");
            System.out.println("4. Xem giỏ hàng");
            System.out.println("5. Xóa món khỏi giỏ");
            System.out.println("6. Cập nhật số lượng");
            System.out.println("7. Đặt hàng");
            System.out.println("8. Thanh toán");
            System.out.println("9. Xem lịch sử đơn hàng");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    // FoodService.showFoods();
                    break;

                case 2:
                    // FoodService.searchFood();
                    break;

                case 3:
                    // CartService.addToCart();
                    break;

                case 4:
                    // CartService.showCart();
                    break;

                case 5:
                    // CartService.removeItem();
                    break;

                case 6:
                    // CartService.updateQuantity();
                    break;

                case 7:
                    // OrderService.createOrder();
                    break;

                case 8:
                    // PaymentService.payment();
                    break;

                case 9:
                    // OrderService.showHistory();
                    break;

                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

            System.out.println();

        } while (choice != 0);

    }
}