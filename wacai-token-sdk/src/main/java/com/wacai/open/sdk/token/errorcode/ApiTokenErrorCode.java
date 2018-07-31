package com.wacai.open.sdk.token.errorcode;

import com.wacai.open.common.error.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ApiTokenErrorCode implements ErrorCode {

	SIGN_NOT_MATCH(10008, "sign值不匹配"),
	INVALID_REFRESH_TOKEN(10010, "非法的refresh_token"),
	ACCESS_TOKEN_EXPIRED(10011, "access_token已过期"),
	INVALID_ACCESS_TOKEN(10012, "access_token非法"),
	REFRESH_TOKEN_EXPIRED(10013, "refresh_token已过期"),;

	private final int code;

	private final String description;
}