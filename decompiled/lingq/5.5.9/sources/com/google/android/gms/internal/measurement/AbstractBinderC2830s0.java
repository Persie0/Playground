package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2830s0 extends BinderC2639e0 implements InterfaceC2843t0 {
    public AbstractBinderC2830s0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.BinderC2639e0
    /* JADX INFO: renamed from: h */
    public final boolean mo5490h(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) C2653f0.m7797a(parcel, Bundle.CREATOR);
        C2653f0.m7798b(parcel);
        ((BinderC2751m0) this).mo8058U(bundle);
        parcel2.writeNoException();
        return true;
    }
}
