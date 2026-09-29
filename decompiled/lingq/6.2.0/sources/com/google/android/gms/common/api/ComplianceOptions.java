package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p000.l70;
import p000.qmb;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
public final class ComplianceOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ComplianceOptions> CREATOR = new qmb(5);

    /* JADX INFO: renamed from: a */
    public final int f11650a;

    /* JADX INFO: renamed from: b */
    public final int f11651b;

    /* JADX INFO: renamed from: c */
    public final int f11652c;

    /* JADX INFO: renamed from: d */
    public final boolean f11653d;

    public ComplianceOptions(int i, int i2, int i3, boolean z) {
        this.f11650a = i;
        this.f11651b = i2;
        this.f11652c = i3;
        this.f11653d = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ComplianceOptions)) {
            return false;
        }
        ComplianceOptions complianceOptions = (ComplianceOptions) obj;
        return this.f11650a == complianceOptions.f11650a && this.f11651b == complianceOptions.f11651b && this.f11652c == complianceOptions.f11652c && this.f11653d == complianceOptions.f11653d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11650a), Integer.valueOf(this.f11651b), Integer.valueOf(this.f11652c), Boolean.valueOf(this.f11653d)});
    }

    public final String toString() {
        int i = this.f11650a;
        int length = String.valueOf(i).length();
        int i2 = this.f11651b;
        int length2 = String.valueOf(i2).length();
        int i3 = this.f11652c;
        int length3 = String.valueOf(i3).length();
        boolean z = this.f11653d;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z).length() + 1);
        wq1.m24127w(i, i2, "ComplianceOptions{callerProductId=", ", dataOwnerProductId=", sb);
        sb.append(", processingReason=");
        sb.append(i3);
        sb.append(", isUserData=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(this.f11650a);
        l70.m15935Z(parcel, 2, 4);
        parcel.writeInt(this.f11651b);
        l70.m15935Z(parcel, 3, 4);
        parcel.writeInt(this.f11652c);
        l70.m15935Z(parcel, 4, 4);
        parcel.writeInt(this.f11653d ? 1 : 0);
        l70.m15939b0(parcel, iM15937a0);
    }
}
