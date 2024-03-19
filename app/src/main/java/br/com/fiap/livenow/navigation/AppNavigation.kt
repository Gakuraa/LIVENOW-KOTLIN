package br.com.fiap.livenow.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import br.com.fiap.livenow.screens.HomeScreen
import br.com.fiap.livenow.screens.ProfileScreen
import br.com.fiap.livenow.screens.SettingsScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    Scaffold(
        topBar = {
            TopNavigationBar()
        },
        bottomBar = {
            NavigationBar(
                contentColor = Color.White
            ) {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination

                listofNavItems.forEach{ navItem ->
                    NavigationBarItem(
                        modifier = Modifier
                            .background(Color.Black),
                        colors = NavigationBarItemDefaults.colors(
                            selectedIconColor = Color(0xFF882DA8),
                            unselectedIconColor = Color.White,
                            selectedTextColor = Color(0xFF882DA8),
                            unselectedTextColor = Color.White
                        ),
                        selected = currentDestination?.hierarchy?.any{ it.route == navItem.route } == true,
                        onClick = {
                                  navController.navigate(navItem.route){
                                      popUpTo(navController.graph.findStartDestination().id){
                                          saveState = true
                                      }
                                      launchSingleTop = true
                                      restoreState = true
                                  }
                        },
                        icon = {
                               Icon(
                                   imageVector =  navItem.icon,
                                   contentDescription = null
                               )
                        },
                        label = {
                            Text(text = navItem.label)
                        }
                    )

                }
            }
        }
    ){ paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screens.HomeScreen.name,
            modifier = Modifier
                .padding(paddingValues)
        ){
            composable(route = Screens.HomeScreen.name){
                HomeScreen()
            }
            composable(route = Screens.ProfileScreen.name){
                ProfileScreen()
            }
            composable(route = Screens.SettingsScreen.name){
                SettingsScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopNavigationBar() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
    ) {
        TopAppBar(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black),
            title = {
                Text(
                    text = "LiveNow",
                    color = Color.Black
                )
            }
        )
    }
}