package com.vmakd1916gmail.com.core.util

import androidx.fragment.app.Fragment

sealed class UiEvent {
    data class Navigate(
        val fragmentContainer:Int,
        val fragment: Fragment
        ): UiEvent()
}