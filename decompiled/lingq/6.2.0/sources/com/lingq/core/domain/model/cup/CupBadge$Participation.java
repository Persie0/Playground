package com.lingq.core.domain.model.cup;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.os1;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class CupBadge$Participation implements os1 {
    public static final C1411c Companion = new C1411c();

    /* JADX INFO: renamed from: a */
    public final String f18965a;

    public /* synthetic */ CupBadge$Participation(int i, String str) {
        if (1 == (i & 1)) {
            this.f18965a = str;
        } else {
            n3c.m17204b(i, 1, CupBadge$Participation$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CupBadge$Participation) && fa4.m11650l(this.f18965a, ((CupBadge$Participation) obj).f18965a);
    }

    public final int hashCode() {
        String str = this.f18965a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("Participation(earnedAt=", this.f18965a, ")");
    }

    public CupBadge$Participation(String str) {
        this.f18965a = str;
    }
}
