package com.lingq.core.domain.model.cup;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class CupTeamEntry {
    public static final C1419k Companion = new C1419k();

    /* JADX INFO: renamed from: a */
    public final String f18996a;

    /* JADX INFO: renamed from: b */
    public final int f18997b;

    /* JADX INFO: renamed from: c */
    public final boolean f18998c;

    public /* synthetic */ CupTeamEntry(int i, int i2, String str, boolean z) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, CupTeamEntry$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f18996a = str;
        this.f18997b = i2;
        if ((i & 4) == 0) {
            this.f18998c = false;
        } else {
            this.f18998c = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CupTeamEntry)) {
            return false;
        }
        CupTeamEntry cupTeamEntry = (CupTeamEntry) obj;
        return fa4.m11650l(this.f18996a, cupTeamEntry.f18996a) && this.f18997b == cupTeamEntry.f18997b && this.f18998c == cupTeamEntry.f18998c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18998c) + wq1.m24106b(this.f18997b, this.f18996a.hashCode() * 31, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17740o(AbstractC3393o1.m17741p(this.f18997b, "CupTeamEntry(code=", this.f18996a, ", participants=", ", canJoinTeam="), this.f18998c, ")");
    }

    public CupTeamEntry(String str, int i, boolean z) {
        str.getClass();
        this.f18996a = str;
        this.f18997b = i;
        this.f18998c = z;
    }
}
