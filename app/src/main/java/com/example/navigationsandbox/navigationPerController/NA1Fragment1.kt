package com.example.navigationsandbox.navigationPerController

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navigationsandbox.R
import com.example.navigationsandbox.data.ComplexData
import com.example.navigationsandbox.databinding.ActivityNavigationPerControllerFirstBinding
import com.example.navigationsandbox.databinding.Fragment1Na1Binding
import com.example.navigationsandbox.ext.navigateEvent
import com.vmakd1916gmail.com.core.util.UiEvent

class NA1Fragment1 : Fragment(), View.OnClickListener {

    private var _binding: Fragment1Na1Binding? = null
    val mBinding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = Fragment1Na1Binding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mBinding.btnToFrag2.setOnClickListener(this)
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnToFrag2 -> {
                //-1.2-
                navigateEvent(
                    UiEvent.Navigate(
                        R.id.fragment_container_1,
                        NA1Fragment2.newInstance(
                            ComplexData(
                                "LOL",
                                69
                            )
                        )
                    )
                )
                //-1.1-
//                val fragment = NA1Fragment2()
//                val fm = activity?.supportFragmentManager
//                fm?.beginTransaction()
//                    ?.addToBackStack( "tag" ) //-1.1- если хотим создать стак
//                    ?.replace(R.id.fragment_container_1, fragment) // -1.1-
//                    ?.commit()
            }
        }
    }
}