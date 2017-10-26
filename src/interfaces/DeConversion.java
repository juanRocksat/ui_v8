package interfaces;

public interface DeConversion
{
	int ABORT=0;
	public default double stringToInt(String s)
	{
		return Double.parseDouble(s);
	}
	public default String doubleToString(double dx )
	{
		return String.valueOf(dx);
	}
	public default int centimetroAPixel(int centimetro){
		double x = (double) centimetro;
		return (int) (x * 39.938109286035136);
	}
}
