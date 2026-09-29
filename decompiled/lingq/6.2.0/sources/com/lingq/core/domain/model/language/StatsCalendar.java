package com.lingq.core.domain.model.language;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.ks8;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class StatsCalendar {
    public static final C1433m Companion = new C1433m();

    /* JADX INFO: renamed from: c */
    public static final cs4[] f19121c = {null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new ks8(12))};

    /* JADX INFO: renamed from: a */
    public final int f19122a;

    /* JADX INFO: renamed from: b */
    public final List f19123b;

    public /* synthetic */ StatsCalendar(int i, int i2, List list) {
        this.f19122a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.f19123b = EmptyList.f47638a;
        } else {
            this.f19123b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsCalendar)) {
            return false;
        }
        StatsCalendar statsCalendar = (StatsCalendar) obj;
        return this.f19122a == statsCalendar.f19122a && fa4.m11650l(this.f19123b, statsCalendar.f19123b);
    }

    public final int hashCode() {
        return this.f19123b.hashCode() + (Integer.hashCode(this.f19122a) * 31);
    }

    public final String toString() {
        return "StatsCalendar(dailyGoal=" + this.f19122a + ", stats=" + this.f19123b + ")";
    }

    public StatsCalendar(int i, List list) {
        list.getClass();
        this.f19122a = i;
        this.f19123b = list;
    }
}
