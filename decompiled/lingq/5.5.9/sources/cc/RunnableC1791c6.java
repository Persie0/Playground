package cc;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2843t0;
import com.google.android.gms.measurement.internal.zzli;
import com.google.android.gms.measurement.internal.zzq;
import java.util.List;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.c6 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1791c6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f9747a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f9748b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzq f9749c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f9750d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC2843t0 f9751e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1881m6 f9752f;

    public RunnableC1791c6(C1881m6 c1881m6, String str, String str2, zzq zzqVar, boolean z10, InterfaceC2843t0 interfaceC2843t0) {
        this.f9752f = c1881m6;
        this.f9747a = str;
        this.f9748b = str2;
        this.f9749c = zzqVar;
        this.f9750d = z10;
        this.f9751e = interfaceC2843t0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        zzq zzqVar = this.f9749c;
        String str = this.f9747a;
        InterfaceC2843t0 interfaceC2843t0 = this.f9751e;
        C1881m6 c1881m6 = this.f9752f;
        Bundle bundle2 = new Bundle();
        try {
            try {
                InterfaceC1779b3 interfaceC1779b3 = c1881m6.f10007d;
                InterfaceC1781b5 interfaceC1781b5 = c1881m6.f10430a;
                String str2 = this.f9748b;
                if (interfaceC1779b3 == null) {
                    C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9942f.m5625c(str, str2, "Failed to get user properties; not connected to service");
                    C1900o7 c1900o7 = ((C1897o4) interfaceC1781b5).f10089l;
                    C1897o4.m5774i(c1900o7);
                    c1900o7.m5807C(interfaceC2843t0, bundle2);
                    return;
                }
                C6272i.m12915i(zzqVar);
                List<zzli> listMo5498A0 = interfaceC1779b3.mo5498A0(str, str2, this.f9750d, zzqVar);
                bundle = new Bundle();
                if (listMo5498A0 != null) {
                    for (zzli zzliVar : listMo5498A0) {
                        String str3 = zzliVar.f14621e;
                        String str4 = zzliVar.f14618b;
                        if (str3 != null) {
                            bundle.putString(str4, str3);
                        } else {
                            Long l10 = zzliVar.f14620d;
                            if (l10 != null) {
                                bundle.putLong(str4, l10.longValue());
                            } else {
                                Double d10 = zzliVar.f14623g;
                                if (d10 != null) {
                                    bundle.putDouble(str4, d10.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    c1881m6.m5765s();
                    C1900o7 c1900o8 = ((C1897o4) interfaceC1781b5).f10089l;
                    C1897o4.m5774i(c1900o8);
                    c1900o8.m5807C(interfaceC2843t0, bundle);
                } catch (RemoteException e10) {
                    e = e10;
                    bundle2 = bundle;
                    C1860k3 c1860k4 = ((C1897o4) c1881m6.f10430a).f10086i;
                    C1897o4.m5776k(c1860k4);
                    c1860k4.f9942f.m5625c(str, e, "Failed to get user properties; remote exception");
                    C1900o7 c1900o9 = ((C1897o4) c1881m6.f10430a).f10089l;
                    C1897o4.m5774i(c1900o9);
                    c1900o9.m5807C(interfaceC2843t0, bundle2);
                } catch (Throwable th2) {
                    th = th2;
                    C1900o7 c1900o10 = ((C1897o4) c1881m6.f10430a).f10089l;
                    C1897o4.m5774i(c1900o10);
                    c1900o10.m5807C(interfaceC2843t0, bundle);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bundle = bundle2;
            }
        } catch (RemoteException e11) {
            e = e11;
        }
    }
}
