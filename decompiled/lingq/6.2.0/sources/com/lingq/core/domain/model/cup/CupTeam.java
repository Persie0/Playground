package com.lingq.core.domain.model.cup;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class CupTeam {
    public static final C1418j Companion = new C1418j();

    /* JADX INFO: renamed from: a */
    public final int f18993a;

    /* JADX INFO: renamed from: b */
    public final String f18994b;

    /* JADX INFO: renamed from: c */
    public final String f18995c;

    public /* synthetic */ CupTeam(String str, int i, int i2, String str2) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, CupTeam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f18993a = i2;
        this.f18994b = str;
        this.f18995c = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m8021a() {
        return this.f18994b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CupTeam)) {
            return false;
        }
        CupTeam cupTeam = (CupTeam) obj;
        return this.f18993a == cupTeam.f18993a && fa4.m11650l(this.f18994b, cupTeam.f18994b) && fa4.m11650l(this.f18995c, cupTeam.f18995c);
    }

    public final int hashCode() {
        return this.f18995c.hashCode() + ux5.m22980c(Integer.hashCode(this.f18993a) * 31, this.f18994b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m22995r(this.f18993a, "CupTeam(id=", ", code=", this.f18994b, ", name="), this.f18995c, ")");
    }

    public CupTeam(String str, int i, String str2) {
        str.getClass();
        str2.getClass();
        this.f18993a = i;
        this.f18994b = str;
        this.f18995c = str2;
    }
}
