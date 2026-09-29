package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0987y;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p176ib.C6297u0;

/* JADX INFO: loaded from: classes.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new C6297u0();

    /* JADX INFO: renamed from: a */
    public final Bundle f13984a;

    /* JADX INFO: renamed from: b */
    public final Feature[] f13985b;

    /* JADX INFO: renamed from: c */
    public final int f13986c;

    /* JADX INFO: renamed from: d */
    public final ConnectionTelemetryConfiguration f13987d;

    public zzk() {
    }

    public zzk(Bundle bundle, Feature[] featureArr, int i10, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f13984a = bundle;
        this.f13985b = featureArr;
        this.f13986c = i10;
        this.f13987d = connectionTelemetryConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3827i(parcel, 1, this.f13984a);
        C0987y.m3833o(parcel, 2, this.f13985b, i10);
        C0987y.m3829k(parcel, 3, this.f13986c);
        C0987y.m3831m(parcel, 4, this.f13987d, i10);
        C0987y.m3839u(parcel, iM3836r);
    }
}
