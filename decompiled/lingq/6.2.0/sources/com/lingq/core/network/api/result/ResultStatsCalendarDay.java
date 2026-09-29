package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultStatsCalendarDay {
    public static final C1787y3 Companion = new C1787y3();

    /* JADX INFO: renamed from: a */
    public final String f21521a;

    /* JADX INFO: renamed from: b */
    public final Double f21522b;

    public /* synthetic */ ResultStatsCalendarDay(int i, String str, Double d) {
        this.f21521a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.f21522b = null;
        } else {
            this.f21522b = d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultStatsCalendarDay)) {
            return false;
        }
        ResultStatsCalendarDay resultStatsCalendarDay = (ResultStatsCalendarDay) obj;
        return fa4.m11650l(this.f21521a, resultStatsCalendarDay.f21521a) && fa4.m11650l(this.f21522b, resultStatsCalendarDay.f21522b);
    }

    public final int hashCode() {
        int iHashCode = this.f21521a.hashCode() * 31;
        Double d = this.f21522b;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }

    public final String toString() {
        return "ResultStatsCalendarDay(date=" + this.f21521a + ", dailyGoalProgress=" + this.f21522b + ")";
    }
}
