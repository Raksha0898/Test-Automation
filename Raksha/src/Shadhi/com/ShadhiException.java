package Shadhi.com;

public class ShadhiException extends Exception
{
  String msg;
  
  ShadhiException(String msg)
  {
	  this.msg=msg;
  }
  public String getmsg()
  {
	  return msg;
  }
}
