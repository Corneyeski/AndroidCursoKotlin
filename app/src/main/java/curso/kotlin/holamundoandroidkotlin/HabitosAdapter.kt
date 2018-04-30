package curso.kotlin.holamundoandroidkotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_list.view.*

class HabitosAdapter(val habitos:List<Habito>): RecyclerView.Adapter<HabitosAdapter.HabitoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)

        return HabitoViewHolder(view)
    }

    override fun getItemCount(): Int { return habitos.size }

    override fun onBindViewHolder(holder: HabitoViewHolder, position: Int) {
        if (holder != null) {
            holder.v.tv_titulo.text = habitos.get(position).titulo
            holder.v.tv_descripcion.text = habitos.get(position).descripcion
            holder.v.tv_icono.setImageURI(habitos.get(position).imagen)
        }
    }

    class HabitoViewHolder(val v : View) : RecyclerView.ViewHolder(v) {

    }
}