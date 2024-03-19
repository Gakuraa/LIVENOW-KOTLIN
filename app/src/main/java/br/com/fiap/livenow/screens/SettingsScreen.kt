package br.com.fiap.livenow.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.livenow.R


@Composable
fun SettingsScreen() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF313131))
    ){
        SettingsCard1()
        SettingCard(topic = "Linguagem", icon = Icons.Default.Build)
        SettingCard(topic = "Segurança", icon = Icons.Default.Lock)
        SettingCard(topic = "Centro de Ajuda", icon = Icons.Default.Call)
        SettingCard(topic = "Sobre nós", icon = Icons.Default.Info)
        LogoutButton()
    }
}

@Composable
fun SettingsCard1() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(color = Color(0xFF1B1B1B))
            .clip(RoundedCornerShape(8.dp))
            .padding(16.dp)
    ) {
        Box(modifier = Modifier
            .align(Alignment.CenterHorizontally)
        ){
            Surface(
                modifier = Modifier.size(60.dp),
                shape = CircleShape,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.4f)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.girl_img),
                    contentDescription = "Mulher"
                )
            }
        }
        Text(
            text = "Amanda Almeida",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 24.sp,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = "32 anos",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 24.sp,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun SettingCard(topic: String, icon: ImageVector) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(color = Color(0xFF1B1B1B))
            .clip(RoundedCornerShape(8.dp))
            .padding(16.dp)
    ) {
        Row(modifier = Modifier
            .align(Alignment.Start)
        ) {
            Icon(
                imageVector = icon,
                contentDescription = "Icon",
                modifier = Modifier.size(16.dp),
                tint = Color.White
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = topic,fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 16.sp
            )
        }
    }
}

@Composable
fun LogoutButton() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.BottomCenter)
    ) {
        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF1B1B1B)
            )
        ) {
            Text(
                text = "Sair",
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 16.sp
            )
        }
    }
}