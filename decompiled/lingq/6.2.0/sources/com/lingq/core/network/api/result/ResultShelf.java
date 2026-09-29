package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.AbstractC3393o1;
import p000.b98;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultShelf {
    public static final C1730s3 Companion = new C1730s3();

    /* JADX INFO: renamed from: h */
    public static final cs4[] f21502h = {null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new b98(1)), null, null, null, null};

    /* JADX INFO: renamed from: a */
    public final Boolean f21503a;

    /* JADX INFO: renamed from: b */
    public final Boolean f21504b;

    /* JADX INFO: renamed from: c */
    public final List f21505c;

    /* JADX INFO: renamed from: d */
    public final String f21506d;

    /* JADX INFO: renamed from: e */
    public final int f21507e;

    /* JADX INFO: renamed from: f */
    public final String f21508f;

    /* JADX INFO: renamed from: g */
    public final String f21509g;

    public /* synthetic */ ResultShelf(int i, Boolean bool, Boolean bool2, List list, String str, int i2, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f21503a = null;
        } else {
            this.f21503a = bool;
        }
        if ((i & 2) == 0) {
            this.f21504b = null;
        } else {
            this.f21504b = bool2;
        }
        if ((i & 4) == 0) {
            this.f21505c = EmptyList.f47638a;
        } else {
            this.f21505c = list;
        }
        if ((i & 8) == 0) {
            this.f21506d = "";
        } else {
            this.f21506d = str;
        }
        if ((i & 16) == 0) {
            this.f21507e = 0;
        } else {
            this.f21507e = i2;
        }
        if ((i & 32) == 0) {
            this.f21508f = "";
        } else {
            this.f21508f = str2;
        }
        if ((i & 64) == 0) {
            this.f21509g = "";
        } else {
            this.f21509g = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultShelf)) {
            return false;
        }
        ResultShelf resultShelf = (ResultShelf) obj;
        return fa4.m11650l(this.f21503a, resultShelf.f21503a) && fa4.m11650l(this.f21504b, resultShelf.f21504b) && fa4.m11650l(this.f21505c, resultShelf.f21505c) && fa4.m11650l(this.f21506d, resultShelf.f21506d) && this.f21507e == resultShelf.f21507e && fa4.m11650l(this.f21508f, resultShelf.f21508f) && fa4.m11650l(this.f21509g, resultShelf.f21509g);
    }

    public final int hashCode() {
        Boolean bool = this.f21503a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f21504b;
        int iM22980c = ux5.m22980c(wq1.m24106b(this.f21507e, ux5.m22980c(ux5.m22979b((iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.f21505c), this.f21506d, 31), 31), this.f21508f, 31);
        String str = this.f21509g;
        return iM22980c + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultShelf(pinned=");
        sb.append(this.f21503a);
        sb.append(", pinnedHard=");
        sb.append(this.f21504b);
        sb.append(", tabs=");
        wq1.m24130z(", code=", this.f21506d, ", id=", sb, this.f21505c);
        hn1.m13361k(this.f21507e, ", title=", this.f21508f, ", oTitle=", sb);
        return AbstractC3393o1.m17738m(sb, this.f21509g, ")");
    }
}
