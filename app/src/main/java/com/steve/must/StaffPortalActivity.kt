package com.steve.must

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.steve.must.databinding.ActivityStaffPortalBinding

class StaffPortalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStaffPortalBinding
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityStaffPortalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.webview.settings.javaScriptEnabled = true
        binding.webview.settings.loadWithOverviewMode = true
        binding.webview.settings.useWideViewPort = true
        binding.webview.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url!!)
                return false
            }
        }
        binding.webview.loadUrl("https://staff.must.ac.ke/")
    }
}