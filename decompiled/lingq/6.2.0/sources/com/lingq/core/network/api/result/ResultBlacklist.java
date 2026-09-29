package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.ri5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultBlacklist {
    public static final C1732t Companion = new C1732t();

    /* JADX INFO: renamed from: c */
    public static final cs4[] f20615c;

    /* JADX INFO: renamed from: a */
    public final List f20616a;

    /* JADX INFO: renamed from: b */
    public final List f20617b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f20615c = new cs4[]{AbstractC3192a.m15357b(lazyThreadSafetyMode, new ri5(17)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new ri5(18))};
    }

    public /* synthetic */ ResultBlacklist(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f20616a = null;
        } else {
            this.f20616a = list;
        }
        if ((i & 2) == 0) {
            this.f20617b = null;
        } else {
            this.f20617b = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultBlacklist)) {
            return false;
        }
        ResultBlacklist resultBlacklist = (ResultBlacklist) obj;
        return fa4.m11650l(this.f20616a, resultBlacklist.f20616a) && fa4.m11650l(this.f20617b, resultBlacklist.f20617b);
    }

    public final int hashCode() {
        List list = this.f20616a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f20617b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "ResultBlacklist(courseBlacklist=" + this.f20616a + ", sourceBlacklist=" + this.f20617b + ")";
    }
}
