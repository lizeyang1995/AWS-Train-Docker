package com.example.backend

import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
class Controller(private var repository: Repository) {

    @GetMapping("/users")
    fun getAllUsers(): Iterable<User> {
        return repository.findAll()
    }

    @PostMapping("/users")
    fun addUser(@RequestBody user: User) {
        repository.save(user)
    }
}