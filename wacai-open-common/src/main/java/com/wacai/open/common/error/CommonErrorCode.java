package com.wacai.open.common.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CommonErrorCode implements ErrorCode {

	CLIENT_SYSTEM_ERROR(9999, "系统错误"),
	SYSTEM_ERROR(10000, "系统错误"),
	;

	private final int code;

	private final String description;
}
