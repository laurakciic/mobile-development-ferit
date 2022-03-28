package hr.ferit.laurakovacic.RMA_LV1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity: ", "onCreate")

        showNameAndDescription()
        showBmi()
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity: ", "onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity: ", "onDestroy")
    }

    private fun showNameAndDescription() {
        val entryName = findViewById<EditText>(R.id.entryName)
        val entryDescription = findViewById<EditText>(R.id.entryDescription)

        val readOnlyName = findViewById<TextView>(R.id.textView3)
        val readOnlyDescription = findViewById<TextView>(R.id.textView7)

        val confirmBtn = findViewById<Button>(R.id.confirmBtn)

        confirmBtn.setOnClickListener {
            val name = entryName.text.toString()
            readOnlyName.text = name

            val description = entryDescription.text.toString()
            readOnlyDescription.text = description
        }
    }

    private fun showBmi(){
        val entryHeight = findViewById<EditText>(R.id.entryHeight)
        val entryWeight = findViewById<EditText>(R.id.entryWeight)
        val calculateBtn = findViewById<Button>(R.id.calculateBtn)

        calculateBtn.setOnClickListener {
            val height = entryHeight.text.toString()
            val weight = entryWeight.text.toString()

            val intHeight = height.toFloat()
            val intWeight = weight.toFloat()

            val bmi = calculateBmi(intHeight, intWeight)
            Toast.makeText(this, bmi.toString(), Toast.LENGTH_LONG).show()
        }
    }

    private fun calculateBmi(height: Float, weight: Float): Float {
        return weight / (height * height)
    }
}