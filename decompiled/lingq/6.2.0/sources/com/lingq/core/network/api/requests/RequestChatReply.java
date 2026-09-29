package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class RequestChatReply {
    public static final C1582k Companion = new C1582k();

    /* JADX INFO: renamed from: a */
    public final String f20334a;

    /* JADX INFO: renamed from: b */
    public final String f20335b;

    public /* synthetic */ RequestChatReply(String str, int i, String str2) {
        if (1 != (i & 1)) {
            n3c.m17204b(i, 1, RequestChatReply$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20334a = str;
        if ((i & 2) == 0) {
            this.f20335b = null;
        } else {
            this.f20335b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestChatReply)) {
            return false;
        }
        RequestChatReply requestChatReply = (RequestChatReply) obj;
        return fa4.m11650l(this.f20334a, requestChatReply.f20334a) && fa4.m11650l(this.f20335b, requestChatReply.f20335b);
    }

    public final int hashCode() {
        int iHashCode = this.f20334a.hashCode() * 31;
        String str = this.f20335b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ux5.m22991n("RequestChatReply(message=", this.f20334a, ", mode=", this.f20335b, ")");
    }

    public RequestChatReply(String str, String str2) {
        str.getClass();
        this.f20334a = str;
        this.f20335b = str2;
    }
}
