package se.jsam.androidlab

sealed class Thing {
    data class Message(val message: String) : Thing()
    object Nothing : Thing()
}