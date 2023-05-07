package com.example.meinrestaurant.ui.theme


import RestaurantsViewModel
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Place
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.meinrestaurant.Restaurant

@Composable
fun RestaurantScreen(){
    val viewModel:RestaurantsViewModel = viewModel()
    LazyColumn(contentPadding = PaddingValues(vertical = 8.dp, horizontal = 8.dp)) {
        items(viewModel.getRestaurants()){i -> RestaurantItem(i)}
    }
}

@Composable
fun RestaurantItem(item: Restaurant){
    var favoriteState by remember {mutableStateOf(true)}
    val icon = if(favoriteState){
        Icons.Filled.Favorite
    }else{
        Icons.Filled.FavoriteBorder
    }

    Card(elevation = 4.dp, modifier = Modifier.padding(8.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)){
            RestaurantIcon(Icons.Filled.Place, Modifier.weight(0.15f), { favoriteState = !favoriteState })
            RestaurantDetails(item.title, item.description, Modifier.weight(0.7f))
            RestaurantIcon(Icons.Filled.Place, Modifier.weight(0.15f), { favoriteState = !favoriteState })

        }
    }
}

@Composable
fun RestaurantIcon(icon: ImageVector, modifier:Modifier, onClick: () -> Unit){
    Image(imageVector = icon, contentDescription = "Restaurant icon", modifier = modifier.padding(8.dp).clickable { onClick() })
}

@Composable
fun RestaurantDetails(titel: String, description: String, modifier: Modifier){
    Column(modifier = modifier) {
        Text(text = titel, style= MaterialTheme.typography.h6)
        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
            Text(text=description, style= MaterialTheme.typography.body2)
        }}

}


