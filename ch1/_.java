/**
* $ javac _.java && java _ - A .
* out put will be A. because ++x instaed of x++, note x++ would give you an ArrayIndexOutOfBoundsException
**/
import static java.lang.System.*;

class _ 
{
	static public void main(String[] __A_V_)
	{
		String $ = "";
		for(int x = 0; ++x < __A_V_.length;)
			$ += __A_V_[x];
		out.println($);
	}
}