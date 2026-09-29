package p398tb;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: tb.a */
/* JADX INFO: loaded from: classes.dex */
public class C9242a implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f47931a;

    /* JADX INFO: renamed from: b */
    public final String f47932b;

    public C9242a(IBinder iBinder, String str) {
        this.f47931a = iBinder;
        this.f47932b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f47931a;
    }
}
