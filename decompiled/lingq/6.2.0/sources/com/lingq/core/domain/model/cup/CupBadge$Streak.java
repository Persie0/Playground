package com.lingq.core.domain.model.cup;

import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.n3c;
import p000.os1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class CupBadge$Streak implements os1 {
    public static final C1412d Companion = new C1412d();

    /* JADX INFO: renamed from: a */
    public final int f18966a;

    /* JADX INFO: renamed from: b */
    public final String f18967b;

    public /* synthetic */ CupBadge$Streak(int i, String str, int i2) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, CupBadge$Streak$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f18966a = i2;
        this.f18967b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CupBadge$Streak)) {
            return false;
        }
        CupBadge$Streak cupBadge$Streak = (CupBadge$Streak) obj;
        return this.f18966a == cupBadge$Streak.f18966a && fa4.m11650l(this.f18967b, cupBadge$Streak.f18967b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f18966a) * 31;
        String str = this.f18967b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return hn1.m13354d(this.f18966a, "Streak(tier=", ", earnedAt=", this.f18967b, ")");
    }

    public CupBadge$Streak(int i, String str) {
        this.f18966a = i;
        this.f18967b = str;
    }
}
