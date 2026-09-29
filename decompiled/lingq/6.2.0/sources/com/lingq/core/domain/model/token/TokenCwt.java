package com.lingq.core.domain.model.token;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class TokenCwt {
    public static final C1490f Companion = new C1490f();

    /* JADX INFO: renamed from: a */
    public final String f19583a;

    /* JADX INFO: renamed from: b */
    public final String f19584b;

    /* JADX INFO: renamed from: c */
    public final String f19585c;

    /* JADX INFO: renamed from: d */
    public final String f19586d;

    /* JADX INFO: renamed from: e */
    public final String f19587e;

    /* JADX INFO: renamed from: f */
    public final int f19588f;

    /* JADX INFO: renamed from: g */
    public final int f19589g;

    public /* synthetic */ TokenCwt(int i, String str, String str2, String str3, String str4, String str5, int i2, int i3) {
        if ((i & 1) == 0) {
            this.f19583a = "";
        } else {
            this.f19583a = str;
        }
        if ((i & 2) == 0) {
            this.f19584b = "";
        } else {
            this.f19584b = str2;
        }
        if ((i & 4) == 0) {
            this.f19585c = "";
        } else {
            this.f19585c = str3;
        }
        if ((i & 8) == 0) {
            this.f19586d = "";
        } else {
            this.f19586d = str4;
        }
        if ((i & 16) == 0) {
            this.f19587e = "";
        } else {
            this.f19587e = str5;
        }
        if ((i & 32) == 0) {
            this.f19588f = 0;
        } else {
            this.f19588f = i2;
        }
        if ((i & 64) == 0) {
            this.f19589g = 0;
        } else {
            this.f19589g = i3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenCwt)) {
            return false;
        }
        TokenCwt tokenCwt = (TokenCwt) obj;
        return fa4.m11650l(this.f19583a, tokenCwt.f19583a) && fa4.m11650l(this.f19584b, tokenCwt.f19584b) && fa4.m11650l(this.f19585c, tokenCwt.f19585c) && fa4.m11650l(this.f19586d, tokenCwt.f19586d) && fa4.m11650l(this.f19587e, tokenCwt.f19587e) && this.f19588f == tokenCwt.f19588f && this.f19589g == tokenCwt.f19589g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19589g) + wq1.m24106b(this.f19588f, ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(this.f19583a.hashCode() * 31, this.f19584b, 31), this.f19585c, 31), this.f19586d, 31), this.f19587e, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("TokenCwt(word=", this.f19583a, ", sentence=", this.f19584b, ", languageSrc=");
        AbstractC3393o1.m17725C(sbM23000w, this.f19585c, ", languageDst=", this.f19586d, ", translation=");
        AbstractC3393o1.m17748w(this.f19588f, this.f19587e, ", sentenceIndex=", ", sentenceTokenIndex=", sbM23000w);
        return wq1.m24123s(sbM23000w, this.f19589g, ")");
    }

    public TokenCwt(int i, int i2, String str, String str2, String str3, String str4, String str5) {
        ux5.m22975B(str, str2, str3, str4, str5);
        this.f19583a = str;
        this.f19584b = str2;
        this.f19585c = str3;
        this.f19586d = str4;
        this.f19587e = str5;
        this.f19588f = i;
        this.f19589g = i2;
    }
}
