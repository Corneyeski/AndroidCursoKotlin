package curso.kotlin.holamundoandroidkotlin

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.makeText

class CreditosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creditos)
    }

    override fun onDestroy() {
        super.onDestroy()
        val toast = Toast(this)
        toast.mostrarMensaje(this, "finalizado")
    }
}

fun Toast.mostrarMensaje(ctx:Context, info:String){
    makeText(ctx, info, Toast.LENGTH_LONG).show()

}