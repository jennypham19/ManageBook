package managebook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<TextBook> arrSachGk = new ArrayList<>();
//		
		int soSachGiaoKhoa;
        double tongTienSachGiaoKhoa = 0;
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Nhập số sách giáo khoa: ");
        soSachGiaoKhoa = scanner.nextInt();
         
        
        for (int i = 0; i < soSachGiaoKhoa; i++) {
            System.out.println("Nhập thông tin quyển sách thứ " + (i + 1) + ":");
            TextBook sachGiaoKhoa = new TextBook();
            sachGiaoKhoa.nhapSach();
            arrSachGk.add(sachGiaoKhoa);
        }
            
         
        for (int i = 0; i < arrSachGk.size(); i++) {
            if (arrSachGk.get(i).getNumber() == 0) {
                tongTienSachGiaoKhoa += arrSachGk.get(i).getSoLuong() * 
                    arrSachGk.get(i).getDonGia() * 50 / 100;
            } else if (arrSachGk.get(i).getNumber() == 1) {
                tongTienSachGiaoKhoa += arrSachGk.get(i).getSoLuong() * 
                    arrSachGk.get(i).getDonGia();
            }
        }
        System.out.println("Tổng tiền sách giáo khoa = " + tongTienSachGiaoKhoa);
                
         
        System.out.println("-----Thông tin sách giáo khoa-----");
        for (int i = 0; i < arrSachGk.size(); i++) {
            System.out.println(arrSachGk.get(i).toString());
        }
           
//       
	}
}
