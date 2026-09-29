package com.lingq.core.domain.model.cup;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.os1;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class CupBadge$Champion implements os1 {
    public static final C1409a Companion = new C1409a();

    /* JADX INFO: renamed from: a */
    public final String f18963a;

    /* JADX INFO: renamed from: b */
    public final String f18964b;

    public /* synthetic */ CupBadge$Champion(String str, int i, String str2) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, CupBadge$Champion$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f18963a = str;
        this.f18964b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CupBadge$Champion)) {
            return false;
        }
        CupBadge$Champion cupBadge$Champion = (CupBadge$Champion) obj;
        return fa4.m11650l(this.f18963a, cupBadge$Champion.f18963a) && fa4.m11650l(this.f18964b, cupBadge$Champion.f18964b);
    }

    public final int hashCode() {
        int iHashCode = this.f18963a.hashCode() * 31;
        String str = this.f18964b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ux5.m22991n("Champion(teamCode=", this.f18963a, ", earnedAt=", this.f18964b, ")");
    }

    public CupBadge$Champion(String str, String str2) {
        this.f18963a = str;
        this.f18964b = str2;
    }
}
