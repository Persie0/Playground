package p152hb;

import android.app.job.JobParameters;
import android.os.Bundle;
import android.text.TextUtils;
import cc.BinderC1987y4;
import cc.C1834h4;
import cc.C1842i3;
import cc.C1846i7;
import cc.C1860k3;
import cc.C1864k7;
import cc.C1935s6;
import cc.InterfaceC1926r6;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.internal.measurement.C2596b;
import com.google.android.gms.internal.measurement.C2610c;
import com.google.android.gms.internal.measurement.C2765n0;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzq;
import dm.C5212l;
import java.util.HashMap;
import p338qd.C8573r0;

/* JADX INFO: renamed from: hb.a2 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5952a2 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35413a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f35414b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f35415c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f35416d;

    public /* synthetic */ RunnableC5952a2(int i10, Object obj, Object obj2, Object obj3) {
        this.f35413a = i10;
        this.f35416d = obj;
        this.f35414b = obj2;
        this.f35415c = obj3;
    }

    public /* synthetic */ RunnableC5952a2(C1935s6 c1935s6, C1860k3 c1860k3, JobParameters jobParameters) {
        this.f35413a = 2;
        this.f35414b = c1935s6;
        this.f35415c = c1860k3;
        this.f35416d = jobParameters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        C2765n0 c2765n0;
        zzau zzauVar;
        int i10 = this.f35413a;
        Bundle bundle2 = null;
        Object obj = this.f35415c;
        Object obj2 = this.f35414b;
        Object obj3 = this.f35416d;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                FragmentC5956b2 fragmentC5956b2 = (FragmentC5956b2) obj3;
                if (fragmentC5956b2.f35425b > 0) {
                    LifecycleCallback lifecycleCallback = (LifecycleCallback) obj2;
                    Bundle bundle3 = fragmentC5956b2.f35426c;
                    if (bundle3 != null) {
                        bundle = bundle2;
                        bundle = bundle3.getBundle((String) obj);
                    }
                    bundle = bundle2;
                    lifecycleCallback.mo7575e(bundle);
                }
                if (fragmentC5956b2.f35425b >= 2) {
                    ((LifecycleCallback) obj2).mo7578h();
                }
                if (fragmentC5956b2.f35425b >= 3) {
                    ((LifecycleCallback) obj2).mo7576f();
                }
                if (fragmentC5956b2.f35425b >= 4) {
                    ((LifecycleCallback) obj2).mo7579i();
                }
                if (fragmentC5956b2.f35425b >= 5) {
                    ((LifecycleCallback) obj2).getClass();
                }
                break;
            case 1:
                BinderC1987y4 binderC1987y4 = (BinderC1987y4) obj3;
                zzaw zzawVar = (zzaw) obj2;
                binderC1987y4.getClass();
                boolean zEquals = "_cmp".equals(zzawVar.f14613a);
                C1846i7 c1846i7 = binderC1987y4.f10411a;
                if (zEquals && (zzauVar = zzawVar.f14614b) != null) {
                    Bundle bundle4 = zzauVar.f14612a;
                    if (bundle4.size() != 0) {
                        String string = bundle4.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            c1846i7.mo5517e().f9948l.m5624b(zzawVar.toString(), "Event has been filtered ");
                            zzawVar = new zzaw("_cmpx", zzawVar.f14614b, zzawVar.f14615c, zzawVar.f14616d);
                        }
                    }
                }
                String str = zzawVar.f14613a;
                zzq zzqVar = (zzq) obj;
                C1834h4 c1834h4 = c1846i7.f9891a;
                C1864k7 c1864k7 = c1846i7.f9897g;
                C1846i7.m5629H(c1834h4);
                if (c1834h4.m5619s(zzqVar.f14638a)) {
                    C1842i3 c1842i3 = c1846i7.mo5517e().f9938I;
                    String str2 = zzqVar.f14638a;
                    c1842i3.m5624b(str2, "EES config found for");
                    C1834h4 c1834h5 = c1846i7.f9891a;
                    C1846i7.m5629H(c1834h5);
                    if (!TextUtils.isEmpty(str2)) {
                        c2765n0 = bundle2;
                        c2765n0 = (C2765n0) c1834h5.f9846j.m16516b(str2);
                    }
                    if (c2765n0 != 0) {
                        try {
                            C2610c c2610c = c2765n0.f14323c;
                            C1846i7.m5629H(c1864k7);
                            HashMap mapM5712E = C1864k7.m5712E(zzawVar.f14614b.m8535q(), true);
                            String strM16751q1 = C8573r0.m16751q1(str, C5212l.f33285d, C5212l.f33283b);
                            if (strM16751q1 == null) {
                                strM16751q1 = str;
                            }
                            if (!c2765n0.m8073b(new C2596b(strM16751q1, zzawVar.f14616d, mapM5712E))) {
                                c1846i7.mo5517e().f9938I.m5624b(str, "EES was not applied to event");
                                binderC1987y4.m5928j(zzawVar, zzqVar);
                            } else {
                                if (!c2610c.f14075b.equals(c2610c.f14074a)) {
                                    c1846i7.mo5517e().f9938I.m5624b(str, "EES edited event");
                                    C1846i7.m5629H(c1864k7);
                                    binderC1987y4.m5928j(C1864k7.m5725y(c2610c.f14075b), zzqVar);
                                } else {
                                    binderC1987y4.m5928j(zzawVar, zzqVar);
                                }
                                if (!c2610c.f14076c.isEmpty()) {
                                    for (C2596b c2596b : c2610c.f14076c) {
                                        c1846i7.mo5517e().f9938I.m5624b(c2596b.f14059a, "EES logging created event");
                                        C1846i7.m5629H(c1864k7);
                                        binderC1987y4.m5928j(C1864k7.m5725y(c2596b), zzqVar);
                                    }
                                }
                            }
                        } catch (zzd unused) {
                            c1846i7.mo5517e().f9942f.m5625c(zzqVar.f14639b, str, "EES error. appId, eventName");
                        }
                    } else {
                        c1846i7.mo5517e().f9938I.m5624b(str2, "EES not loaded for");
                        binderC1987y4.m5928j(zzawVar, zzqVar);
                    }
                } else {
                    binderC1987y4.m5928j(zzawVar, zzqVar);
                }
                break;
            default:
                C1935s6 c1935s6 = (C1935s6) obj2;
                c1935s6.getClass();
                ((C1860k3) obj).f9938I.m5623a("AppMeasurementJobService processed last upload request.");
                ((InterfaceC1926r6) c1935s6.f10199a).mo5855c((JobParameters) obj3);
                break;
        }
    }
}
