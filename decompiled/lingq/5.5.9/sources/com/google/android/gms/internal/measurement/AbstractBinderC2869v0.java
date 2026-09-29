package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2869v0 extends BinderC2639e0 implements InterfaceC2882w0 {
    public AbstractBinderC2869v0() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.BinderC2639e0
    /* JADX INFO: renamed from: h */
    public final boolean mo5490h(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i10 == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Bundle bundle = (Bundle) C2653f0.m7797a(parcel, Bundle.CREATOR);
            long j10 = parcel.readLong();
            C2653f0.m7798b(parcel);
            ((BinderC2805q1) this).mo8157L(j10, bundle, string, string2);
            parcel2.writeNoException();
        } else {
            if (i10 != 2) {
                return false;
            }
            int iMo8158a = ((BinderC2805q1) this).mo8158a();
            parcel2.writeNoException();
            parcel2.writeInt(iMo8158a);
        }
        return true;
    }
}
