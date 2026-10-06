package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: dt */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0141dt extends Binder implements InterfaceC0142du {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0143dv f12538a;

    public BinderC0141dt() {
        attachInterface(this, "android.support.v4.os.IResultReceiver");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.os.IResultReceiver");
        }
        switch (i) {
            case 1598968902:
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            default:
                switch (i) {
                    case 1:
                        parcel.readInt();
                        this.f12538a.mo1021a();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
        }
    }

    public BinderC0141dt(C0143dv c0143dv) {
        this.f12538a = c0143dv;
        attachInterface(this, "android.support.v4.os.IResultReceiver");
    }
}
