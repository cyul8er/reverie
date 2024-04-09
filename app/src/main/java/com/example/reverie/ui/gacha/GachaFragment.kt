package com.example.reverie.ui.gacha

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.reverie.databinding.FragmentGachaBinding

class GachaFragment : Fragment() {

    private var _binding: FragmentGachaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val gachaViewModel =
            ViewModelProvider(this).get(GachaViewModel::class.java)

        _binding = FragmentGachaBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textGacha
        gachaViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}