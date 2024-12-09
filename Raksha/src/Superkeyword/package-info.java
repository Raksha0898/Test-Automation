package Superkeyword;
	class Whatsapp_v1
	{
		void status()
		{
			System.out.println("text");
			// TODO Auto-generated method stub

		}
	}
class Whatsapp_v2 extends Whatsapp_v1
{
	void status()
	{
		System.out.println("text,img,video");
	}
}
class package-info
{
	public static void main(String[] args)
	{
		Whatsapp_v2 w new Whatsapp_v1();
		w.status();
	}
}
}
