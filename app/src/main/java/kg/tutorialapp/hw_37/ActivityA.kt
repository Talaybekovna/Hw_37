package kg.tutorialapp.hw_37

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class ActivityA : AppCompatActivity(), FragmentAListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        val textFromArguments: String = intent?.getStringExtra("String") ?: showToast()

        val fragmentA = FragmentA()
        val args = Bundle()
        args.putString("String2", textFromArguments)
        fragmentA.arguments = args

        supportFragmentManager
                .beginTransaction()
                .add(R.id.fr_container, fragmentA, FragmentA.TAG)
                .commit()
    }

    override fun showToast():String {
        val text = Toast.makeText(this, "There is no any text from MainActivity", Toast.LENGTH_LONG).show()
        return text.toString()
    }
}