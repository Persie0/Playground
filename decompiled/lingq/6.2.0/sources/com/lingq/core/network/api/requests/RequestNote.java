package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class RequestNote {
    public static final C1581j0 Companion = new C1581j0();

    /* JADX INFO: renamed from: a */
    public final String f20407a;

    /* JADX INFO: renamed from: b */
    public final String f20408b;

    public /* synthetic */ RequestNote(String str, int i, String str2) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, RequestNote$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20407a = str;
        this.f20408b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestNote)) {
            return false;
        }
        RequestNote requestNote = (RequestNote) obj;
        return fa4.m11650l(this.f20407a, requestNote.f20407a) && fa4.m11650l(this.f20408b, requestNote.f20408b);
    }

    public final int hashCode() {
        return this.f20408b.hashCode() + (this.f20407a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("RequestNote(language=", this.f20407a, ", text=", this.f20408b, ")");
    }

    public RequestNote(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f20407a = str;
        this.f20408b = str2;
    }
}
