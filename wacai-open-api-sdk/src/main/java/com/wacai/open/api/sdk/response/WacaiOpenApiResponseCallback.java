package com.wacai.open.api.sdk.response;

import com.wacai.open.common.ex.WacaiOpenApiResponseException;

public interface WacaiOpenApiResponseCallback<T> {

	void onSuccess(T data);

	void onFailure(WacaiOpenApiResponseException ex);
}
