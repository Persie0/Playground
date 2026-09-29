package cc;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2843t0;
import com.google.android.gms.measurement.internal.zzaw;

/* JADX INFO: renamed from: cc.f6 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1818f6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzaw f9801a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f9802b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC2843t0 f9803c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1881m6 f9804d;

    public RunnableC1818f6(C1881m6 c1881m6, zzaw zzawVar, String str, InterfaceC2843t0 interfaceC2843t0) {
        this.f9804d = c1881m6;
        this.f9801a = zzawVar;
        this.f9802b = str;
        this.f9803c = interfaceC2843t0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        C1900o7 c1900o7;
        C1897o4 c1897o4;
        InterfaceC2843t0 interfaceC2843t0 = this.f9803c;
        C1881m6 c1881m6 = this.f9804d;
        byte[] bArrMo5500E = null;
        try {
            try {
                InterfaceC1779b3 interfaceC1779b3 = c1881m6.f10007d;
                InterfaceC1781b5 interfaceC1781b5 = c1881m6.f10430a;
                if (interfaceC1779b3 == null) {
                    C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9942f.m5623a("Discarding data. Failed to send event to service to bundle");
                    c1897o4 = (C1897o4) interfaceC1781b5;
                } else {
                    bArrMo5500E = interfaceC1779b3.mo5500E(this.f9801a, this.f9802b);
                    c1881m6.m5765s();
                    c1897o4 = (C1897o4) interfaceC1781b5;
                }
                c1900o7 = c1897o4.f10089l;
            } catch (RemoteException e10) {
                C1860k3 c1860k4 = ((C1897o4) c1881m6.f10430a).f10086i;
                C1897o4.m5776k(c1860k4);
                c1860k4.f9942f.m5624b(e10, "Failed to send event to the service to bundle");
                c1900o7 = ((C1897o4) c1881m6.f10430a).f10089l;
            }
            C1897o4.m5774i(c1900o7);
            c1900o7.m5808D(interfaceC2843t0, bArrMo5500E);
        } catch (Throwable th2) {
            C1900o7 c1900o8 = ((C1897o4) c1881m6.f10430a).f10089l;
            C1897o4.m5774i(c1900o8);
            c1900o8.m5808D(interfaceC2843t0, null);
            throw th2;
        }
    }
}
