import java.util.Scanner;//���� java.util ���µ� Scanner ��
public class Car
{
private String type;
private double tank;
private double oil;

public Car()  //���캯��
{
this.type=type;
this.tank=tank;
this.oil=oil;
}

public void gas(){}
public void run(){}

public static void main (String[] args)
{
int i;
Scanner sc=new Scanner(System.in);//����һ��������Ķ���ʹ���ܹ��������뺯��
Car[] cars=new Car[5];//����������������
//�����ʼ��
for(i=0;i<5;i++)
{
cars[i]=new Car();
}

System.out.println("��������5�鳵��������");
System.out.println("�����복�����ԣ�");

//ѭ������5������������Բ����������
for(i=0;i<5;i++)
{
cars[i].type=sc.next();
cars[i].tank=sc.nextDouble();
cars[i].oil=sc.nextDouble();
System.out.println("��������Ϊ��\n"+"type:"+cars[i].type+"\n"+"tank:"+cars[i].tank+"\n"+"oil:"+cars[i].oil);
if(i==4)System.out.println("�������");
else System.out.print("��������һ���������ԣ�\n");
}
}
}

