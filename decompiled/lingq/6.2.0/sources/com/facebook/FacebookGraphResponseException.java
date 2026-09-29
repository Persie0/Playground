package com.facebook;

import p000.pp3;

/* JADX INFO: loaded from: classes2.dex */
public final class FacebookGraphResponseException extends FacebookException {

    /* JADX INFO: renamed from: b */
    public final pp3 f11355b;

    public FacebookGraphResponseException(pp3 pp3Var, String str) {
        super(str);
        this.f11355b = pp3Var;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        pp3 pp3Var = this.f11355b;
        FacebookRequestError facebookRequestError = pp3Var != null ? pp3Var.f56629c : null;
        StringBuilder sb = new StringBuilder("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (facebookRequestError != null) {
            sb.append("httpResponseCode: ");
            sb.append(facebookRequestError.f11357a);
            sb.append(", facebookErrorCode: ");
            sb.append(facebookRequestError.f11358b);
            sb.append(", facebookErrorType: ");
            sb.append(facebookRequestError.f11360d);
            sb.append(", message: ");
            sb.append(facebookRequestError.m5184a());
            sb.append("}");
        }
        return sb.toString();
    }
}
