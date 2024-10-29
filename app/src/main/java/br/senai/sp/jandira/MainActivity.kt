package br.senai.sp.jandira

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ui.theme.TelaPerfilSinalibrasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TelaPerfilSinalibrasTheme {
                Perfil()
            }
        }
    }
}

@Composable
fun Perfil() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFC7E2FE))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
                .height(330.dp)
        ) {
            Icon(
                modifier = Modifier.padding(vertical = 7.dp),
                imageVector = Icons.Default.ArrowBackIosNew,
                contentDescription = "BackArrow",
                tint = Color.Black
            )

            Column {
                Box(modifier = Modifier.fillMaxSize()) {
                    Text(
                        modifier = Modifier.align(Alignment.TopCenter),
                        text = "Perfil",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 26.sp
                    )

                    Image(
                        painter = painterResource(id = R.drawable.image),
                        contentDescription = "perfil",
                        modifier = Modifier
                            .size(width = 170.dp, height = 170.dp)
                            .align(Alignment.Center)
                    )

                    Text(
                        modifier = Modifier
                            .align(Alignment.BottomCenter)
                            .padding(bottom = 45.dp),
                        text = "James Smith",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 26.sp
                    )

                    Image(
                        painter = painterResource(id = R.drawable.aluno),
                        contentDescription = "tag",
                        modifier = Modifier
                            .align(Alignment.BottomCenter)
                            .size(height = 33.dp, width = 151.dp)
                    )
                }
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
                .height(330.dp)
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFFFFFFF))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.image5),
                        contentDescription = "perfil",
                        modifier = Modifier.size(width = 60.dp, height = 70.dp)
                    )

                    Spacer(modifier = Modifier.width(16.dp))

                    Column(
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(
                            text = "NÚMEROS",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Row {
                            Button(
                                onClick = { /* TODO: Ação dos Vídeos */ },
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(0x00FFFFFF)
                                ),
                                modifier = Modifier
                                    .padding(end = 8.dp)
                                    .border(
                                        border = BorderStroke(2.dp, Color(0xFF345ADE)),
                                        shape = RoundedCornerShape(16.dp)
                                    ),
                                contentPadding = PaddingValues(horizontal = 12.dp, vertical = 4.dp)
                            ) {
                                Text(
                                    text = "4 Vídeos",
                                    color = Color(0xFF345ADE),
                                    fontSize = 12.sp
                                )
                            }

                            Button(
                                modifier = Modifier.border(
                                    border = BorderStroke(2.dp, Color(0xFFFEC608)),
                                    shape = RoundedCornerShape(16.dp)
                                ),
                                onClick = { /* TODO: Ação das Atividades */ },
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(0x00FFFFFF)
                                ),
                                contentPadding = PaddingValues(horizontal = 5.dp, vertical = 4.dp)
                            ) {
                                Text(
                                    text = "2 Atividades",
                                    color = Color(0xFFFEC608),
                                    fontSize = 12.sp
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier.size(48.dp)
                    ) {
                        CircularProgressIndicator(
                            progress = 0.65f,
                            modifier = Modifier.fillMaxSize(),
                            color = Color(0xFF4CAF50),
                            strokeWidth = 6.dp
                        )

                        Text(
                            text = "65%",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                    }
                }
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { /* Ação do botão */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0F1951)),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .padding(3.dp)
                    .height(48.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.message),
                        contentDescription = "Ícone de mensagem",
                        tint = Color(0xFFD1E3FF),
                        modifier = Modifier.size(24.dp)
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    Text(
                        text = "Mensagem",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFD1E3FF)
                    )
                }
            }
        }
    }
}

    @Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    TelaPerfilSinalibrasTheme {
        Perfil()
    }
}