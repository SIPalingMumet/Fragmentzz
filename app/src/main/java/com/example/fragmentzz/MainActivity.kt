package com.example.fragmentzz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.android.synthetic.main.activity_main.*

class CommunicationViewModel : ViewModel() {
    private val mName = MutableLiveData<String>()
    val name: LiveData<String>
        get() = mName
    fun setName(name: String) {
        mName.value = name
    }
}


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view_pager.adapter = ViewPagerAdapter( this,
            supportFragmentManager)
        tabs.setupWithViewPager(view_pager)
    }
}