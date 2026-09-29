package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.material.datepicker.z */
/* JADX INFO: loaded from: classes.dex */
public final class C3024z {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference<C3023y> f15232a = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public static long m8752a(long j10) {
        Calendar calendarM8756e = m8756e(null);
        calendarM8756e.setTimeInMillis(j10);
        return m8754c(calendarM8756e).getTimeInMillis();
    }

    @TargetApi(24)
    /* JADX INFO: renamed from: b */
    public static DateFormat m8753b(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    /* JADX INFO: renamed from: c */
    public static Calendar m8754c(Calendar calendar) {
        Calendar calendarM8756e = m8756e(calendar);
        Calendar calendarM8756e2 = m8756e(null);
        calendarM8756e2.set(calendarM8756e.get(1), calendarM8756e.get(2), calendarM8756e.get(5));
        return calendarM8756e2;
    }

    /* JADX INFO: renamed from: d */
    public static Calendar m8755d() {
        C3023y c3023y = f15232a.get();
        if (c3023y == null) {
            c3023y = C3023y.f15229c;
        }
        java.util.TimeZone timeZone = c3023y.f15231b;
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = c3023y.f15230a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    /* JADX INFO: renamed from: e */
    public static Calendar m8756e(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
