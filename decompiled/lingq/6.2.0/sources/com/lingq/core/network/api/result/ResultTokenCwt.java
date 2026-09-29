package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultTokenCwt {
    public static final C1653f4 Companion = new C1653f4();

    /* JADX INFO: renamed from: a */
    public final String f21582a;

    /* JADX INFO: renamed from: b */
    public final String f21583b;

    /* JADX INFO: renamed from: c */
    public final String f21584c;

    /* JADX INFO: renamed from: d */
    public final String f21585d;

    /* JADX INFO: renamed from: e */
    public final String f21586e;

    public /* synthetic */ ResultTokenCwt(String str, int i, String str2, String str3, String str4, String str5) {
        if ((i & 1) == 0) {
            this.f21582a = "";
        } else {
            this.f21582a = str;
        }
        if ((i & 2) == 0) {
            this.f21583b = "";
        } else {
            this.f21583b = str2;
        }
        if ((i & 4) == 0) {
            this.f21584c = "";
        } else {
            this.f21584c = str3;
        }
        if ((i & 8) == 0) {
            this.f21585d = "";
        } else {
            this.f21585d = str4;
        }
        if ((i & 16) == 0) {
            this.f21586e = "";
        } else {
            this.f21586e = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultTokenCwt)) {
            return false;
        }
        ResultTokenCwt resultTokenCwt = (ResultTokenCwt) obj;
        return fa4.m11650l(this.f21582a, resultTokenCwt.f21582a) && fa4.m11650l(this.f21583b, resultTokenCwt.f21583b) && fa4.m11650l(this.f21584c, resultTokenCwt.f21584c) && fa4.m11650l(this.f21585d, resultTokenCwt.f21585d) && fa4.m11650l(this.f21586e, resultTokenCwt.f21586e);
    }

    public final int hashCode() {
        return this.f21586e.hashCode() + ux5.m22980c(ux5.m22980c(ux5.m22980c(this.f21582a.hashCode() * 31, this.f21583b, 31), this.f21584c, 31), this.f21585d, 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ResultTokenCwt(word=", this.f21582a, ", sentence=", this.f21583b, ", languageSrc=");
        AbstractC3393o1.m17725C(sbM23000w, this.f21584c, ", languageDst=", this.f21585d, ", translation=");
        return AbstractC3393o1.m17738m(sbM23000w, this.f21586e, ")");
    }
}
