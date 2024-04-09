package com.example.reverie.ui.task


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.time.LocalDate
import java.time.LocalTime
import java.util.UUID


class TaskViewModel : ViewModel()
{
    private val _text = MutableLiveData<String>().apply {
        value = "This is work Fragment"
    }
    val text: LiveData<String> = _text


    var taskItems = MutableLiveData<MutableList<TaskItem>>()

    init {
        taskItems.value = mutableListOf()

    }
    fun addTaskItem(newTask: TaskItem){
        val list = taskItems.value
        list!!.add(newTask)
        taskItems.postValue(list!!)
    }

    fun updateTaskItem(id: UUID, name: String, desc:String,dueTime: LocalTime?){
        val list = taskItems.value
        val task = list!!.find {it.id ==id}
        task.name = name
        task.desc = desc
        task.dueTime = dueTime
        taskItems.postValue(list!!)
    }

    fun setCompleted(taskItem: TaskItem){
        val list = taskItems.value
        val task = list!!.find {it.id == taskItem.id}
        if (task.completedDate == null)
            task.completedDate = LocalTime.now()
        taskItems.postValue(list)
    }

}