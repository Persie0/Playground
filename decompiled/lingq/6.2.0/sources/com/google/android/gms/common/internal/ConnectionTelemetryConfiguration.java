package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.qmb;

/* JADX INFO: loaded from: classes2.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new qmb(21);

    /* JADX INFO: renamed from: a */
    public final RootTelemetryConfiguration f11690a;

    /* JADX INFO: renamed from: b */
    public final boolean f11691b;

    /* JADX INFO: renamed from: c */
    public final boolean f11692c;

    /* JADX INFO: renamed from: d */
    public final int[] f11693d;

    /* JADX INFO: renamed from: e */
    public final int f11694e;

    /* JADX INFO: renamed from: f */
    public final int[] f11695f;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.f11690a = rootTelemetryConfiguration;
        this.f11691b = z;
        this.f11692c = z2;
        this.f11693d = iArr;
        this.f11694e = i;
        this.f11695f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15929T(parcel, 1, this.f11690a, i);
        l70.m15935Z(parcel, 2, 4);
        parcel.writeInt(this.f11691b ? 1 : 0);
        l70.m15935Z(parcel, 3, 4);
        parcel.writeInt(this.f11692c ? 1 : 0);
        l70.m15928S(parcel, 4, this.f11693d);
        l70.m15935Z(parcel, 5, 4);
        parcel.writeInt(this.f11694e);
        l70.m15928S(parcel, 6, this.f11695f);
        l70.m15939b0(parcel, iM15937a0);
    }
}
