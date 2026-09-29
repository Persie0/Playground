package com.facebook;

import p000.AbstractC3393o1;

/* JADX INFO: loaded from: classes2.dex */
public final class FacebookDialogException extends FacebookException {

    /* JADX INFO: renamed from: b */
    public final int f11352b;

    /* JADX INFO: renamed from: c */
    public final String f11353c;

    public FacebookDialogException(String str, int i, String str2) {
        super(str);
        this.f11352b = i;
        this.f11353c = str2;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("{FacebookDialogException: errorCode: ");
        sb.append(this.f11352b);
        sb.append(", message: ");
        sb.append(getMessage());
        sb.append(", url: ");
        return AbstractC3393o1.m17738m(sb, this.f11353c, "}");
    }
}
