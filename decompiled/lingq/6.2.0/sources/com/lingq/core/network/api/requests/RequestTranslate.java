package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class RequestTranslate {
    public static final C1613z0 Companion = new C1613z0();

    /* JADX INFO: renamed from: a */
    public final String f20458a;

    /* JADX INFO: renamed from: b */
    public final String f20459b;

    /* JADX INFO: renamed from: c */
    public final String f20460c;

    /* JADX INFO: renamed from: d */
    public final String f20461d;

    public /* synthetic */ RequestTranslate(int i, String str, String str2, String str3, String str4) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, RequestTranslate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20458a = str;
        this.f20459b = str2;
        this.f20460c = str3;
        if ((i & 8) == 0) {
            this.f20461d = null;
        } else {
            this.f20461d = str4;
        }
    }

    public RequestTranslate(String str, String str2, String str3, String str4) {
        ux5.m22974A(str, str2, str3);
        this.f20458a = str;
        this.f20459b = str2;
        this.f20460c = str3;
        this.f20461d = str4;
    }
}
