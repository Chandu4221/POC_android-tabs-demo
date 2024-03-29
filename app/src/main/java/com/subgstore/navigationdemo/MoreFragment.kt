package com.subgstore.navigationdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.subgstore.navigationdemo.databinding.FragmentMoreBinding

class MoreFragment : Fragment() {
    private var _binding:FragmentMoreBinding? = null;
    private val binding get() = _binding!!;

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMoreBinding.inflate(inflater,container,false);
        return binding.root;
    }

    override fun onDestroy() {
        super.onDestroy();
        _binding = null;
    }
}