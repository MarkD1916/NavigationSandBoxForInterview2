package com.example.navigationsandbox.ext

import androidx.fragment.app.Fragment
import com.example.navigationsandbox.R
import com.vmakd1916gmail.com.core.util.UiEvent


fun Fragment.navigateEvent(event: UiEvent.Navigate){
    requireActivity().supportFragmentManager
        .beginTransaction()
        .addToBackStack(null)
        .replace(event.fragmentContainer, event.fragment)
        .commit()
}