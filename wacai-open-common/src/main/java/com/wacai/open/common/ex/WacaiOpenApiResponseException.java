package com.wacai.open.common.ex;

import com.wacai.open.common.error.CommonErrorCode;
import com.wacai.open.common.error.ErrorCode;
import com.wacai.open.common.response.WacaiErrorResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class WacaiOpenApiResponseException extends RuntimeException {

	private final int code;

	private final String error;

	public WacaiOpenApiResponseException(int code, String error, Throwable throwable) {
		super(code + ":" + error, throwable);
		this.code = code;
		this.error = error;
	}

	public WacaiOpenApiResponseException(WacaiErrorResponse wacaiErrorResponse) {
		super(wacaiErrorResponse.getCode() + ":" + wacaiErrorResponse.getError());
		this.code = wacaiErrorResponse.getCode();
		this.error = wacaiErrorResponse.getError();
	}

	public WacaiOpenApiResponseException(ErrorCode errorCode) {
		super(errorCode.getCode() + ":" + errorCode.getDescription());
		this.code = errorCode.getCode();
		this.error = errorCode.getDescription();
	}

	public WacaiOpenApiResponseException(ErrorCode errorCode, Throwable throwable) {
		this(errorCode.getCode(), errorCode.getDescription(), throwable);
	}

	/**
	 * 是否系统异常
	 *
	 * @return {@code true} 如果是系统异常
	 */
	public boolean isSystem() {
		return CommonErrorCode.CLIENT_SYSTEM_ERROR.getCode() == code
				|| CommonErrorCode.SYSTEM_ERROR.getCode() == code;
	}

	/**
	 * 是否业务异常
	 *
	 * @return {@code true} 如果是业务异常
	 */
	public boolean isBiz() {
		return !isSystem();
	}
}
