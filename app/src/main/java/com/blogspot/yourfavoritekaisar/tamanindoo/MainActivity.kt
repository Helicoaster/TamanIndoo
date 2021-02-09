package com.blogspot.yourfavoritekaisar.tamanindoo

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Gravity
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.blogspot.yourfavoritekaisar.tamanindoo.ui.layanan.LayananFragment
import com.blogspot.yourfavoritekaisar.tamanindoo.ui.pengaturan.PengaturanFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var navigationPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        setSupportActionBar(toolbar)
        setUpDrawerLayout()

        navigationPosition = R.id.LayananMenu
        navigateToFragment(LayananFragment.newInstance())
        nav_home.setCheckedItem(navigationPosition)
        toolbar.title = getString(R.string.inbox)

        nav_home.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.LayananMenu -> {
                    navigationPosition = R.id.LayananMenu
                    navigateToFragment(LayananFragment.newInstance())
                }
                R.id.PengaturanMenu -> {
                    navigationPosition = R.id.PengaturanMenu
                    navigateToFragment(PengaturanFragment.newInstance())
                }
                R.id.KeluarMenu -> {
                    finishAffinity()
                }
            }
            // set item as selected to persist highlight
            menuItem.isChecked = true
            // close drawer when item is tapped
            drawerLayout.closeDrawers()
            true
        }

        drawerLayout.addDrawerListener(object: DrawerLayout.DrawerListener{
            override fun onDrawerStateChanged(p0: Int) {
            }

            override fun onDrawerSlide(p0: View, p1: Float) {
            }

            override fun onDrawerClosed(p0: View) {
            }

            override fun onDrawerOpened(p0: View) {
            }
        })
    }

    private fun navigateToFragment(fragmentToNavigate: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragmentToNavigate)
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

    private fun setUpDrawerLayout() {
        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, R.string.drawerOpen, R.string.drawerClose)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
    }

    @SuppressLint("WrongConstant")
    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(Gravity.START)) {
            drawerLayout.closeDrawer(Gravity.START)
        }

        if (navigationPosition == R.id.LayananMenu) {
            finish()
        } else {
            //Navigate to Inbox Fragment
            navigationPosition = R.id.LayananMenu
            navigateToFragment(LayananFragment.newInstance())
            nav_home.setCheckedItem(navigationPosition)
            toolbar.title = getString(R.string.inbox)
        }
    }


//    private lateinit var appBarConfiguration: AppBarConfiguration
//    lateinit var navController: NavController
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        val toolbar: Toolbar = findViewById(R.id.toolbar)
//        setSupportActionBar(toolbar)
//        setupNavigation()
//
//        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
//        val navView: NavigationView = findViewById(R.id.nav_view)
//        val navController = findNavController(R.id.nav_host_fragment)
//        navView.bringToFront()
//        // Passing each menu ID as a set of Ids because each
//        // menu should be considered as top level destinations.
//        appBarConfiguration = AppBarConfiguration(
//            setOf(R.id.LayananFragment, R.id.PengaturanFragment, R.id.KeluarFragment), drawerLayout)
//        setupActionBarWithNavController(navController, appBarConfiguration)
//        navView.setupWithNavController(navController)
//        navView.setNavigationItemSelectedListener(this)
//    }
//
//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        menuInflater.inflate(R.menu.main, menu)
//        return true
//    }
//
//    override fun onSupportNavigateUp(): Boolean {
//        val navController = findNavController(R.id.nav_host_fragment)
//        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
//    }
//
//    private fun setupNavigation() {
//        setSupportActionBar(toolbar)
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//        supportActionBar?.setDisplayShowHomeEnabled(true)
//        navController = Navigation.findNavController(this, R.id.nav_host_fragment)
//
//        NavigationUI.setupActionBarWithNavController(this, navController, drawer_layout)
//
//        NavigationUI.setupWithNavController(nav_view, navController)
//
//        nav_view.setNavigationItemSelectedListener(this)
//    }
//
//    override fun onNavigationItemSelected(item: MenuItem): Boolean {
//        var fragment: Fragment? = null
//        when (item.itemId) {
//            R.id.LayananMenu -> {
//                fragment = LayananFragment()
//            }
//            R.id.PengaturanMenu -> {
//                fragment = PengaturanFragment()
//            }
//            R.id.KeluarMenu -> {
//                super.onBackPressed()
//            }
//        }
//        if (fragment != null){
//            val fragmentManager : FragmentManager = supportFragmentManager
//            fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, fragment).commit()
//
//        }
//        drawer_layout.closeDrawer(GravityCompat.START)
//        return true
//    }
}
