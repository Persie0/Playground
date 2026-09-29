package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultSimplified {
    public static final C1736t3 Companion = new C1736t3();

    /* JADX INFO: renamed from: a */
    public final String f21510a;

    /* JADX INFO: renamed from: b */
    public final String f21511b;

    /* JADX INFO: renamed from: c */
    public final int f21512c;

    public /* synthetic */ ResultSimplified(String str, int i, int i2, String str2) {
        if ((i & 1) == 0) {
            this.f21510a = null;
        } else {
            this.f21510a = str;
        }
        if ((i & 2) == 0) {
            this.f21511b = null;
        } else {
            this.f21511b = str2;
        }
        if ((i & 4) == 0) {
            this.f21512c = 0;
        } else {
            this.f21512c = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultSimplified)) {
            return false;
        }
        ResultSimplified resultSimplified = (ResultSimplified) obj;
        return fa4.m11650l(this.f21510a, resultSimplified.f21510a) && fa4.m11650l(this.f21511b, resultSimplified.f21511b) && this.f21512c == resultSimplified.f21512c;
    }

    public final int hashCode() {
        String str = this.f21510a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21511b;
        return Integer.hashCode(this.f21512c) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return wq1.m24123s(ux5.m23000w("ResultSimplified(status=", this.f21510a, ", isLocked=", this.f21511b, ", id="), this.f21512c, ")");
    }
}
