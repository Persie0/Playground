package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p000.C3386nv;
import p000.fma;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new C1059g();

    /* JADX INFO: renamed from: a */
    public final Calendar f12899a;

    /* JADX INFO: renamed from: b */
    public final int f12900b;

    /* JADX INFO: renamed from: c */
    public final int f12901c;

    /* JADX INFO: renamed from: d */
    public final int f12902d;

    /* JADX INFO: renamed from: e */
    public final int f12903e;

    /* JADX INFO: renamed from: f */
    public final long f12904f;

    /* JADX INFO: renamed from: g */
    public String f12905g;

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM11943a = fma.m11943a(calendar);
        this.f12899a = calendarM11943a;
        this.f12900b = calendarM11943a.get(2);
        this.f12901c = calendarM11943a.get(1);
        this.f12902d = calendarM11943a.getMaximum(7);
        this.f12903e = calendarM11943a.getActualMaximum(5);
        this.f12904f = calendarM11943a.getTimeInMillis();
    }

    /* JADX INFO: renamed from: a */
    public static Month m6118a(int i, int i2) {
        Calendar calendarM11945c = fma.m11945c(null);
        calendarM11945c.set(1, i);
        calendarM11945c.set(2, i2);
        return new Month(calendarM11945c);
    }

    /* JADX INFO: renamed from: b */
    public static Month m6119b(long j) {
        Calendar calendarM11945c = fma.m11945c(null);
        calendarM11945c.setTimeInMillis(j);
        return new Month(calendarM11945c);
    }

    /* JADX INFO: renamed from: c */
    public final String m6120c() {
        if (this.f12905g == null) {
            long timeInMillis = this.f12899a.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = fma.f39313a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f12905g = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f12905g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Month month) {
        return this.f12899a.compareTo(month.f12899a);
    }

    /* JADX INFO: renamed from: d */
    public final int m6121d(Month month) {
        if (this.f12899a instanceof GregorianCalendar) {
            return (month.f12900b - this.f12900b) + ((month.f12901c - this.f12901c) * 12);
        }
        C3386nv.m17626m("Only Gregorian calendars are supported.");
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f12900b == month.f12900b && this.f12901c == month.f12901c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12900b), Integer.valueOf(this.f12901c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12901c);
        parcel.writeInt(this.f12900b);
    }
}
