package com.lingq.core.domain.model.user;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class Tier {
    public static final C1513o Companion = new C1513o();

    /* JADX INFO: renamed from: a */
    public final String f19855a;

    /* JADX INFO: renamed from: b */
    public final String f19856b;

    /* JADX INFO: renamed from: c */
    public final int f19857c;

    public /* synthetic */ Tier(String str, int i, int i2, String str2) {
        if (6 != (i & 6)) {
            n3c.m17204b(i, 6, Tier$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f19855a = null;
        } else {
            this.f19855a = str;
        }
        this.f19856b = str2;
        this.f19857c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tier)) {
            return false;
        }
        Tier tier = (Tier) obj;
        return fa4.m11650l(this.f19855a, tier.f19855a) && fa4.m11650l(this.f19856b, tier.f19856b) && this.f19857c == tier.f19857c;
    }

    public final int hashCode() {
        String str = this.f19855a;
        return Integer.hashCode(this.f19857c) + ux5.m22980c((str == null ? 0 : str.hashCode()) * 31, this.f19856b, 31);
    }

    public final String toString() {
        return wq1.m24123s(ux5.m23000w("Tier(code=", this.f19855a, ", title=", this.f19856b, ", level="), this.f19857c, ")");
    }

    public Tier() {
        this.f19855a = "";
        this.f19856b = "FREE";
        this.f19857c = 0;
    }
}
