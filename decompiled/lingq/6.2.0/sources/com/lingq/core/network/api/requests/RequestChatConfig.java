package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class RequestChatConfig {
    public static final C1570f Companion = new C1570f();

    /* JADX INFO: renamed from: a */
    public final String f20324a;

    public /* synthetic */ RequestChatConfig(int i, String str) {
        if (1 == (i & 1)) {
            this.f20324a = str;
        } else {
            n3c.m17204b(i, 1, RequestChatConfig$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RequestChatConfig) && fa4.m11650l(this.f20324a, ((RequestChatConfig) obj).f20324a);
    }

    public final int hashCode() {
        return this.f20324a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("RequestChatConfig(mode=", this.f20324a, ")");
    }

    public RequestChatConfig(String str) {
        str.getClass();
        this.f20324a = str;
    }
}
