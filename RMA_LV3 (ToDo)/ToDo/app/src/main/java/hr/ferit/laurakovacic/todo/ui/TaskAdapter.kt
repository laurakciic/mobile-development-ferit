package hr.ferit.laurakovacic.todo.ui

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import hr.ferit.laurakovacic.todo.R
import hr.ferit.laurakovacic.todo.model.Task

class TaskAdapter (private val dataSource : List<Task>,
val context : Context)
    : RecyclerView.Adapter<TaskAdapter.ItemViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layoutItem = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)

        Log.d("TaskAdapter", "onCreateViewHolder")

        return ItemViewHolder(layoutItem)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val task = dataSource[position]
        holder.textView.text = context.resources.getString(task.stringResId)
        Log.d("TaskAdapter", "onBindViewHolder position: $position")
    }

    override fun getItemCount(): Int {
        return dataSource.size
    }

    class ItemViewHolder(private val view: View)
        : RecyclerView.ViewHolder(view){

            val textView = view.findViewById<TextView>(R.id.textView)
        }
}

// dz
// u donjem dijelu treba bit edit text i button da se doda taj tekst u todo listu
// metoda u DataSourceu