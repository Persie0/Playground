package com.google.android.material.datepicker;

import java.util.Calendar;
import p000.fma;

/* JADX INFO: renamed from: com.google.android.material.datepicker.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1054b {

    /* JADX INFO: renamed from: a */
    public Long f12906a;

    static {
        long j = Month.m6118a(1900, 0).f12904f;
        Calendar calendarM11945c = fma.m11945c(null);
        calendarM11945c.setTimeInMillis(j);
        fma.m11943a(calendarM11945c).getTimeInMillis();
        long j2 = Month.m6118a(2100, 11).f12904f;
        Calendar calendarM11945c2 = fma.m11945c(null);
        calendarM11945c2.setTimeInMillis(j2);
        fma.m11943a(calendarM11945c2).getTimeInMillis();
    }
}
