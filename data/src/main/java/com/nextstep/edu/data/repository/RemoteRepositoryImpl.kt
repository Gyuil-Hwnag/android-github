package com.nextstep.edu.data.repository

import com.nextstep.edu.data.RemoteService
import com.nextstep.edu.data.model.RepositoryResponse
import com.nextstep.edu.domain.RemoteRepository
import com.nextstep.edu.domain.model.Repository

class RemoteRepositoryImpl(
    private val remoteService: RemoteService
): RemoteRepository {
    override suspend fun getRepositories(): List<Repository> {
        return remoteService.getRepositories().map(RepositoryResponse::toDomain)
    }
}
