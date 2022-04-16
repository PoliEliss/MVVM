package com.rorono.mvvm.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.rorono.mvvm.R
import com.rorono.mvvm.databinding.FragmentStartBinding
import com.rorono.mvvm.utilits.APP_ACTIVITY
import com.rorono.mvvm.utilits.TYPE_ROOM


class StartFragment : Fragment() {

    private var binding: FragmentStartBinding? = null
    private val mBinding get() = binding!!
    private lateinit var mViewModel: StartFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStartBinding.inflate(layoutInflater,container,false)
        return mBinding.root
    }

    override fun onStart() {
        super.onStart()
        initialization()
    }

    private fun initialization() {
        mViewModel = ViewModelProvider(this).get(StartFragmentViewModel::class.java)
       mBinding.btnRoom.setOnClickListener {
           mViewModel.initDataBase(TYPE_ROOM){
               APP_ACTIVITY.navController.navigate(R.id.action_startFragment_to_mainFragment)
           }
       }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}