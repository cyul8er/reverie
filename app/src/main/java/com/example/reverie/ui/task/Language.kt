package com.example.reverie.ui.task

import java.time.LocalTime
import java.util.UUID

// this is the Language model class
data class TaskItem(
    var name : String ="",
    var desc : String ="",
    var dueTime: LocalTime?,
    var completedDate: LocalTime,
    //var id: UUID = UUID.randomUUID()
)