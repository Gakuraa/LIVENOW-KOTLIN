package br.com.fiap.livenow.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.livenow.R
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomeScreen() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF313131))
        .padding(top = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,

    ){
        Row(
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 25.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Surface(
                modifier = Modifier.size(45.dp),
                shape = CircleShape,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.4f)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.randomguy1),
                    contentDescription = "Pessoa 1"
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = "João da Silva",
                fontWeight = FontWeight.SemiBold,
                color = Color.White,
                fontSize = 24.sp
            )
        }
        PostCard(
            imageUrl = R.drawable.show2,
            postText = "Ed Sheeran é incrível, provavelmente foi o melhor show da miha vida..."
        )
        Spacer(modifier = Modifier.height(12.dp))
        Row(
            modifier = Modifier
                .align(Alignment.Start)
                .padding(start = 25.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Surface(
                modifier = Modifier.size(45.dp),
                shape = CircleShape,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.4f)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.randomguy2),
                    contentDescription = "Pessoa 1"
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = "Antônio Costa",
                fontWeight = FontWeight.SemiBold,
                color = Color.White,
                fontSize = 24.sp
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        PostCard(
            imageUrl = R.drawable.show1,
            postText = "Adorei o show, foi uma experiência surreal!! O artista, os efeitos visuais, conexão emocional..."
        )
        Spacer(modifier = Modifier.height(32.dp))
    }
}

//@OptIn(ExperimentalCoilApi::class)
//@Composable
//fun PostCard(
//    imageUrl: Int,
//    postText: String,
//    modifier: Modifier = Modifier
//) {
//    Card(
//        modifier = modifier
//            .fillMaxWidth()
//            .padding(horizontal = 16.dp)
//            ,
//        shape = RoundedCornerShape(0.dp),
//    ) {
//        Column(modifier = Modifier
//            .padding(16.dp)
//            .background(Color(0xFF1B1B1B)),
//            ) {
//            val painter = rememberImagePainter(imageUrl, builder = {
//                placeholder(android.R.drawable.ic_menu_gallery)
//                error(android.R.drawable.ic_menu_close_clear_cancel)
//            })
//            Image(
//                painter = painter,
//                contentDescription = null,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(200.dp),
//                contentScale = ContentScale.Crop
//            )
//
//            Spacer(modifier = Modifier.height(8.dp))
//
//            Row(verticalAlignment = Alignment.CenterVertically) {
//                Icon(
//                    imageVector = Icons.Default.Favorite,
//                    contentDescription = "Favorite",
//                    modifier = Modifier
//                        .size(24.dp),
//                    tint = Color(0xFF882DA8)
//
//                )
//                Spacer(modifier = Modifier.width(16.dp))
//                Icon(
//                    imageVector = Icons.Default.Share,
//                    contentDescription = "Comment",
//                    modifier = Modifier.size(24.dp),
//                    tint = Color.White
//                )
//            }
//
//            Spacer(modifier = Modifier.height(8.dp))
//
//            Text(
//                text = postText,
//                modifier = Modifier.fillMaxWidth(),
//                color = Color.White,
//            )
//        }
//    }
//}

@OptIn(ExperimentalCoilApi::class)
@Composable
fun PostCard(
    imageUrl: Int,
    postText: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp)
    ) {
        Column(modifier = Modifier
            .padding(8.dp)
            .background(Color(0xFF1B1B1B)),
        ) {
            val painter = rememberImagePainter(imageUrl, builder = {
                placeholder(android.R.drawable.ic_menu_gallery)
                error(android.R.drawable.ic_menu_close_clear_cancel)
            })
            Image(
                painter = painter,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(8.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "Favorite",
                    modifier = Modifier
                        .size(24.dp),
                    tint = Color(0xFF882DA8)

                )
                Spacer(modifier = Modifier.width(16.dp))
                Icon(
                    imageVector = Icons.Default.Share,
                    contentDescription = "Comment",
                    modifier = Modifier.size(24.dp),
                    tint = Color.White
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = postText,
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally),
                color = Color.White,
            )
        }
    }
}



