package com.example.navigationsandbox.data

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class ComplexData(
    val opt1: String?,
    val opt2: Int
): Parcelable

