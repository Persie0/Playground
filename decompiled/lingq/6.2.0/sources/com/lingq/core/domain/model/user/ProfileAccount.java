package com.lingq.core.domain.model.user;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ProfileAccount {
    public static final C1507i Companion = new C1507i();

    /* JADX INFO: renamed from: a */
    public final int f19677a;

    /* JADX INFO: renamed from: b */
    public final String f19678b;

    /* JADX INFO: renamed from: c */
    public final String f19679c;

    /* JADX INFO: renamed from: d */
    public final String f19680d;

    /* JADX INFO: renamed from: e */
    public final int f19681e;

    /* JADX INFO: renamed from: f */
    public final String f19682f;

    /* JADX INFO: renamed from: g */
    public final String f19683g;

    /* JADX INFO: renamed from: h */
    public Integer f19684h;

    /* JADX INFO: renamed from: i */
    public int f19685i;

    /* JADX INFO: renamed from: j */
    public final AccountTier f19686j;

    /* JADX INFO: renamed from: k */
    public int f19687k;

    /* JADX INFO: renamed from: l */
    public final boolean f19688l;

    /* JADX INFO: renamed from: m */
    public final AccountTier f19689m;

    /* JADX INFO: renamed from: n */
    public final String f19690n;

    public /* synthetic */ ProfileAccount(int i, int i2, String str, String str2, String str3, int i3, String str4, String str5, Integer num, int i4, AccountTier accountTier, int i5, boolean z, AccountTier accountTier2, String str6) {
        if ((i & 1) == 0) {
            this.f19677a = 0;
        } else {
            this.f19677a = i2;
        }
        if ((i & 2) == 0) {
            this.f19678b = "";
        } else {
            this.f19678b = str;
        }
        if ((i & 4) == 0) {
            this.f19679c = null;
        } else {
            this.f19679c = str2;
        }
        if ((i & 8) == 0) {
            this.f19680d = "";
        } else {
            this.f19680d = str3;
        }
        if ((i & 16) == 0) {
            this.f19681e = 0;
        } else {
            this.f19681e = i3;
        }
        if ((i & 32) == 0) {
            this.f19682f = null;
        } else {
            this.f19682f = str4;
        }
        if ((i & 64) == 0) {
            this.f19683g = "";
        } else {
            this.f19683g = str5;
        }
        if ((i & 128) == 0) {
            this.f19684h = null;
        } else {
            this.f19684h = num;
        }
        if ((i & 256) == 0) {
            this.f19685i = 0;
        } else {
            this.f19685i = i4;
        }
        if ((i & 512) == 0) {
            this.f19686j = null;
        } else {
            this.f19686j = accountTier;
        }
        if ((i & 1024) == 0) {
            this.f19687k = 0;
        } else {
            this.f19687k = i5;
        }
        if ((i & 2048) == 0) {
            this.f19688l = false;
        } else {
            this.f19688l = z;
        }
        if ((i & 4096) == 0) {
            this.f19689m = null;
        } else {
            this.f19689m = accountTier2;
        }
        if ((i & 8192) == 0) {
            this.f19690n = "";
        } else {
            this.f19690n = str6;
        }
    }

    /* JADX INFO: renamed from: a */
    public final AccountTier m8138a() {
        return this.f19686j;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8139b() {
        if (this.f19684h != null) {
            return false;
        }
        AccountTier accountTier = this.f19686j;
        return !fa4.m11650l(accountTier != null ? accountTier.f19628b : null, "FREE");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileAccount)) {
            return false;
        }
        ProfileAccount profileAccount = (ProfileAccount) obj;
        return this.f19677a == profileAccount.f19677a && fa4.m11650l(this.f19678b, profileAccount.f19678b) && fa4.m11650l(this.f19679c, profileAccount.f19679c) && fa4.m11650l(this.f19680d, profileAccount.f19680d) && this.f19681e == profileAccount.f19681e && fa4.m11650l(this.f19682f, profileAccount.f19682f) && fa4.m11650l(this.f19683g, profileAccount.f19683g) && fa4.m11650l(this.f19684h, profileAccount.f19684h) && this.f19685i == profileAccount.f19685i && fa4.m11650l(this.f19686j, profileAccount.f19686j) && this.f19687k == profileAccount.f19687k && this.f19688l == profileAccount.f19688l && fa4.m11650l(this.f19689m, profileAccount.f19689m) && fa4.m11650l(this.f19690n, profileAccount.f19690n);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(Integer.hashCode(this.f19677a) * 31, this.f19678b, 31);
        String str = this.f19679c;
        int iM24106b = wq1.m24106b(this.f19681e, ux5.m22980c((iM22980c + (str == null ? 0 : str.hashCode())) * 31, this.f19680d, 31), 31);
        String str2 = this.f19682f;
        int iM22980c2 = ux5.m22980c((iM24106b + (str2 == null ? 0 : str2.hashCode())) * 31, this.f19683g, 31);
        Integer num = this.f19684h;
        int iM24106b2 = wq1.m24106b(this.f19685i, (iM22980c2 + (num == null ? 0 : num.hashCode())) * 31, 31);
        AccountTier accountTier = this.f19686j;
        int iM12428e = g9a.m12428e(wq1.m24106b(this.f19687k, (iM24106b2 + (accountTier == null ? 0 : accountTier.hashCode())) * 31, 31), 31, this.f19688l);
        AccountTier accountTier2 = this.f19689m;
        int iHashCode = (iM12428e + (accountTier2 == null ? 0 : accountTier2.hashCode())) * 31;
        String str3 = this.f19690n;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.f19684h;
        int i = this.f19685i;
        int i2 = this.f19687k;
        StringBuilder sbM22995r = ux5.m22995r(this.f19677a, "ProfileAccount(id=", ", username=", this.f19678b, ", role=");
        AbstractC3393o1.m17725C(sbM22995r, this.f19679c, ", email=", this.f19680d, ", activityIndex=");
        hn1.m13361k(this.f19681e, ", photo=", this.f19682f, ", description=", sbM22995r);
        hn1.m13371u(sbM22995r, this.f19683g, ", cardsLimit=", num, ", cardsCount=");
        sbM22995r.append(i);
        sbM22995r.append(", effectiveTier=");
        sbM22995r.append(this.f19686j);
        sbM22995r.append(", importsCount=");
        hn1.m13368r(sbM22995r, i2, ", isDowngraded=", this.f19688l, ", tier=");
        sbM22995r.append(this.f19689m);
        sbM22995r.append(", dateJoined=");
        sbM22995r.append(this.f19690n);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }

    public ProfileAccount() {
        this.f19677a = 0;
        this.f19678b = "";
        this.f19679c = null;
        this.f19680d = "";
        this.f19681e = 0;
        this.f19682f = null;
        this.f19683g = "";
        this.f19684h = null;
        this.f19685i = 0;
        this.f19686j = null;
        this.f19687k = 0;
        this.f19688l = false;
        this.f19689m = null;
        this.f19690n = "";
    }
}
