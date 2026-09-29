package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g98;
import p000.hn1;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultStatsCalendar {
    public static final C1781x3 Companion = new C1781x3();

    /* JADX INFO: renamed from: d */
    public static final cs4[] f21517d = {null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new g98(5))};

    /* JADX INFO: renamed from: a */
    public int f21518a;

    /* JADX INFO: renamed from: b */
    public String f21519b;

    /* JADX INFO: renamed from: c */
    public List f21520c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultStatsCalendar)) {
            return false;
        }
        ResultStatsCalendar resultStatsCalendar = (ResultStatsCalendar) obj;
        return this.f21518a == resultStatsCalendar.f21518a && fa4.m11650l(this.f21519b, resultStatsCalendar.f21519b) && fa4.m11650l(this.f21520c, resultStatsCalendar.f21520c);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(Integer.hashCode(this.f21518a) * 31, this.f21519b, 31);
        List list = this.f21520c;
        return iM22980c + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        int i = this.f21518a;
        String str = this.f21519b;
        return hn1.m13356f(ux5.m22995r(i, "ResultStatsCalendar(dailyGoal=", ", metric=", str, ", stats="), this.f21520c, ")");
    }
}
