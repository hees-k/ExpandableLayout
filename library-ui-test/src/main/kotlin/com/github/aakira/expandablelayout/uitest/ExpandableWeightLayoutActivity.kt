package com.github.aakira.expandablelayout.uitest

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.github.aakira.expandablelayout.ExpandableWeightLayout
import kotlin.properties.Delegates

class ExpandableWeightLayoutActivity : AppCompatActivity() {

    companion object {

        @JvmStatic fun startActivity(context: Context) {
            context.startActivity(Intent(context, ExpandableWeightLayoutActivity::class.java))
        }
    }

    private var expandableLayout: ExpandableWeightLayout by Delegates.notNull()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expandable_weight_layout)
        supportActionBar?.title = ExpandableWeightLayoutActivity::class.java.simpleName

        expandableLayout = findViewById(R.id.expandableLayout) as ExpandableWeightLayout
        findViewById<View>(R.id.expandButton)?.setOnClickListener { expandableLayout.toggle() }
        findViewById<View>(R.id.moveWeightButton)?.setOnClickListener { expandableLayout.move(2f, 0, null) }
    }
}