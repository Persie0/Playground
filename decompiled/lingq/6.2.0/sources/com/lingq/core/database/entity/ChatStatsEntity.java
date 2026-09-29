package com.lingq.core.database.entity;

import p000.ey8;
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ChatStatsEntity {
    public static final C1334f Companion = new C1334f();

    /* JADX INFO: renamed from: a */
    public final int f17113a;

    /* JADX INFO: renamed from: b */
    public final int f17114b;

    /* JADX INFO: renamed from: c */
    public final int f17115c;

    /* JADX INFO: renamed from: d */
    public final int f17116d;

    /* JADX INFO: renamed from: e */
    public final int f17117e;

    /* JADX INFO: renamed from: f */
    public final int f17118f;

    /* JADX INFO: renamed from: g */
    public final double f17119g;

    public /* synthetic */ ChatStatsEntity(int i, int i2, int i3, int i4, int i5, int i6, int i7, double d) {
        if (127 != (i & 127)) {
            n3c.m17204b(i, 127, ChatStatsEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17113a = i2;
        this.f17114b = i3;
        this.f17115c = i4;
        this.f17116d = i5;
        this.f17117e = i6;
        this.f17118f = i7;
        this.f17119g = d;
    }

    /* JADX INFO: renamed from: a */
    public final int m7578a() {
        return this.f17118f;
    }

    /* JADX INFO: renamed from: b */
    public final double m7579b() {
        return this.f17119g;
    }

    /* JADX INFO: renamed from: c */
    public final int m7580c() {
        return this.f17113a;
    }

    /* JADX INFO: renamed from: d */
    public final int m7581d() {
        return this.f17115c;
    }

    /* JADX INFO: renamed from: e */
    public final int m7582e() {
        return this.f17114b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatStatsEntity)) {
            return false;
        }
        ChatStatsEntity chatStatsEntity = (ChatStatsEntity) obj;
        return this.f17113a == chatStatsEntity.f17113a && this.f17114b == chatStatsEntity.f17114b && this.f17115c == chatStatsEntity.f17115c && this.f17116d == chatStatsEntity.f17116d && this.f17117e == chatStatsEntity.f17117e && this.f17118f == chatStatsEntity.f17118f && Double.compare(this.f17119g, chatStatsEntity.f17119g) == 0;
    }

    /* JADX INFO: renamed from: f */
    public final int m7583f() {
        return this.f17116d;
    }

    /* JADX INFO: renamed from: g */
    public final int m7584g() {
        return this.f17117e;
    }

    public final int hashCode() {
        return Double.hashCode(this.f17119g) + wq1.m24106b(this.f17118f, wq1.m24106b(this.f17117e, wq1.m24106b(this.f17116d, wq1.m24106b(this.f17115c, wq1.m24106b(this.f17114b, Integer.hashCode(this.f17113a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f17113a, this.f17114b, "ChatStatsEntity(id=", ", sentences=", ", knownWords=");
        hn1.m13360j(this.f17115c, this.f17116d, ", totalWords=", ", uniqueWords=", sbM22994q);
        hn1.m13360j(this.f17117e, this.f17118f, ", cards=", ", coins=", sbM22994q);
        sbM22994q.append(this.f17119g);
        sbM22994q.append(")");
        return sbM22994q.toString();
    }

    public ChatStatsEntity(int i, int i2, int i3, int i4, int i5, int i6, double d) {
        this.f17113a = i;
        this.f17114b = i2;
        this.f17115c = i3;
        this.f17116d = i4;
        this.f17117e = i5;
        this.f17118f = i6;
        this.f17119g = d;
    }
}
