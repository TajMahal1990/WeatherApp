package com.example.weatherapp2.fragments

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.PackageManagerCompat
import androidx.fragment.app.Fragment

fun Fragment.isPermitissionGranted(p: String) : Boolean {
    return ContextCompat.checkSelfPermission(
        activity as AppCompatActivity,
        p) == PackageManager.PERMISSION_GRANTED
}