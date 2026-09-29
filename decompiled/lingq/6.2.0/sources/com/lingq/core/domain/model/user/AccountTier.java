package com.lingq.core.domain.model.user;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class AccountTier {
    public static final C1499a Companion = new C1499a();

    /* JADX INFO: renamed from: a */
    public final int f19627a;

    /* JADX INFO: renamed from: b */
    public final String f19628b;

    /* JADX INFO: renamed from: c */
    public final Boolean f19629c;

    public /* synthetic */ AccountTier(int i, int i2, String str, Boolean bool) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, AccountTier$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19627a = i2;
        this.f19628b = str;
        if ((i & 4) == 0) {
            this.f19629c = null;
        } else {
            this.f19629c = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountTier)) {
            return false;
        }
        AccountTier accountTier = (AccountTier) obj;
        return this.f19627a == accountTier.f19627a && fa4.m11650l(this.f19628b, accountTier.f19628b) && fa4.m11650l(this.f19629c, accountTier.f19629c);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(Integer.hashCode(this.f19627a) * 31, this.f19628b, 31);
        Boolean bool = this.f19629c;
        return iM22980c + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f19627a, "AccountTier(id=", ", title=", this.f19628b, ", lifetimePremium=");
        sbM22995r.append(this.f19629c);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }

    public AccountTier() {
        Boolean bool = Boolean.FALSE;
        this.f19627a = 1;
        this.f19628b = "FREE";
        this.f19629c = bool;
    }
}
