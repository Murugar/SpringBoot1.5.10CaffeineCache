package com.iqmsoft

import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service


@Service
class TimeService {

    long getTimeNow() {
        new Date().time
    }

    @Cacheable('timeCached')
    long getTimeCached() {
        timeNow
    }
}
