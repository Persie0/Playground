package com.lingq.core.domain.model.user;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class Referral {
    public static final C1511m Companion = new C1511m();

    /* JADX INFO: renamed from: a */
    public final String f19832a;

    public /* synthetic */ Referral(int i, String str) {
        if (1 == (i & 1)) {
            this.f19832a = str;
        } else {
            n3c.m17204b(i, 1, Referral$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Referral) && fa4.m11650l(this.f19832a, ((Referral) obj).f19832a);
    }

    public final int hashCode() {
        String str = this.f19832a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("Referral(photo=", this.f19832a, ")");
    }

    public Referral(String str) {
        this.f19832a = str;
    }
}
