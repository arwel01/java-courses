/**
 * ���� ������ �����������.
 * @author Arwel
 *
 */

public class Calculator 
{
	/**
	 * ��������� ���������.
	 */
	private int result;
	
	/**
	 * ������ ���������.
	 * @param params ��������� ����������.
	 */
	public void add(int ... params)
	{
		for(Integer param : params)
		{
			result += param;
		}
	}
	/**
	 * �������� ��������� ���������.
	 */
	public int getResult()
	{
		return result;
	}
	/**
	 * �������� ��������� ���������.
	 */
	
	public void cleanResult()
	{
		result = 0;
	}
	
}
