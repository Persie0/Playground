package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2856u0 extends C2625d0 implements InterfaceC2882w0 {
    public C2856u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2882w0
    /* JADX INFO: renamed from: L */
    public final void mo8157L(long j10, Bundle bundle, String str, String str2) throws RemoteException {
        Parcel parcelM7743h = m7743h();
        parcelM7743h.writeString(str);
        parcelM7743h.writeString(str2);
        C2653f0.m7799c(parcelM7743h, bundle);
        parcelM7743h.writeLong(j10);
        m7744h0(parcelM7743h, 1);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2882w0
    /* JADX INFO: renamed from: a */
    public final int mo8158a() throws RemoteException {
        Parcel parcelM7745j = m7745j(m7743h(), 2);
        int i10 = parcelM7745j.readInt();
        parcelM7745j.recycle();
        return i10;
    }
}
