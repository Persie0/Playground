package com.lingq.core.domain.model.cup;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cs4;
import p000.e65;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.n3c;
import p000.wf1;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class CupMyStats {
    public static final C1416h Companion = new C1416h();

    /* JADX INFO: renamed from: k */
    public static final cs4[] f18975k = {null, null, null, null, null, null, null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new wf1(2))};

    /* JADX INFO: renamed from: a */
    public final int f18976a;

    /* JADX INFO: renamed from: b */
    public final Integer f18977b;

    /* JADX INFO: renamed from: c */
    public final Integer f18978c;

    /* JADX INFO: renamed from: d */
    public final Integer f18979d;

    /* JADX INFO: renamed from: e */
    public final Integer f18980e;

    /* JADX INFO: renamed from: f */
    public final int f18981f;

    /* JADX INFO: renamed from: g */
    public final int f18982g;

    /* JADX INFO: renamed from: h */
    public final int f18983h;

    /* JADX INFO: renamed from: i */
    public final int f18984i;

    /* JADX INFO: renamed from: j */
    public final List f18985j;

    public /* synthetic */ CupMyStats(int i, int i2, Integer num, Integer num2, Integer num3, Integer num4, int i3, int i4, int i5, int i6, List list) {
        if (1023 != (i & 1023)) {
            n3c.m17204b(i, 1023, CupMyStats$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f18976a = i2;
        this.f18977b = num;
        this.f18978c = num2;
        this.f18979d = num3;
        this.f18980e = num4;
        this.f18981f = i3;
        this.f18982g = i4;
        this.f18983h = i5;
        this.f18984i = i6;
        this.f18985j = list;
    }

    /* JADX INFO: renamed from: a */
    public final Integer m8016a() {
        return this.f18978c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CupMyStats)) {
            return false;
        }
        CupMyStats cupMyStats = (CupMyStats) obj;
        return this.f18976a == cupMyStats.f18976a && fa4.m11650l(this.f18977b, cupMyStats.f18977b) && fa4.m11650l(this.f18978c, cupMyStats.f18978c) && fa4.m11650l(this.f18979d, cupMyStats.f18979d) && fa4.m11650l(this.f18980e, cupMyStats.f18980e) && this.f18981f == cupMyStats.f18981f && this.f18982g == cupMyStats.f18982g && this.f18983h == cupMyStats.f18983h && this.f18984i == cupMyStats.f18984i && fa4.m11650l(this.f18985j, cupMyStats.f18985j);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f18976a) * 31;
        Integer num = this.f18977b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f18978c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f18979d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f18980e;
        return this.f18985j.hashCode() + wq1.m24106b(this.f18984i, wq1.m24106b(this.f18983h, wq1.m24106b(this.f18982g, wq1.m24106b(this.f18981f, (iHashCode4 + (num4 != null ? num4.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CupMyStats(score=");
        sb.append(this.f18976a);
        sb.append(", globalRank=");
        sb.append(this.f18977b);
        sb.append(", teamRank=");
        e65.m10883o(sb, this.f18978c, ", teamRankPrev=", this.f18979d, ", teamRankDelta=");
        sb.append(this.f18980e);
        sb.append(", streakDays=");
        sb.append(this.f18981f);
        sb.append(", daysOpened=");
        hn1.m13360j(this.f18982g, this.f18983h, ", streakTier=", ", currentStreak=", sb);
        sb.append(this.f18984i);
        sb.append(", badges=");
        sb.append(this.f18985j);
        sb.append(")");
        return sb.toString();
    }

    public CupMyStats(int i, Integer num, Integer num2, Integer num3, Integer num4, int i2, int i3, int i4, int i5, ArrayList arrayList) {
        this.f18976a = i;
        this.f18977b = num;
        this.f18978c = num2;
        this.f18979d = num3;
        this.f18980e = num4;
        this.f18981f = i2;
        this.f18982g = i3;
        this.f18983h = i4;
        this.f18984i = i5;
        this.f18985j = arrayList;
    }
}
