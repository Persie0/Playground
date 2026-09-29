package com.lingq.core.domain.model.chat;

import p000.ey8;
import p000.hn1;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ChatStats {
    public static final C1408i Companion = new C1408i();

    /* JADX INFO: renamed from: a */
    public final int f18956a;

    /* JADX INFO: renamed from: b */
    public final int f18957b;

    /* JADX INFO: renamed from: c */
    public final int f18958c;

    /* JADX INFO: renamed from: d */
    public final int f18959d;

    /* JADX INFO: renamed from: e */
    public final int f18960e;

    /* JADX INFO: renamed from: f */
    public final double f18961f;

    public /* synthetic */ ChatStats(int i, int i2, int i3, int i4, int i5, int i6, double d) {
        if ((i & 1) == 0) {
            this.f18956a = 0;
        } else {
            this.f18956a = i2;
        }
        if ((i & 2) == 0) {
            this.f18957b = 0;
        } else {
            this.f18957b = i3;
        }
        if ((i & 4) == 0) {
            this.f18958c = 0;
        } else {
            this.f18958c = i4;
        }
        if ((i & 8) == 0) {
            this.f18959d = 0;
        } else {
            this.f18959d = i5;
        }
        if ((i & 16) == 0) {
            this.f18960e = 0;
        } else {
            this.f18960e = i6;
        }
        if ((i & 32) == 0) {
            this.f18961f = 0.0d;
        } else {
            this.f18961f = d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatStats)) {
            return false;
        }
        ChatStats chatStats = (ChatStats) obj;
        return this.f18956a == chatStats.f18956a && this.f18957b == chatStats.f18957b && this.f18958c == chatStats.f18958c && this.f18959d == chatStats.f18959d && this.f18960e == chatStats.f18960e && Double.compare(this.f18961f, chatStats.f18961f) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f18961f) + wq1.m24106b(this.f18960e, wq1.m24106b(this.f18959d, wq1.m24106b(this.f18958c, wq1.m24106b(this.f18957b, Integer.hashCode(this.f18956a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f18956a, this.f18957b, "ChatStats(sentences=", ", knownWords=", ", totalWords=");
        hn1.m13360j(this.f18958c, this.f18959d, ", uniqueWords=", ", cards=", sbM22994q);
        sbM22994q.append(this.f18960e);
        sbM22994q.append(", coins=");
        sbM22994q.append(this.f18961f);
        sbM22994q.append(")");
        return sbM22994q.toString();
    }

    public ChatStats(int i, int i2, int i3, int i4, int i5, double d) {
        this.f18956a = i;
        this.f18957b = i2;
        this.f18958c = i3;
        this.f18959d = i4;
        this.f18960e = i5;
        this.f18961f = d;
    }

    public /* synthetic */ ChatStats(double d, int i, int i2) {
        this(0, (i2 & 2) != 0 ? 0 : 45, (i2 & 4) != 0 ? 0 : 128, 0, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? 0.0d : d);
    }
}
