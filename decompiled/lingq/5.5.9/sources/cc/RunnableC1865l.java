package cc;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzq;
import p176ib.C6272i;
import p338qd.C8573r0;

/* JADX INFO: renamed from: cc.l */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1865l implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9965a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9966b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f9967c;

    public /* synthetic */ RunnableC1865l(Object obj, int i10, Object obj2) {
        this.f9965a = i10;
        this.f9967c = obj;
        this.f9966b = obj2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f9965a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((InterfaceC1781b5) this.f9966b).mo5515c();
                if (!C8573r0.m16748p1()) {
                    boolean z10 = ((AbstractC1874m) this.f9967c).f9988c != 0;
                    ((AbstractC1874m) this.f9967c).f9988c = 0L;
                    if (z10) {
                        ((AbstractC1874m) this.f9967c).mo5591b();
                    }
                } else {
                    ((InterfaceC1781b5) this.f9966b).mo5518f().m5753p(this);
                }
                break;
            case 1:
                BinderC1987y4 binderC1987y4 = (BinderC1987y4) this.f9967c;
                binderC1987y4.f10411a.m5647a();
                zzac zzacVar = (zzac) this.f9966b;
                if (zzacVar.f14603c.m8536q() != null) {
                    C1846i7 c1846i7 = binderC1987y4.f10411a;
                    c1846i7.getClass();
                    String str = zzacVar.f14601a;
                    C6272i.m12915i(str);
                    zzq zzqVarM5664y = c1846i7.m5664y(str);
                    if (zzqVarM5664y != null) {
                        c1846i7.m5658q(zzacVar, zzqVarM5664y);
                    }
                } else {
                    C1846i7 c1846i8 = binderC1987y4.f10411a;
                    c1846i8.getClass();
                    String str2 = zzacVar.f14601a;
                    C6272i.m12915i(str2);
                    zzq zzqVarM5664y2 = c1846i8.m5664y(str2);
                    if (zzqVarM5664y2 != null) {
                        c1846i8.m5655n(zzacVar, zzqVarM5664y2);
                    }
                }
                break;
            default:
                Object obj = this.f9966b;
                Object obj2 = this.f9967c;
                C1881m6 c1881m6 = (C1881m6) obj2;
                InterfaceC1779b3 interfaceC1779b3 = c1881m6.f10007d;
                if (interfaceC1779b3 == null) {
                    C1860k3 c1860k3 = ((C1897o4) c1881m6.f10430a).f10086i;
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9942f.m5623a("Discarding data. Failed to send app launch");
                } else {
                    try {
                        C6272i.m12915i((zzq) obj);
                        interfaceC1779b3.mo5506k0((zzq) obj);
                        ((C1897o4) ((C1881m6) obj2).f10430a).m5786q().m5589n();
                        ((C1881m6) obj2).m5758l(interfaceC1779b3, null, (zzq) obj);
                        ((C1881m6) obj2).m5765s();
                    } catch (RemoteException e10) {
                        C1860k3 c1860k4 = ((C1897o4) c1881m6.f10430a).f10086i;
                        C1897o4.m5776k(c1860k4);
                        c1860k4.f9942f.m5624b(e10, "Failed to send app launch to the service");
                    }
                }
                break;
        }
    }
}
