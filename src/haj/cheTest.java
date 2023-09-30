package haj;

import java.util.Scanner;

public class cheTest {
    public static void main(String[] args) {
        //建立数组.
        che [] arr = new che[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            che c = new che();//ע��������������һ��Ҫ����Forѭ����,�������в���ȷ
            System.out.println("������۸�");
            double qian = sc.nextDouble();
            c.setJiage(qian);

            System.out.println("Ʒ��");
            String pinpai = sc.next();
            c.setPinpai(pinpai);

            System.out.println("��ɫ");
            String yanse = sc.next();
            c.setYanse(yanse);//ע����������������ֵ��Ҫ��Ӧ��Ӧ���������
            arr[i] = c;//����ǽ������������ֵ������ϵ
        }

        for(int i = 0; i < arr.length ; i++){
            che car=arr[i];
            System.out.println(car.getJiage()+ "   "+ car.getPinpai()
                    +"  " + car.getYanse());
        }
    }
}
