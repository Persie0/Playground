package cc;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzq;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.k6 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1863k6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f9959a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f9960b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f9961c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzq f9962d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f9963e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1881m6 f9964f;

    public RunnableC1863k6(C1881m6 c1881m6, AtomicReference atomicReference, String str, String str2, zzq zzqVar, boolean z10) {
        this.f9964f = c1881m6;
        this.f9959a = atomicReference;
        this.f9960b = str;
        this.f9961c = str2;
        this.f9962d = zzqVar;
        this.f9963e = z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f9959a) {
            try {
                try {
                    C1881m6 c1881m6 = this.f9964f;
                    InterfaceC1779b3 interfaceC1779b3 = c1881m6.f10007d;
                    if (interfaceC1779b3 == null) {
                        C1860k3 c1860k3 = ((C1897o4) c1881m6.f10430a).f10086i;
                        C1897o4.m5776k(c1860k3);
                        c1860k3.f9942f.m5626d("(legacy) Failed to get user properties; not connected to service", null, this.f9960b, this.f9961c);
                        this.f9959a.set(Collections.emptyList());
                        this.f9959a.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        C6272i.m12915i(this.f9962d);
                        this.f9959a.set(interfaceC1779b3.mo5498A0(this.f9960b, this.f9961c, this.f9963e, this.f9962d));
                    } else {
                        this.f9959a.set(interfaceC1779b3.mo5512y(null, this.f9960b, this.f9961c, this.f9963e));
                    }
                    this.f9964f.m5765s();
                    atomicReference = this.f9959a;
                    atomicReference.notify();
                } catch (RemoteException e10) {
                    C1860k3 c1860k4 = ((C1897o4) this.f9964f.f10430a).f10086i;
                    C1897o4.m5776k(c1860k4);
                    c1860k4.f9942f.m5626d("(legacy) Failed to get user properties; remote exception", null, this.f9960b, e10);
                    this.f9959a.set(Collections.emptyList());
                    atomicReference = this.f9959a;
                }
            } catch (Throwable th2) {
                this.f9959a.notify();
                throw th2;
            }
        }
    }
}
