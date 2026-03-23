package screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

sealed class Screen {
    object List : Screen()
    data class Detail(val deviceName: String) : Screen()
}

class Navigator {
    var current by mutableStateOf<Screen>(Screen.List)
        private set

    fun navigateTo(screen: Screen) {
        current = screen
    }

    fun popBackStack() {
        current = Screen.List
    }
}

@Composable
fun AppNavigation() {
    val navigator = remember { Navigator() }

    when (val screen = navigator.current) {
        is Screen.List -> DeviceListScreen(navigator)
        is Screen.Detail -> DeviceDetailScreen(screen.deviceName, navigator)
    }
}
