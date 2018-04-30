package curso.kotlin.holamundoandroidkotlin

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.net.URI

class MainActivity : AppCompatActivity() {

    //lateinit var r:RecyclerView
    private val habitos:MutableList<Habito> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // r = findViewById<RecyclerView>(R.id.listaHabitos)

        //TODO Puedes llamar a los elementos directamente por el id sin necesidad de instanciarlos
        listaHabitos.setHasFixedSize(true)
        listaHabitos.layoutManager = LinearLayoutManager(this)


        //carga de habitos
        this.habitos.add(Habito("Beber agua","litro y medio va bien", Uri.parse("http://iniciativafiscal.com/wp-content/uploads/clientes-asesoria-fiscal-icono.png")))
        this.habitos.add(Habito("Comer fruta","5 piezas al dia",Uri.parse("http://iniciativafiscal.com/wp-content/uploads/clientes-asesoria-fiscal-icono.png")))
        this.habitos.add(Habito("comer vegetales","brocoli no",Uri.parse("http://iniciativafiscal.com/wp-content/uploads/clientes-asesoria-fiscal-icono.png")))
        this.habitos.add(Habito("hacer ejercicio","sin pasarse tampoco",Uri.parse("http://iniciativafiscal.com/wp-content/uploads/clientes-asesoria-fiscal-icono.png")))

        //TODO Adapter
        listaHabitos.adapter = HabitosAdapter(habitos)


        creditos.setOnClickListener{
            val intent:Intent = Intent(this, CreditosActivity::class.java)
            startActivity(intent)
        }
    }

    fun llamarConsultor(view:View){
        val intent:Intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:1234567")
        startActivity(intent)
    }
}
