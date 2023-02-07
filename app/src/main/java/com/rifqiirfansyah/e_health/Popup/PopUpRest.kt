package com.rifqiirfansyah.e_health.Popup

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.DialogFragment
import com.rifqiirfansyah.e_health.R

class PopUpRest : DialogFragment() {

    var a: String = "null"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        val view: View = inflater.inflate(R.layout.activity_pop_up_rest, container, false)


        val ActionOke = view.findViewById<Button>(R.id.btnCancel)

        if (dialog != null && dialog!!.window != null) {
            dialog!!.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog!!.window!!.requestFeature(Window.FEATURE_NO_TITLE)
        }
        ActionOke.setOnClickListener(View.OnClickListener { dialog!!.dismiss() })
        return view
    }
}
