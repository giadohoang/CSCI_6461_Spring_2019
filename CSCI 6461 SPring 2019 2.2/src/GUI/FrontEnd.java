package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import com.sun.java_cup.internal.runtime.virtual_parse_stack;

import instructions.Instructions;
import registers.Cache;
import registers.Memory;
import registers.Registers;
import instructions.InstructionsLibrary;
import instructions.UnitConverter;
import ioDevices.*;
import program.Program1;

import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.Toolkit;
import javax.swing.JToggleButton;
import javax.swing.JTextField;

public class FrontEnd {

	private JFrame frmCsciSimulator;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	Registers register;
	Memory memory;
	Keyboard keyboard;
	Printer printer;
	boolean program1Active = false;
	Program1 program1;
	// Cache cache;
	InstructionsLibrary instructionsLibrary = new InstructionsLibrary();
	JRadioButton mar_0;
	JSeparator separator_12;
	JSeparator separator_13;
	JSeparator separator_14;
	JSeparator separator_15;
	JSeparator separator_8;
	JSeparator separator_9;
	JSeparator separator_10;
	JSeparator separator_11;
	JSeparator separator_4;
	JSeparator separator_5;
	JSeparator separator_6;
	JSeparator separator_7;
	JSeparator separator_2;
	JSeparator separator_3;
	JSeparator separator_1;
	JSeparator separator;
	JRadioButton mar_1;
	JRadioButton mar_2;
	JRadioButton mar_3;
	JRadioButton mar_4;
	JRadioButton mar_5;
	JRadioButton mar_6;
	JRadioButton mar_7;
	JRadioButton mar_8;
	JRadioButton mar_9;
	JRadioButton mar_10;
	JRadioButton mar_11;
	JRadioButton mar_12;
	JRadioButton mar_13;
	JRadioButton mar_14;
	JRadioButton mar_15;
	JRadioButton mbr_0;
	JRadioButton mbr_1;
	JRadioButton mbr_2;
	JRadioButton mbr_3;
	JRadioButton mbr_4;
	JRadioButton mbr_5;
	JRadioButton mbr_6;
	JRadioButton mbr_7;
	JRadioButton mbr_8;
	JRadioButton mbr_9;
	JRadioButton mbr_10;
	JRadioButton mbr_11;
	JRadioButton mbr_12;
	JRadioButton mbr_13;
	JRadioButton mbr_14;
	JRadioButton mbr_15;
	JRadioButton x1_0;
	JRadioButton x1_1;
	JRadioButton x1_2;
	JRadioButton x1_3;
	JRadioButton x1_4;
	JRadioButton x1_5;
	JRadioButton x1_6;
	JRadioButton x1_7;
	JRadioButton x1_8;
	JRadioButton x1_9;
	JRadioButton x1_10;
	JRadioButton x1_11;
	JRadioButton x1_12;
	JRadioButton x1_13;
	JRadioButton x1_14;
	JRadioButton x1_15;
	JRadioButton x2_0;
	JRadioButton x2_1;
	JRadioButton x2_2;
	JRadioButton x2_3;
	JRadioButton x2_4;
	JRadioButton x2_5;
	JRadioButton x2_6;
	JRadioButton x2_7;
	JRadioButton x2_8;
	JRadioButton x2_9;
	JRadioButton x2_10;
	JRadioButton x2_11;
	JRadioButton x2_12;
	JRadioButton x2_13;
	JRadioButton x2_14;
	JRadioButton x2_15;
	JRadioButton x3_0;
	JRadioButton x3_1;
	JRadioButton x3_2;
	JRadioButton x3_3;
	JRadioButton x3_4;
	JRadioButton x3_5;
	JRadioButton x3_6;
	JRadioButton x3_7;
	JRadioButton x3_8;
	JRadioButton x3_9;
	JRadioButton x3_10;
	JRadioButton x3_11;
	JRadioButton x3_12;
	JRadioButton x3_13;
	JRadioButton x3_14;
	JRadioButton x3_15;
	JRadioButton r0_0;
	JRadioButton r0_1;
	JRadioButton r0_2;
	JRadioButton r0_3;
	JRadioButton r0_4;
	JRadioButton r0_5;
	JRadioButton r0_6;
	JRadioButton r0_7;
	JRadioButton r0_8;
	JRadioButton r0_9;
	JRadioButton r0_10;
	JRadioButton r0_11;
	JRadioButton r0_12;
	JRadioButton r0_13;
	JRadioButton r0_14;
	JRadioButton r0_15;
	JRadioButton r1_0;
	JRadioButton r1_1;
	JRadioButton r1_2;
	JRadioButton r1_3;
	JRadioButton r1_4;
	JRadioButton r1_5;
	JRadioButton r1_6;
	JRadioButton r1_7;
	JRadioButton r1_8;
	JRadioButton r1_9;
	JRadioButton r1_10;
	JRadioButton r1_11;
	JRadioButton r1_12;
	JRadioButton r1_13;
	JRadioButton r1_14;
	JRadioButton r1_15;
	JRadioButton r2_0;
	JRadioButton r2_1;
	JRadioButton r2_2;
	JRadioButton r2_3;
	JRadioButton r2_4;
	JRadioButton r2_5;
	JRadioButton r2_6;
	JRadioButton r2_7;
	JRadioButton r2_8;
	JRadioButton r2_9;
	JRadioButton r2_10;
	JRadioButton r2_11;
	JRadioButton r2_12;
	JRadioButton r2_13;
	JRadioButton r2_14;
	JRadioButton r2_15;
	JRadioButton r3_0;
	JRadioButton r3_1;
	JRadioButton r3_2;
	JRadioButton r3_3;
	JRadioButton r3_4;
	JRadioButton r3_5;
	JRadioButton r3_6;
	JRadioButton r3_7;
	JRadioButton r3_8;
	JRadioButton r3_9;
	JRadioButton r3_10;
	JRadioButton r3_11;
	JRadioButton r3_12;
	JRadioButton r3_13;
	JRadioButton r3_14;
	JRadioButton r3_15;
	JRadioButton ci_0;
	JRadioButton ci_1;
	JRadioButton ci_2;
	JRadioButton ci_3;
	JRadioButton ci_4;
	JRadioButton ci_5;
	JRadioButton ci_6;
	JRadioButton ci_7;
	JRadioButton ci_8;
	JRadioButton ci_9;
	JRadioButton ci_10;
	JRadioButton ci_11;
	JRadioButton ci_12;
	JRadioButton ci_13;
	JRadioButton ci_14;
	JRadioButton ci_15;
	JRadioButton ir_0;
	JRadioButton ir_1;
	JRadioButton ir_2;
	JRadioButton ir_3;
	JRadioButton ir_4;
	JRadioButton ir_5;
	JRadioButton ir_6;
	JRadioButton ir_7;
	JRadioButton ir_8;
	JRadioButton ir_9;
	JRadioButton ir_10;
	JRadioButton ir_11;
	JRadioButton ir_12;
	JRadioButton ir_13;
	JRadioButton ir_14;
	JRadioButton ir_15;
	JButton btnPC;
	JButton btn_SendProgram1;
	JPanel panelPC;
	JRadioButton pc_0;
	JRadioButton pc_1;
	JRadioButton pc_2;
	JRadioButton pc_3;
	JRadioButton pc_4;
	JRadioButton pc_5;
	JRadioButton pc_6;
	JRadioButton pc_7;
	JRadioButton pc_8;
	JRadioButton pc_9;
	JRadioButton pc_10;
	JRadioButton pc_11;
	JButton btnIR;
	JButton btnMAR;
	JButton btnMBR;
	JButton btnX1;
	JButton btnX2;
	JButton btnX3;
	JButton btnR0;
	JButton btnR1;
	JButton btnR2;
	JButton btnR3;
	JButton btnCUSTOM;
	JButton btnCC;
	JRadioButton cc_0;
	JRadioButton cc_1;
	JRadioButton cc_2;
	JRadioButton cc_3;
	JButton btnMFR;
	JRadioButton mfr_0;
	JRadioButton mfr_1;
	JRadioButton mfr_2;
	JRadioButton mfr_3;
	JLabel lblNewLabel_1;
	JLabel label;
	JLabel label_1;
	JLabel label_2;
	JLabel label_3;
	JLabel label_4;
	JLabel label_5;
	JLabel label_6;
	JLabel label_7;
	JLabel label_8;
	JLabel label_9;
	JLabel label_10;
	JLabel label_11;
	JLabel label_12;
	JLabel label_13;
	JLabel label_14;
	JTextArea monitor;
	JButton btnIPL;
	boolean panelActive;
	private JPanel panelCC;
	private JPanel panelIR;
	private JPanel panelMAR;
	private JPanel panelMBR;
	private JPanel panelMFR;
	private JPanel panelX1;
	private JPanel panelX2;
	private JPanel panelX3;
	private JPanel panelR0;
	private JPanel panelR1;
	private JPanel panelR2;
	private JPanel panelR3;
	private JPanel panelCUSTOM;

	JTextPane textPane_PC;
	JTextPane textPane_CC;
	JTextPane textPane_IR;
	JTextPane textPane_MAR;
	JTextPane textPane_MBR;
	JTextPane textPane_MFR;
	JTextPane textPane_X1;
	JTextPane textPane_X2;
	JTextPane textPane_X3;
	JTextPane textPane_R0;
	JTextPane textPane_R1;
	JTextPane textPane_R2;
	JTextPane textPane_R3;
	JTextPane textPane_CUSTOM;
	private JScrollPane scrollPane;
	private JTextPane txtpnPleaseHitIpl;
	private JSeparator separator_16;
	private JTextArea textBox;
	private JScrollPane scrollPane_1;
	private JSeparator separator_17;
	private JButton btn_FindProgram1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontEnd window = new FrontEnd();
					window.frmCsciSimulator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrontEnd() {
		initialize();
		addListeners();
	}

	/**
	 * initialize registers, memory, instruction
	 */
	private void initializeMachine() {
		register = new Registers();
		memory = new Memory();
		printer = new Printer();
		keyboard = new Keyboard();
		// cache = new Cache();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCsciSimulator = new JFrame();
		frmCsciSimulator.getContentPane().setForeground(Color.WHITE);
		frmCsciSimulator.getContentPane().setBackground(new Color(255, 137, 102));
		frmCsciSimulator.setBackground(Color.WHITE);
		frmCsciSimulator.setForeground(Color.WHITE);
		frmCsciSimulator.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(FrontEnd.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frmCsciSimulator.setTitle("CSCI 6461 SIMULATOR PROJECT");
		frmCsciSimulator.setBounds(100, 100, 1521, 594);
		frmCsciSimulator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCsciSimulator.getContentPane().setLayout(null);

		btn_FindProgram1 = new JButton("2. Find");
		btn_FindProgram1.setBounds(1390, 510, 89, 23);
		frmCsciSimulator.getContentPane().add(btn_FindProgram1);

		separator_12 = new JSeparator();
		separator_12.setOrientation(SwingConstants.VERTICAL);
		separator_12.setForeground(new Color(165, 42, 42));
		separator_12.setBounds(600, 40, 2, 467);
		frmCsciSimulator.getContentPane().add(separator_12);

		separator_13 = new JSeparator();
		separator_13.setOrientation(SwingConstants.VERTICAL);
		separator_13.setForeground(new Color(165, 42, 42));
		separator_13.setBounds(575, 40, 2, 467);
		frmCsciSimulator.getContentPane().add(separator_13);

		separator_14 = new JSeparator();
		separator_14.setOrientation(SwingConstants.VERTICAL);
		separator_14.setForeground(new Color(165, 42, 42));
		separator_14.setBounds(550, 40, 2, 467);
		frmCsciSimulator.getContentPane().add(separator_14);

		separator_15 = new JSeparator();
		separator_15.setOrientation(SwingConstants.VERTICAL);
		separator_15.setForeground(new Color(165, 42, 42));
		separator_15.setBounds(525, 40, 2, 467);
		frmCsciSimulator.getContentPane().add(separator_15);

		separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setForeground(new Color(165, 42, 42));
		separator_8.setBounds(500, 40, 2, 467);
		frmCsciSimulator.getContentPane().add(separator_8);

		separator_9 = new JSeparator();
		separator_9.setOrientation(SwingConstants.VERTICAL);
		separator_9.setForeground(new Color(165, 42, 42));
		separator_9.setBounds(475, 40, 2, 467);
		frmCsciSimulator.getContentPane().add(separator_9);

		separator_10 = new JSeparator();
		separator_10.setOrientation(SwingConstants.VERTICAL);
		separator_10.setForeground(new Color(165, 42, 42));
		separator_10.setBounds(450, 40, 2, 467);
		frmCsciSimulator.getContentPane().add(separator_10);

		separator_11 = new JSeparator();
		separator_11.setOrientation(SwingConstants.VERTICAL);
		separator_11.setForeground(new Color(165, 42, 42));
		separator_11.setBounds(425, 40, 2, 467);
		frmCsciSimulator.getContentPane().add(separator_11);

		separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setForeground(new Color(165, 42, 42));
		separator_4.setBounds(400, 40, 2, 467);
		frmCsciSimulator.getContentPane().add(separator_4);

		separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setForeground(new Color(165, 42, 42));
		separator_5.setBounds(375, 40, 2, 467);
		frmCsciSimulator.getContentPane().add(separator_5);

		separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setForeground(new Color(165, 42, 42));
		separator_6.setBounds(350, 40, 2, 467);
		frmCsciSimulator.getContentPane().add(separator_6);

		separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setForeground(new Color(165, 42, 42));
		separator_7.setBounds(325, 40, 2, 467);
		frmCsciSimulator.getContentPane().add(separator_7);

		separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(new Color(165, 42, 42));
		separator_2.setBounds(300, 40, 2, 467);
		frmCsciSimulator.getContentPane().add(separator_2);

		separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setForeground(new Color(165, 42, 42));
		separator_3.setBounds(275, 40, 2, 467);
		frmCsciSimulator.getContentPane().add(separator_3);

		separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(new Color(165, 42, 42));
		separator_1.setBounds(250, 40, 2, 467);
		frmCsciSimulator.getContentPane().add(separator_1);

		separator = new JSeparator();
		separator.setForeground(new Color(165, 42, 42));
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(225, 40, 2, 467);
		frmCsciSimulator.getContentPane().add(separator);

		panelMAR = new JPanel();
		panelMAR.setBounds(204, 136, 565, 23);
		frmCsciSimulator.getContentPane().add(panelMAR);
		panelMAR.setLayout(null);

		textPane_MAR = new JTextPane();
		textPane_MAR.setBounds(411, 0, 144, 23);
		panelMAR.add(textPane_MAR);
		textPane_MAR.setEditable(false);

		mar_0 = new JRadioButton("");
		mar_0.setBounds(0, 0, 23, 23);
		panelMAR.add(mar_0);

		mar_1 = new JRadioButton("");
		mar_1.setBounds(25, 0, 23, 23);
		panelMAR.add(mar_1);

		mar_2 = new JRadioButton("");
		mar_2.setBounds(50, 0, 23, 23);
		panelMAR.add(mar_2);

		mar_3 = new JRadioButton("");
		mar_3.setBounds(75, 0, 23, 23);
		panelMAR.add(mar_3);

		mar_4 = new JRadioButton("");
		mar_4.setBounds(100, 0, 23, 23);
		panelMAR.add(mar_4);

		mar_5 = new JRadioButton("");
		mar_5.setBounds(125, 0, 23, 23);
		panelMAR.add(mar_5);

		mar_6 = new JRadioButton("");
		mar_6.setBounds(150, 0, 23, 23);
		panelMAR.add(mar_6);

		mar_7 = new JRadioButton("");
		mar_7.setBounds(175, 0, 23, 23);
		panelMAR.add(mar_7);

		mar_8 = new JRadioButton("");
		mar_8.setBounds(200, 0, 23, 23);
		panelMAR.add(mar_8);

		mar_9 = new JRadioButton("");
		mar_9.setBounds(225, 0, 23, 23);
		panelMAR.add(mar_9);

		mar_10 = new JRadioButton("");
		mar_10.setBounds(250, 0, 23, 23);
		panelMAR.add(mar_10);

		mar_11 = new JRadioButton("");
		mar_11.setBounds(275, 0, 23, 23);
		panelMAR.add(mar_11);

		mar_12 = new JRadioButton("");
		mar_12.setBounds(300, 0, 23, 23);
		panelMAR.add(mar_12);

		mar_13 = new JRadioButton("");
		mar_13.setBounds(325, 0, 23, 23);
		panelMAR.add(mar_13);

		mar_14 = new JRadioButton("");
		mar_14.setBounds(350, 0, 23, 23);
		panelMAR.add(mar_14);

		mar_15 = new JRadioButton("");
		mar_15.setBounds(375, 0, 23, 23);
		panelMAR.add(mar_15);
		mar_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		panelMBR = new JPanel();
		panelMBR.setBounds(204, 174, 565, 23);
		frmCsciSimulator.getContentPane().add(panelMBR);
		panelMBR.setLayout(null);

		textPane_MBR = new JTextPane();
		textPane_MBR.setBounds(411, 0, 144, 23);
		panelMBR.add(textPane_MBR);
		textPane_MBR.setEditable(false);

		mbr_0 = new JRadioButton("");
		mbr_0.setBounds(0, 0, 23, 23);
		panelMBR.add(mbr_0);

		mbr_1 = new JRadioButton("");
		mbr_1.setBounds(25, 0, 23, 23);
		panelMBR.add(mbr_1);

		mbr_2 = new JRadioButton("");
		mbr_2.setBounds(50, 0, 23, 23);
		panelMBR.add(mbr_2);

		mbr_3 = new JRadioButton("");
		mbr_3.setBounds(75, 0, 23, 23);
		panelMBR.add(mbr_3);

		mbr_4 = new JRadioButton("");
		mbr_4.setBounds(100, 0, 23, 23);
		panelMBR.add(mbr_4);

		mbr_5 = new JRadioButton("");
		mbr_5.setBounds(125, 0, 23, 23);
		panelMBR.add(mbr_5);

		mbr_6 = new JRadioButton("");
		mbr_6.setBounds(150, 0, 23, 23);
		panelMBR.add(mbr_6);

		mbr_7 = new JRadioButton("");
		mbr_7.setBounds(175, 0, 23, 23);
		panelMBR.add(mbr_7);

		mbr_8 = new JRadioButton("");
		mbr_8.setBounds(200, 0, 23, 23);
		panelMBR.add(mbr_8);

		mbr_9 = new JRadioButton("");
		mbr_9.setBounds(225, 0, 23, 23);
		panelMBR.add(mbr_9);

		mbr_10 = new JRadioButton("");
		mbr_10.setBounds(250, 0, 23, 23);
		panelMBR.add(mbr_10);

		mbr_11 = new JRadioButton("");
		mbr_11.setBounds(275, 0, 23, 23);
		panelMBR.add(mbr_11);

		mbr_12 = new JRadioButton("");
		mbr_12.setBounds(300, 0, 23, 23);
		panelMBR.add(mbr_12);

		mbr_13 = new JRadioButton("");
		mbr_13.setBounds(325, 0, 23, 23);
		panelMBR.add(mbr_13);

		mbr_14 = new JRadioButton("");
		mbr_14.setBounds(350, 0, 23, 23);
		panelMBR.add(mbr_14);

		mbr_15 = new JRadioButton("");
		mbr_15.setBounds(375, 0, 23, 23);
		panelMBR.add(mbr_15);

		panelX1 = new JPanel();
		panelX1.setBounds(204, 237, 565, 23);
		frmCsciSimulator.getContentPane().add(panelX1);
		panelX1.setLayout(null);

		textPane_X1 = new JTextPane();
		textPane_X1.setBounds(411, 0, 144, 23);
		panelX1.add(textPane_X1);
		textPane_X1.setEditable(false);

		x1_0 = new JRadioButton("");
		x1_0.setBounds(0, 0, 23, 23);
		panelX1.add(x1_0);

		x1_1 = new JRadioButton("");
		x1_1.setBounds(25, 0, 23, 23);
		panelX1.add(x1_1);

		x1_2 = new JRadioButton("");
		x1_2.setBounds(50, 0, 23, 23);
		panelX1.add(x1_2);

		x1_3 = new JRadioButton("");
		x1_3.setBounds(75, 0, 23, 23);
		panelX1.add(x1_3);

		x1_4 = new JRadioButton("");
		x1_4.setBounds(100, 0, 23, 23);
		panelX1.add(x1_4);

		x1_5 = new JRadioButton("");
		x1_5.setBounds(125, 0, 23, 23);
		panelX1.add(x1_5);

		x1_6 = new JRadioButton("");
		x1_6.setBounds(150, 0, 23, 23);
		panelX1.add(x1_6);

		x1_7 = new JRadioButton("");
		x1_7.setBounds(175, 0, 23, 23);
		panelX1.add(x1_7);

		x1_8 = new JRadioButton("");
		x1_8.setBounds(200, 0, 23, 23);
		panelX1.add(x1_8);

		x1_9 = new JRadioButton("");
		x1_9.setBounds(225, 0, 23, 23);
		panelX1.add(x1_9);

		x1_10 = new JRadioButton("");
		x1_10.setBounds(250, 0, 23, 23);
		panelX1.add(x1_10);

		x1_11 = new JRadioButton("");
		x1_11.setBounds(275, 0, 23, 23);
		panelX1.add(x1_11);

		x1_12 = new JRadioButton("");
		x1_12.setBounds(300, 0, 23, 23);
		panelX1.add(x1_12);

		x1_13 = new JRadioButton("");
		x1_13.setBounds(325, 0, 23, 23);
		panelX1.add(x1_13);

		x1_14 = new JRadioButton("");
		x1_14.setBounds(350, 0, 23, 23);
		panelX1.add(x1_14);

		x1_15 = new JRadioButton("");
		x1_15.setBounds(375, 0, 23, 23);
		panelX1.add(x1_15);

		panelX2 = new JPanel();
		panelX2.setBounds(204, 267, 565, 23);
		frmCsciSimulator.getContentPane().add(panelX2);
		panelX2.setLayout(null);

		textPane_X2 = new JTextPane();
		textPane_X2.setBounds(411, 0, 144, 23);
		panelX2.add(textPane_X2);
		textPane_X2.setEditable(false);

		x2_0 = new JRadioButton("");
		x2_0.setBounds(0, 0, 23, 23);
		panelX2.add(x2_0);

		x2_1 = new JRadioButton("");
		x2_1.setBounds(25, 0, 23, 23);
		panelX2.add(x2_1);

		x2_2 = new JRadioButton("");
		x2_2.setBounds(50, 0, 23, 23);
		panelX2.add(x2_2);

		x2_3 = new JRadioButton("");
		x2_3.setBounds(75, 0, 23, 23);
		panelX2.add(x2_3);

		x2_4 = new JRadioButton("");
		x2_4.setBounds(100, 0, 23, 23);
		panelX2.add(x2_4);

		x2_5 = new JRadioButton("");
		x2_5.setBounds(125, 0, 23, 23);
		panelX2.add(x2_5);

		x2_6 = new JRadioButton("");
		x2_6.setBounds(150, 0, 23, 23);
		panelX2.add(x2_6);

		x2_7 = new JRadioButton("");
		x2_7.setBounds(175, 0, 23, 23);
		panelX2.add(x2_7);

		x2_8 = new JRadioButton("");
		x2_8.setBounds(200, 0, 23, 23);
		panelX2.add(x2_8);

		x2_9 = new JRadioButton("");
		x2_9.setBounds(225, 0, 23, 23);
		panelX2.add(x2_9);

		x2_10 = new JRadioButton("");
		x2_10.setBounds(250, 0, 23, 23);
		panelX2.add(x2_10);

		x2_11 = new JRadioButton("");
		x2_11.setBounds(275, 0, 23, 23);
		panelX2.add(x2_11);

		x2_12 = new JRadioButton("");
		x2_12.setBounds(300, 0, 23, 23);
		panelX2.add(x2_12);

		x2_13 = new JRadioButton("");
		x2_13.setBounds(325, 0, 23, 23);
		panelX2.add(x2_13);

		x2_14 = new JRadioButton("");
		x2_14.setBounds(350, 0, 23, 23);
		panelX2.add(x2_14);

		x2_15 = new JRadioButton("");
		x2_15.setBounds(375, 0, 23, 23);
		panelX2.add(x2_15);

		panelX3 = new JPanel();
		panelX3.setBounds(204, 300, 565, 23);
		frmCsciSimulator.getContentPane().add(panelX3);
		panelX3.setLayout(null);

		textPane_X3 = new JTextPane();
		textPane_X3.setBounds(411, 0, 144, 23);
		panelX3.add(textPane_X3);
		textPane_X3.setEditable(false);

		x3_0 = new JRadioButton("");
		x3_0.setBounds(0, 0, 23, 23);
		panelX3.add(x3_0);

		x3_1 = new JRadioButton("");
		x3_1.setBounds(25, 0, 23, 23);
		panelX3.add(x3_1);

		x3_2 = new JRadioButton("");
		x3_2.setBounds(50, 0, 23, 23);
		panelX3.add(x3_2);

		x3_3 = new JRadioButton("");
		x3_3.setBounds(75, 0, 23, 23);
		panelX3.add(x3_3);

		x3_4 = new JRadioButton("");
		x3_4.setBounds(100, 0, 23, 23);
		panelX3.add(x3_4);

		x3_5 = new JRadioButton("");
		x3_5.setBounds(125, 0, 23, 23);
		panelX3.add(x3_5);

		x3_6 = new JRadioButton("");
		x3_6.setBounds(150, 0, 23, 23);
		panelX3.add(x3_6);

		x3_7 = new JRadioButton("");
		x3_7.setBounds(175, 0, 23, 23);
		panelX3.add(x3_7);

		x3_8 = new JRadioButton("");
		x3_8.setBounds(200, 0, 23, 23);
		panelX3.add(x3_8);

		x3_9 = new JRadioButton("");
		x3_9.setBounds(225, 0, 23, 23);
		panelX3.add(x3_9);

		x3_10 = new JRadioButton("");
		x3_10.setBounds(250, 0, 23, 23);
		panelX3.add(x3_10);

		x3_11 = new JRadioButton("");
		x3_11.setBounds(275, 0, 23, 23);
		panelX3.add(x3_11);

		x3_12 = new JRadioButton("");
		x3_12.setBounds(300, 0, 23, 23);
		panelX3.add(x3_12);

		x3_13 = new JRadioButton("");
		x3_13.setBounds(325, 0, 23, 23);
		panelX3.add(x3_13);

		x3_14 = new JRadioButton("");
		x3_14.setBounds(350, 0, 23, 23);
		panelX3.add(x3_14);

		x3_15 = new JRadioButton("");
		x3_15.setBounds(375, 0, 23, 23);
		panelX3.add(x3_15);

		panelR0 = new JPanel();
		panelR0.setBounds(204, 330, 565, 23);
		frmCsciSimulator.getContentPane().add(panelR0);
		panelR0.setLayout(null);

		textPane_R0 = new JTextPane();
		textPane_R0.setBounds(411, 0, 144, 23);
		panelR0.add(textPane_R0);
		textPane_R0.setEditable(false);

		r0_0 = new JRadioButton("");
		r0_0.setBounds(0, 0, 23, 23);
		panelR0.add(r0_0);

		r0_1 = new JRadioButton("");
		r0_1.setBounds(25, 0, 23, 23);
		panelR0.add(r0_1);

		r0_2 = new JRadioButton("");
		r0_2.setBounds(50, 0, 23, 23);
		panelR0.add(r0_2);

		r0_3 = new JRadioButton("");
		r0_3.setBounds(75, 0, 23, 23);
		panelR0.add(r0_3);

		r0_4 = new JRadioButton("");
		r0_4.setBounds(100, 0, 23, 23);
		panelR0.add(r0_4);

		r0_5 = new JRadioButton("");
		r0_5.setBounds(125, 0, 23, 23);
		panelR0.add(r0_5);

		r0_6 = new JRadioButton("");
		r0_6.setBounds(150, 0, 23, 23);
		panelR0.add(r0_6);

		r0_7 = new JRadioButton("");
		r0_7.setBounds(175, 0, 23, 23);
		panelR0.add(r0_7);

		r0_8 = new JRadioButton("");
		r0_8.setBounds(200, 0, 23, 23);
		panelR0.add(r0_8);

		r0_9 = new JRadioButton("");
		r0_9.setBounds(225, 0, 23, 23);
		panelR0.add(r0_9);

		r0_10 = new JRadioButton("");
		r0_10.setBounds(250, 0, 23, 23);
		panelR0.add(r0_10);

		r0_11 = new JRadioButton("");
		r0_11.setBounds(275, 0, 23, 23);
		panelR0.add(r0_11);

		r0_12 = new JRadioButton("");
		r0_12.setBounds(300, 0, 23, 23);
		panelR0.add(r0_12);

		r0_13 = new JRadioButton("");
		r0_13.setBounds(325, 0, 23, 23);
		panelR0.add(r0_13);

		r0_14 = new JRadioButton("");
		r0_14.setBounds(350, 0, 23, 23);
		panelR0.add(r0_14);

		r0_15 = new JRadioButton("");
		r0_15.setBounds(375, 0, 23, 23);
		panelR0.add(r0_15);

		panelR1 = new JPanel();
		panelR1.setBounds(204, 360, 565, 23);
		frmCsciSimulator.getContentPane().add(panelR1);
		panelR1.setLayout(null);

		textPane_R1 = new JTextPane();
		textPane_R1.setBounds(411, 0, 144, 23);
		panelR1.add(textPane_R1);
		textPane_R1.setEditable(false);

		r1_0 = new JRadioButton("");
		r1_0.setBounds(0, 0, 23, 23);
		panelR1.add(r1_0);

		r1_1 = new JRadioButton("");
		r1_1.setBounds(25, 0, 23, 23);
		panelR1.add(r1_1);

		r1_2 = new JRadioButton("");
		r1_2.setBounds(50, 0, 23, 23);
		panelR1.add(r1_2);

		r1_3 = new JRadioButton("");
		r1_3.setBounds(75, 0, 23, 23);
		panelR1.add(r1_3);

		r1_4 = new JRadioButton("");
		r1_4.setBounds(100, 0, 23, 23);
		panelR1.add(r1_4);

		r1_5 = new JRadioButton("");
		r1_5.setBounds(125, 0, 23, 23);
		panelR1.add(r1_5);

		r1_6 = new JRadioButton("");
		r1_6.setBounds(150, 0, 23, 23);
		panelR1.add(r1_6);

		r1_7 = new JRadioButton("");
		r1_7.setBounds(175, 0, 23, 23);
		panelR1.add(r1_7);

		r1_8 = new JRadioButton("");
		r1_8.setBounds(200, 0, 23, 23);
		panelR1.add(r1_8);

		r1_9 = new JRadioButton("");
		r1_9.setBounds(225, 0, 23, 23);
		panelR1.add(r1_9);

		r1_10 = new JRadioButton("");
		r1_10.setBounds(250, 0, 23, 23);
		panelR1.add(r1_10);

		r1_11 = new JRadioButton("");
		r1_11.setBounds(275, 0, 23, 23);
		panelR1.add(r1_11);

		r1_12 = new JRadioButton("");
		r1_12.setBounds(300, 0, 23, 23);
		panelR1.add(r1_12);

		r1_13 = new JRadioButton("");
		r1_13.setBounds(325, 0, 23, 23);
		panelR1.add(r1_13);

		r1_14 = new JRadioButton("");
		r1_14.setBounds(350, 0, 23, 23);
		panelR1.add(r1_14);

		r1_15 = new JRadioButton("");
		r1_15.setBounds(375, 0, 23, 23);
		panelR1.add(r1_15);

		panelR2 = new JPanel();
		panelR2.setBounds(204, 398, 565, 23);
		frmCsciSimulator.getContentPane().add(panelR2);
		panelR2.setLayout(null);

		textPane_R2 = new JTextPane();
		textPane_R2.setBounds(411, 0, 144, 23);
		panelR2.add(textPane_R2);
		textPane_R2.setEditable(false);

		r2_0 = new JRadioButton("");
		r2_0.setBounds(0, 0, 23, 23);
		panelR2.add(r2_0);

		r2_1 = new JRadioButton("");
		r2_1.setBounds(25, 0, 23, 23);
		panelR2.add(r2_1);

		r2_2 = new JRadioButton("");
		r2_2.setBounds(50, 0, 23, 23);
		panelR2.add(r2_2);

		r2_3 = new JRadioButton("");
		r2_3.setBounds(75, 0, 23, 23);
		panelR2.add(r2_3);

		r2_4 = new JRadioButton("");
		r2_4.setBounds(100, 0, 23, 23);
		panelR2.add(r2_4);

		r2_5 = new JRadioButton("");
		r2_5.setBounds(125, 0, 23, 23);
		panelR2.add(r2_5);

		r2_6 = new JRadioButton("");
		r2_6.setBounds(150, 0, 23, 23);
		panelR2.add(r2_6);

		r2_7 = new JRadioButton("");
		r2_7.setBounds(175, 0, 23, 23);
		panelR2.add(r2_7);

		r2_8 = new JRadioButton("");
		r2_8.setBounds(200, 0, 23, 23);
		panelR2.add(r2_8);

		r2_9 = new JRadioButton("");
		r2_9.setBounds(225, 0, 23, 23);
		panelR2.add(r2_9);

		r2_10 = new JRadioButton("");
		r2_10.setBounds(250, 0, 23, 23);
		panelR2.add(r2_10);

		r2_11 = new JRadioButton("");
		r2_11.setBounds(275, 0, 23, 23);
		panelR2.add(r2_11);

		r2_12 = new JRadioButton("");
		r2_12.setBounds(300, 0, 23, 23);
		panelR2.add(r2_12);

		r2_13 = new JRadioButton("");
		r2_13.setBounds(325, 0, 23, 23);
		panelR2.add(r2_13);

		r2_14 = new JRadioButton("");
		r2_14.setBounds(350, 0, 23, 23);
		panelR2.add(r2_14);

		r2_15 = new JRadioButton("");
		r2_15.setBounds(375, 0, 23, 23);
		panelR2.add(r2_15);

		panelR3 = new JPanel();
		panelR3.setBounds(204, 436, 565, 23);
		frmCsciSimulator.getContentPane().add(panelR3);
		panelR3.setLayout(null);

		textPane_R3 = new JTextPane();
		textPane_R3.setBounds(411, 0, 144, 23);
		panelR3.add(textPane_R3);
		textPane_R3.setEditable(false);

		r3_0 = new JRadioButton("");
		r3_0.setBounds(0, 0, 23, 23);
		panelR3.add(r3_0);

		r3_1 = new JRadioButton("");
		r3_1.setBounds(25, 0, 23, 23);
		panelR3.add(r3_1);

		r3_2 = new JRadioButton("");
		r3_2.setBounds(50, 0, 23, 23);
		panelR3.add(r3_2);

		r3_3 = new JRadioButton("");
		r3_3.setBounds(75, 0, 23, 23);
		panelR3.add(r3_3);

		r3_4 = new JRadioButton("");
		r3_4.setBounds(100, 0, 23, 23);
		panelR3.add(r3_4);

		r3_5 = new JRadioButton("");
		r3_5.setBounds(125, 0, 23, 23);
		panelR3.add(r3_5);

		r3_6 = new JRadioButton("");
		r3_6.setBounds(150, 0, 23, 23);
		panelR3.add(r3_6);

		r3_7 = new JRadioButton("");
		r3_7.setBounds(175, 0, 23, 23);
		panelR3.add(r3_7);

		r3_8 = new JRadioButton("");
		r3_8.setBounds(200, 0, 23, 23);
		panelR3.add(r3_8);

		r3_9 = new JRadioButton("");
		r3_9.setBounds(225, 0, 23, 23);
		panelR3.add(r3_9);

		r3_10 = new JRadioButton("");
		r3_10.setBounds(250, 0, 23, 23);
		panelR3.add(r3_10);

		r3_11 = new JRadioButton("");
		r3_11.setBounds(275, 0, 23, 23);
		panelR3.add(r3_11);

		r3_12 = new JRadioButton("");
		r3_12.setBounds(300, 0, 23, 23);
		panelR3.add(r3_12);

		r3_13 = new JRadioButton("");
		r3_13.setBounds(325, 0, 23, 23);
		panelR3.add(r3_13);

		r3_14 = new JRadioButton("");
		r3_14.setBounds(350, 0, 23, 23);
		panelR3.add(r3_14);

		r3_15 = new JRadioButton("");
		r3_15.setBounds(375, 0, 23, 23);
		panelR3.add(r3_15);

		panelCUSTOM = new JPanel();
		panelCUSTOM.setBounds(204, 472, 565, 23);
		frmCsciSimulator.getContentPane().add(panelCUSTOM);
		panelCUSTOM.setLayout(null);

		textPane_CUSTOM = new JTextPane();
		textPane_CUSTOM.setBounds(411, 0, 144, 23);
		panelCUSTOM.add(textPane_CUSTOM);
		textPane_CUSTOM.setEditable(false);

		ci_0 = new JRadioButton("");
		ci_0.setBounds(0, 0, 23, 23);
		panelCUSTOM.add(ci_0);

		ci_1 = new JRadioButton("");
		ci_1.setBounds(25, 0, 23, 23);
		panelCUSTOM.add(ci_1);

		ci_2 = new JRadioButton("");
		ci_2.setBounds(50, 0, 23, 23);
		panelCUSTOM.add(ci_2);

		ci_3 = new JRadioButton("");
		ci_3.setBounds(75, 0, 23, 23);
		panelCUSTOM.add(ci_3);

		ci_4 = new JRadioButton("");
		ci_4.setBounds(100, 0, 23, 23);
		panelCUSTOM.add(ci_4);

		ci_5 = new JRadioButton("");
		ci_5.setBounds(125, 0, 23, 23);
		panelCUSTOM.add(ci_5);

		ci_6 = new JRadioButton("");
		ci_6.setBounds(150, 0, 23, 23);
		panelCUSTOM.add(ci_6);

		ci_7 = new JRadioButton("");
		ci_7.setBounds(175, 0, 23, 23);
		panelCUSTOM.add(ci_7);

		ci_8 = new JRadioButton("");
		ci_8.setBounds(200, 0, 23, 23);
		panelCUSTOM.add(ci_8);

		ci_9 = new JRadioButton("");
		ci_9.setBounds(225, 0, 23, 23);
		panelCUSTOM.add(ci_9);

		ci_10 = new JRadioButton("");
		ci_10.setBounds(250, 0, 23, 23);
		panelCUSTOM.add(ci_10);

		ci_11 = new JRadioButton("");
		ci_11.setBounds(275, 0, 23, 23);
		panelCUSTOM.add(ci_11);

		ci_12 = new JRadioButton("");
		ci_12.setBounds(300, 0, 23, 23);
		panelCUSTOM.add(ci_12);

		ci_13 = new JRadioButton("");
		ci_13.setBounds(325, 0, 23, 23);
		panelCUSTOM.add(ci_13);

		ci_14 = new JRadioButton("");
		ci_14.setBounds(350, 0, 23, 23);
		panelCUSTOM.add(ci_14);

		ci_15 = new JRadioButton("");
		ci_15.setBounds(375, 0, 23, 23);
		panelCUSTOM.add(ci_15);

		panelIR = new JPanel();
		panelIR.setBounds(204, 110, 565, 23);
		frmCsciSimulator.getContentPane().add(panelIR);
		panelIR.setLayout(null);

		textPane_IR = new JTextPane();
		textPane_IR.setBounds(411, 0, 144, 23);
		panelIR.add(textPane_IR);
		textPane_IR.setEditable(false);

		ir_0 = new JRadioButton("");
		ir_0.setBounds(0, 0, 23, 23);
		panelIR.add(ir_0);

		ir_1 = new JRadioButton("");
		ir_1.setBounds(25, 0, 23, 23);
		panelIR.add(ir_1);

		ir_2 = new JRadioButton("");
		ir_2.setBounds(50, 0, 23, 23);
		panelIR.add(ir_2);

		ir_3 = new JRadioButton("");
		ir_3.setBounds(75, 0, 23, 23);
		panelIR.add(ir_3);

		ir_4 = new JRadioButton("");
		ir_4.setBounds(100, 0, 23, 23);
		panelIR.add(ir_4);

		ir_5 = new JRadioButton("");
		ir_5.setBounds(125, 0, 23, 23);
		panelIR.add(ir_5);

		ir_6 = new JRadioButton("");
		ir_6.setBounds(150, 0, 23, 23);
		panelIR.add(ir_6);

		ir_7 = new JRadioButton("");
		ir_7.setBounds(175, 0, 23, 23);
		panelIR.add(ir_7);

		ir_8 = new JRadioButton("");
		ir_8.setBounds(200, 0, 23, 23);
		panelIR.add(ir_8);

		ir_9 = new JRadioButton("");
		ir_9.setBounds(225, 0, 23, 23);
		panelIR.add(ir_9);

		ir_10 = new JRadioButton("");
		ir_10.setBounds(250, 0, 23, 23);
		panelIR.add(ir_10);

		ir_11 = new JRadioButton("");
		ir_11.setBounds(275, 0, 23, 23);
		panelIR.add(ir_11);

		ir_12 = new JRadioButton("");
		ir_12.setBounds(300, 0, 23, 23);
		panelIR.add(ir_12);

		ir_13 = new JRadioButton("");
		ir_13.setBounds(325, 0, 23, 23);
		panelIR.add(ir_13);

		ir_14 = new JRadioButton("");
		ir_14.setBounds(350, 0, 23, 23);
		panelIR.add(ir_14);

		ir_15 = new JRadioButton("");
		ir_15.setBounds(375, 0, 23, 23);
		panelIR.add(ir_15);

		btnPC = new JButton("PC");
		btnPC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		// btnPC.addMouseListener(new MouseAdapter() {
		// @Override
		// public void mouseClicked(MouseEvent e) {
		// StringBuffer stringBuffer = new StringBuffer();
		// int index = 0;
		// for(Component component : panelPC. )

		// }
		// });
		btnPC.setBounds(109, 60, 89, 23);
		frmCsciSimulator.getContentPane().add(btnPC);

		panelPC = new JPanel();
		panelPC.setBounds(204, 60, 565, 23);
		frmCsciSimulator.getContentPane().add(panelPC);
		panelPC.setLayout(null);

		textPane_PC = new JTextPane();
		textPane_PC.setBounds(411, 0, 144, 23);
		panelPC.add(textPane_PC);
		textPane_PC.setEditable(false);

		pc_0 = new JRadioButton("");
		pc_0.setBounds(0, 0, 23, 23);
		panelPC.add(pc_0);

		pc_1 = new JRadioButton("");
		pc_1.setBounds(25, 0, 23, 23);
		panelPC.add(pc_1);

		pc_2 = new JRadioButton("");
		pc_2.setBounds(50, 0, 23, 23);
		panelPC.add(pc_2);

		pc_3 = new JRadioButton("");
		pc_3.setBounds(75, 0, 23, 23);
		panelPC.add(pc_3);

		pc_4 = new JRadioButton("");
		pc_4.setBounds(100, 0, 23, 23);
		panelPC.add(pc_4);

		pc_5 = new JRadioButton("");
		pc_5.setBounds(125, 0, 23, 23);
		panelPC.add(pc_5);

		pc_6 = new JRadioButton("");
		pc_6.setBounds(150, 0, 23, 23);
		panelPC.add(pc_6);

		pc_7 = new JRadioButton("");
		pc_7.setBounds(175, 0, 23, 23);
		panelPC.add(pc_7);

		pc_8 = new JRadioButton("");
		pc_8.setBounds(200, 0, 23, 23);
		panelPC.add(pc_8);

		pc_9 = new JRadioButton("");
		pc_9.setBounds(225, 0, 23, 23);
		panelPC.add(pc_9);

		pc_10 = new JRadioButton("");
		pc_10.setBounds(250, 0, 23, 23);
		panelPC.add(pc_10);

		pc_11 = new JRadioButton("");
		pc_11.setBounds(275, 0, 23, 23);
		panelPC.add(pc_11);

		btnIR = new JButton("IR");
		btnIR.setBounds(109, 110, 89, 23);
		frmCsciSimulator.getContentPane().add(btnIR);

		btnMAR = new JButton("MAR");
		btnMAR.setBounds(109, 136, 89, 23);
		frmCsciSimulator.getContentPane().add(btnMAR);

		btnMBR = new JButton("MBR");
		btnMBR.setBounds(109, 170, 89, 23);
		frmCsciSimulator.getContentPane().add(btnMBR);

		btnX1 = new JButton("X1");
		btnX1.setBounds(109, 237, 89, 23);
		frmCsciSimulator.getContentPane().add(btnX1);

		btnX2 = new JButton("X2");
		btnX2.setBounds(109, 267, 89, 23);
		frmCsciSimulator.getContentPane().add(btnX2);

		btnX3 = new JButton("X3");
		btnX3.setBounds(109, 300, 89, 23);
		frmCsciSimulator.getContentPane().add(btnX3);

		btnR0 = new JButton("R0");
		btnR0.setBounds(109, 330, 89, 23);
		frmCsciSimulator.getContentPane().add(btnR0);

		btnR1 = new JButton("R1");
		btnR1.setBounds(109, 360, 89, 23);
		frmCsciSimulator.getContentPane().add(btnR1);

		btnR2 = new JButton("R2");
		btnR2.setBounds(109, 398, 89, 23);
		frmCsciSimulator.getContentPane().add(btnR2);

		btnR3 = new JButton("R3");
		btnR3.setBounds(109, 436, 89, 23);
		frmCsciSimulator.getContentPane().add(btnR3);

		btnCUSTOM = new JButton("CUSTOM INSTRUCTION");
		btnCUSTOM.setBounds(10, 470, 188, 32);
		frmCsciSimulator.getContentPane().add(btnCUSTOM);

		btnCC = new JButton("CC");
		btnCC.setBounds(109, 84, 89, 23);
		frmCsciSimulator.getContentPane().add(btnCC);

		panelCC = new JPanel();
		panelCC.setBounds(204, 84, 565, 23);
		frmCsciSimulator.getContentPane().add(panelCC);
		panelCC.setLayout(null);

		textPane_CC = new JTextPane();
		textPane_CC.setBounds(411, 0, 144, 23);
		panelCC.add(textPane_CC);
		textPane_CC.setEditable(false);

		cc_0 = new JRadioButton("");
		cc_0.setBounds(0, 0, 23, 23);
		panelCC.add(cc_0);

		cc_1 = new JRadioButton("");
		cc_1.setBounds(25, 0, 23, 23);
		panelCC.add(cc_1);

		cc_2 = new JRadioButton("");
		cc_2.setBounds(50, 0, 23, 23);
		panelCC.add(cc_2);

		cc_3 = new JRadioButton("");
		cc_3.setBounds(75, 0, 23, 23);
		panelCC.add(cc_3);

		btnMFR = new JButton("MFR");
		btnMFR.setBounds(109, 204, 89, 23);
		frmCsciSimulator.getContentPane().add(btnMFR);

		panelMFR = new JPanel();
		panelMFR.setBounds(204, 204, 565, 23);
		frmCsciSimulator.getContentPane().add(panelMFR);
		panelMFR.setLayout(null);

		textPane_MFR = new JTextPane();
		textPane_MFR.setBounds(411, 0, 144, 23);
		panelMFR.add(textPane_MFR);
		textPane_MFR.setEditable(false);

		mfr_0 = new JRadioButton("");
		mfr_0.setBounds(0, 0, 23, 23);
		panelMFR.add(mfr_0);
		mfr_0.setForeground(Color.BLACK);

		mfr_1 = new JRadioButton("");
		mfr_1.setBounds(25, 0, 23, 23);
		panelMFR.add(mfr_1);
		mfr_1.setForeground(Color.BLACK);

		mfr_2 = new JRadioButton("");
		mfr_2.setBounds(50, 0, 23, 23);
		panelMFR.add(mfr_2);
		mfr_2.setForeground(Color.BLACK);

		mfr_3 = new JRadioButton("");
		mfr_3.setBounds(75, 0, 23, 23);
		panelMFR.add(mfr_3);
		mfr_3.setForeground(Color.BLACK);

		lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setBounds(210, 40, 14, 14);
		frmCsciSimulator.getContentPane().add(lblNewLabel_1);

		label = new JLabel("1");
		label.setBounds(238, 39, 14, 14);
		frmCsciSimulator.getContentPane().add(label);

		label_1 = new JLabel("2");
		label_1.setBounds(263, 40, 14, 14);
		frmCsciSimulator.getContentPane().add(label_1);

		label_2 = new JLabel("3");
		label_2.setBounds(288, 39, 14, 14);
		frmCsciSimulator.getContentPane().add(label_2);

		label_3 = new JLabel("4");
		label_3.setBounds(313, 39, 14, 14);
		frmCsciSimulator.getContentPane().add(label_3);

		label_4 = new JLabel("5");
		label_4.setBounds(338, 40, 14, 14);
		frmCsciSimulator.getContentPane().add(label_4);

		label_5 = new JLabel("6");
		label_5.setBounds(363, 40, 14, 14);
		frmCsciSimulator.getContentPane().add(label_5);

		label_6 = new JLabel("7");
		label_6.setBounds(388, 40, 14, 14);
		frmCsciSimulator.getContentPane().add(label_6);

		label_7 = new JLabel("8");
		label_7.setBounds(413, 39, 14, 14);
		frmCsciSimulator.getContentPane().add(label_7);

		label_8 = new JLabel("9");
		label_8.setBounds(438, 39, 14, 14);
		frmCsciSimulator.getContentPane().add(label_8);

		label_9 = new JLabel("10");
		label_9.setBounds(463, 39, 14, 14);
		frmCsciSimulator.getContentPane().add(label_9);

		label_10 = new JLabel("11");
		label_10.setBounds(488, 39, 14, 14);
		frmCsciSimulator.getContentPane().add(label_10);

		label_11 = new JLabel("12");
		label_11.setBounds(513, 40, 14, 14);
		frmCsciSimulator.getContentPane().add(label_11);

		label_12 = new JLabel("13");
		label_12.setBounds(538, 40, 14, 14);
		frmCsciSimulator.getContentPane().add(label_12);

		label_13 = new JLabel("14");
		label_13.setBounds(563, 40, 14, 14);
		frmCsciSimulator.getContentPane().add(label_13);

		label_14 = new JLabel("15");
		label_14.setBounds(588, 40, 14, 14);
		frmCsciSimulator.getContentPane().add(label_14);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(790, 58, 436, 272);
		frmCsciSimulator.getContentPane().add(scrollPane);

		monitor = new JTextArea();
		scrollPane.setViewportView(monitor);
		monitor.setEditable(false);
		monitor.setLineWrap(true);

		btnIPL = new JButton("IPL");
		btnIPL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIPL.setBackground(new Color(254, 215, 102));
		btnIPL.setBounds(10, 11, 113, 38);
		btnIPL.setOpaque(true);
		btnIPL.setBorderPainted(false);
		frmCsciSimulator.getContentPane().add(btnIPL);

		JLabel lblMessage = new JLabel("MESSAGE", SwingConstants.CENTER);
		lblMessage.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblMessage.setForeground(Color.MAGENTA);
		lblMessage.setBounds(790, 11, 436, 43);

		frmCsciSimulator.getContentPane().add(lblMessage);

		txtpnPleaseHitIpl = new JTextPane();
		txtpnPleaseHitIpl.setEditable(false);
		txtpnPleaseHitIpl.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnPleaseHitIpl.setBackground(new Color(153, 204, 204));
		txtpnPleaseHitIpl.setText("1. Please click IPL to start.");
		// txtpnPleaseHitIpl.;
		txtpnPleaseHitIpl.setBounds(133, 11, 151, 23);
		frmCsciSimulator.getContentPane().add(txtpnPleaseHitIpl);

		JTextPane txtpnSetupEach = new JTextPane();
		txtpnSetupEach.setText(
				"2. Following steps help customizing each bit for registers:\r\n\r\na. Choose bits to set 1.\r\n\r\nb. Non Choosen bit represents 0.\r\n\r\nc.  After choosing bits, click on register name (PC, IR, R3, etc) to set bits for that register");
		txtpnSetupEach.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnSetupEach.setEditable(false);
		txtpnSetupEach.setBackground(new Color(153, 204, 204));
		txtpnSetupEach.setBounds(5, 110, 94, 349);
		frmCsciSimulator.getContentPane().add(txtpnSetupEach);

		JTextPane txtpnToRun = new JTextPane();
		txtpnToRun.setText("3. To Run Custom instrution, set above bits and click CUSTOM INSTRUCTION");
		txtpnToRun.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnToRun.setEditable(false);
		txtpnToRun.setBackground(new Color(153, 204, 204));
		txtpnToRun.setBounds(10, 510, 430, 39);
		frmCsciSimulator.getContentPane().add(txtpnToRun);

		separator_16 = new JSeparator();
		separator_16.setForeground(new Color(204, 0, 51));
		separator_16.setBackground(Color.MAGENTA);
		separator_16.setForeground(Color.MAGENTA);
		separator_16.setBounds(10, 463, 758, 3);
		frmCsciSimulator.getContentPane().add(separator_16);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(779, 341, 460, 57);
		frmCsciSimulator.getContentPane().add(scrollPane_1);

		textBox = new JTextArea();
		textBox.setLineWrap(true);
		scrollPane_1.setViewportView(textBox);

		btn_SendProgram1 = new JButton("1. Send");
		btn_SendProgram1.setBounds(1276, 510, 89, 23);
		frmCsciSimulator.getContentPane().add(btn_SendProgram1);

		JTextPane txtpnPleaseEnter = new JTextPane();
		txtpnPleaseEnter.setEditable(false);
		txtpnPleaseEnter.setText(
				"\tPROGRAM I\r\na.Please enter 20 numbers ( 0 to 65,535) into the box in following sample: 123,224,23,87,0,1,535,.....,12\r\n\r\nb. Hit SEND first, you will be asked to enter another number, example:\r\n34\r\n\r\nc. Hit FIND and we will show the closet number to that number");
		txtpnPleaseEnter.setBounds(1259, 300, 236, 244);
		frmCsciSimulator.getContentPane().add(txtpnPleaseEnter);

		separator_17 = new JSeparator();
		separator_17.setOrientation(SwingConstants.VERTICAL);
		separator_17.setForeground(new Color(165, 42, 42));
		separator_17.setBounds(778, 60, 2, 467);
		frmCsciSimulator.getContentPane().add(separator_17);
	}

	public void addListeners() {
		// When press IPL
		// Set PC to 10
		btnIPL.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				initializeMachine();

				if (panelActive == false) {
					setActive(panelPC, true);
					setActive(panelCC, true);
					setActive(panelIR, true);
					setActive(panelMAR, true);
					setActive(panelMBR, true);
					setActive(panelMFR, true);
					setActive(panelX1, true);
					setActive(panelX2, true);
					setActive(panelX3, true);
					setActive(panelR0, true);
					setActive(panelR1, true);
					setActive(panelR2, true);
					setActive(panelR3, true);
					setActive(panelCUSTOM, true);

					panelActive = true;
				}
				register.setPC("000000001010");
				// textPane_PC.setText(register.getPC());
				register.setCC("0000");
				// textPane_PC.setText(register.getC());
				register.setIR("0000000000000000");
				// textPane_PC.setText(register.getPC());
				register.setMAR("0000000000000000");
				// textPane_PC.setText(register.getPC());
				register.setMBR("0000000000000000");
				// textPane_PC.setText(register.getPC());
				register.setMFR("0000");
				// textPane_PC.setText(register.getPC());
				register.setX1("0000000000000000");
				// textPane_PC.setText(register.getPC());
				register.setX2("0000000000000000");
				// textPane_PC.setText(register.getPC());
				register.setX3("0000000000000000");
				// textPane_PC.setText(register.getPC());
				register.setR0("0000000000000000");
				// textPane_PC.setText(register.getPC());
				register.setR1("0000000000000000");
				// textPane_PC.setText(register.getPC());
				register.setR2("0000000000000000");
				// textPane_PC.setText(register.getPC());
				register.setR3("0000000000000000");
				// textPane_PC.setText(register.getPC());
				// register.setR0("000000000000");
				updateText();

			}
		});

		// button PC is clicked
		// we loop through the radio button inside panelPC
		// if radio button is selected, append 1 to string builder
		// else append 0 as if it is not selected
		btnPC.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				StringBuffer stringBuffer = new StringBuffer();
				// for each component in this panel
				// if it is a radio button
				// check if the button is clicked or not
				for (Component component : panelPC.getComponents()) {
					if (component instanceof JRadioButton) {
						JRadioButton jRadioButton = (JRadioButton) component;
						stringBuffer = jRadioButton.isSelected() ? stringBuffer.append("1") : stringBuffer.append("0");

					}
				}

				register.setPC(stringBuffer.toString());
				System.out.println("Set PC = " + register.getPC());
				printMessage("Set PC = " + register.getPC());
				updateText();
				// monitor.append("Set PC = " + register.getPC() + "\n");
			}
		});

		// button CC is clicked
		// we loop through the radio button inside panelCC
		// if radio button is selected, append 1 to string builder
		// else append 0 as if it is not selected
		btnCC.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				StringBuffer stringBuffer = new StringBuffer();
				// for each component in this panel
				// if it is a radio button
				// check if the button is clicked or not
				for (Component component : panelCC.getComponents()) {
					if (component instanceof JRadioButton) {
						JRadioButton jRadioButton = (JRadioButton) component;
						stringBuffer = jRadioButton.isSelected() ? stringBuffer.append("1") : stringBuffer.append("0");

					}
				}

				register.setCC(stringBuffer.toString());
				System.out.println("Set CC = " + register.getCC());
				printMessage("Set CC = " + register.getCC());
				updateText();
			}
		});

		// button IR is clicked
		// we loop through the radio button inside panelIR
		// if radio button is selected, append 1 to string builder
		// else append 0 as if it is not selected
		btnIR.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				StringBuffer stringBuffer = new StringBuffer();
				// for each component in this panel
				// if it is a radio button
				// check if the button is clicked or not
				for (Component component : panelIR.getComponents()) {
					if (component instanceof JRadioButton) {
						JRadioButton jRadioButton = (JRadioButton) component;
						stringBuffer = jRadioButton.isSelected() ? stringBuffer.append("1") : stringBuffer.append("0");

					}
				}

				register.setIR(stringBuffer.toString());
				System.out.println("Set IR = " + register.getIR());
				printMessage("Set IR = " + register.getIR());
				updateText();
			}
		});

		// button MAR is clicked
		// we loop through the radio button inside panelMAR
		// if radio button is selected, append 1 to string builder
		// else append 0 as if it is not selected
		btnMAR.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				StringBuffer stringBuffer = new StringBuffer();
				// for each component in this panel
				// if it is a radio button
				// check if the button is clicked or not
				for (Component component : panelMAR.getComponents()) {
					if (component instanceof JRadioButton) {
						JRadioButton jRadioButton = (JRadioButton) component;
						stringBuffer = jRadioButton.isSelected() ? stringBuffer.append("1") : stringBuffer.append("0");

					}
				}

				register.setMAR(stringBuffer.toString());
				System.out.println("Set MAR = " + register.getMAR());
				printMessage("Set MAR = " + register.getMAR());
				updateText();
			}
		});
		// button MBR is clicked
		// we loop through the radio button inside panelMAR
		// if radio button is selected, append 1 to string builder
		// else append 0 as if it is not selected
		btnMBR.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				StringBuffer stringBuffer = new StringBuffer();
				// for each component in this panel
				// if it is a radio button
				// check if the button is clicked or not
				for (Component component : panelMBR.getComponents()) {
					if (component instanceof JRadioButton) {
						JRadioButton jRadioButton = (JRadioButton) component;
						stringBuffer = jRadioButton.isSelected() ? stringBuffer.append("1") : stringBuffer.append("0");

					}
				}

				register.setMBR(stringBuffer.toString());
				System.out.println("Set MBR = " + register.getMBR());
				printMessage("Set MBR = " + register.getMBR());
				updateText();
			}
		});

		// button MFR is clicked
		// we loop through the radio button inside panelMFR
		// if radio button is selected, append 1 to string builder
		// else append 0 as if it is not selected
		btnMFR.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				StringBuffer stringBuffer = new StringBuffer();
				// for each component in this panel
				// if it is a radio button
				// check if the button is clicked or not
				for (Component component : panelMFR.getComponents()) {
					if (component instanceof JRadioButton) {
						JRadioButton jRadioButton = (JRadioButton) component;
						stringBuffer = jRadioButton.isSelected() ? stringBuffer.append("1") : stringBuffer.append("0");

					}
				}

				register.setMFR(stringBuffer.toString());
				System.out.println("Set MFR = " + register.getMFR());
				printMessage("Set MFR = " + register.getMFR());
				updateText();
			}
		});

		// button X1 is clicked
		// we loop through the radio button inside panelX1
		// if radio button is selected, append 1 to string builder
		// else append 0 as if it is not selected
		btnX1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				StringBuffer stringBuffer = new StringBuffer();
				// for each component in this panel
				// if it is a radio button
				// check if the button is clicked or not
				for (Component component : panelX1.getComponents()) {
					if (component instanceof JRadioButton) {
						JRadioButton jRadioButton = (JRadioButton) component;
						stringBuffer = jRadioButton.isSelected() ? stringBuffer.append("1") : stringBuffer.append("0");

					}
				}

				register.setX1(stringBuffer.toString());
				System.out.println("Set X1 = " + register.getX1());
				printMessage("Set X1 = " + register.getX1());
				updateText();
			}
		});

		// button X2 is clicked
		// we loop through the radio button inside panelX2
		// if radio button is selected, append 1 to string builder
		// else append 0 as if it is not selected
		btnX2.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				StringBuffer stringBuffer = new StringBuffer();
				// for each component in this panel
				// if it is a radio button
				// check if the button is clicked or not
				for (Component component : panelX2.getComponents()) {
					if (component instanceof JRadioButton) {
						JRadioButton jRadioButton = (JRadioButton) component;
						stringBuffer = jRadioButton.isSelected() ? stringBuffer.append("1") : stringBuffer.append("0");

					}
				}

				register.setX2(stringBuffer.toString());
				System.out.println("Set X2 = " + register.getX2());
				printMessage("Set X2 = " + register.getX2());
				updateText();
			}
		});

		// button X3 is clicked
		// we loop through the radio button inside panelX3
		// if radio button is selected, append 1 to string builder
		// else append 0 as if it is not selected
		btnX3.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				StringBuffer stringBuffer = new StringBuffer();
				// for each component in this panel
				// if it is a radio button
				// check if the button is clicked or not
				for (Component component : panelX3.getComponents()) {
					if (component instanceof JRadioButton) {
						JRadioButton jRadioButton = (JRadioButton) component;
						stringBuffer = jRadioButton.isSelected() ? stringBuffer.append("1") : stringBuffer.append("0");

					}
				}

				register.setX3(stringBuffer.toString());
				System.out.println("Set X3 = " + register.getX3());
				printMessage("Set X3 = " + register.getX3());
				updateText();
			}
		});

		// button R0 is clicked
		// we loop through the radio button inside panelR0
		// if radio button is selected, append 1 to string builder
		// else append 0 as if it is not selected
		btnR0.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				StringBuffer stringBuffer = new StringBuffer();
				// for each component in this panel
				// if it is a radio button
				// check if the button is clicked or not
				for (Component component : panelR0.getComponents()) {
					if (component instanceof JRadioButton) {
						JRadioButton jRadioButton = (JRadioButton) component;
						stringBuffer = jRadioButton.isSelected() ? stringBuffer.append("1") : stringBuffer.append("0");

					}
				}

				register.setR0(stringBuffer.toString());
				System.out.println("Set R0 = " + register.getR0());
				printMessage("Set R0 = " + register.getR0());
				updateText();
			}
		});

		// button R1 is clicked
		// we loop through the radio button inside panelR1
		// if radio button is selected, append 1 to string builder
		// else append 0 as if it is not selected
		btnR1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				StringBuffer stringBuffer = new StringBuffer();
				// for each component in this panel
				// if it is a radio button
				// check if the button is clicked or not
				for (Component component : panelR1.getComponents()) {
					if (component instanceof JRadioButton) {
						JRadioButton jRadioButton = (JRadioButton) component;
						stringBuffer = jRadioButton.isSelected() ? stringBuffer.append("1") : stringBuffer.append("0");

					}
				}

				register.setR1(stringBuffer.toString());
				System.out.println("Set R1 = " + register.getR1());
				printMessage("Set R1 = " + register.getR1());
				updateText();
			}
		});

		// button R2 is clicked
		// we loop through the radio button inside panelR2
		// if radio button is selected, append 1 to string builder
		// else append 0 as if it is not selected
		btnR2.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				StringBuffer stringBuffer = new StringBuffer();
				// for each component in this panel
				// if it is a radio button
				// check if the button is clicked or not
				for (Component component : panelR2.getComponents()) {
					if (component instanceof JRadioButton) {
						JRadioButton jRadioButton = (JRadioButton) component;
						stringBuffer = jRadioButton.isSelected() ? stringBuffer.append("1") : stringBuffer.append("0");

					}
				}

				register.setR2(stringBuffer.toString());
				System.out.println("Set R2 = " + register.getR2());
				printMessage("Set R2 = " + register.getR2());
				updateText();
			}
		});

		// button R3 is clicked
		// we loop through the radio button inside panelR3
		// if radio button is selected, append 1 to string builder
		// else append 0 as if it is not selected
		btnR3.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				StringBuffer stringBuffer = new StringBuffer();
				// for each component in this panel
				// if it is a radio button
				// check if the button is clicked or not
				for (Component component : panelR3.getComponents()) {
					if (component instanceof JRadioButton) {
						JRadioButton jRadioButton = (JRadioButton) component;
						stringBuffer = jRadioButton.isSelected() ? stringBuffer.append("1") : stringBuffer.append("0");

					}
				}

				register.setR3(stringBuffer.toString());
				System.out.println("Set R3 = " + register.getR3());
				printMessage("Set R3 = " + register.getR3());
				updateText();
			}

		});

		// button CUSTOM is clicked
		// we loop through the radio button inside panelCUSTOM
		// if radio button is selected, append 1 to string builder
		// else append 0 as if it is not selected
		btnCUSTOM.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				StringBuffer stringBuffer = new StringBuffer();
				// for each component in this panel
				// if it is a radio button
				// check if the button is clicked or not
				for (Component component : panelCUSTOM.getComponents()) {
					if (component instanceof JRadioButton) {
						JRadioButton jRadioButton = (JRadioButton) component;
						stringBuffer = jRadioButton.isSelected() ? stringBuffer.append("1") : stringBuffer.append("0");

					}
				}
				String instructionToExecute = stringBuffer.toString();

				memory.setCache(UnitConverter.binaryStringToInteger(register.getPC()), instructionToExecute);
				register.setMAR(register.getPC());
				register.setMBR(memory.getFromCache(UnitConverter.binaryStringToInteger(register.getMAR())));
				register.setIR(register.getMBR());

				execute(register.getIR());
				updateText();

				// register.setR3(stringBuffer.toString());
				// System.out.println("Set R3 = " + register.getR3());
				// printMessage("Set R3 = " + register.getR3());
			}
		});

		btn_SendProgram1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				// if nothing is entered
				if (textBox.getText() == null || textBox.getText().split(",").length != 20) {
					printMessage("Please enter 20 numbers separated by comma into the box");
				}
				// 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20
				else { // men this is converting string of numbers separated by comma into
						// and then convert one more time to Int array int[]
					int[] numbersEntered = Arrays.stream(textBox.getText().split(",")).mapToInt(Integer::parseInt)
							.toArray();
					String[] input = textBox.getText().split(",");
					printMessage("Thank you, you entered");
					printMessage(Arrays.toString(numbersEntered)); // assume we store all numbers
					// into memory starting at location 20 -> 39 // store into memory starting from
					// location 20
					// register.setPC(UnitConverter.integerTo16BitBinary(20));

					for (int i = 0; i < 20; i++) {
						int location = i + 12;
						// store number entered at location 20+i in memory
						memory.setMemory(location, UnitConverter.integerTo16BitBinary(numbersEntered[i]));

						printMessage("we added: " + numbersEntered[i] + ", or in binary: "
								+ memory.getFromMemory(location) + ", to location M[" + location + "]");

					}
					printMessage("Program 1 activated, Enter another number that you want to find then hit FIND");
					program1Active = true;
					textBox.setText("");
				}

			}
		});

		btn_FindProgram1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int result = 0;
				if (!isInteger(textBox.getText())) {
					printMessage("Please enter an apropriate integer from 0 to 65535");
				} else {
					String numberToFind = textBox.getText();
					printMessage("Thank you! You entered " + numberToFind + "\n" + "Let me see...");

					if (!program1Active) {
						printMessage("Please have 20 numbers properly typed in");
						return;
					}
					int temp = Integer.parseInt(numberToFind);
					// store number to find into location 11 in memory
					memory.setMemory(11, UnitConverter.integerTo16BitBinary(temp));
					textBox.setText("");
					result = program1(temp, memory);
					printMessage("We found: " + result + " is the closest one" + "\n");
				}
			}
		});

	}

	private static boolean isInteger(String string) {
		try {
			Integer.parseInt(string);
		} catch (NumberFormatException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
		// if non exception happen
		return true;
	}

	public int program1(int numberToFind, Memory mem) {
printMessage("Please wait...");
try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}
		int result = 0;
		/*
		 * int temp =
		 * Math.abs(UnitConverter.binaryStringToInteger(mem.getFromMemory(20)) -
		 * UnitConverter.binaryStringToInteger(mem.getFromMemory(300))); for(int i = 1;
		 * i < 20; i++) { int index = 20+i; if(temp >
		 * Math.abs(UnitConverter.binaryStringToInteger(mem.getFromMemory(index)) -
		 * UnitConverter.binaryStringToInteger(mem.getFromMemory(300))) ) {
		 * //System.out.println("get " +
		 * UnitConverter.binaryStringToInteger(mem.getFromMemory(index)) +
		 * " from location " + index); temp =
		 * Math.abs(UnitConverter.binaryStringToInteger(mem.getFromMemory(index)) -
		 * UnitConverter.binaryStringToInteger(mem.getFromMemory(300))); result =
		 * UnitConverter.binaryStringToInteger(mem.getFromMemory(index)); } }
		 */
		// 1. load memory location x into register R0
		// 2. Subtract memory[300] to register R0
		// 3. store back into memory
		// continue with next location of x
		// loop through address 20 to 39 (20 locations, subtract each value with value
		// in location 300
		// store the absolute result in location 50 to 69
		// for(int i =0; i < 20; i++) {
		// SMR from R0 to M[300]

		// 1. Load from memory loc 12 to R0)
		execute("0000010000001100");
		// System.out.println("After first instruction, R0 = " +
		// register.getGPRj("00"));
		int temp = Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind);
		// store what ever on R0 to mem loc 10
		execute("0000100000001010");

		// 2.Load from memory loc 13 to R0)
		execute("0000010000001101");
		if (temp > Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind)) {
			temp = Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind);
			// store this value (loc 13) to loc 10 using R0
			execute("0000100000001010");
		}

		// 3.Load from memory loc 14 to R0)
		execute("0000010000001110");
		if (temp > Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind)) {
			temp = Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind);
			// store this value (loc 14) to loc 10 using R0
			execute("0000100000001010");
		}

		// 4.Load from memory loc 15 to R0)
		execute("0000010000001111");
		if (temp > Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind)) {
			temp = Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind);
			// store this value (loc 15) to loc 10 using R0
			execute("0000100000001010");
		}
		// 5.Load from memory loc 16 to R0)
		execute("0000010000010000");
		if (temp > Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind)) {
			temp = Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind);
			// store this value (loc 16) to loc 10 using R0
			execute("0000100000001010");
		}
		// 6.Load from memory loc 17 to R0)
		execute("0000010000010001");
		if (temp > Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind)) {
			temp = Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind);
			// store this value (loc 17) to loc 10 using R0
			execute("0000100000001010");
		}
		// 7.Load from memory loc 18 to R0)
		execute("0000010000010010");
		if (temp > Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind)) {
			temp = Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind);
			// store this value (loc 18) to loc 10 using R0
			execute("0000100000001010");
		}
		// 8.Load from memory loc 19 to R0)
		execute("0000010000010011");
		if (temp > Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind)) {
			temp = Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind);
			// store this value (loc 19) to loc 10 using R0
			execute("0000100000001010");
		}
		// 9.Load from memory loc 20 to R0)
		execute("0000010000010100");
		if (temp > Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind)) {
			temp = Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind);
			// store this value (loc 20) to loc 10 using R0
			execute("0000100000001010");
		}
		// 10.Load from memory loc 21 to R0)
		execute("0000010000010101");
		if (temp > Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind)) {
			temp = Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind);
			// store this value (loc 21) to loc 10 using R0
			execute("0000100000001010");
		}
		// 11.Load from memory loc 22 to R0)
		execute("0000010000010110");
		if (temp > Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind)) {
			temp = Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind);
			// store this value (loc 22) to loc 10 using R0
			execute("0000100000001010");
		}
		// 12.Load from memory loc 23 to R0)
		execute("0000010000010111");
		if (temp > Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind)) {
			temp = Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind);
			// store this value (loc 23) to loc 10 using R0
			execute("0000100000001010");
		}
		// 13.Load from memory loc 24 to R0)
		execute("0000010000011000");
		if (temp > Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind)) {
			temp = Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind);
			// store this value (loc 24) to loc 10 using R0
			execute("0000100000001010");
		}
		// 14.Load from memory loc 25 to R0)
		execute("0000010000011001");
		if (temp > Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind)) {
			temp = Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind);
			// store this value (loc 25) to loc 10 using R0
			execute("0000100000001010");
		}
		// 15.Load from memory loc 26 to R0)
		execute("0000010000011010");
		if (temp > Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind)) {
			temp = Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind);
			// store this value (loc 26) to loc 10 using R0
			execute("0000100000001010");
		}
		// 16.Load from memory loc 27 to R0)
		execute("0000010000011011");
		if (temp > Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind)) {
			temp = Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind);
			// store this value (loc 27) to loc 10 using R0
			execute("0000100000001010");
		}
		// 17.Load from memory loc 28 to R0)
		execute("0000010000011100");
		if (temp > Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind)) {
			temp = Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind);
			// store this value (loc 28) to loc 10 using R0
			execute("0000100000001010");
		}
		// 18.Load from memory loc 29 to R0)
		execute("0000010000011101");
		if (temp > Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind)) {
			temp = Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind);
			// store this value (loc 29) to loc 10 using R0
			execute("0000100000001010");
		}
		// 19.Load from memory loc 30 to R0)
		execute("0000010000011110");
		if (temp > Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind)) {
			temp = Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind);
			// store this value (loc 30) to loc 10 using R0
			execute("0000100000001010");
		}
		// 20.Load from memory loc 31 to R0)
		execute("0000010000011111");
		if (temp > Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind)) {
			temp = Math.abs(UnitConverter.binaryStringToInteger(register.getGPRj("00")) - numberToFind);
			// store this value (loc 31) to loc 10 using R0
			execute("0000100000001010");
		}

		result = UnitConverter.binaryStringToInteger(memory.getFromMemory(10));

		// }
		return result;
	}

	protected void updateText() {
		String string = "";
		// TODO Auto-generated method stub

		textPane_PC.setText(register.getPC());
		textPane_CC.setText(register.getCC());
		textPane_IR.setText(register.getIR());
		textPane_MAR.setText(register.getMAR());
		textPane_MBR.setText(register.getMBR());
		textPane_MFR.setText(register.getMFR());
		textPane_X1.setText(register.getX1());
		textPane_X2.setText(register.getX2());
		textPane_X3.setText(register.getX3());
		textPane_R0.setText(register.getR0());
		textPane_R1.setText(register.getR1());
		textPane_R2.setText(register.getR2());
		textPane_R3.setText(register.getR3());
		onUpdateListener();
		// textPane_CC.setText(register.getCC());

	}

	private void printMessage(String message) {
		monitor.append(message + "\n");
	}

	private void onUpdateListener() {
		// go to each component in Frame
		for (Component component : frmCsciSimulator.getComponents()) {
			// if that component is a JPanel
			if (component instanceof JPanel) {
				// call that JPanel jpanel
				JPanel jpanel = (JPanel) component;
				// for each components in that jpanel
				for (Component components : jpanel.getComponents()) {
					if (components instanceof JRadioButton) {

					}
				}

			}
		}
	}

	protected void setActive(JPanel panel, boolean activted) {
		// TODO Auto-generated method stub
		for (Component component : panel.getComponents()) {
			if (component instanceof JPanel) {
				JPanel jpanel = (JPanel) component;
				this.setActive(jpanel, activted);
			} else {
				component.setEnabled(activted);
			}
		}
	}

	/**
	 * execute instructions
	 * 
	 * @param binaryInstruction
	 *            : input binary instructions
	 * @return none
	 */
	public void execute(String binaryInstruction) {
		System.out.println("Instruction: " + binaryInstruction);
		monitor.append("Instruction: " + binaryInstruction + "\n");
		String opcode = binaryInstruction.substring(0, 6);

		// get opcode
		opcode = instructionsLibrary.getCode(opcode);
		Instructions instruction;
		// dispatch different instructions to different methods
		try {
			instruction = (Instructions) Class.forName("instructions." + opcode).newInstance();
			System.out.println(instruction.getClass());

			instruction.execute(binaryInstruction, this.register, this.memory);
			monitor.append(instruction.printMessage() + "\n");
			updateText();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
		}
	}

	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
		}
	}
}
