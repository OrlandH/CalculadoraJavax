import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.objecthunter.exp4j.*;

public class Calculadora {
    private JPanel marco;
    private JLabel titulo;
    private JButton Potencia;
    private JButton cButton;
    private JButton Raiz;
    private JButton DELButton;
    private JButton DIVbutton;
    private JButton xButton;
    private JButton RestButton;
    private JButton TANButton;
    private JButton COSButton;
    private JButton SENButton;
    private JButton a9Button;
    private JButton a8Button;
    private JButton a7Button;
    private JButton a6Button;
    private JButton a5Button;
    private JButton a4Button;
    private JLabel textoinsertado;
    private JLabel textoinsertandose;
    private JButton a1Button;
    private JButton negativo; //Este boton no existe uwu
    private JButton a2Button;
    private JButton a0Button;
    private JButton a3Button;
    private JButton coma;
    private JButton Masbutton;
    private JButton Igualbutton;

    private StringBuilder numeroActual = new StringBuilder();
    private StringBuilder operacionActual = new StringBuilder();
    private double resultadoAnterior = 0;

    public Calculadora() {


        //Botones Numericos

        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeroActual.append("0");
                textoinsertandose.setText(numeroActual.toString());
            }
        });

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeroActual.append("1");
                textoinsertandose.setText(numeroActual.toString());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeroActual.append("2");
                textoinsertandose.setText(numeroActual.toString());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeroActual.append("3");
                textoinsertandose.setText(numeroActual.toString());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeroActual.append("4");
                textoinsertandose.setText(numeroActual.toString());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeroActual.append("5");
                textoinsertandose.setText(numeroActual.toString());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeroActual.append("6");
                textoinsertandose.setText(numeroActual.toString());
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeroActual.append("7");
                textoinsertandose.setText(numeroActual.toString());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeroActual.append("8");
                textoinsertandose.setText(numeroActual.toString());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeroActual.append("9");
                textoinsertandose.setText(numeroActual.toString());
            }
        });


        //Operaciones
        //SUMA
        Masbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (numeroActual.length() > 0) {
                    operacionActual.append(numeroActual.toString());
                    operacionActual.append("+");
                    numeroActual.setLength(0);
                    textoinsertado.setText(operacionActual.toString());
                    textoinsertandose.setText("0");
                } else if (resultadoAnterior != 0) {
                    operacionActual.append(resultadoAnterior);
                    operacionActual.append("+");
                    textoinsertado.setText(operacionActual.toString());
                    textoinsertandose.setText("0");
                }
            }
        });


        //RESTA
        RestButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (numeroActual.length() > 0) {
                    operacionActual.append(numeroActual.toString());
                    operacionActual.append("-");
                    numeroActual.setLength(0);
                    textoinsertado.setText(operacionActual.toString());
                    textoinsertandose.setText("0");
                } else if (resultadoAnterior != 0) {
                    operacionActual.append(resultadoAnterior);
                    operacionActual.append("-");
                    textoinsertado.setText(operacionActual.toString());
                    textoinsertandose.setText("0");
                }
            }
        });

        //MULTIPLICACION
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (numeroActual.length() > 0) {
                    operacionActual.append(numeroActual.toString());
                    operacionActual.append("*");
                    numeroActual.setLength(0);
                    textoinsertado.setText(operacionActual.toString());
                    textoinsertandose.setText("0");
                } else if (resultadoAnterior != 0) {
                    operacionActual.append(resultadoAnterior);
                    operacionActual.append("*");
                    textoinsertado.setText(operacionActual.toString());
                    textoinsertandose.setText("0");
                }
            }
        });

        //DIVISION
        DIVbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (numeroActual.length() > 0) {
                    operacionActual.append(numeroActual.toString());
                    operacionActual.append("/");
                    numeroActual.setLength(0);
                    textoinsertado.setText(operacionActual.toString());
                    textoinsertandose.setText("0");
                } else if (resultadoAnterior != 0) {
                    operacionActual.append(resultadoAnterior);
                    operacionActual.append("/");
                    textoinsertado.setText(operacionActual.toString());
                    textoinsertandose.setText("0");
                }
            }
        });
        Raiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        //Coma

        coma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!numeroActual.toString().contains(".")) {
                    numeroActual.append(".");
                    textoinsertandose.setText(numeroActual.toString());
                }
            }
        });

        //Operaciones Trigonometricas
        //SENO
        SENButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero = Double.parseDouble(numeroActual.toString());
                double resultado = Math.sin(Math.toRadians(numero));
                resultado = Math.round(resultado * 100.0) / 100.0;
                numeroActual.setLength(0);
                numeroActual.append(resultado);
                textoinsertandose.setText(numeroActual.toString());
            }
        });
        //COSENO
        COSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero = Double.parseDouble(numeroActual.toString());
                double resultado = Math.cos(Math.toRadians(numero));
                resultado = Math.round(resultado * 100.0) / 100.0;
                numeroActual.setLength(0);
                numeroActual.append(resultado);
                textoinsertandose.setText(numeroActual.toString());
            }
        });
        //TANGENTE
        TANButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero = Double.parseDouble(numeroActual.toString());
                double resultado = Math.tan(Math.toRadians(numero));
                resultado = Math.round(resultado * 100.0) / 100.0;
                numeroActual.setLength(0);
                numeroActual.append(resultado);
                textoinsertandose.setText(numeroActual.toString());
            }
        });

        //Borrar y restaurar botones
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeroActual.setLength(0);
                operacionActual.setLength(0);
                resultadoAnterior = 0;
                textoinsertado.setText("");
                textoinsertandose.setText("0");
            }
        });
        //Igual

        Igualbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (numeroActual.length() > 0) {
                    operacionActual.append(numeroActual.toString());
                    numeroActual.setLength(0);
                }

                String expresion = operacionActual.toString();

                try {
                    double resultado = evaluarExpresion(expresion);
                    textoinsertado.setText(expresion);
                    textoinsertandose.setText(formatearResultado(resultado));
                    resultadoAnterior = resultado;
                } catch (ArithmeticException ex) {
                    textoinsertado.setText("");
                    textoinsertandose.setText("No se puede dividir entre 0");
                } catch (Exception ex) {
                    textoinsertado.setText("");
                    textoinsertandose.setText("Error de Sintaxis");
                }

                operacionActual.setLength(0);
            }
        });
        // Borrar un digito
        DELButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (numeroActual.length() > 0) {
                    numeroActual.deleteCharAt(numeroActual.length() - 1);
                    textoinsertandose.setText(numeroActual.toString());
                }}
        });

        // Raiz
        Raiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero = Double.parseDouble(numeroActual.toString());
                double resultado = Math.sqrt(numero);
                resultado = Math.round(resultado * 100.0) / 100.0;
                numeroActual.setLength(0);
                numeroActual.append(resultado);
                textoinsertandose.setText(numeroActual.toString());
            }
        });

        // Potencia
        Potencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero = Double.parseDouble(numeroActual.toString());
                double resultado = Math.pow(numero,2);
                resultado = Math.round(resultado * 100.0) / 100.0;
                numeroActual.setLength(0);
                numeroActual.append(resultado);
                textoinsertandose.setText(numeroActual.toString());
            }
        });
    }


    //Métodos adicionales
    private double evaluarExpresion(String expresion) {
        try {
            ExpressionBuilder builder = new ExpressionBuilder(expresion);
            Expression exp = builder.build();
            return exp.evaluate();
        } catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException("Operación mal formada");
        }
    }

    private String formatearResultado(double resultado) {
        if (resultado == (long) resultado) {
            return String.format("%d", (long) resultado);
        } else {
            return String.format("%.2f", resultado);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new Calculadora().marco);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}