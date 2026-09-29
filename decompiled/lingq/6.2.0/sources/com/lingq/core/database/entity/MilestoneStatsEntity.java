package com.lingq.core.database.entity;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class MilestoneStatsEntity {
    public static final C1331d0 Companion = new C1331d0();

    /* JADX INFO: renamed from: a */
    public final String f17401a;

    /* JADX INFO: renamed from: b */
    public final int f17402b;

    /* JADX INFO: renamed from: c */
    public final int f17403c;

    /* JADX INFO: renamed from: d */
    public final int f17404d;

    public /* synthetic */ MilestoneStatsEntity(int i, String str, int i2, int i3, int i4) {
        if (1 != (i & 1)) {
            n3c.m17204b(i, 1, MilestoneStatsEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17401a = str;
        if ((i & 2) == 0) {
            this.f17402b = 0;
        } else {
            this.f17402b = i2;
        }
        if ((i & 4) == 0) {
            this.f17403c = 0;
        } else {
            this.f17403c = i3;
        }
        if ((i & 8) == 0) {
            this.f17404d = 0;
        } else {
            this.f17404d = i4;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m7770a() {
        return this.f17404d;
    }

    /* JADX INFO: renamed from: b */
    public final int m7771b() {
        return this.f17402b;
    }

    /* JADX INFO: renamed from: c */
    public final String m7772c() {
        return this.f17401a;
    }

    /* JADX INFO: renamed from: d */
    public final int m7773d() {
        return this.f17403c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MilestoneStatsEntity)) {
            return false;
        }
        MilestoneStatsEntity milestoneStatsEntity = (MilestoneStatsEntity) obj;
        return fa4.m11650l(this.f17401a, milestoneStatsEntity.f17401a) && this.f17402b == milestoneStatsEntity.f17402b && this.f17403c == milestoneStatsEntity.f17403c && this.f17404d == milestoneStatsEntity.f17404d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17404d) + wq1.m24106b(this.f17403c, wq1.m24106b(this.f17402b, this.f17401a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f17402b, "MilestoneStatsEntity(language=", this.f17401a, ", knownWords=", ", lingqs=");
        sbM17741p.append(this.f17403c);
        sbM17741p.append(", dailyScore=");
        sbM17741p.append(this.f17404d);
        sbM17741p.append(")");
        return sbM17741p.toString();
    }

    public MilestoneStatsEntity(String str, int i, int i2, int i3) {
        str.getClass();
        this.f17401a = str;
        this.f17402b = i;
        this.f17403c = i2;
        this.f17404d = i3;
    }
}
