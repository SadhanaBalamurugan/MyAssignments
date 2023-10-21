package week1.day2;

public class EdgeBrowser {
	public static void main(String[] args) {
		Browser1 a = new Browser1();
		String b=	a.launchBrowser("Chrome");
			System.out.println(b);
			a.loadUrl();
	}

}
