package com.nextstep.edu.data

import com.nextstep.edu.data.model.RepositoryResponse
import retrofit2.http.GET

interface RemoteService {

    // 유저 목록 가져오기
    @GET("repositories")
    suspend fun getRepositories(): List<RepositoryResponse>
}
