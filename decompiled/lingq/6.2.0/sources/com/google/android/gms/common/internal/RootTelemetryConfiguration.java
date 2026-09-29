package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new y3a(24);

    /* JADX INFO: renamed from: a */
    public final int f11721a;

    /* JADX INFO: renamed from: b */
    public final boolean f11722b;

    /* JADX INFO: renamed from: c */
    public final boolean f11723c;

    /* JADX INFO: renamed from: d */
    public final int f11724d;

    /* JADX INFO: renamed from: e */
    public final int f11725e;

    public RootTelemetryConfiguration(int i, boolean z, boolean z2, int i2, int i3) {
        this.f11721a = i;
        this.f11722b = z;
        this.f11723c = z2;
        this.f11724d = i2;
        this.f11725e = i3;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m5288r() {
        return this.f11722b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(this.f11721a);
        l70.m15935Z(parcel, 2, 4);
        parcel.writeInt(this.f11722b ? 1 : 0);
        l70.m15935Z(parcel, 3, 4);
        parcel.writeInt(this.f11723c ? 1 : 0);
        l70.m15935Z(parcel, 4, 4);
        parcel.writeInt(this.f11724d);
        l70.m15935Z(parcel, 5, 4);
        parcel.writeInt(this.f11725e);
        l70.m15939b0(parcel, iM15937a0);
    }
}
