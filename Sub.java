public class Sub extends Base{
public String str="sub class";
   void sub_show(){
		System.out.println("sub�����еķ���");
   }
   void show(){

	System.out.println("���ิд�˸���ķ���sub class");
   }

public static void main(String[] args){
//����ת�ͣ�Ĭ�ϣ���������ָ���������
   Base base=new Sub();

 /* ��������ò��ܷ������������ķ����Լ�����
   System.out.println(base.str);
   
   base.sub_show();
   */
      base.show();
	  base.base_show();
      System.out.println(base.str);
	  
	  Base q=new Sub();
	  Sub sub=(Sub)q;
	  
	  System.out.println(sub.str);
	  sub.sub_show();
	  sub.show();
	  sub.base_show();
	  System.out.println(sub.i);
}
}