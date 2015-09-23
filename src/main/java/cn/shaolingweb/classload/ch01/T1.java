package cn.shaolingweb.classload.ch01;

public class T1 {
	public static void main(String[] args) {
		ClassLoader app=Thread.currentThread().getContextClassLoader();
		ClassLoader appP=app.getParent();
		ClassLoader appPP=appP.getParent();
		System.out.println(app);//app
		System.out.println(appP);//ext
		System.out.println(appPP);//null
	}
}
