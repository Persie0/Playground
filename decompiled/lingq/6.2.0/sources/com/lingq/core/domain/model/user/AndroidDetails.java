package com.lingq.core.domain.model.user;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class AndroidDetails {
    public static final C1500b Companion = new C1500b();

    /* JADX INFO: renamed from: a */
    public final String f19630a;

    /* JADX INFO: renamed from: b */
    public final String f19631b;

    public /* synthetic */ AndroidDetails(String str, int i, String str2) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, AndroidDetails$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19630a = str;
        this.f19631b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidDetails)) {
            return false;
        }
        AndroidDetails androidDetails = (AndroidDetails) obj;
        return fa4.m11650l(this.f19630a, androidDetails.f19630a) && fa4.m11650l(this.f19631b, androidDetails.f19631b);
    }

    public final int hashCode() {
        return this.f19631b.hashCode() + (this.f19630a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("AndroidDetails(token=", this.f19630a, ", orderId=", this.f19631b, ")");
    }
}
