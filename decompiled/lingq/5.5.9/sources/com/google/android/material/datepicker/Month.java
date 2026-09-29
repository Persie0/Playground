package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new C2996a();

    /* JADX INFO: renamed from: a */
    public final Calendar f15130a;

    /* JADX INFO: renamed from: b */
    public final int f15131b;

    /* JADX INFO: renamed from: c */
    public final int f15132c;

    /* JADX INFO: renamed from: d */
    public final int f15133d;

    /* JADX INFO: renamed from: e */
    public final int f15134e;

    /* JADX INFO: renamed from: f */
    public final long f15135f;

    /* JADX INFO: renamed from: g */
    public String f15136g;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.Month$a */
    public class C2996a implements Parcelable.Creator<Month> {
        @Override // android.os.Parcelable.Creator
        public final Month createFromParcel(Parcel parcel) {
            return Month.m8735a(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Month[] newArray(int i10) {
            return new Month[i10];
        }
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM8754c = C3024z.m8754c(calendar);
        this.f15130a = calendarM8754c;
        this.f15131b = calendarM8754c.get(2);
        this.f15132c = calendarM8754c.get(1);
        this.f15133d = calendarM8754c.getMaximum(7);
        this.f15134e = calendarM8754c.getActualMaximum(5);
        this.f15135f = calendarM8754c.getTimeInMillis();
    }

    /* JADX INFO: renamed from: a */
    public static Month m8735a(int i10, int i11) {
        Calendar calendarM8756e = C3024z.m8756e(null);
        calendarM8756e.set(1, i10);
        calendarM8756e.set(2, i11);
        return new Month(calendarM8756e);
    }

    /* JADX INFO: renamed from: l */
    public static Month m8736l(long j10) {
        Calendar calendarM8756e = C3024z.m8756e(null);
        calendarM8756e.setTimeInMillis(j10);
        return new Month(calendarM8756e);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Month month) {
        return this.f15130a.compareTo(month.f15130a);
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
        return this.f15131b == month.f15131b && this.f15132c == month.f15132c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15131b), Integer.valueOf(this.f15132c)});
    }

    /* JADX INFO: renamed from: q */
    public final String m8737q() {
        if (this.f15136g == null) {
            this.f15136g = C3024z.m8753b("yMMMM", Locale.getDefault()).format(new Date(this.f15130a.getTimeInMillis()));
        }
        return this.f15136g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f15132c);
        parcel.writeInt(this.f15131b);
    }
}
