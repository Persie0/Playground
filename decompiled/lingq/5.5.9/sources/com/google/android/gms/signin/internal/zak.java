package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0987y;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;
import ec.C5396i;

/* JADX INFO: loaded from: classes.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new C5396i();

    /* JADX INFO: renamed from: a */
    public final int f14657a;

    /* JADX INFO: renamed from: b */
    public final ConnectionResult f14658b;

    /* JADX INFO: renamed from: c */
    public final zav f14659c;

    public zak(int i10, ConnectionResult connectionResult, zav zavVar) {
        this.f14657a = i10;
        this.f14658b = connectionResult;
        this.f14659c = zavVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3829k(parcel, 1, this.f14657a);
        C0987y.m3831m(parcel, 2, this.f14658b, i10);
        C0987y.m3831m(parcel, 3, this.f14659c, i10);
        C0987y.m3839u(parcel, iM3836r);
    }
}
