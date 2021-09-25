package com.dev.unittestexample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dev.unittestexample.R
import com.dev.unittestexample.databinding.ActivityMainBinding
import com.dev.unittestexample.presentation.UserPresenter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    companion object {
        private const val ID = "ID"
    }

    private lateinit var viewBinding: ActivityMainBinding

    @Inject
    lateinit var userPresenter: UserPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        with(viewBinding) {
            tvUserNameText.text = userPresenter.getUsername(ID)
            tvUserUniqueCodeText.text = userPresenter.getUniqueCode(ID)
        }
    }
}