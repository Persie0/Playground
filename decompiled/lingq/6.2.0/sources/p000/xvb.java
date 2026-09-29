package p000;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class xvb implements c4c, IInterface {

    /* JADX INFO: renamed from: f */
    public final IBinder f68859f;

    public xvb(IBinder iBinder) {
        this.f68859f = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f68859f;
    }
}
