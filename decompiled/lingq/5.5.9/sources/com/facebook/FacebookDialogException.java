package com.facebook;

import dm.C5207g;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/facebook/FacebookDialogException;", "Lcom/facebook/FacebookException;", "facebook-common_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public final class FacebookDialogException extends FacebookException {

    /* JADX INFO: renamed from: b */
    public final int f11433b;

    /* JADX INFO: renamed from: c */
    public final String f11434c;

    public FacebookDialogException(String str, int i10, String str2) {
        super(str);
        this.f11433b = i10;
        this.f11434c = str2;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        String str = "{FacebookDialogException: errorCode: " + this.f11433b + ", message: " + getMessage() + ", url: " + this.f11434c + "}";
        C5207g.m11110e(str, "StringBuilder()\n        .append(\"{FacebookDialogException: \")\n        .append(\"errorCode: \")\n        .append(errorCode)\n        .append(\", message: \")\n        .append(message)\n        .append(\", url: \")\n        .append(failingUrl)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
