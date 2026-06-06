package cn.ppps.forwarder.fragment

import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewbinding.ViewBinding
import cn.ppps.forwarder.core.BaseFragment
import com.xuexiang.xpage.annotation.Page

@Page(name = "服务端")
class ServerFragment : BaseFragment<ViewBinding?>() {
    override fun initViews() {}

    override fun viewBindingInflate(inflater: LayoutInflater, container: ViewGroup): ViewBinding {
        val view = TextView(inflater.context).apply {
            text = "HTTP remote control is disabled."
            gravity = Gravity.CENTER
            layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        }
        return object : ViewBinding {
            override fun getRoot(): View = view
        }
    }
}
