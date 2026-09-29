package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class RequestChatMessageRating {
    public static final C1578i Companion = new C1578i();

    /* JADX INFO: renamed from: a */
    public final String f20327a;

    public /* synthetic */ RequestChatMessageRating(int i, String str) {
        if (1 == (i & 1)) {
            this.f20327a = str;
        } else {
            n3c.m17204b(i, 1, RequestChatMessageRating$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RequestChatMessageRating) && fa4.m11650l(this.f20327a, ((RequestChatMessageRating) obj).f20327a);
    }

    public final int hashCode() {
        return this.f20327a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("RequestChatMessageRating(value=", this.f20327a, ")");
    }

    public RequestChatMessageRating(String str) {
        str.getClass();
        this.f20327a = str;
    }
}
