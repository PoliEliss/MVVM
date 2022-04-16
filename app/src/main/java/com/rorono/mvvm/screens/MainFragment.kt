package com.rorono.mvvm.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.rorono.mvvm.R
import com.rorono.mvvm.databinding.FragmentMainBinding
import com.rorono.mvvm.utilits.APP_ACTIVITY


class MainFragment : Fragment() {

    private var binding: FragmentMainBinding? = null
    private val mainBinding get() = binding!!
    private lateinit var mViewModel: MainFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return mainBinding.root
    }

    override fun onStart() {
        super.onStart()
        initialization()
    }

    private fun initialization() {
       mViewModel = ViewModelProvider(this).get(MainFragmentViewModel::class.java)
        mainBinding.floatingActionButtonAddNote.setOnClickListener {
            APP_ACTIVITY.navController.navigate(R.id.action_mainFragment_to_addNewNoteFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


}