package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.qmb;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
public final class zzju extends AbstractSafeParcelable implements Comparable<zzju> {
    public static final Parcelable.Creator<zzju> CREATOR = new qmb(19);

    /* JADX INFO: renamed from: a */
    public final int f11918a;

    /* JADX INFO: renamed from: b */
    public final int f11919b;

    public zzju(int i, int i2) {
        this.f11918a = i;
        this.f11919b = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(zzju zzjuVar) {
        zzju zzjuVar2 = zzjuVar;
        int i = zzjuVar2.f11918a;
        int i2 = this.f11918a;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        int i3 = zzjuVar2.f11919b;
        int i4 = this.f11919b;
        if (i4 < i3) {
            return -1;
        }
        return i4 > i3 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
    
        r0 = (r3 = (com.google.android.gms.internal.measurement.zzju) r3).f11918a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
    
        r3 = r3.f11919b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        return (obj instanceof zzju) && (i2 = this.f11918a) >= i && i2 <= i && (i4 = this.f11919b) >= i3 && i4 <= i3;
    }

    public final int hashCode() {
        return (this.f11918a * 31) + this.f11919b;
    }

    public final String toString() {
        int i = this.f11918a;
        int length = String.valueOf(i).length();
        int i2 = this.f11919b;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(i2).length() + 1);
        wq1.m24127w(i, i2, "GenericDimension(", ", ", sb);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(this.f11918a);
        l70.m15935Z(parcel, 2, 4);
        parcel.writeInt(this.f11919b);
        l70.m15939b0(parcel, iM15937a0);
    }
}
