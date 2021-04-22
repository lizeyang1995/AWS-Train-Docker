package com.example.backend

import org.springframework.data.jpa.repository.JpaRepository

interface Repository : JpaRepository<User, Long> {
    override fun findAll(): MutableList<User>
}