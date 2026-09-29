package cc;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.InterfaceC2843t0;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzli;
import com.google.android.gms.measurement.internal.zzq;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.p4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1906p4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10119a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzq f10120b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f10121c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f10122d;

    public RunnableC1906p4(C1881m6 c1881m6, zzq zzqVar, InterfaceC2843t0 interfaceC2843t0) {
        this.f10119a = 2;
        this.f10121c = c1881m6;
        this.f10120b = zzqVar;
        this.f10122d = interfaceC2843t0;
    }

    public /* synthetic */ RunnableC1906p4(BinderC1987y4 binderC1987y4, AbstractSafeParcelable abstractSafeParcelable, zzq zzqVar, int i10) {
        this.f10119a = i10;
        this.f10121c = binderC1987y4;
        this.f10122d = abstractSafeParcelable;
        this.f10120b = zzqVar;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        C1897o4 c1897o4;
        int i10 = this.f10119a;
        zzq zzqVar = this.f10120b;
        Object obj = this.f10122d;
        Object obj2 = this.f10121c;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                BinderC1987y4 binderC1987y4 = (BinderC1987y4) obj2;
                binderC1987y4.f10411a.m5647a();
                zzac zzacVar = (zzac) obj;
                Object objM8536q = zzacVar.f14603c.m8536q();
                C1846i7 c1846i7 = binderC1987y4.f10411a;
                if (objM8536q == null) {
                    c1846i7.m5655n(zzacVar, zzqVar);
                    return;
                } else {
                    c1846i7.m5658q(zzacVar, zzqVar);
                    return;
                }
            case 1:
                BinderC1987y4 binderC1987y5 = (BinderC1987y4) obj2;
                binderC1987y5.f10411a.m5647a();
                zzli zzliVar = (zzli) obj;
                Object objM8536q2 = zzliVar.m8536q();
                C1846i7 c1846i8 = binderC1987y5.f10411a;
                if (objM8536q2 == null) {
                    c1846i8.m5656o(zzliVar.f14618b, zzqVar);
                    return;
                } else {
                    c1846i8.m5660s(zzliVar, zzqVar);
                    return;
                }
            default:
                String strMo5503K = null;
                try {
                    try {
                        C1986y3 c1986y3 = ((C1897o4) ((C1881m6) obj2).f10430a).f10085h;
                        C1897o4.m5774i(c1986y3);
                        if (c1986y3.m5919n().m5597f(zzah.ANALYTICS_STORAGE)) {
                            C1881m6 c1881m6 = (C1881m6) obj2;
                            InterfaceC1779b3 interfaceC1779b3 = c1881m6.f10007d;
                            if (interfaceC1779b3 == null) {
                                C1860k3 c1860k3 = ((C1897o4) c1881m6.f10430a).f10086i;
                                C1897o4.m5776k(c1860k3);
                                c1860k3.f9942f.m5623a("Failed to get app instance id");
                                c1897o4 = (C1897o4) ((C1881m6) obj2).f10430a;
                            } else {
                                C6272i.m12915i(zzqVar);
                                strMo5503K = interfaceC1779b3.mo5503K(zzqVar);
                                if (strMo5503K != null) {
                                    C1934s5 c1934s5 = ((C1897o4) ((C1881m6) obj2).f10430a).f10060K;
                                    C1897o4.m5775j(c1934s5);
                                    c1934s5.f10193g.set(strMo5503K);
                                    C1986y3 c1986y4 = ((C1897o4) ((C1881m6) obj2).f10430a).f10085h;
                                    C1897o4.m5774i(c1986y4);
                                    c1986y4.f10404f.m5914b(strMo5503K);
                                }
                                ((C1881m6) obj2).m5765s();
                                c1897o4 = (C1897o4) ((C1881m6) obj2).f10430a;
                            }
                        } else {
                            C1860k3 c1860k4 = ((C1897o4) ((C1881m6) obj2).f10430a).f10086i;
                            C1897o4.m5776k(c1860k4);
                            c1860k4.f9947k.m5623a("Analytics storage consent denied; will not get app instance id");
                            C1934s5 c1934s6 = ((C1897o4) ((C1881m6) obj2).f10430a).f10060K;
                            C1897o4.m5775j(c1934s6);
                            c1934s6.f10193g.set(null);
                            C1986y3 c1986y5 = ((C1897o4) ((C1881m6) obj2).f10430a).f10085h;
                            C1897o4.m5774i(c1986y5);
                            c1986y5.f10404f.m5914b(null);
                            c1897o4 = (C1897o4) ((C1881m6) obj2).f10430a;
                        }
                    } catch (RemoteException e10) {
                        C1860k3 c1860k5 = ((C1897o4) ((C1881m6) obj2).f10430a).f10086i;
                        C1897o4.m5776k(c1860k5);
                        c1860k5.f9942f.m5624b(e10, "Failed to get app instance id");
                        c1897o4 = (C1897o4) ((C1881m6) obj2).f10430a;
                    }
                    C1900o7 c1900o7 = c1897o4.f10089l;
                    C1897o4.m5774i(c1900o7);
                    c1900o7.m5811G(strMo5503K, (InterfaceC2843t0) obj);
                    return;
                } catch (Throwable th2) {
                    C1900o7 c1900o8 = ((C1897o4) ((C1881m6) obj2).f10430a).f10089l;
                    C1897o4.m5774i(c1900o8);
                    c1900o8.m5811G(null, (InterfaceC2843t0) obj);
                    throw th2;
                }
        }
    }
}
