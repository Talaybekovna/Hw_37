package kg.tutorialapp.hw_37

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var etText: EditText
    lateinit var btnSendText: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setup()
    }

    private fun setup() {
        etText = findViewById(R.id.et_text)
        btnSendText = findViewById(R.id.btn_send_text)

        btnSendText.setOnClickListener {
            val text = etText.text.toString()
            val intent = Intent(this, ActivityA::class.java)
            intent.putExtra("String", text)
            startActivity(intent)
        }
    }
}