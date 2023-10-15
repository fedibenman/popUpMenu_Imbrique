package com.example.popupmenu_imbrique

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.popupmenu_imbrique.ui.theme.PopUpMenu_ImbriqueTheme

class MainActivity : ComponentActivity() {
    private lateinit var showPopupMenuBtn: Button
    private  lateinit var popupMenu: PopupMenu
    private lateinit var mainLayout: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        showPopupMenuBtn = findViewById(R.id.showPopupMenuBtn)
        mainLayout = findViewById(R.id.mainLayout)

        showPopupMenuBtn.setOnClickListener {
            popupMenu = PopupMenu(this,findViewById(R.id.showPopupMenuBtn))
            popupMenu.inflate(R.menu.popup_menu)
        popupMenu.setOnMenuItemClickListener { item ->
            when(item.itemId){
            R.id.red -> {
                mainLayout.setBackgroundColor(resources.getColor(R.color.red, null))
                true
            }
            R.id.green -> {
                mainLayout.setBackgroundColor(resources.getColor(R.color.green, null))
                true
            }
            R.id.yellow -> {
                mainLayout.setBackgroundColor(resources.getColor(R.color.yellow, null))
                true
            }

                else -> {false}
            }
        }
            popupMenu.show()
        }
    }
}


