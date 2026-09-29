package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d0 */
/* JADX INFO: loaded from: classes.dex */
public class C2625d0 implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f14142a;

    /* JADX INFO: renamed from: b */
    public final String f14143b;

    public C2625d0(IBinder iBinder, String str) {
        this.f14142a = iBinder;
        this.f14143b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f14142a;
    }

    /* JADX INFO: renamed from: h */
    public final Parcel m7743h() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f14143b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m7744h0(Parcel parcel, int i10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f14142a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
            parcel.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcel.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final Parcel m7745j(Parcel parcel, int i10) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f14142a.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } catch (Throwable th2) {
            parcel.recycle();
            throw th2;
        }
    }
}
