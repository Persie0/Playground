package com.lingq.core.domain.model.cup;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class CupChampion {
    public static final C1414f Companion = new C1414f();

    /* JADX INFO: renamed from: a */
    public final String f18970a;

    /* JADX INFO: renamed from: b */
    public final String f18971b;

    /* JADX INFO: renamed from: c */
    public final double f18972c;

    public /* synthetic */ CupChampion(double d, int i, String str, String str2) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, CupChampion$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f18970a = str;
        this.f18971b = str2;
        this.f18972c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CupChampion)) {
            return false;
        }
        CupChampion cupChampion = (CupChampion) obj;
        return fa4.m11650l(this.f18970a, cupChampion.f18970a) && fa4.m11650l(this.f18971b, cupChampion.f18971b) && Double.compare(this.f18972c, cupChampion.f18972c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f18972c) + ux5.m22980c(this.f18970a.hashCode() * 31, this.f18971b, 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("CupChampion(teamCode=", this.f18970a, ", name=", this.f18971b, ", coins=");
        sbM23000w.append(this.f18972c);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }

    public CupChampion(String str, String str2, double d) {
        str.getClass();
        str2.getClass();
        this.f18970a = str;
        this.f18971b = str2;
        this.f18972c = d;
    }
}
