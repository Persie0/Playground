package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;
import p446w2.C9804b;

/* JADX INFO: loaded from: classes.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C2989a();

    /* JADX INFO: renamed from: a */
    public final Month f15096a;

    /* JADX INFO: renamed from: b */
    public final Month f15097b;

    /* JADX INFO: renamed from: c */
    public final DateValidator f15098c;

    /* JADX INFO: renamed from: d */
    public final Month f15099d;

    /* JADX INFO: renamed from: e */
    public final int f15100e;

    /* JADX INFO: renamed from: f */
    public final int f15101f;

    /* JADX INFO: renamed from: g */
    public final int f15102g;

    public interface DateValidator extends Parcelable {
        /* JADX INFO: renamed from: Y */
        boolean mo8719Y(long j10);
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.CalendarConstraints$a */
    public class C2989a implements Parcelable.Creator<CalendarConstraints> {
        @Override // android.os.Parcelable.Creator
        public final CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CalendarConstraints[] newArray(int i10) {
            return new CalendarConstraints[i10];
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.CalendarConstraints$b */
    public static final class C2990b {

        /* JADX INFO: renamed from: f */
        public static final long f15103f = C3024z.m8752a(Month.m8735a(1900, 0).f15135f);

        /* JADX INFO: renamed from: g */
        public static final long f15104g = C3024z.m8752a(Month.m8735a(2100, 11).f15135f);

        /* JADX INFO: renamed from: a */
        public final long f15105a;

        /* JADX INFO: renamed from: b */
        public final long f15106b;

        /* JADX INFO: renamed from: c */
        public Long f15107c;

        /* JADX INFO: renamed from: d */
        public final int f15108d;

        /* JADX INFO: renamed from: e */
        public final DateValidator f15109e;

        public C2990b(CalendarConstraints calendarConstraints) {
            this.f15105a = f15103f;
            this.f15106b = f15104g;
            this.f15109e = new DateValidatorPointForward(Long.MIN_VALUE);
            this.f15105a = calendarConstraints.f15096a.f15135f;
            this.f15106b = calendarConstraints.f15097b.f15135f;
            this.f15107c = Long.valueOf(calendarConstraints.f15099d.f15135f);
            this.f15108d = calendarConstraints.f15100e;
            this.f15109e = calendarConstraints.f15098c;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i10) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f15096a = month;
        this.f15097b = month2;
        this.f15099d = month3;
        this.f15100e = i10;
        this.f15098c = dateValidator;
        Calendar calendar = month.f15130a;
        if (month3 != null && calendar.compareTo(month3.f15130a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.f15130a.compareTo(month2.f15130a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > C3024z.m8756e(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        if (!(calendar instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        int i11 = month2.f15132c;
        int i12 = month.f15132c;
        this.f15102g = (month2.f15131b - month.f15131b) + ((i11 - i12) * 12) + 1;
        this.f15101f = (i11 - i12) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f15096a.equals(calendarConstraints.f15096a) && this.f15097b.equals(calendarConstraints.f15097b) && C9804b.m18286a(this.f15099d, calendarConstraints.f15099d) && this.f15100e == calendarConstraints.f15100e && this.f15098c.equals(calendarConstraints.f15098c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15096a, this.f15097b, this.f15099d, Integer.valueOf(this.f15100e), this.f15098c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f15096a, 0);
        parcel.writeParcelable(this.f15097b, 0);
        parcel.writeParcelable(this.f15099d, 0);
        parcel.writeParcelable(this.f15098c, 0);
        parcel.writeInt(this.f15100e);
    }
}
