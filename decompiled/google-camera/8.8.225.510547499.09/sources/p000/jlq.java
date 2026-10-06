package p000;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jlq implements jkx {

    /* JADX INFO: renamed from: a */
    private final msn f34329a;

    /* JADX INFO: renamed from: b */
    private final long f34330b;

    /* JADX INFO: renamed from: c */
    private final jlt f34331c;

    /* JADX INFO: renamed from: d */
    private final jls f34332d;

    public jlq(jlt jltVar, jls jlsVar, msn msnVar) {
        this.f34331c = jltVar;
        this.f34332d = jlsVar;
        this.f34329a = msnVar;
        this.f34330b = msnVar.mo15326a();
    }

    @Override // p000.jkx
    /* JADX INFO: renamed from: a */
    public final void mo13325a(int i, String str) {
        Status status = new Status(i, str);
        long jMo15326a = this.f34329a.mo15326a() - this.f34330b;
        try {
            jls jlsVar = this.f34332d;
            Parcel parcelM3398a = jlsVar.m3398a();
            cbs.m3404c(parcelM3398a, status);
            parcelM3398a.writeLong(jMo15326a);
            jlsVar.m3400z(3, parcelM3398a);
        } catch (RemoteException e) {
            Log.w("brella.ExampleStoreSvc", "onIteratorNextFailure AIDL call failed, closing iterator", e);
            this.f34331c.m13343b();
        }
    }

    @Override // p000.jkx
    /* JADX INFO: renamed from: b */
    public final void mo13326b(byte[] bArr, byte[] bArr2) {
        long jMo15326a = this.f34329a.mo15326a() - this.f34330b;
        try {
            jls jlsVar = this.f34332d;
            jjc jjcVarM13304b = null;
            jjc jjcVarM13304b2 = bArr == null ? null : jjb.m13304b(bArr);
            if (bArr2 != null) {
                jjcVarM13304b = jjb.m13304b(bArr2);
            }
            Parcel parcelM3398a = jlsVar.m3398a();
            cbs.m3405d(parcelM3398a, jjcVarM13304b2);
            cbs.m3405d(parcelM3398a, jjcVarM13304b);
            parcelM3398a.writeLong(jMo15326a);
            jlsVar.m3400z(2, parcelM3398a);
        } catch (RemoteException e) {
            Log.w("brella.ExampleStoreSvc", "onIteratorNextSuccess AIDL call failed, closing iterator", e);
            this.f34331c.m13343b();
        }
    }
}
