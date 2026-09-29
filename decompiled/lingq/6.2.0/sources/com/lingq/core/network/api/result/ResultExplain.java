package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultExplain {
    public static final C1680k1 Companion = new C1680k1();

    /* JADX INFO: renamed from: a */
    public final String f20849a;

    /* JADX INFO: renamed from: b */
    public final String f20850b;

    /* JADX INFO: renamed from: c */
    public final String f20851c;

    public /* synthetic */ ResultExplain(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f20849a = null;
        } else {
            this.f20849a = str;
        }
        if ((i & 2) == 0) {
            this.f20850b = null;
        } else {
            this.f20850b = str2;
        }
        if ((i & 4) == 0) {
            this.f20851c = null;
        } else {
            this.f20851c = str3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8358a() {
        return this.f20851c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultExplain)) {
            return false;
        }
        ResultExplain resultExplain = (ResultExplain) obj;
        return fa4.m11650l(this.f20849a, resultExplain.f20849a) && fa4.m11650l(this.f20850b, resultExplain.f20850b) && fa4.m11650l(this.f20851c, resultExplain.f20851c);
    }

    public final int hashCode() {
        String str = this.f20849a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20850b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20851c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("ResultExplain(target=", this.f20849a, ", sentence=", this.f20850b, ", explanation="), this.f20851c, ")");
    }
}
