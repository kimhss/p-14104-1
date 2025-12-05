package com.back.domain.global;

public record RsData<T>(String resultCode, String msg, T data) {
}
