package cc;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzli;
import java.util.Iterator;
import java.util.TreeSet;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.g5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1826g5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9815a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bundle f9816b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1934s5 f9817c;

    public /* synthetic */ RunnableC1826g5(C1934s5 c1934s5, Bundle bundle, int i10) {
        this.f9815a = i10;
        this.f9817c = c1934s5;
        this.f9816b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9815a;
        Bundle bundle = this.f9816b;
        C1934s5 c1934s5 = this.f9817c;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                InterfaceC1781b5 interfaceC1781b5 = c1934s5.f10430a;
                if (bundle == null) {
                    C1986y3 c1986y3 = ((C1897o4) interfaceC1781b5).f10085h;
                    C1897o4.m5774i(c1986y3);
                    c1986y3.f10400R.m5894b(new Bundle());
                    break;
                } else {
                    C1897o4 c1897o4 = (C1897o4) interfaceC1781b5;
                    C1986y3 c1986y4 = c1897o4.f10085h;
                    C1897o4.m5774i(c1986y4);
                    Bundle bundleM5893a = c1986y4.f10400R.m5893a();
                    Iterator<String> it = bundle.keySet().iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        C1995z4 c1995z4 = c1934s5.f10188K;
                        C1860k3 c1860k3 = c1897o4.f10086i;
                        C1900o7 c1900o7 = c1897o4.f10089l;
                        if (!zHasNext) {
                            C1897o4.m5774i(c1900o7);
                            C1900o7 c1900o8 = ((C1897o4) c1897o4.f10084g.f10430a).f10089l;
                            C1897o4.m5774i(c1900o8);
                            int i11 = c1900o8.m5824U(201500000) ? 100 : 25;
                            if (bundleM5893a.size() > i11) {
                                int i12 = 0;
                                for (String str : new TreeSet(bundleM5893a.keySet())) {
                                    i12++;
                                    if (i12 > i11) {
                                        bundleM5893a.remove(str);
                                    }
                                }
                                C1897o4.m5774i(c1900o7);
                                c1900o7.getClass();
                                C1900o7.m5804y(c1995z4, null, 26, null, null, 0);
                                C1897o4.m5776k(c1860k3);
                                c1860k3.f9947k.m5623a("Too many default event parameters set. Discarding beyond event parameter limit");
                            }
                            C1986y3 c1986y5 = c1897o4.f10085h;
                            C1897o4.m5774i(c1986y5);
                            c1986y5.f10400R.m5894b(bundleM5893a);
                            C1881m6 c1881m6M5788t = c1897o4.m5788t();
                            c1881m6M5788t.mo5748g();
                            c1881m6M5788t.m5851h();
                            c1881m6M5788t.m5766t(new RunnableC1994z3(3, c1881m6M5788t, c1881m6M5788t.m5763q(false), bundleM5893a));
                            break;
                        } else {
                            String next = it.next();
                            Object obj = bundle.get(next);
                            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                                C1897o4.m5774i(c1900o7);
                                c1900o7.getClass();
                                if (C1900o7.m5791S(obj)) {
                                    C1900o7.m5804y(c1995z4, null, 27, null, null, 0);
                                }
                                C1897o4.m5776k(c1860k3);
                                c1860k3.f9947k.m5625c(next, obj, "Invalid default event parameter type. Name, value");
                            } else if (C1900o7.m5792V(next)) {
                                C1897o4.m5776k(c1860k3);
                                c1860k3.f9947k.m5624b(next, "Invalid default event parameter name. Name");
                            } else if (obj == null) {
                                bundleM5893a.remove(next);
                            } else {
                                C1897o4.m5774i(c1900o7);
                                if (c1900o7.m5818N(100, obj, "param", next)) {
                                    c1900o7.m5847z(bundleM5893a, next, obj);
                                }
                            }
                        }
                    }
                }
                break;
            default:
                c1934s5.mo5748g();
                c1934s5.m5851h();
                C6272i.m12915i(bundle);
                String string = bundle.getString("name");
                String string2 = bundle.getString("origin");
                C6272i.m12912f(string);
                C6272i.m12912f(string2);
                C6272i.m12915i(bundle.get("value"));
                InterfaceC1781b5 interfaceC1781b6 = c1934s5.f10430a;
                C1897o4 c1897o5 = (C1897o4) interfaceC1781b6;
                if (!c1897o5.m5779g()) {
                    C1860k3 c1860k4 = c1897o5.f10086i;
                    C1897o4.m5776k(c1860k4);
                    c1860k4.f9938I.m5623a("Conditional property not set since app measurement is disabled");
                } else {
                    zzli zzliVar = new zzli(bundle.getLong("triggered_timestamp"), bundle.get("value"), string, string2);
                    try {
                        C1900o7 c1900o9 = ((C1897o4) interfaceC1781b6).f10089l;
                        C1897o4.m5774i(c1900o9);
                        bundle.getString("app_id");
                        zzaw zzawVarM5840p0 = c1900o9.m5840p0(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true);
                        C1900o7 c1900o10 = ((C1897o4) interfaceC1781b6).f10089l;
                        C1897o4.m5774i(c1900o10);
                        bundle.getString("app_id");
                        zzaw zzawVarM5840p1 = c1900o10.m5840p0(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true);
                        C1900o7 c1900o11 = ((C1897o4) interfaceC1781b6).f10089l;
                        C1897o4.m5774i(c1900o11);
                        bundle.getString("app_id");
                        c1897o5.m5788t().m5759m(new zzac(bundle.getString("app_id"), string2, zzliVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), zzawVarM5840p1, bundle.getLong("trigger_timeout"), zzawVarM5840p0, bundle.getLong("time_to_live"), c1900o11.m5840p0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
        }
    }
}
