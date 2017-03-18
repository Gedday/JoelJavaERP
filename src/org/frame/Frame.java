package org.frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import org.tempuri.Get1ResponseGet1Result;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.activation.*;
import java.sql.*;


public class Frame {

	private JFrame frame;
	private JTable table;
	org.tempuri.WebService1SoapProxy obj = new org.tempuri.WebService1SoapProxy();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 607, 458);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBackground(Color.BLACK);
		table.setBounds(209, 119, -115, -114);
		frame.getContentPane().add(table);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(297, 46, 155, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					buildTableModel(obj.get1());
					table.setModel(buildTableModel(rs));
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(297, 5, 155, 37);
		frame.getContentPane().add(btnNewButton_1);
	}
	
	public static DefaultTableModel buildTableModel(Get1ResponseGet1Result get1ResponseGet1Result)
	        throws SQLException {

	    ResultSetMetaData metaData = get1ResponseGet1Result.getMetaData();

	    // names of columns
	    Vector<String> columnNames = new Vector<String>();
	    int columnCount = metaData.getColumnCount();
	    for (int column = 1; column <= columnCount; column++) {
	        columnNames.add(metaData.getColumnName(column));
	    }

	    // data of the table
	    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
	    while (get1ResponseGet1Result.next()) {
	        Vector<Object> vector = new Vector<Object>();
	        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
	            vector.add(get1ResponseGet1Result.getObject(columnIndex));
	        }
	        data.add(vector);
	    }

}
