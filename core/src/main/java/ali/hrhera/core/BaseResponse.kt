package ali.hrhera.core

sealed class BaseResponse<T : Any>

data class Success<T : Any>(val data: T) : BaseResponse<T>()
data class Error<T : Any>(val throwable: Throwable) : BaseResponse<T>()
data object Loading : BaseResponse<Nothing>()
data object Idel : BaseResponse<Nothing>()