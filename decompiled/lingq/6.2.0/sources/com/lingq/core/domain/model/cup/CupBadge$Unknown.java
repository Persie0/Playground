package com.lingq.core.domain.model.cup;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.os1;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class CupBadge$Unknown implements os1 {
    public static final C1413e Companion = new C1413e();

    /* JADX INFO: renamed from: a */
    public final String f18968a;

    /* JADX INFO: renamed from: b */
    public final String f18969b;

    public /* synthetic */ CupBadge$Unknown(String str, int i, String str2) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, CupBadge$Unknown$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f18968a = str;
        this.f18969b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CupBadge$Unknown)) {
            return false;
        }
        CupBadge$Unknown cupBadge$Unknown = (CupBadge$Unknown) obj;
        return fa4.m11650l(this.f18968a, cupBadge$Unknown.f18968a) && fa4.m11650l(this.f18969b, cupBadge$Unknown.f18969b);
    }

    public final int hashCode() {
        int iHashCode = this.f18968a.hashCode() * 31;
        String str = this.f18969b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ux5.m22991n("Unknown(kind=", this.f18968a, ", earnedAt=", this.f18969b, ")");
    }

    public CupBadge$Unknown(String str, String str2) {
        str.getClass();
        this.f18968a = str;
        this.f18969b = str2;
    }
}
