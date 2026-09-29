package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.os.ResultReceiver;

/* JADX INFO: loaded from: classes2.dex */
public final class f98 extends Binder implements gy3 {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f38687g = 0;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ResultReceiver f38688f;

    public f98(ResultReceiver resultReceiver) {
        this.f38688f = resultReceiver;
        attachInterface(this, gy3.f41521e);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = gy3.f41521e;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        this.f38688f.mo628a(parcel.readInt(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
        return true;
    }
}
