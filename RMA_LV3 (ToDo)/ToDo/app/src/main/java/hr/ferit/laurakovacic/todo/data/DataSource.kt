package hr.ferit.laurakovacic.todo.data

import hr.ferit.laurakovacic.todo.R
import hr.ferit.laurakovacic.todo.model.Task

class DataSource {

    fun loadTasks () : List<Task> {
        return listOf<Task>(
            Task(R.string.task1),
            Task(R.string.task2),
            Task(R.string.task3),
            Task(R.string.task4)
        )
    }
}