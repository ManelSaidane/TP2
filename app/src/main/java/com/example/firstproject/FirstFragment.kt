package com.example.firstproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.firstproject.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

         binding.btnToast.setOnClickListener {
             val myToast= Toast.makeText(context,"hello toast" , Toast.LENGTH_SHORT)
             myToast.show()
         }

        binding.btnCount.setOnClickListener {
            countMe(binding)
        }



       // binding.buttonFirst.setOnClickListener {
      //      findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        //}
    }
    private fun countMe(binding: FragmentFirstBinding){
       val numText = binding.textView.text
        val nbInt = numText.toString().toInt()
        val nb = nbInt +1

        binding.textView.text = nb.toString()

    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}