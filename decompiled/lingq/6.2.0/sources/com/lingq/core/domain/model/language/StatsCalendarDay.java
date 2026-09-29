package com.lingq.core.domain.model.language;

import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class StatsCalendarDay {
    public static final C1434n Companion = new C1434n();

    /* JADX INFO: renamed from: a */
    public final String f19124a;

    /* JADX INFO: renamed from: b */
    public final Double f19125b;

    public /* synthetic */ StatsCalendarDay(int i, String str, Double d) {
        this.f19124a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.f19125b = null;
        } else {
            this.f19125b = d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsCalendarDay)) {
            return false;
        }
        StatsCalendarDay statsCalendarDay = (StatsCalendarDay) obj;
        return fa4.m11650l(this.f19124a, statsCalendarDay.f19124a) && fa4.m11650l(this.f19125b, statsCalendarDay.f19125b);
    }

    public final int hashCode() {
        int iHashCode = this.f19124a.hashCode() * 31;
        Double d = this.f19125b;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }

    public final String toString() {
        return "StatsCalendarDay(date=" + this.f19124a + ", dailyGoalProgress=" + this.f19125b + ")";
    }

    public StatsCalendarDay(String str, Double d) {
        str.getClass();
        this.f19124a = str;
        this.f19125b = d;
    }
}
