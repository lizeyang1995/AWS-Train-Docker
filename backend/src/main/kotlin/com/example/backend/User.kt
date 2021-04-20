package com.example.backend

import javax.persistence.*

@Entity
@Table(name="User")
class User(@Id @GeneratedValue @Column(name="id") var id: Long,
           @Column(name="name") var name: String)