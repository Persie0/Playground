package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultUserLanguage {
    public static final C1749v4 Companion = new C1749v4();

    /* JADX INFO: renamed from: a */
    public final int f21661a;

    /* JADX INFO: renamed from: b */
    public final String f21662b;

    /* JADX INFO: renamed from: c */
    public final String f21663c;

    public /* synthetic */ ResultUserLanguage(String str, int i, int i2, String str2) {
        this.f21661a = (i & 1) == 0 ? 0 : i2;
        this.f21662b = (i & 2) == 0 ? "" : str;
        if ((i & 4) == 0) {
            this.f21663c = null;
        } else {
            this.f21663c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultUserLanguage)) {
            return false;
        }
        ResultUserLanguage resultUserLanguage = (ResultUserLanguage) obj;
        return this.f21661a == resultUserLanguage.f21661a && fa4.m11650l(this.f21662b, resultUserLanguage.f21662b) && fa4.m11650l(this.f21663c, resultUserLanguage.f21663c);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(Integer.hashCode(this.f21661a) * 31, this.f21662b, 31);
        String str = this.f21663c;
        return iM22980c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m22995r(this.f21661a, "ResultUserLanguage(id=", ", code=", this.f21662b, ", title="), this.f21663c, ")");
    }
}
