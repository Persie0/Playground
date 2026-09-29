package com.lingq.core.network.api.result;

import p000.ey8;
import p000.hn1;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultChatStats {
    public static final C1739u0 Companion = new C1739u0();

    /* JADX INFO: renamed from: a */
    public final int f20759a;

    /* JADX INFO: renamed from: b */
    public final int f20760b;

    /* JADX INFO: renamed from: c */
    public final int f20761c;

    /* JADX INFO: renamed from: d */
    public final int f20762d;

    /* JADX INFO: renamed from: e */
    public final int f20763e;

    /* JADX INFO: renamed from: f */
    public final double f20764f;

    public /* synthetic */ ResultChatStats(int i, int i2, int i3, int i4, int i5, int i6, double d) {
        if ((i & 1) == 0) {
            this.f20759a = 0;
        } else {
            this.f20759a = i2;
        }
        if ((i & 2) == 0) {
            this.f20760b = 0;
        } else {
            this.f20760b = i3;
        }
        if ((i & 4) == 0) {
            this.f20761c = 0;
        } else {
            this.f20761c = i4;
        }
        if ((i & 8) == 0) {
            this.f20762d = 0;
        } else {
            this.f20762d = i5;
        }
        if ((i & 16) == 0) {
            this.f20763e = 0;
        } else {
            this.f20763e = i6;
        }
        if ((i & 32) == 0) {
            this.f20764f = 0.0d;
        } else {
            this.f20764f = d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultChatStats)) {
            return false;
        }
        ResultChatStats resultChatStats = (ResultChatStats) obj;
        return this.f20759a == resultChatStats.f20759a && this.f20760b == resultChatStats.f20760b && this.f20761c == resultChatStats.f20761c && this.f20762d == resultChatStats.f20762d && this.f20763e == resultChatStats.f20763e && Double.compare(this.f20764f, resultChatStats.f20764f) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f20764f) + wq1.m24106b(this.f20763e, wq1.m24106b(this.f20762d, wq1.m24106b(this.f20761c, wq1.m24106b(this.f20760b, Integer.hashCode(this.f20759a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f20759a, this.f20760b, "ResultChatStats(sentences=", ", knownWords=", ", totalWords=");
        hn1.m13360j(this.f20761c, this.f20762d, ", uniqueWords=", ", cards=", sbM22994q);
        sbM22994q.append(this.f20763e);
        sbM22994q.append(", coins=");
        sbM22994q.append(this.f20764f);
        sbM22994q.append(")");
        return sbM22994q.toString();
    }
}
