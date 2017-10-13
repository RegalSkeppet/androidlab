package se.jsam.androidlab

import android.util.Log

inline fun useAppName(f: (String) -> Unit) {
    f("AndroidLab")
}

fun logThing(t: Thing): Unit = when(t) {
    is Thing.Message -> useAppName { Log.d(it, t.message) }
    Thing.Nothing -> useAppName { Log.d(it, "nothing") }
}
