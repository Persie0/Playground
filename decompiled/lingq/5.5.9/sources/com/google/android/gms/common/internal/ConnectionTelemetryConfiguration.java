package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0987y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p176ib.C6299v0;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new C6299v0();

    /* JADX INFO: renamed from: a */
    public final RootTelemetryConfiguration f13931a;

    /* JADX INFO: renamed from: b */
    public final boolean f13932b;

    /* JADX INFO: renamed from: c */
    public final boolean f13933c;

    /* JADX INFO: renamed from: d */
    public final int[] f13934d;

    /* JADX INFO: renamed from: e */
    public final int f13935e;

    /* JADX INFO: renamed from: f */
    public final int[] f13936f;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f13931a = rootTelemetryConfiguration;
        this.f13932b = z10;
        this.f13933c = z11;
        this.f13934d = iArr;
        this.f13935e = i10;
        this.f13936f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3831m(parcel, 1, this.f13931a, i10);
        C0987y.m3826h(parcel, 2, this.f13932b);
        C0987y.m3826h(parcel, 3, this.f13933c);
        int[] iArr = this.f13934d;
        if (iArr != null) {
            int iM3836r2 = C0987y.m3836r(parcel, 4);
            parcel.writeIntArray(iArr);
            C0987y.m3839u(parcel, iM3836r2);
        }
        C0987y.m3829k(parcel, 5, this.f13935e);
        int[] iArr2 = this.f13936f;
        if (iArr2 != null) {
            int iM3836r3 = C0987y.m3836r(parcel, 6);
            parcel.writeIntArray(iArr2);
            C0987y.m3839u(parcel, iM3836r3);
        }
        C0987y.m3839u(parcel, iM3836r);
    }
}
