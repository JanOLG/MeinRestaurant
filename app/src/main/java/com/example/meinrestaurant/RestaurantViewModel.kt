import androidx.lifecycle.ViewModel
import com.example.meinrestaurant.dummyListe


class RestaurantsViewModel(): ViewModel() {
    fun getRestaurants() = dummyListe
}