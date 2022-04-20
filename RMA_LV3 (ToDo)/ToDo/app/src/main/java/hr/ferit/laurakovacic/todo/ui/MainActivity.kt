package hr.ferit.laurakovacic.todo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import hr.ferit.laurakovacic.todo.R
import hr.ferit.laurakovacic.todo.data.DataSource


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycleView)

        val dataSource = DataSource().loadTasks()

        recyclerView.adapter = TaskAdapter (dataSource, this)
    }
}