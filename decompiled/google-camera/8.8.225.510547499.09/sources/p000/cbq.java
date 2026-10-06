package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class cbq implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f4962a;

    /* JADX INFO: renamed from: b */
    private final String f4963b;

    protected cbq(IBinder iBinder, String str) {
        this.f4962a = iBinder;
        this.f4963b = str;
    }

    /* JADX INFO: renamed from: A */
    public final void m3397A(int i, Parcel parcel) {
        try {
            this.f4962a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: renamed from: a */
    public final Parcel m3398a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f4963b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4962a;
    }

    /* JADX INFO: renamed from: y */
    public final Parcel m3399y(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f4962a.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m3400z(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f4962a.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
