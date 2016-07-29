/**
 * Клас реалізує калькулятор.
 * @author Arwel
 *
 */

public class Calculator 
{
	/**
	 * Результат обчислень.
	 */
	private int result;
	
	/**
	 * Суммуєм аргументи.
	 * @param params Агрументи суммування.
	 */
	public void add(int ... params)
	{
		for(Integer param : params)
		{
			result += param;
		}
	}
	/**
	 * Отримати результат обчислень.
	 */
	public int getResult()
	{
		return result;
	}
	/**
	 * Очистити результат обчислень.
	 */
	
	public void cleanResult()
	{
		result = 0;
	}
	
}
