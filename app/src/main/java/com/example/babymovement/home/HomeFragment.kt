package com.example.babymovement.home

import com.example.babymovement.base.BaseFragment
import com.example.babymovement.databinding.FragmentHomeBinding


class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override fun getViewBinding(): FragmentHomeBinding = FragmentHomeBinding.inflate(layoutInflater)
}