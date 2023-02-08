package com.nttdata.utils;

import lombok.extern.slf4j.Slf4j;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Request;
import okhttp3.Response;

import java.time.LocalDateTime;

@Slf4j
public class SimpleLogEventsListener extends EventListener {

    @Override
    public void callStart(Call call) {
        log.info("callStart OkHttp at {}", LocalDateTime.now());
    }

//    @Override
//    public void requestHeadersEnd(Call call, Request request) {
//        log.info("requestHeadersEnd at {} with headers {}", LocalDateTime.now(), request.headers());
//    }
//
//    @Override
//    public void responseHeadersEnd(Call call, Response response) {
//        log.info("responseHeadersEnd at {} with headers {}", LocalDateTime.now(), response.headers());
//    }

    @Override
    public void callEnd(Call call) {
        log.info("callEnd OkHttp at {}", LocalDateTime.now());
    }
}
