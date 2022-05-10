package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {


    private EditText txtValorAlcool;
    private EditText txtValorGasolina;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtValorAlcool = findViewById(R.id.editTextAlcool);
        txtValorGasolina = findViewById(R.id.editTextGasolina);
        txtResultado = findViewById(R.id.textViewResultado);
    }



    //METODO CALCULAR/////////////////////////////////////////////////////////////
    public void calcular(View view){

        //Recuperando valores digitados
        String valorAlcool      = txtValorAlcool.getText().toString();
        String valorGasolina    = txtValorGasolina.getText().toString();

        //Validando os campos digitados
        boolean valorValidado = validarCamposDecimais(valorAlcool, valorGasolina);
        if (!valorValidado)  {
            txtResultado.setText("Valor inválido!!");
        }else {

            //Conversão String -> Double
            double vAlcool      = Double.parseDouble(valorAlcool);
            double vGasolina    = Double.parseDouble(valorGasolina);

            //Calculo
            double resultado    = vAlcool / vGasolina;
            if (resultado <= 0.73) {
                txtResultado.setText("Utilize Alcool");
            }else {
                txtResultado.setText("Utilize Gasolina");
            }
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////

        //METODO DE VALIDAÇÃO DE DECIMAIS//////////////
        public boolean validarCamposDecimais(String x, String y){

            boolean validacao = true;

            if ((x == null || x.equals("")) && (y == null || y.equals(""))) {
                validacao = false;
                return validacao;
            }else {
               validacao = true;
               return validacao;
            }
        ///////////////////////////////////////////////


}
}


