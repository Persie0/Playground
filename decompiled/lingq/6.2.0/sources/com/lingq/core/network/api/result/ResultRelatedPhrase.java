package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g98;
import p000.hn1;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultRelatedPhrase {
    public static final C1712p3 Companion = new C1712p3();

    /* JADX INFO: renamed from: d */
    public static final cs4[] f21484d = {null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new g98(1))};

    /* JADX INFO: renamed from: a */
    public String f21485a;

    /* JADX INFO: renamed from: b */
    public String f21486b;

    /* JADX INFO: renamed from: c */
    public List f21487c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultRelatedPhrase)) {
            return false;
        }
        ResultRelatedPhrase resultRelatedPhrase = (ResultRelatedPhrase) obj;
        return fa4.m11650l(this.f21485a, resultRelatedPhrase.f21485a) && fa4.m11650l(this.f21486b, resultRelatedPhrase.f21486b) && fa4.m11650l(this.f21487c, resultRelatedPhrase.f21487c);
    }

    public final int hashCode() {
        String str = this.f21485a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21486b;
        return this.f21487c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f21485a;
        String str2 = this.f21486b;
        return hn1.m13356f(ux5.m23000w("ResultRelatedPhrase(term=", str, ", normalizedTerm=", str2, ", meanings="), this.f21487c, ")");
    }
}
