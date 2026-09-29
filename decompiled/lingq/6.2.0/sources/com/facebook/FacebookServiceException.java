package com.facebook;

/* JADX INFO: loaded from: classes2.dex */
public final class FacebookServiceException extends FacebookException {

    /* JADX INFO: renamed from: b */
    public final FacebookRequestError f11366b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacebookServiceException(FacebookRequestError facebookRequestError, String str) {
        super(str);
        facebookRequestError.getClass();
        this.f11366b = facebookRequestError;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("{FacebookServiceException: httpResponseCode: ");
        FacebookRequestError facebookRequestError = this.f11366b;
        sb.append(facebookRequestError.f11357a);
        sb.append(", facebookErrorCode: ");
        sb.append(facebookRequestError.f11358b);
        sb.append(", facebookErrorType: ");
        sb.append(facebookRequestError.f11360d);
        sb.append(", message: ");
        sb.append(facebookRequestError.m5184a());
        sb.append("}");
        return sb.toString();
    }
}
