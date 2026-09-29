package p000;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class l6d implements IInterface {

    /* JADX INFO: renamed from: f */
    public final IBinder f49228f;

    public l6d(IBinder iBinder) {
        this.f49228f = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f49228f;
    }
}
