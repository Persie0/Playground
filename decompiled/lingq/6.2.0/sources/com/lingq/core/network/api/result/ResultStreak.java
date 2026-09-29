package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultStreak {
    public static final C1793z3 Companion = new C1793z3();

    /* JADX INFO: renamed from: a */
    public final int f21523a;

    /* JADX INFO: renamed from: b */
    public final double f21524b;

    /* JADX INFO: renamed from: c */
    public final int f21525c;

    /* JADX INFO: renamed from: d */
    public final boolean f21526d;

    /* JADX INFO: renamed from: e */
    public final String f21527e;

    /* JADX INFO: renamed from: f */
    public final String f21528f;

    public /* synthetic */ ResultStreak(int i, int i2, double d, int i3, boolean z, String str, String str2) {
        if ((i & 1) == 0) {
            this.f21523a = 0;
        } else {
            this.f21523a = i2;
        }
        if ((i & 2) == 0) {
            this.f21524b = 0.0d;
        } else {
            this.f21524b = d;
        }
        if ((i & 4) == 0) {
            this.f21525c = 0;
        } else {
            this.f21525c = i3;
        }
        if ((i & 8) == 0) {
            this.f21526d = false;
        } else {
            this.f21526d = z;
        }
        if ((i & 16) == 0) {
            this.f21527e = null;
        } else {
            this.f21527e = str;
        }
        if ((i & 32) == 0) {
            this.f21528f = null;
        } else {
            this.f21528f = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultStreak)) {
            return false;
        }
        ResultStreak resultStreak = (ResultStreak) obj;
        return this.f21523a == resultStreak.f21523a && Double.compare(this.f21524b, resultStreak.f21524b) == 0 && this.f21525c == resultStreak.f21525c && this.f21526d == resultStreak.f21526d && fa4.m11650l(this.f21527e, resultStreak.f21527e) && fa4.m11650l(this.f21528f, resultStreak.f21528f);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(wq1.m24106b(this.f21525c, g9a.m12424a(this.f21524b, Integer.hashCode(this.f21523a) * 31, 31), 31), 31, this.f21526d);
        String str = this.f21527e;
        int iHashCode = (iM12428e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21528f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultStreak(streakDays=");
        sb.append(this.f21523a);
        sb.append(", coins=");
        sb.append(this.f21524b);
        sb.append(", latestStreakDays=");
        sb.append(this.f21525c);
        sb.append(", isStreakBroken=");
        sb.append(this.f21526d);
        AbstractC3393o1.m17725C(sb, ", brokenStreakDate=", this.f21527e, ", error=", this.f21528f);
        sb.append(")");
        return sb.toString();
    }
}
