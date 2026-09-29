package com.facebook;

import dm.C5207g;
import kotlin.Metadata;
import p291o7.C8010t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/facebook/FacebookGraphResponseException;", "Lcom/facebook/FacebookException;", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public final class FacebookGraphResponseException extends FacebookException {

    /* JADX INFO: renamed from: b */
    public final C8010t f11436b;

    public FacebookGraphResponseException(C8010t c8010t, String str) {
        super(str);
        this.f11436b = c8010t;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        C8010t c8010t = this.f11436b;
        FacebookRequestError facebookRequestError = c8010t == null ? null : c8010t.f43588c;
        StringBuilder sb2 = new StringBuilder("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb2.append(message);
            sb2.append(" ");
        }
        if (facebookRequestError != null) {
            sb2.append("httpResponseCode: ");
            sb2.append(facebookRequestError.f11438a);
            sb2.append(", facebookErrorCode: ");
            sb2.append(facebookRequestError.f11439b);
            sb2.append(", facebookErrorType: ");
            sb2.append(facebookRequestError.f11441d);
            sb2.append(", message: ");
            sb2.append(facebookRequestError.m6602a());
            sb2.append("}");
        }
        String string = sb2.toString();
        C5207g.m11110e(string, "errorStringBuilder.toString()");
        return string;
    }
}
