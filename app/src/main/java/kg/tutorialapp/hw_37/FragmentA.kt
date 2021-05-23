package kg.tutorialapp.hw_37

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast


class FragmentA : Fragment() {

    lateinit var tvText: TextView
    lateinit var listener: FragmentAListener

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_a, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        tvText = view.findViewById(R.id.tv_text)
        val textFromArgument = arguments?.getString("String2")

        if (textFromArgument == "") listener.showToast() else tvText.text = textFromArgument
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is FragmentAListener) listener = context
    }

    companion object {
        const val TAG = "A"

    }
}