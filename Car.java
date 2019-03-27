import java.util.Scanner;//导入 java.util 包下的 Scanner 类
public class Car
{
private String type;
private double tank;
private double oil;

public Car()  //构造函数
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
Scanner sc=new Scanner(System.in);//创建一个输入类的对象使其能够调用输入函数
Car[] cars=new Car[5];//创建汽车对象数组
//对象初始化
for(i=0;i<5;i++)
{
cars[i]=new Car();
}

System.out.println("最大可输入5组车辆的属性");
System.out.println("请输入车的属性：");

//循环输入5组汽车大的属性并输出其属性
for(i=0;i<5;i++)
{
cars[i].type=sc.next();
cars[i].tank=sc.nextDouble();
cars[i].oil=sc.nextDouble();
System.out.println("车辆属性为：\n"+"type:"+cars[i].type+"\n"+"tank:"+cars[i].tank+"\n"+"oil:"+cars[i].oil);
if(i==4)System.out.println("输入完毕");
else System.out.print("请输入下一辆车的属性：\n");
}
}
}

