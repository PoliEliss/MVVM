package com.rorono.mvvm.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.rorono.mvvm.R
import com.rorono.mvvm.databinding.FragmentAddNewNoteBinding
import com.rorono.mvvm.databinding.FragmentMainBinding
import com.rorono.mvvm.models.AppNote
import com.rorono.mvvm.utilits.APP_ACTIVITY


class AddNewNoteFragment : Fragment() {

    private var binding: FragmentAddNewNoteBinding? = null
    private val mBinding get() = binding!!
    private lateinit var mViewModel: AddNewViewNoteModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddNewNoteBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onStart() {
        super.onStart()
        initialization()
    }

    private fun initialization() {
      mViewModel = ViewModelProvider(this).get(AddNewViewNoteModel::class.java)
        mBinding.buttonAdd.setOnClickListener {
            val name = mBinding.editTextInputNameNote.text.toString()
            val text = mBinding.editTextInputTextNote.text.toString()
            if (name.isEmpty()){
                Toast.makeText(requireContext(),"Введите название",Toast.LENGTH_SHORT).show()
            } else{
                mViewModel.insert(AppNote(name = name, text = text)){

                    requireActivity().runOnUiThread {
                        APP_ACTIVITY.navController.navigate(R.id.action_addNewNoteFragment_to_mainFragment)
                    }


                }
            }


        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}