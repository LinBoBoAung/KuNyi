package com.padcmyanmar.kunyi.events

class ErrorEvent
{
    class ApiErrorEvent(val throwable: Throwable? = null) {
        fun getMsg(): String? {
            return if (throwable == null)
                "Null Throwable in Error"
            else
                throwable.message
        }
    }
}