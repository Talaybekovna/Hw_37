package kg.tutorialapp.hw_37

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate((R.menu.main_menu), menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item_one ->  Toast.makeText(this, "Settings", Toast.LENGTH_LONG).show()
            R.id.item_two ->  Toast.makeText(this, "Account", Toast.LENGTH_LONG).show()
            R.id.item_three ->  Toast.makeText(this, "Search", Toast.LENGTH_LONG).show()
            R.id.item_four ->  Toast.makeText(this, "About", Toast.LENGTH_LONG).show()
            R.id.item_five ->  Toast.makeText(this, "Help", Toast.LENGTH_LONG).show()
        }
        return super.onOptionsItemSelected(item)
    }
}
