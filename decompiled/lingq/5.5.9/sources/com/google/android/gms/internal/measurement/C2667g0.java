package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2667g0 extends C2625d0 implements InterfaceC2695i0 {
    public C2667g0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2695i0
    /* JADX INFO: renamed from: e */
    public final Bundle mo7830e(Bundle bundle) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7799c(parcelM7743h, bundle);
        Parcel parcelM7745j = m7745j(parcelM7743h, 1);
        Bundle bundle2 = (Bundle) C2653f0.m7797a(parcelM7745j, Bundle.CREATOR);
        parcelM7745j.recycle();
        return bundle2;
    }
}
