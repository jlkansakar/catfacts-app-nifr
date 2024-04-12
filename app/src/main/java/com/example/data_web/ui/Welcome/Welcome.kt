package com.example.data_web.ui.Welcome

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.data_web.ui.CatFact.CatFactsViewModel

@Composable
fun Welcome(navController: NavController) {

    val viewModel = viewModel<CatFactsViewModel>()
    Box {
        Column(
            Modifier.padding(30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Press the button to get a cat fact!")
            Row()
            {

                Button(onClick = {
                    navController.navigate("catFact")
                    }) {
                    Text("Fetch a fact")
                }

            }
            Text(text = "~ Facts ~")
        }
    }
}