package p1;
public class PinCheck {
	public boolean k;
	public boolean Verify(int pinNo)
	{
		switch(pinNo)
		{
		case 1111: k=true;
		break;
		case 2222: k=true;
		break;
		default: k=false;
		}//end of switch
		return(k);
	}
}
