package cc;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2843t0;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.j6 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1854j6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f9928a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f9929b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzq f9930c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC2843t0 f9931d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1881m6 f9932e;

    public RunnableC1854j6(C1881m6 c1881m6, String str, String str2, zzq zzqVar, InterfaceC2843t0 interfaceC2843t0) {
        this.f9932e = c1881m6;
        this.f9928a = str;
        this.f9929b = str2;
        this.f9930c = zzqVar;
        this.f9931d = interfaceC2843t0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1900o7 c1900o7;
        C1897o4 c1897o4;
        zzq zzqVar = this.f9930c;
        String str = this.f9929b;
        String str2 = this.f9928a;
        InterfaceC2843t0 interfaceC2843t0 = this.f9931d;
        C1881m6 c1881m6 = this.f9932e;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                InterfaceC1779b3 interfaceC1779b3 = c1881m6.f10007d;
                InterfaceC1781b5 interfaceC1781b5 = c1881m6.f10430a;
                if (interfaceC1779b3 == null) {
                    C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9942f.m5625c(str2, str, "Failed to get conditional properties; not connected to service");
                    c1897o4 = (C1897o4) interfaceC1781b5;
                } else {
                    C6272i.m12915i(zzqVar);
                    arrayList = C1900o7.m5802r(interfaceC1779b3.mo5507l0(str2, str, zzqVar));
                    c1881m6.m5765s();
                    c1897o4 = (C1897o4) interfaceC1781b5;
                }
                c1900o7 = c1897o4.f10089l;
            } catch (RemoteException e10) {
                C1860k3 c1860k4 = ((C1897o4) c1881m6.f10430a).f10086i;
                C1897o4.m5776k(c1860k4);
                c1860k4.f9942f.m5626d("Failed to get conditional properties; remote exception", str2, str, e10);
                c1900o7 = ((C1897o4) c1881m6.f10430a).f10089l;
            }
            C1897o4.m5774i(c1900o7);
            c1900o7.m5806B(interfaceC2843t0, arrayList);
        } catch (Throwable th2) {
            C1900o7 c1900o8 = ((C1897o4) c1881m6.f10430a).f10089l;
            C1897o4.m5774i(c1900o8);
            c1900o8.m5806B(interfaceC2843t0, arrayList);
            throw th2;
        }
    }
}
