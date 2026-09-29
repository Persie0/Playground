package com.lingq.core.common.util;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class LqAnalyticsVariant {
    public static final C1264b Companion = new C1264b();

    /* JADX INFO: renamed from: a */
    public final int f14397a;

    /* JADX INFO: renamed from: b */
    public final String f14398b;

    /* JADX INFO: renamed from: c */
    public final boolean f14399c;

    public /* synthetic */ LqAnalyticsVariant(int i, int i2, String str, boolean z) {
        this.f14397a = (i & 1) == 0 ? -1 : i2;
        if ((i & 2) == 0) {
            this.f14398b = "not set";
        } else {
            this.f14398b = str;
        }
        if ((i & 4) == 0) {
            this.f14399c = true;
        } else {
            this.f14399c = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LqAnalyticsVariant)) {
            return false;
        }
        LqAnalyticsVariant lqAnalyticsVariant = (LqAnalyticsVariant) obj;
        return this.f14397a == lqAnalyticsVariant.f14397a && fa4.m11650l(this.f14398b, lqAnalyticsVariant.f14398b) && this.f14399c == lqAnalyticsVariant.f14399c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14399c) + ux5.m22980c(Integer.hashCode(this.f14397a) * 31, this.f14398b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17740o(ux5.m22995r(this.f14397a, "LqAnalyticsVariant(variantId=", ", variantName=", this.f14398b, ", isBaseline="), this.f14399c, ")");
    }

    public LqAnalyticsVariant(String str, int i, boolean z) {
        this.f14397a = i;
        this.f14398b = str;
        this.f14399c = z;
    }
}
