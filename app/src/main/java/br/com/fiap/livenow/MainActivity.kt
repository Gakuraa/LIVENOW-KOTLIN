package br.com.fiap.livenow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import br.com.fiap.livenow.navigation.AppNavigation
import br.com.fiap.livenow.ui.theme.LiveNowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LiveNowTheme {
                AppNavigation()
            }
        }
    }
}
