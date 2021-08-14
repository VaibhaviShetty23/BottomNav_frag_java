package com.example.bottomnav_frag_java.ui.dashboard

import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.fragment.app.Fragment
import com.example.bottomnav_frag_java.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {
    private var binding: FragmentDashboardBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View{
        binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding!!.root
        val textView = binding!!.textDashboard
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}