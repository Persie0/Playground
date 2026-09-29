package com.lingq.core.domain.model.milestones;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class DailyGoalMet {
    public static final C1473b Companion = new C1473b();

    /* JADX INFO: renamed from: a */
    public final String f19514a;

    /* JADX INFO: renamed from: b */
    public final int f19515b;

    /* JADX INFO: renamed from: c */
    public final int f19516c;

    /* JADX INFO: renamed from: d */
    public final int f19517d;

    /* JADX INFO: renamed from: e */
    public final boolean f19518e;

    /* JADX INFO: renamed from: f */
    public final String f19519f;

    /* JADX INFO: renamed from: g */
    public final int f19520g;

    public /* synthetic */ DailyGoalMet(int i, String str, int i2, int i3, int i4, boolean z, String str2, int i5) {
        if (63 != (i & 63)) {
            n3c.m17204b(i, 63, DailyGoalMet$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19514a = str;
        this.f19515b = i2;
        this.f19516c = i3;
        this.f19517d = i4;
        this.f19518e = z;
        this.f19519f = str2;
        if ((i & 64) == 0) {
            this.f19520g = -1;
        } else {
            this.f19520g = i5;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8097a() {
        return this.f19519f;
    }

    /* JADX INFO: renamed from: b */
    public final int m8098b() {
        return this.f19520g;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8099c() {
        return this.f19518e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailyGoalMet)) {
            return false;
        }
        DailyGoalMet dailyGoalMet = (DailyGoalMet) obj;
        return fa4.m11650l(this.f19514a, dailyGoalMet.f19514a) && this.f19515b == dailyGoalMet.f19515b && this.f19516c == dailyGoalMet.f19516c && this.f19517d == dailyGoalMet.f19517d && this.f19518e == dailyGoalMet.f19518e && fa4.m11650l(this.f19519f, dailyGoalMet.f19519f) && this.f19520g == dailyGoalMet.f19520g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19520g) + ux5.m22980c(g9a.m12428e(wq1.m24106b(this.f19517d, wq1.m24106b(this.f19516c, wq1.m24106b(this.f19515b, this.f19514a.hashCode() * 31, 31), 31), 31), 31, this.f19518e), this.f19519f, 31);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f19515b, "DailyGoalMet(date=", this.f19514a, ", met=", ", goal=");
        hn1.m13360j(this.f19516c, this.f19517d, ", activityId=", ", isDouble=", sbM17741p);
        hn1.m13367q(", slug=", this.f19519f, ", streak=", sbM17741p, this.f19518e);
        return wq1.m24123s(sbM17741p, this.f19520g, ")");
    }

    public DailyGoalMet(String str, int i, int i2, int i3, boolean z, String str2, int i4) {
        str.getClass();
        str2.getClass();
        this.f19514a = str;
        this.f19515b = i;
        this.f19516c = i2;
        this.f19517d = i3;
        this.f19518e = z;
        this.f19519f = str2;
        this.f19520g = i4;
    }
}
