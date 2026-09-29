package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import p000.C3386nv;
import p000.fma;

/* JADX INFO: loaded from: classes2.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C1053a();

    /* JADX INFO: renamed from: a */
    public final Month f12874a;

    /* JADX INFO: renamed from: b */
    public final Month f12875b;

    /* JADX INFO: renamed from: c */
    public final DateValidator f12876c;

    /* JADX INFO: renamed from: d */
    public final Month f12877d;

    /* JADX INFO: renamed from: e */
    public final int f12878e;

    /* JADX INFO: renamed from: f */
    public final int f12879f;

    /* JADX INFO: renamed from: g */
    public final int f12880g;

    public interface DateValidator extends Parcelable {
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f12874a = month;
        this.f12875b = month2;
        this.f12877d = month3;
        this.f12878e = i;
        this.f12876c = dateValidator;
        if (month3 != null && month.f12899a.compareTo(month3.f12899a) > 0) {
            C3386nv.m17626m("start Month cannot be after current Month");
            throw null;
        }
        if (month3 != null && month3.f12899a.compareTo(month2.f12899a) > 0) {
            C3386nv.m17626m("current Month cannot be after end Month");
            throw null;
        }
        if (i < 0 || i > fma.m11945c(null).getMaximum(7)) {
            C3386nv.m17626m("firstDayOfWeek is not valid");
            throw null;
        }
        this.f12880g = month.m6121d(month2) + 1;
        this.f12879f = (month2.f12901c - month.f12901c) + 1;
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
        return this.f12874a.equals(calendarConstraints.f12874a) && this.f12875b.equals(calendarConstraints.f12875b) && Objects.equals(this.f12877d, calendarConstraints.f12877d) && this.f12878e == calendarConstraints.f12878e && this.f12876c.equals(calendarConstraints.f12876c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12874a, this.f12875b, this.f12877d, Integer.valueOf(this.f12878e), this.f12876c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f12874a, 0);
        parcel.writeParcelable(this.f12875b, 0);
        parcel.writeParcelable(this.f12877d, 0);
        parcel.writeParcelable(this.f12876c, 0);
        parcel.writeInt(this.f12878e);
    }
}
