package com.example.demo.entity.repository

import com.example.demo.entity.PostEntity
import org.springframework.data.repository.CrudRepository

interface PostRepository: CrudRepository<PostEntity, Int> {
}