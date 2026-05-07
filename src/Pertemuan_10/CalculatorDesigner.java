package Pertemuan_10;

import javax.swing.*;
import java.awt.*;

public class CalculatorDesigner {
    private JPanel mainPanel;
    private JTextField displayField;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttonDivide;

    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton buttonMultiply;

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton buttonMinus;

    private JButton button0;
    private JButton buttonClear;
    private JButton buttonEquals;
    private JButton buttonPlus;

    private double firstNumber = 0;
    private String operator = "";
    private boolean startNewNumber = true;

    public CalculatorDesigner() {
        setupDisplay();
        setupButtonActions();
    }

    private void setupDisplay() {
        displayField.setText("0");
        displayField.setEditable(false);
        displayField.setHorizontalAlignment(SwingConstants.RIGHT);
        displayField.setFont(new Font("Arial", Font.BOLD, 28));
    }

    private void setupButtonActions() {
        button0.addActionListener(e -> inputNumber("0"));
        button1.addActionListener(e -> inputNumber("1"));
        button2.addActionListener(e -> inputNumber("2"));
        button3.addActionListener(e -> inputNumber("3"));
        button4.addActionListener(e -> inputNumber("4"));
        button5.addActionListener(e -> inputNumber("5"));
        button6.addActionListener(e -> inputNumber("6"));
        button7.addActionListener(e -> inputNumber("7"));
        button8.addActionListener(e -> inputNumber("8"));
        button9.addActionListener(e -> inputNumber("9"));

        buttonPlus.addActionListener(e -> inputOperator("+"));
        buttonMinus.addActionListener(e -> inputOperator("-"));
        buttonMultiply.addActionListener(e -> inputOperator("*"));
        buttonDivide.addActionListener(e -> inputOperator("/"));

        buttonEquals.addActionListener(e -> calculate());
        buttonClear.addActionListener(e -> clear());
    }

    private void inputNumber(String number) {
        if (startNewNumber) {
            displayField.setText(number);
            startNewNumber = false;
        } else {
            displayField.setText(displayField.getText() + number);
        }
    }

    private void inputOperator(String selectedOperator) {
        firstNumber = Double.parseDouble(displayField.getText());
        operator = selectedOperator;
        startNewNumber = true;
    }

    private void calculate() {
        double secondNumber = Double.parseDouble(displayField.getText());
        double result;
        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber == 0) {
                    displayField.setText("Error");
                    startNewNumber = true;
                    return;
                }
                result = firstNumber / secondNumber;
                break;
            default:
                return;
        }
        displayField.setText(String.valueOf(result));
        startNewNumber = true;

    }

    private void clear() {
        displayField.setText("0");
        firstNumber = 0;
        operator = "";
        startNewNumber = true;
    }

    static void main() {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Kalkulator Sederhana - Swing UI Designer");
            CalculatorDesigner calculator = new CalculatorDesigner();
            frame.setContentPane(calculator.mainPanel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(350, 450);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}