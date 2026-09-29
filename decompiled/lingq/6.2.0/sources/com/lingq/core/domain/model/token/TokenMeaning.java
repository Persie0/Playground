package com.lingq.core.domain.model.token;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class TokenMeaning {
    public static final C1493i Companion = new C1493i();

    /* JADX INFO: renamed from: a */
    public final int f19594a;

    /* JADX INFO: renamed from: b */
    public final String f19595b;

    /* JADX INFO: renamed from: c */
    public final String f19596c;

    /* JADX INFO: renamed from: d */
    public final int f19597d;

    /* JADX INFO: renamed from: e */
    public final int f19598e;

    /* JADX INFO: renamed from: f */
    public final boolean f19599f;

    /* JADX INFO: renamed from: g */
    public final String f19600g;

    /* JADX INFO: renamed from: h */
    public final Integer f19601h;

    /* JADX INFO: renamed from: i */
    public final boolean f19602i;

    /* JADX INFO: renamed from: j */
    public final int f19603j;

    public /* synthetic */ TokenMeaning(int i, int i2, String str, String str2, int i3, int i4, boolean z, String str3, Integer num, boolean z2, int i5) {
        if ((i & 1) == 0) {
            this.f19594a = 0;
        } else {
            this.f19594a = i2;
        }
        if ((i & 2) == 0) {
            this.f19595b = null;
        } else {
            this.f19595b = str;
        }
        if ((i & 4) == 0) {
            this.f19596c = null;
        } else {
            this.f19596c = str2;
        }
        if ((i & 8) == 0) {
            this.f19597d = 0;
        } else {
            this.f19597d = i3;
        }
        if ((i & 16) == 0) {
            this.f19598e = 0;
        } else {
            this.f19598e = i4;
        }
        if ((i & 32) == 0) {
            this.f19599f = false;
        } else {
            this.f19599f = z;
        }
        if ((i & 64) == 0) {
            this.f19600g = null;
        } else {
            this.f19600g = str3;
        }
        if ((i & 128) == 0) {
            this.f19601h = null;
        } else {
            this.f19601h = num;
        }
        if ((i & 256) == 0) {
            this.f19602i = false;
        } else {
            this.f19602i = z2;
        }
        if ((i & 512) == 0) {
            this.f19603j = 0;
        } else {
            this.f19603j = i5;
        }
    }

    /* JADX INFO: renamed from: a */
    public static TokenMeaning m8127a(TokenMeaning tokenMeaning, int i, String str, String str2, int i2) {
        if ((i2 & 1) != 0) {
            i = tokenMeaning.f19594a;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            str = tokenMeaning.f19595b;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = tokenMeaning.f19596c;
        }
        int i4 = tokenMeaning.f19597d;
        int i5 = tokenMeaning.f19598e;
        boolean z = tokenMeaning.f19599f;
        String str4 = tokenMeaning.f19600g;
        Integer num = tokenMeaning.f19601h;
        boolean z2 = tokenMeaning.f19602i;
        int i6 = tokenMeaning.f19603j;
        tokenMeaning.getClass();
        return new TokenMeaning(i3, str3, str2, i4, i5, z, str4, num, z2, i6);
    }

    /* JADX INFO: renamed from: b */
    public final String m8128b() {
        return this.f19600g;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8129c() {
        return this.f19599f;
    }

    /* JADX INFO: renamed from: d */
    public final int m8130d() {
        return this.f19594a;
    }

    /* JADX INFO: renamed from: e */
    public final String m8131e() {
        return this.f19595b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenMeaning)) {
            return false;
        }
        TokenMeaning tokenMeaning = (TokenMeaning) obj;
        return this.f19594a == tokenMeaning.f19594a && fa4.m11650l(this.f19595b, tokenMeaning.f19595b) && fa4.m11650l(this.f19596c, tokenMeaning.f19596c) && this.f19597d == tokenMeaning.f19597d && this.f19598e == tokenMeaning.f19598e && this.f19599f == tokenMeaning.f19599f && fa4.m11650l(this.f19600g, tokenMeaning.f19600g) && fa4.m11650l(this.f19601h, tokenMeaning.f19601h) && this.f19602i == tokenMeaning.f19602i && this.f19603j == tokenMeaning.f19603j;
    }

    /* JADX INFO: renamed from: f */
    public final int m8132f() {
        return this.f19598e;
    }

    /* JADX INFO: renamed from: g */
    public final String m8133g() {
        return this.f19596c;
    }

    /* JADX INFO: renamed from: h */
    public final int m8134h() {
        return this.f19603j;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f19594a) * 31;
        String str = this.f19595b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19596c;
        int iM12428e = g9a.m12428e(wq1.m24106b(this.f19598e, wq1.m24106b(this.f19597d, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31, this.f19599f);
        String str3 = this.f19600g;
        int iHashCode3 = (iM12428e + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f19601h;
        return Integer.hashCode(this.f19603j) + g9a.m12428e((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f19602i);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m8135i() {
        return this.f19602i;
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f19594a, "TokenMeaning(id=", ", locale=", this.f19595b, ", text=");
        AbstractC3393o1.m17748w(this.f19597d, this.f19596c, ", termId=", ", popularity=", sbM22995r);
        hn1.m13368r(sbM22995r, this.f19598e, ", flagged=", this.f19599f, ", detectedLocale=");
        hn1.m13371u(sbM22995r, this.f19600g, ", creatorId=", this.f19601h, ", isGoogleTranslate=");
        sbM22995r.append(this.f19602i);
        sbM22995r.append(", wordId=");
        sbM22995r.append(this.f19603j);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }

    public TokenMeaning(int i, String str, String str2, int i2, int i3, boolean z, String str3, Integer num, boolean z2, int i4) {
        this.f19594a = i;
        this.f19595b = str;
        this.f19596c = str2;
        this.f19597d = i2;
        this.f19598e = i3;
        this.f19599f = z;
        this.f19600g = str3;
        this.f19601h = num;
        this.f19602i = z2;
        this.f19603j = i4;
    }

    public /* synthetic */ TokenMeaning(int i, String str, String str2, int i2, boolean z, String str3, boolean z2, int i3, int i4) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? null : str, (i4 & 4) != 0 ? null : str2, 0, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? false : z, (i4 & 64) != 0 ? null : str3, null, (i4 & 256) != 0 ? false : z2, (i4 & 512) != 0 ? 0 : i3);
    }
}
