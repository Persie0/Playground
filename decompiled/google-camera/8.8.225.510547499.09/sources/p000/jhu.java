package p000;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class jhu implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f34092a;

    public jhu(IBinder iBinder) {
        this.f34092a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f34092a;
    }
}
