package se.jsam.androidlab

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        getName {
            Log.d(it, "Creating.")
        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private inline fun getName(f: (String) -> Unit) {
        f("MainActivity")
    }
}
