package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultTranslation {
    public static final C1671i4 Companion = new C1671i4();

    /* JADX INFO: renamed from: a */
    public final String f21604a;

    /* JADX INFO: renamed from: b */
    public final String f21605b;

    /* JADX INFO: renamed from: c */
    public final String f21606c;

    public /* synthetic */ ResultTranslation(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f21604a = "";
        } else {
            this.f21604a = str;
        }
        if ((i & 2) == 0) {
            this.f21605b = "";
        } else {
            this.f21605b = str2;
        }
        if ((i & 4) == 0) {
            this.f21606c = "";
        } else {
            this.f21606c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultTranslation)) {
            return false;
        }
        ResultTranslation resultTranslation = (ResultTranslation) obj;
        return fa4.m11650l(this.f21604a, resultTranslation.f21604a) && fa4.m11650l(this.f21605b, resultTranslation.f21605b) && fa4.m11650l(this.f21606c, resultTranslation.f21606c);
    }

    public final int hashCode() {
        return this.f21606c.hashCode() + ux5.m22980c(this.f21604a.hashCode() * 31, this.f21605b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("ResultTranslation(text=", this.f21604a, ", language=", this.f21605b, ", type="), this.f21606c, ")");
    }
}
