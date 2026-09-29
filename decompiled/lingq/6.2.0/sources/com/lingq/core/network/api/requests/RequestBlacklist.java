package com.lingq.core.network.api.requests;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class RequestBlacklist {
    public static final C1558b Companion = new C1558b();

    /* JADX INFO: renamed from: a */
    public final String f20313a;

    /* JADX INFO: renamed from: b */
    public final String f20314b;

    /* JADX INFO: renamed from: c */
    public final String f20315c;

    public /* synthetic */ RequestBlacklist(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, RequestBlacklist$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20313a = str;
        this.f20314b = str2;
        this.f20315c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestBlacklist)) {
            return false;
        }
        RequestBlacklist requestBlacklist = (RequestBlacklist) obj;
        return fa4.m11650l(this.f20313a, requestBlacklist.f20313a) && fa4.m11650l(this.f20314b, requestBlacklist.f20314b) && fa4.m11650l(this.f20315c, requestBlacklist.f20315c);
    }

    public final int hashCode() {
        return this.f20315c.hashCode() + ux5.m22980c(this.f20313a.hashCode() * 31, this.f20314b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("RequestBlacklist(type=", this.f20313a, ", action=", this.f20314b, ", item="), this.f20315c, ")");
    }

    public RequestBlacklist(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.f20313a = str;
        this.f20314b = str2;
        this.f20315c = str3;
    }
}
