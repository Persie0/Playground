package com.lingq.core.network.api.result;

import java.util.List;
import java.util.Map;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.e65;
import p000.ey8;
import p000.fa4;
import p000.wq1;
import p000.x88;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultFastSearch {
    public static final C1686l1 Companion = new C1686l1();

    /* JADX INFO: renamed from: g */
    public static final cs4[] f20852g;

    /* JADX INFO: renamed from: a */
    public final List f20853a;

    /* JADX INFO: renamed from: b */
    public final int f20854b;

    /* JADX INFO: renamed from: c */
    public final Map f20855c;

    /* JADX INFO: renamed from: d */
    public final int f20856d;

    /* JADX INFO: renamed from: e */
    public final Map f20857e;

    /* JADX INFO: renamed from: f */
    public final Map f20858f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f20852g = new cs4[]{AbstractC3192a.m15357b(lazyThreadSafetyMode, new x88(7)), null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new x88(8)), null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new x88(9)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new x88(10))};
    }

    public /* synthetic */ ResultFastSearch(int i, List list, int i2, Map map, int i3, Map map2, Map map3) {
        this.f20853a = (i & 1) == 0 ? EmptyList.f47638a : list;
        if ((i & 2) == 0) {
            this.f20854b = 0;
        } else {
            this.f20854b = i2;
        }
        if ((i & 4) == 0) {
            this.f20855c = AbstractC3194a.m15360M();
        } else {
            this.f20855c = map;
        }
        if ((i & 8) == 0) {
            this.f20856d = 0;
        } else {
            this.f20856d = i3;
        }
        if ((i & 16) == 0) {
            this.f20857e = AbstractC3194a.m15360M();
        } else {
            this.f20857e = map2;
        }
        if ((i & 32) == 0) {
            this.f20858f = AbstractC3194a.m15360M();
        } else {
            this.f20858f = map3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultFastSearch)) {
            return false;
        }
        ResultFastSearch resultFastSearch = (ResultFastSearch) obj;
        return fa4.m11650l(this.f20853a, resultFastSearch.f20853a) && this.f20854b == resultFastSearch.f20854b && fa4.m11650l(this.f20855c, resultFastSearch.f20855c) && this.f20856d == resultFastSearch.f20856d && fa4.m11650l(this.f20857e, resultFastSearch.f20857e) && fa4.m11650l(this.f20858f, resultFastSearch.f20858f);
    }

    public final int hashCode() {
        return this.f20858f.hashCode() + e65.m10869a(wq1.m24106b(this.f20856d, e65.m10869a(wq1.m24106b(this.f20854b, this.f20853a.hashCode() * 31, 31), 31, this.f20855c), 31), 31, this.f20857e);
    }

    public final String toString() {
        return "ResultFastSearch(results=" + this.f20853a + ", total=" + this.f20854b + ", totalAccents=" + this.f20855c + ", totalNative=" + this.f20856d + ", totalShelves=" + this.f20857e + ", totalTypes=" + this.f20858f + ")";
    }
}
