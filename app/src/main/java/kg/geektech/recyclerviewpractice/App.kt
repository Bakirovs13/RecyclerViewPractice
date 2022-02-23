package kg.geektech.recyclerviewpractice

import android.app.Application
import kg.geektech.recyclerviewpractice.model.UsersService

class App:Application() {

    val userService =UsersService()

}