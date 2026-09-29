package p000;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class l0c implements wrb, IInterface {

    /* JADX INFO: renamed from: f */
    public final IBinder f48877f;

    public l0c(IBinder iBinder) {
        this.f48877f = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f48877f;
    }
}
