package screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DeviceListScreen(navigator: Navigator) {
    val devices = listOf("iPhone 15", "Galaxy S24", "Pixel 8")

    Column(modifier = Modifier.padding(32.dp)) {
        devices.forEach { device ->
            Button(onClick = {
                navigator.navigateTo(Screen.Detail(device))
            }) {
                Text(device)
            }
        }
    }
}