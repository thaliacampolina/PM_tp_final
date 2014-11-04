package util;

import java.io.IOException;
import java.util.Scanner;

/**
 * Classe para auxiliar na leitura de dados do teclado e 
 * impressao de dados.
 * 
 * @author Isabel
 */
public class IO 
{
	/** ---------------------------------------------------------------------------
	 * Salta uma linha.
	 */
	public void println ()
	{
		System.out.println();
	}
	
	/** ---------------------------------------------------------------------------
	 * Imprime um inteiro e quebra a linha.
	 * @param i
	 */
	public void println (int i)
	{
		System.out.println(""+i);
	}
	
	/** ---------------------------------------------------------------------------
	 * Imprime um double e quebra a linha.
	 * @param i
	 */
	public void println (double i)
	{
		System.out.println(""+i);
	}
	
	/** ---------------------------------------------------------------------------
	 * Imprime um char e quebra a linha.
	 * @param i
	 */
	public void println (char i)
	{
		System.out.println(""+i);
	}
	
	/** ---------------------------------------------------------------------------
	 * Imprime uma String e quebra a linha.
	 * @param line
	 */
	public void println (String line)
	{
		System.out.println(line);
	}
	
	/** ---------------------------------------------------------------------------
	 * Imprime um booleano e quebra a linha.
	 * @param bool
	 */
	public void println (boolean bool)
	{
		System.out.println(bool);
	}
	
	/** ---------------------------------------------------------------------------
	 * Imprime uma palavra vazia.
	 */
	public void print ()
	{
		System.out.print("");
	}
	
	/** ---------------------------------------------------------------------------
	 * Imprime um inteiro.
	 * @param i
	 */
	public void print (int i)
	{
		System.out.print(""+i);
	}
	
	/** ---------------------------------------------------------------------------
	 * Imprime um double.
	 * @param i
	 */
	public void print (double i)
	{
		System.out.print(""+i);
	}
	
	/** ---------------------------------------------------------------------------
	 * Imprime um char.
	 * @param i
	 */
	public void print (char i)
	{
		System.out.print(""+i);
	}
	
	/** ---------------------------------------------------------------------------
	 * Imprime uma String.
	 * @param line
	 */
	public void print (String line)
	{
		System.out.print(line);
	}
	
	/** ---------------------------------------------------------------------------
	 * Imprime um booleano.
	 * @param bool
	 */
	public void print (boolean bool)
	{
		System.out.print(bool);
	}
	
	/** ---------------------------------------------------------------------------
	 * Le uma String do teclado.
	 * @return string
	 */
	public String readln ()
	{
		Scanner s = new Scanner (System.in);
		String	string = s.next();
		
		s.close();
		
		return string;
	}
	
	/** ---------------------------------------------------------------------------
	 * Le um inteiro do teclado.
	 * @return integer
	 */
	public int readInt ()
	{
		Scanner s = new Scanner (System.in);
		int		integer = s.nextInt();
		
		s.close();
		
		return integer;
	}
	
	/** ---------------------------------------------------------------------------
	 * Le um double do teclado
	 * @return doub
	 */
	public double readDouble ()
	{
		Scanner s = new Scanner (System.in);
		double	doub = s.nextDouble();
		
		s.close();
		
		return doub;
	}
	
	/** ---------------------------------------------------------------------------
	 * Le um char do teclado
	 * @return c
	 */
	public char readChar ()
	{
		char c = ' ';
		try {
			c = ((char)System.in.read());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return c;
	}
}