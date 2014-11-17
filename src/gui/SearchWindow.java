package gui;

import java.awt.*;

import javax.swing.*;

public class SearchWindow extends JDialog 
{
	public SearchWindow ()
	{
		// Titulo
                super();
                setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
		setTitle("Busca de filmes");
		
		// Tamanho
		setSize(800,600);
		
		// Mante-la com o tamanho fixo
		setResizable(false);
		
		// Sair quando fechar
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		// Container para o layout da janela
		Container contentPane = getContentPane ();
		
		// Adiciona coisas
		contentPane.add(new MainPanel());
		
		// Eventos
		
		
		// Visivel
		//setVisible(true);
	}
	/*
	public static void main (String[] args)
	   {
		   new SearchWindow ();
	   }*/
}    

