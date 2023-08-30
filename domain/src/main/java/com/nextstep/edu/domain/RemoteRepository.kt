package com.nextstep.edu.domain

import com.nextstep.edu.domain.model.Repository

interface RemoteRepository {

    suspend fun getRepositories(): List<Repository>
}
