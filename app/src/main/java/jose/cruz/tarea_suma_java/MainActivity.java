package jose.cruz.tarea_suma_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // declaración de variables
    EditText sumando1, sumando2;
    Button b_sumar;
    TextView tv_suma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // equiparación de varables
        sumando1 = findViewById(R.id.et_sumando1);
        sumando2 = findViewById(R.id.ed_sumando2);
        b_sumar = findViewById(R.id.b_sumar);
        tv_suma = findViewById(R.id.tv_suma);

        // acción del botón
        b_sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // lectura de datos
                String n1 = sumando1.getText().toString();
                String n2 = sumando2.getText().toString();

                if (n1.isEmpty() || n2.isEmpty()){
                    mensajito("Debes ingresar un valor en cada campo.");
                } else {
                    float s1 = Float.parseFloat(n1);
                    float s2 = Float.parseFloat(n2);
                    float suma = s1 + s2;
                    tv_suma.setText(Float.toString(suma));
                } // else

            } // onClick

        }); // b_sumar.setOnClickListener


        sumando1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                tv_suma.setText("");

            }
        }); // sumando1.addTextChangedListener


        sumando2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                tv_suma.setText("");

            }
        }); // sumando2.addTextChangedList


    } // protected void onCreate


    public void mensajito(String mensaje){
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
    } // public void  mesajito


} // public class MainActivity
