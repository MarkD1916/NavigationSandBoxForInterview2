package com.example.navigationsandbox.navigationPerController

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navigationsandbox.R
import com.example.navigationsandbox.data.ComplexData
import com.example.navigationsandbox.databinding.ActivityNavigationPerControllerFirstBinding
import com.example.navigationsandbox.databinding.Fragment1Na1Binding
import com.example.navigationsandbox.databinding.Fragment2Na1Binding

class NA1Fragment2: Fragment(), View.OnClickListener {

    private var _binding: Fragment2Na1Binding? = null
    val mBinding get() = _binding!!

    private lateinit var args: ComplexData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        args = arguments?.getParcelable(ARG_NA1Fragment2) ?: ComplexData(null, 0)
        Log.d("NA1Fragment2", "onCreate: ${args.opt1}, ${args.opt2}")
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = Fragment2Na1Binding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onClick(v: View) {
        when (v.id) {
//            R.id.btnToFrag2 -> {
//                //-1.1-
//
//                val fm = activity?.supportFragmentManager
//                fm?.beginTransaction()
//                    ?.replace(R.id.fragment_container_1, this)
//                    ?.commit()
//            }
        }
    }

    companion object {
        @JvmStatic private val ARG_NA1Fragment2 = "ARG_NA1Fragment2"

        fun newInstance(complexArgs: ComplexData): NA1Fragment2 {
            val args = Bundle()
            args.putParcelable(ARG_NA1Fragment2, complexArgs)
            val fragment = NA1Fragment2()
            fragment.arguments = args
            return fragment
        }
    }
}