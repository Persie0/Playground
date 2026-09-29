package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2817r0 extends C2625d0 implements InterfaceC2843t0 {
    public C2817r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2843t0
    /* JADX INFO: renamed from: U */
    public final void mo8058U(Bundle bundle) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        C2653f0.m7799c(parcelM7743h, bundle);
        m7744h0(parcelM7743h, 1);
    }
}
