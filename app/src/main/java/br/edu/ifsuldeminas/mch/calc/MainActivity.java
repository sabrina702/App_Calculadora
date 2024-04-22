package br.edu.ifsuldeminas.mch.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import de.congrace.exp4j.Calculable;
import de.congrace.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "ifsuldeminas.mch.calc";
    private Button buttonIgual, buttonDeleta, buttonReseta;
    private Button buttonZero, buttonUm, buttonDois, buttonTres, buttonQuatro, buttonCinco, buttonSeis, buttonSete, buttonOito, buttonNove;
    private Button buttonSoma, buttonSub, buttonMult, buttonDiv, buttonPorc, buttonVir, buttonParenteses;
    private TextView textViewResultado;
    private TextView textViewUltimaExpressao;
    private String expressao = "";
    private Double resultado = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResultado = findViewById(R.id.textViewResultadoID);
        textViewUltimaExpressao = findViewById(R.id.textViewUltimaExpressaoID);

        buttonIgual = findViewById(R.id.buttonIgualID);
        buttonDeleta = findViewById(R.id.buttonDeleteID);
        buttonReseta = findViewById(R.id.buttonResetID);

        buttonSoma = findViewById(R.id.buttonSomaID);
        buttonSub = findViewById(R.id.buttonSubtracaoID);
        buttonDiv = findViewById(R.id.buttonDivisaoID);
        buttonMult = findViewById(R.id.buttonMultiplicacaoID);
        buttonPorc = findViewById(R.id.buttonPorcentoID);
        buttonVir = findViewById(R.id.buttonVirgulaID);
        buttonParenteses = findViewById(R.id.buttonParentesID);

        buttonZero = findViewById(R.id.buttonZeroID);
        buttonUm = findViewById(R.id.buttonUmID);
        buttonDois = findViewById(R.id.buttonDoisID);
        buttonTres = findViewById(R.id.buttonTresID);
        buttonQuatro = findViewById(R.id.buttonQuatroID);
        buttonCinco = findViewById(R.id.buttonCincoID);
        buttonSeis = findViewById(R.id.buttonSeisID);
        buttonSete = findViewById(R.id.buttonSeteID);
        buttonOito = findViewById(R.id.buttonOitoID);
        buttonNove = findViewById(R.id.buttonNoveID);

        //OnClick dos Números
        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewUltimaExpressao.append("0");
            }
        });
        buttonUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewUltimaExpressao.append("1");
            }
        });
        buttonDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewUltimaExpressao.append("2");
            }
        });
        buttonTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewUltimaExpressao.append("3");
            }
        });
        buttonQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewUltimaExpressao.append("4");
            }
        });
        buttonCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewUltimaExpressao.append("5");
            }
        });
        buttonSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewUltimaExpressao.append("6");
            }
        });
        buttonSete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewUltimaExpressao.append("7");
            }
        });
        buttonOito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewUltimaExpressao.append("8");
            }
        });
        buttonNove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewUltimaExpressao.append("9");
            }
        });

        //OnClick dos Operadores
        buttonSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = textViewUltimaExpressao.getText().toString();
                if (!expressao.isEmpty()) {
                    if (!verificaCaracter(expressao)) {
                        textViewUltimaExpressao.setText(expressao + "+");
                    } else {
                        textViewUltimaExpressao.setText(expressao.substring(0, expressao.length() - 1) + "+");
                    }
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = textViewUltimaExpressao.getText().toString();
                if (!expressao.isEmpty()) {
                    if (!verificaCaracter(expressao)) {
                        textViewUltimaExpressao.setText(expressao + "-");
                    } else {
                        textViewUltimaExpressao.setText(expressao.substring(0, expressao.length() - 1) + "-");
                    }
                }
            }
        });
        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = textViewUltimaExpressao.getText().toString();
                if (!expressao.isEmpty()) {
                    if (!verificaCaracter(expressao)) {
                        textViewUltimaExpressao.setText(expressao + "*");
                    } else {
                        textViewUltimaExpressao.setText(expressao.substring(0, expressao.length() - 1) + "*");
                    }
                }
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = textViewUltimaExpressao.getText().toString();
                if (!expressao.isEmpty()) {
                    if (!verificaCaracter(expressao)) {
                        textViewUltimaExpressao.setText(expressao + "/");
                    } else {
                        textViewUltimaExpressao.setText(expressao.substring(0, expressao.length() - 1) + "/");
                    }
                }
            }
        });
        buttonPorc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = textViewUltimaExpressao.getText().toString();
                if (!expressao.isEmpty()) {
                    if (!verificaCaracter(expressao)) {
                        textViewUltimaExpressao.setText(expressao + "%");
                    } else {
                        textViewUltimaExpressao.setText(expressao.substring(0, expressao.length() - 1) + "%");
                    }
                }
            }
        });
        buttonVir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = textViewUltimaExpressao.getText().toString();
                if (!expressao.isEmpty() && Character.isDigit(expressao.charAt(expressao.length() - 1))) {
                    String[] numeros = expressao.split("[+\\-*/]");
                    String ultimoNumero = numeros[numeros.length - 1];
                    if (!ultimoNumero.contains(".")) {
                        textViewUltimaExpressao.append(".");
                    }
                }
            }

        });
        buttonParenteses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String expressao = textViewUltimaExpressao.getText().toString();
                // Verifica se um parêntese foi aberto anteriormente na expressão
                // Se um parêntese estiver aberto, fecha-o; caso contrário, abre-o
                if (verificaParenteseAberto(expressao)) {
                    textViewUltimaExpressao.append(")"); // Fecha o parêntese
                }else if (expressao.isEmpty()) {
                    textViewUltimaExpressao.append("(");
                } else if (!verificaCaracter(expressao)){
                    textViewUltimaExpressao.append("*("); // Abre o parêntese
                }else {
                    textViewUltimaExpressao.append("(");
                }
            }
        });

        //OnClick do Button Igual
        buttonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculable avaliadorExpressao = null;
                try {
                    expressao = textViewUltimaExpressao.getText().toString();
                    avaliadorExpressao = new ExpressionBuilder(expressao).build();

                    resultado = avaliadorExpressao.calculate();

                    textViewUltimaExpressao.setText(expressao);
                    textViewResultado.setText(resultado.toString());

                    // Se houver um resultado, usá-lo como parte da próxima expressão
                    if (resultado != 0.0) {
                        textViewUltimaExpressao.setText(resultado.toString());
                    }
                } catch (Exception e) {
                    Log.e(TAG, getResources().getString(R.string.menssagem_de_erro) + expressao, e);
                    textViewResultado.setText(getResources().getString(R.string.menssagem_de_erro));
                }
            }
        });

        //OnCick do Button Deleta
        buttonDeleta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = textViewUltimaExpressao.getText().toString();
                if (expressao.length() > 0) {
                    expressao = expressao.substring(0, expressao.length() - 1);
                    textViewUltimaExpressao.setText(expressao);
                }
            }
        });

        //OnClick do Button Reset
        buttonReseta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewUltimaExpressao.setText("");
                textViewResultado.setText("");
                resultado = 0.0;
            }
        });
    }
    private boolean verificaCaracter(String expressao) {
        // pega o ultimo caracter e verifica se é um operador
        String ultimoCaractere = expressao.substring(expressao.length() - 1);
        return ultimoCaractere.equals("+") || ultimoCaractere.equals("-") || ultimoCaractere.equals("*") || ultimoCaractere.equals("/") || ultimoCaractere.equals("%");
    }

    // Função para verificar se um parêntese foi aberto anteriormente na expressão
    private boolean verificaParenteseAberto(String expressao) {
        int countParenteses = 0;
        for (int i = 0; i < expressao.length(); i++) {
            if (expressao.charAt(i) == '(') {
                countParenteses++;
            } else if (expressao.charAt(i) == ')') {
                countParenteses--;
            }
        }
        return countParenteses > 0;
    }
}