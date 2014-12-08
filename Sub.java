public class Sub extends Base{
public String str="sub class";
   void sub_show(){
		System.out.println("sub类特有的方法");
   }
   void show(){

	System.out.println("子类复写了父类的方法sub class");
   }

public static void main(String[] args){
//向上转型：默认，父类引用指向子类对象
   Base base=new Sub();

 /* 父类的引用不能访问子类新增的方法以及变量
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