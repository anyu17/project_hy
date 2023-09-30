package jp.co.kanyu.day;

import java.util.Scanner;

public class zhanghudenglu {
    public static void main(String[] args) {
        String rightuserID = "zhangsan";
        String userpassword = "123456";

        Scanner sr = new Scanner(System.in);
        System.out.println("�������˺ź�����");
        for(int i = 0; i < 3; i++){

            String torokuid = sr.next();
            String torokupassword = sr.next();
           if(torokuid .equals(rightuserID) && torokupassword .equals(userpassword)){
            System.out.println("��¼�ɹ�");
            break;
        }else{
            if (i == 2 ) {
                System.out.println("�����˻�������");
                }else{
                System.out.println("��¼ʧ��,����������" + "��ʣ" + (2 - i) + "�λ���");
             }
            }
        }

    }
}
