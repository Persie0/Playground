package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p000.jij;
import p000.jiy;
import p000.jny;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AppTheme extends jij implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new jny(17);

    /* JADX INFO: renamed from: a */
    private final int f7768a;

    /* JADX INFO: renamed from: b */
    private final int f7769b;

    /* JADX INFO: renamed from: c */
    private final int f7770c;

    /* JADX INFO: renamed from: d */
    private final int f7771d;

    public AppTheme() {
        this.f7768a = 0;
        this.f7769b = 0;
        this.f7770c = 0;
        this.f7771d = 0;
    }

    public AppTheme(int i, int i2, int i3, int i4) {
        this.f7768a = i;
        this.f7769b = i2;
        this.f7770c = i3;
        this.f7771d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppTheme)) {
            return false;
        }
        AppTheme appTheme = (AppTheme) obj;
        return this.f7769b == appTheme.f7769b && this.f7768a == appTheme.f7768a && this.f7770c == appTheme.f7770c && this.f7771d == appTheme.f7771d;
    }

    public final int hashCode() {
        return (((((this.f7769b * 31) + this.f7768a) * 31) + this.f7770c) * 31) + this.f7771d;
    }

    public final String toString() {
        return "AppTheme {dynamicColor =" + this.f7769b + ", colorTheme =" + this.f7768a + ", screenAlignment =" + this.f7770c + ", screenItemsSize =" + this.f7771d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        int i2 = this.f7768a;
        if (i2 == 0) {
            i2 = 1;
        }
        jiy.m13287n(parcel, 1, i2);
        int i3 = this.f7769b;
        if (i3 == 0) {
            i3 = 1;
        }
        jiy.m13287n(parcel, 2, i3);
        int i4 = this.f7770c;
        jiy.m13287n(parcel, 3, i4 != 0 ? i4 : 1);
        int i5 = this.f7771d;
        jiy.m13287n(parcel, 4, i5 != 0 ? i5 : 3);
        jiy.m13283j(parcel, iM13281h);
    }
}
