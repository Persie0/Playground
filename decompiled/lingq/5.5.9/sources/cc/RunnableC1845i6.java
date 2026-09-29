package cc;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzq;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.i6 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1845i6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f9866a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f9867b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f9868c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzq f9869d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1881m6 f9870e;

    public RunnableC1845i6(C1881m6 c1881m6, AtomicReference atomicReference, String str, String str2, zzq zzqVar) {
        this.f9870e = c1881m6;
        this.f9866a = atomicReference;
        this.f9867b = str;
        this.f9868c = str2;
        this.f9869d = zzqVar;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f9866a) {
            try {
                try {
                    C1881m6 c1881m6 = this.f9870e;
                    InterfaceC1779b3 interfaceC1779b3 = c1881m6.f10007d;
                    if (interfaceC1779b3 == null) {
                        C1860k3 c1860k3 = ((C1897o4) c1881m6.f10430a).f10086i;
                        C1897o4.m5776k(c1860k3);
                        c1860k3.f9942f.m5626d("(legacy) Failed to get conditional properties; not connected to service", null, this.f9867b, this.f9868c);
                        this.f9866a.set(Collections.emptyList());
                        this.f9866a.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        C6272i.m12915i(this.f9869d);
                        this.f9866a.set(interfaceC1779b3.mo5507l0(this.f9867b, this.f9868c, this.f9869d));
                    } else {
                        this.f9866a.set(interfaceC1779b3.mo5504O(null, this.f9867b, this.f9868c));
                    }
                    this.f9870e.m5765s();
                    atomicReference = this.f9866a;
                    atomicReference.notify();
                } catch (RemoteException e10) {
                    C1860k3 c1860k4 = ((C1897o4) this.f9870e.f10430a).f10086i;
                    C1897o4.m5776k(c1860k4);
                    c1860k4.f9942f.m5626d("(legacy) Failed to get conditional properties; remote exception", null, this.f9867b, e10);
                    this.f9866a.set(Collections.emptyList());
                    atomicReference = this.f9866a;
                }
            } catch (Throwable th2) {
                this.f9866a.notify();
                throw th2;
            }
        }
    }
}
