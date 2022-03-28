package hr.ferit.laurakovacic.RMA_LV1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity: ", "onCreate")


    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity: ", "onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity: ", "onDestroy")
    }
}