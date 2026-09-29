package p000;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class yx3 implements zx3 {

    /* JADX INFO: renamed from: f */
    public IBinder f70616f;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f70616f;
    }

    @Override // p000.zx3
    /* JADX INFO: renamed from: f */
    public final void mo25371f(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(zx3.f72336c);
            parcelObtain.writeStringArray(strArr);
            this.f70616f.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
