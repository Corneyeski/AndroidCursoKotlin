package curso.kotlin.holamundoandroidkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class CreditosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creditos)
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "finalizado", Toast.LENGTH_LONG).show()
    }
}

fun Toast.mostrarMensaje(){}