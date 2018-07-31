package com.wacai.open.common.response;

import lombok.Data;

@Data
public class WacaiErrorResponse {

	private int code;

	private String error;
}
