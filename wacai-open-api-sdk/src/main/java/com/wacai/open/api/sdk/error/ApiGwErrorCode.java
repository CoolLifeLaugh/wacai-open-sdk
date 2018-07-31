package com.wacai.open.api.sdk.error;

import com.wacai.open.common.error.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ApiGwErrorCode implements ErrorCode {

	ERROR_RET_TYPE(9996, "接口需要设置byte[]返回类型"),
	ERROR_PARAM(9997, "参数错误"),
	SIGN_NOT_MATCH(10008, "sign值不匹配"),
	;

	private final int code;

	private final String description;
}
