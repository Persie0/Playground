package com.facebook;

import dm.C5207g;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/facebook/FacebookServiceException;", "Lcom/facebook/FacebookException;", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public final class FacebookServiceException extends FacebookException {

    /* JADX INFO: renamed from: b */
    public final FacebookRequestError f11447b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacebookServiceException(FacebookRequestError facebookRequestError, String str) {
        super(str);
        C5207g.m11111f(facebookRequestError, "requestError");
        this.f11447b = facebookRequestError;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{FacebookServiceException: httpResponseCode: ");
        FacebookRequestError facebookRequestError = this.f11447b;
        sb2.append(facebookRequestError.f11438a);
        sb2.append(", facebookErrorCode: ");
        sb2.append(facebookRequestError.f11439b);
        sb2.append(", facebookErrorType: ");
        sb2.append(facebookRequestError.f11441d);
        sb2.append(", message: ");
        sb2.append(facebookRequestError.m6602a());
        sb2.append("}");
        String string = sb2.toString();
        C5207g.m11110e(string, "StringBuilder()\n        .append(\"{FacebookServiceException: \")\n        .append(\"httpResponseCode: \")\n        .append(requestError.requestStatusCode)\n        .append(\", facebookErrorCode: \")\n        .append(requestError.errorCode)\n        .append(\", facebookErrorType: \")\n        .append(requestError.errorType)\n        .append(\", message: \")\n        .append(requestError.errorMessage)\n        .append(\"}\")\n        .toString()");
        return string;
    }
}
