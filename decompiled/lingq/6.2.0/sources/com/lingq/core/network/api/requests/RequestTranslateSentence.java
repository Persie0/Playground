package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.n3c;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class RequestTranslateSentence {
    public static final C1557a1 Companion = new C1557a1();

    /* JADX INFO: renamed from: a */
    public final String f20462a;

    /* JADX INFO: renamed from: b */
    public final boolean f20463b;

    /* JADX INFO: renamed from: c */
    public final int f20464c;

    public /* synthetic */ RequestTranslateSentence(int i, int i2, String str, boolean z) {
        if (5 != (i & 5)) {
            n3c.m17204b(i, 5, RequestTranslateSentence$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20462a = str;
        if ((i & 2) == 0) {
            this.f20463b = true;
        } else {
            this.f20463b = z;
        }
        this.f20464c = i2;
    }
}
