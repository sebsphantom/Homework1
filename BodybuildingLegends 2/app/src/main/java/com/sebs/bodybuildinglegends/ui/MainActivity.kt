package com.sebs.bodybuildinglegends.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.sebs.bodybuildinglegends.application.BodybuildingLegendsDBApp
import com.sebs.bodybuildinglegends.data.LegendRepository
import com.sebs.bodybuildinglegends.data.db.model.LegendEntity
import com.sebs.bodybuildinglegends.databinding.ActivityMainBinding
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


private var legends: MutableList<LegendEntity> = mutableListOf()
    private lateinit var repository: LegendRepository





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        repository = (application as BodybuildingLegendsDBApp).repository

        val legend = LegendEntity(
            title = "Sam Sulek",
            genre = "Professional", //category
            developer = "USA" //region or country


        )

lifecycleScope.launch {
    repository.insertLegend(legend)

}





    }

    fun click(view: View) {}
}

