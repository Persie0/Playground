package com.lingq.core.network.api.result.worldcup;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.e65;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.wq1;
import p000.x88;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultCupMy {
    public static final C1767l Companion = new C1767l();

    /* JADX INFO: renamed from: k */
    public static final cs4[] f21780k = {null, null, null, null, null, null, null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new x88(1))};

    /* JADX INFO: renamed from: a */
    public final int f21781a;

    /* JADX INFO: renamed from: b */
    public final Integer f21782b;

    /* JADX INFO: renamed from: c */
    public final Integer f21783c;

    /* JADX INFO: renamed from: d */
    public final Integer f21784d;

    /* JADX INFO: renamed from: e */
    public final Integer f21785e;

    /* JADX INFO: renamed from: f */
    public final int f21786f;

    /* JADX INFO: renamed from: g */
    public final int f21787g;

    /* JADX INFO: renamed from: h */
    public final int f21788h;

    /* JADX INFO: renamed from: i */
    public final int f21789i;

    /* JADX INFO: renamed from: j */
    public final List f21790j;

    public /* synthetic */ ResultCupMy(int i, int i2, Integer num, Integer num2, Integer num3, Integer num4, int i3, int i4, int i5, int i6, List list) {
        if ((i & 1) == 0) {
            this.f21781a = 0;
        } else {
            this.f21781a = i2;
        }
        if ((i & 2) == 0) {
            this.f21782b = null;
        } else {
            this.f21782b = num;
        }
        if ((i & 4) == 0) {
            this.f21783c = null;
        } else {
            this.f21783c = num2;
        }
        if ((i & 8) == 0) {
            this.f21784d = null;
        } else {
            this.f21784d = num3;
        }
        if ((i & 16) == 0) {
            this.f21785e = null;
        } else {
            this.f21785e = num4;
        }
        if ((i & 32) == 0) {
            this.f21786f = 0;
        } else {
            this.f21786f = i3;
        }
        if ((i & 64) == 0) {
            this.f21787g = 0;
        } else {
            this.f21787g = i4;
        }
        if ((i & 128) == 0) {
            this.f21788h = 0;
        } else {
            this.f21788h = i5;
        }
        if ((i & 256) == 0) {
            this.f21789i = 0;
        } else {
            this.f21789i = i6;
        }
        if ((i & 512) == 0) {
            this.f21790j = EmptyList.f47638a;
        } else {
            this.f21790j = list;
        }
    }

    /* JADX INFO: renamed from: a */
    public final List m8419a() {
        return this.f21790j;
    }

    /* JADX INFO: renamed from: b */
    public final int m8420b() {
        return this.f21789i;
    }

    /* JADX INFO: renamed from: c */
    public final int m8421c() {
        return this.f21787g;
    }

    /* JADX INFO: renamed from: d */
    public final Integer m8422d() {
        return this.f21782b;
    }

    /* JADX INFO: renamed from: e */
    public final int m8423e() {
        return this.f21781a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCupMy)) {
            return false;
        }
        ResultCupMy resultCupMy = (ResultCupMy) obj;
        return this.f21781a == resultCupMy.f21781a && fa4.m11650l(this.f21782b, resultCupMy.f21782b) && fa4.m11650l(this.f21783c, resultCupMy.f21783c) && fa4.m11650l(this.f21784d, resultCupMy.f21784d) && fa4.m11650l(this.f21785e, resultCupMy.f21785e) && this.f21786f == resultCupMy.f21786f && this.f21787g == resultCupMy.f21787g && this.f21788h == resultCupMy.f21788h && this.f21789i == resultCupMy.f21789i && fa4.m11650l(this.f21790j, resultCupMy.f21790j);
    }

    /* JADX INFO: renamed from: f */
    public final int m8424f() {
        return this.f21786f;
    }

    /* JADX INFO: renamed from: g */
    public final int m8425g() {
        return this.f21788h;
    }

    /* JADX INFO: renamed from: h */
    public final Integer m8426h() {
        return this.f21783c;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f21781a) * 31;
        Integer num = this.f21782b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f21783c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f21784d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f21785e;
        return this.f21790j.hashCode() + wq1.m24106b(this.f21789i, wq1.m24106b(this.f21788h, wq1.m24106b(this.f21787g, wq1.m24106b(this.f21786f, (iHashCode4 + (num4 != null ? num4.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    /* JADX INFO: renamed from: i */
    public final Integer m8427i() {
        return this.f21785e;
    }

    /* JADX INFO: renamed from: j */
    public final Integer m8428j() {
        return this.f21784d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultCupMy(score=");
        sb.append(this.f21781a);
        sb.append(", globalRank=");
        sb.append(this.f21782b);
        sb.append(", teamRank=");
        e65.m10883o(sb, this.f21783c, ", teamRankPrev=", this.f21784d, ", teamRankDelta=");
        sb.append(this.f21785e);
        sb.append(", streakDays=");
        sb.append(this.f21786f);
        sb.append(", daysOpened=");
        hn1.m13360j(this.f21787g, this.f21788h, ", streakTier=", ", currentStreak=", sb);
        sb.append(this.f21789i);
        sb.append(", badges=");
        sb.append(this.f21790j);
        sb.append(")");
        return sb.toString();
    }
}
