package io.test.service

import io.micronaut.retry.annotation.Retryable
import jakarta.inject.Singleton

@Singleton
class MicronautService() {
    @Retryable
    suspend fun getContent(): String{
        return ""
    }
}