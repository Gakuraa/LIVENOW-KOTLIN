package br.com.fiap.livenow.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.livenow.R

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF313131))
    ) {
        ProfileCard()
        MusicCard()
        CardPost()
    }
}

@Composable
fun ProfileCard() {
    Row(
        modifier = Modifier
            .padding(8.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(color = Color(0xFF1B1B1B))
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Surface(
            modifier = Modifier.size(100.dp),
            shape = CircleShape,
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.4f)
        ) {
            Image(
                painter = painterResource(id = R.drawable.girl_img),
                contentDescription = "Mulher"
            )
        }

        Column(
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.CenterVertically)
        ) {
            Text(
                text = "Amanda Almeida",
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 24.sp
            )
            Text(
                text = "Biografia",
                fontWeight = FontWeight.SemiBold,
                color = Color.White,
                fontSize = 18.sp
            )
            Text(
                text = "Bem vindo(a) ao meu perfil! Sou Rockeira e amo ir para shows!",
                fontWeight = FontWeight.Light,
                color = Color.White
            )
            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .offset(y = 25.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF882DA8)
                )
            ) {
                Text(
                    text = "Editar",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 12.sp
                )
            }
        }
    }
}

@Composable
fun MusicCard() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(color = Color(0xFF1B1B1B))
            .clip(RoundedCornerShape(8.dp))
            .padding(16.dp)
    ) {
        Text(
            text = "Músicas Favoritas",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier
        ) {
            Column {
                Surface(
                    modifier = Modifier.size(60.dp),
                    shape = CircleShape,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.4f)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.arcticmonkeys),
                        contentDescription = "Mulher"
                    )
                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(
                    text = "Arctic Monkeys",
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )
                Text(
                    text = "Do I Wanna know?",
                    fontWeight = FontWeight.Light,
                    color = Color.White
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier
        ) {
            Column {
                Surface(
                    modifier = Modifier.size(60.dp),
                    shape = CircleShape,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.4f)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.stonetemple),
                        contentDescription = "Banda 2"
                    )
                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(
                    text = "Stone Temple Pilos",
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )
                Text(
                    text = "Interstate Love Song",
                    fontWeight = FontWeight.Light,
                    color = Color.White
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier
        ) {
            Column {
                Surface(
                    modifier = Modifier.size(60.dp),
                    shape = CircleShape,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.4f)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.kingkrule),
                        contentDescription = "Banda 3"
                    )
                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(
                    text = "King Krule",
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )
                Text(
                    text = "Out Getting Ribs",
                    fontWeight = FontWeight.Light,
                    color = Color.White
                )
            }
        }
    }
}

@Composable
fun CardPost() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(color = Color(0xFF1B1B1B))
            .clip(RoundedCornerShape(8.dp))
            .padding(16.dp)
    ) {
        Text(
            text = "Publicações",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.width(8.dp))
        Row(
            modifier = Modifier
        ) {
            Column {
                Surface(
                    modifier = Modifier.size(0.dp),
                    shape = CircleShape,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.4f)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.girl_img),
                        contentDescription = "Mulher"
                    )
                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(
                    text = "Amanda Almeida",
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )
                Text(
                    text = "Gente, o show do Pearl Jam foi incrível!!",
                    fontWeight = FontWeight.Light,
                    color = Color.White
                )
            }
        }
    }
}