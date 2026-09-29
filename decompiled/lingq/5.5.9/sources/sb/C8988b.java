package sb;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: sb.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8988b implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f47172a;

    public C8988b(IBinder iBinder) {
        this.f47172a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f47172a;
    }
}
