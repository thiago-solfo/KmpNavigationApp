package screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DeviceDetailScreen(deviceName: String, navigator: Navigator) {
    Column(modifier = Modifier.padding(32.dp)) {
        Text("Detalhes: $deviceName")

        Button(onClick = {
            navigator.popBackStack()
        }) {
            Text("Voltar")
        }
    }
}