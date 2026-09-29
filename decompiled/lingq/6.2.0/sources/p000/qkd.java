package p000;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class qkd implements tkd, IInterface {

    /* JADX INFO: renamed from: f */
    public final IBinder f57887f;

    public qkd(IBinder iBinder) {
        this.f57887f = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f57887f;
    }
}
