package com.example.studeasee.ui

import android.content.Intent
import android.net.http.UrlRequest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.studeasee.R
import com.example.studeasee.adapter.ViewPagerAdapter
import com.example.studeasee.databinding.ActivityRoomDetailsBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions




class RoomDetailsActivity : AppCompatActivity() , OnMapReadyCallback {
    private lateinit var binding: ActivityRoomDetailsBinding
    private var mGoogleMap: GoogleMap? = null


    private val latlngku = LatLng(23.129220,72.540530)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRoomDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val images = listOf(
            R.drawable.pgroom1,
            R.drawable.pgroom2,
            R.drawable.pgroom3,
            R.drawable.pgroom4,
            R.drawable.pgroom5
        )
        val adapter = ViewPagerAdapter(images)
        binding.bannerPager.adapter = adapter

        binding.bannerPager.beginFakeDrag()
        binding.bannerPager.fakeDragBy(-6f)
        binding.bannerPager.endFakeDrag()


        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.mapFragment) as SupportMapFragment
        mapFragment.getMapAsync(this)


        binding.buttonConfirmBook.setOnClickListener{
            Intent(this,DoneActivity::class.java).also {
                startActivity(it)
            }
        }
    }








    private fun zoomOnMap(latLng: LatLng){
        val newLatLngZoom = CameraUpdateFactory.newLatLngZoom(latLng,5f)
        mGoogleMap?.animateCamera(newLatLngZoom)

    }

      private fun addMarker(position:LatLng): Marker {
         val marker =  mGoogleMap?.addMarker(
             MarkerOptions()
                 .position(latlngku)
                 .title("Draggable Marker")
                 .draggable(true))

          return marker!!
      }

//  fun onMapReady(googleMap: GoogleMap?) {
//        mGoogleMap = googleMap
//        addMarker(latlngku)
//    }

    override fun onMapReady(googleMap: GoogleMap) {
        mGoogleMap = googleMap
        addMarker(latlngku)
        zoomOnMap(latlngku)
    }

}
