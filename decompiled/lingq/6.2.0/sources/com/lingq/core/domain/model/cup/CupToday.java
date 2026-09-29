package com.lingq.core.domain.model.cup;

import p000.ey8;
import p000.fa4;
import p000.n3c;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class CupToday {
    public static final C1420l Companion = new C1420l();

    /* JADX INFO: renamed from: a */
    public final String f18999a;

    /* JADX INFO: renamed from: b */
    public final CupPrize f19000b;

    /* JADX INFO: renamed from: c */
    public final CupClaim f19001c;

    public /* synthetic */ CupToday(int i, String str, CupPrize cupPrize, CupClaim cupClaim) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, CupToday$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f18999a = str;
        this.f19000b = cupPrize;
        this.f19001c = cupClaim;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CupToday)) {
            return false;
        }
        CupToday cupToday = (CupToday) obj;
        return fa4.m11650l(this.f18999a, cupToday.f18999a) && fa4.m11650l(this.f19000b, cupToday.f19000b) && fa4.m11650l(this.f19001c, cupToday.f19001c);
    }

    public final int hashCode() {
        int iHashCode = this.f18999a.hashCode() * 31;
        CupPrize cupPrize = this.f19000b;
        int iHashCode2 = (iHashCode + (cupPrize == null ? 0 : cupPrize.hashCode())) * 31;
        CupClaim cupClaim = this.f19001c;
        return iHashCode2 + (cupClaim != null ? cupClaim.hashCode() : 0);
    }

    public final String toString() {
        return "CupToday(date=" + this.f18999a + ", prize=" + this.f19000b + ", claim=" + this.f19001c + ")";
    }

    public CupToday(String str, CupPrize cupPrize, CupClaim cupClaim) {
        str.getClass();
        this.f18999a = str;
        this.f19000b = cupPrize;
        this.f19001c = cupClaim;
    }
}
