public class Base{
	private	String pri_str="私有变量";
				String def_str="默认变量";
	protected	String pro_str="protected变量";
	public		String pub_str="public变量";

	public  String str="私有变量";

	int i=1212;
	int a;
	void show(){
	
		System.out.println("Base");
		}
	
	void base_show(){
	
		System.out.println("aaaaBase");
	}
	private void pri_show(){
		System.out.println("私有变量");
	}
	 void def_show(){
		System.out.println("默认变量");
	}
	protected void pro_show(){
		System.out.println("protected变量");
	}
	public void pub_show(){
		System.out.println("public变量");
	}
}