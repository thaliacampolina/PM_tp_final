package gui;

import java.awt.*;

import javax.swing.*;

import model.gui.FieldPanel;
import model.gui.MainPanel;

public class SearchWindow extends JFrame
{
	public SearchWindow ()
	{
		// Titulo
		setTitle("Busca de filmes");
		
		// Tamanho
		setSize(800,600);
		
		// Mante-la com o tamanho fixo
		setResizable(false);
		
		// Sair quando fechar
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Container para o layout da janela
		Container	contentPane = getContentPane ();
		
		// Adiciona coisas
		contentPane.add(new MainPanel());
		
		// Eventos
		
		
		// Visivel
		setVisible(true);
	}
	
	/*
	 * Teste
	 */
	public static void main (String[] args)
	{
		new SearchWindow();
		
	}
}