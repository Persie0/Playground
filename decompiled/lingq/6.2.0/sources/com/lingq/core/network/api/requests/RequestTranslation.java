package com.lingq.core.network.api.requests;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class RequestTranslation {
    public static final C1560b1 Companion = new C1560b1();

    /* JADX INFO: renamed from: a */
    public final String f20465a;

    /* JADX INFO: renamed from: b */
    public final String f20466b;

    /* JADX INFO: renamed from: c */
    public final String f20467c;

    public /* synthetic */ RequestTranslation(String str, int i, String str2, String str3) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, RequestTranslation$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20465a = str;
        this.f20466b = str2;
        if ((i & 4) == 0) {
            this.f20467c = null;
        } else {
            this.f20467c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestTranslation)) {
            return false;
        }
        RequestTranslation requestTranslation = (RequestTranslation) obj;
        return fa4.m11650l(this.f20465a, requestTranslation.f20465a) && fa4.m11650l(this.f20466b, requestTranslation.f20466b) && fa4.m11650l(this.f20467c, requestTranslation.f20467c);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(this.f20465a.hashCode() * 31, this.f20466b, 31);
        String str = this.f20467c;
        return iM22980c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("RequestTranslation(text=", this.f20465a, ", language=", this.f20466b, ", type="), this.f20467c, ")");
    }

    public RequestTranslation(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.f20465a = str;
        this.f20466b = str2;
        this.f20467c = str3;
    }
}
