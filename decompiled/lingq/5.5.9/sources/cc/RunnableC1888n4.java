package cc;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.internal.measurement.C2718j9;
import com.google.android.gms.internal.measurement.InterfaceC2732k9;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p176ib.C6272i;
import p295ob.C8032b;

/* JADX INFO: renamed from: cc.n4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1888n4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10032a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f10033b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f10034c;

    public /* synthetic */ RunnableC1888n4(Object obj, int i10, Object obj2) {
        this.f10032a = i10;
        this.f10034c = obj;
        this.f10033b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0381  */
    /* JADX WARN: Code duplicated, block: B:130:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:132:0x03db  */
    /* JADX WARN: Code duplicated, block: B:150:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:152:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:153:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:159:0x04c2  */
    @Override // java.lang.Runnable
    public final void run() {
        C1811f c1811f;
        String strM5531n;
        String string;
        String str;
        String string2;
        Boolean boolM5920o;
        boolean zM5779g;
        SharedPreferences sharedPreferences;
        boolean zContains;
        ServiceInfo serviceInfo;
        Bundle bundle;
        boolean z10 = false;
        switch (this.f10032a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C1897o4 c1897o4 = (C1897o4) this.f10034c;
                C1808e5 c1808e5 = (C1808e5) this.f10033b;
                C1879m4 c1879m4 = c1897o4.f10087j;
                C1897o4.m5776k(c1879m4);
                c1879m4.mo5748g();
                C1802e c1802e = c1897o4.f10084g;
                ((C1897o4) c1802e.f10430a).getClass();
                C1883n c1883n = new C1883n(c1897o4);
                c1883n.m5493k();
                c1897o4.f10066Q = c1883n;
                C1788c3 c1788c3 = new C1788c3(c1897o4, c1808e5.f9778f);
                c1788c3.m5852j();
                c1897o4.f10067R = c1788c3;
                C1806e3 c1806e3 = new C1806e3(c1897o4);
                c1806e3.m5852j();
                c1897o4.f10064O = c1806e3;
                C1881m6 c1881m6 = new C1881m6(c1897o4);
                c1881m6.m5852j();
                c1897o4.f10065P = c1881m6;
                C1900o7 c1900o7 = c1897o4.f10089l;
                if (c1900o7.f9672b) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                c1900o7.m5816L();
                ((C1897o4) c1900o7.f10430a).m5778a();
                c1900o7.f9672b = true;
                C1986y3 c1986y3 = c1897o4.f10085h;
                if (c1986y3.f9672b) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                c1986y3.m5918m();
                ((C1897o4) c1986y3.f10430a).m5778a();
                c1986y3.f9672b = true;
                C1788c3 c1788c4 = c1897o4.f10067R;
                if (c1788c4.f10143b) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                c1788c4.m5529l();
                ((C1897o4) c1788c4.f10430a).m5778a();
                c1788c4.f10143b = true;
                C1860k3 c1860k3 = c1897o4.f10086i;
                C1897o4.m5776k(c1860k3);
                c1802e.m5578m();
                C1842i3 c1842i3 = c1860k3.f9948l;
                c1842i3.m5624b(76003L, "App measurement initialized, version");
                C1897o4.m5776k(c1860k3);
                c1842i3.m5623a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                String strM5530m = c1788c3.m5530m();
                if (TextUtils.isEmpty(c1897o4.f10078b)) {
                    if (c1900o7.m5822R(strM5530m)) {
                        C1897o4.m5776k(c1860k3);
                        c1842i3.m5623a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                    } else {
                        C1897o4.m5776k(c1860k3);
                        c1842i3.m5623a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM5530m)));
                    }
                }
                C1897o4.m5776k(c1860k3);
                c1860k3.f9937H.m5623a("Debug-level message logging enabled");
                int i10 = c1897o4.f10075Z;
                AtomicInteger atomicInteger = c1897o4.f10077a0;
                if (i10 != atomicInteger.get()) {
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9942f.m5625c(Integer.valueOf(c1897o4.f10075Z), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                }
                c1897o4.f10068S = true;
                zzcl zzclVar = c1808e5.f9779g;
                C1879m4 c1879m5 = c1897o4.f10087j;
                C1897o4.m5776k(c1879m5);
                c1879m5.mo5748g();
                C1986y3 c1986y4 = c1897o4.f10085h;
                C1897o4.m5774i(c1986y4);
                C1811f c1811fM5919n = c1986y4.m5919n();
                c1986y4.mo5748g();
                int i11 = c1986y4.m5917l().getInt("consent_source", 100);
                C1802e c1802e2 = c1897o4.f10084g;
                InterfaceC1781b5 interfaceC1781b5 = c1802e2.f10430a;
                Boolean boolM5581p = c1802e2.m5581p("google_analytics_default_allow_ad_storage");
                Boolean boolM5581p2 = c1802e2.m5581p("google_analytics_default_allow_analytics_storage");
                long j10 = c1897o4.f10079b0;
                C1934s5 c1934s5 = c1897o4.f10060K;
                int i12 = -10;
                if (!(boolM5581p == null && boolM5581p2 == null) && c1986y4.m5924s(-10)) {
                    c1811f = new C1811f(boolM5581p, boolM5581p2);
                } else {
                    if (!TextUtils.isEmpty(c1897o4.m5785p().m5531n()) && (i11 == 0 || i11 == 30 || i11 == 10 || i11 == 30 || i11 == 30 || i11 == 40)) {
                        C1897o4.m5775j(c1934s5);
                        c1934s5.m5877u(C1811f.f9788b, -10, j10);
                    } else if (TextUtils.isEmpty(c1897o4.m5785p().m5531n()) && zzclVar != null && (bundle = zzclVar.f14535g) != null && c1986y4.m5924s(30)) {
                        c1811f = C1811f.m5592a(bundle);
                        if (!c1811f.equals(C1811f.f9788b)) {
                            i12 = 30;
                        }
                    }
                    c1811f = null;
                    i12 = 100;
                }
                if (c1811f != null) {
                    C1897o4.m5775j(c1934s5);
                    c1934s5.m5877u(c1811f, i12, j10);
                    c1811fM5919n = c1811f;
                }
                C1897o4.m5775j(c1934s5);
                c1934s5.m5878v(c1811fM5919n);
                C1959v3 c1959v3 = c1986y4.f10403e;
                long jM5897a = c1959v3.m5897a();
                C1860k3 c1860k4 = c1897o4.f10086i;
                if (jM5897a == 0) {
                    C1897o4.m5776k(c1860k4);
                    c1860k4.f9938I.m5624b(Long.valueOf(j10), "Persisting first open");
                    c1959v3.m5898b(j10);
                }
                C1897o4.m5775j(c1934s5);
                C1936s7 c1936s7 = c1934s5.f10186I;
                if (c1936s7.m5887b() && c1936s7.m5888c()) {
                    C1986y3 c1986y5 = c1936s7.f10200a.f10085h;
                    C1897o4.m5774i(c1986y5);
                    c1986y5.f10398P.m5914b(null);
                }
                boolean zM5780h = c1897o4.m5780h();
                C1900o7 c1900o8 = c1897o4.f10089l;
                if (zM5780h) {
                    boolean zIsEmpty = TextUtils.isEmpty(c1897o4.m5785p().m5531n());
                    C1977x3 c1977x3 = c1986y4.f10404f;
                    if (zIsEmpty) {
                        C1788c3 c1788c3M5785p = c1897o4.m5785p();
                        c1788c3M5785p.m5851h();
                        if (!TextUtils.isEmpty(c1788c3M5785p.f9700H)) {
                            C1897o4.m5774i(c1900o8);
                            strM5531n = c1897o4.m5785p().m5531n();
                            c1986y4.mo5748g();
                            string = c1986y4.m5917l().getString("gmp_app_id", null);
                            C1788c3 c1788c3M5785p2 = c1897o4.m5785p();
                            c1788c3M5785p2.m5851h();
                            str = c1788c3M5785p2.f9700H;
                            c1986y4.mo5748g();
                            string2 = c1986y4.m5917l().getString("admob_app_id", null);
                            c1900o8.getClass();
                            if (C1900o7.m5795Y(strM5531n, string, str, string2)) {
                                C1897o4.m5776k(c1860k4);
                                c1860k4.f9948l.m5623a("Rechecking which service to use due to a GMP App Id change");
                                c1986y4.mo5748g();
                                boolM5920o = c1986y4.m5920o();
                                SharedPreferences.Editor editorEdit = c1986y4.m5917l().edit();
                                editorEdit.clear();
                                editorEdit.apply();
                                if (boolM5920o != null) {
                                    c1986y4.m5921p(boolM5920o);
                                }
                                c1897o4.m5786q().m5588m();
                                c1897o4.f10065P.m5768w();
                                c1897o4.f10065P.m5767v();
                                c1959v3.m5898b(j10);
                                c1977x3.m5914b(null);
                            }
                            String strM5531n2 = c1897o4.m5785p().m5531n();
                            c1986y4.mo5748g();
                            SharedPreferences.Editor editorEdit2 = c1986y4.m5917l().edit();
                            editorEdit2.putString("gmp_app_id", strM5531n2);
                            editorEdit2.apply();
                            C1788c3 c1788c3M5785p3 = c1897o4.m5785p();
                            c1788c3M5785p3.m5851h();
                            String str2 = c1788c3M5785p3.f9700H;
                            c1986y4.mo5748g();
                            SharedPreferences.Editor editorEdit3 = c1986y4.m5917l().edit();
                            editorEdit3.putString("admob_app_id", str2);
                            editorEdit3.apply();
                        }
                    } else {
                        C1897o4.m5774i(c1900o8);
                        strM5531n = c1897o4.m5785p().m5531n();
                        c1986y4.mo5748g();
                        string = c1986y4.m5917l().getString("gmp_app_id", null);
                        C1788c3 c1788c3M5785p4 = c1897o4.m5785p();
                        c1788c3M5785p4.m5851h();
                        str = c1788c3M5785p4.f9700H;
                        c1986y4.mo5748g();
                        string2 = c1986y4.m5917l().getString("admob_app_id", null);
                        c1900o8.getClass();
                        if (C1900o7.m5795Y(strM5531n, string, str, string2)) {
                            C1897o4.m5776k(c1860k4);
                            c1860k4.f9948l.m5623a("Rechecking which service to use due to a GMP App Id change");
                            c1986y4.mo5748g();
                            boolM5920o = c1986y4.m5920o();
                            SharedPreferences.Editor editorEdit4 = c1986y4.m5917l().edit();
                            editorEdit4.clear();
                            editorEdit4.apply();
                            if (boolM5920o != null) {
                                c1986y4.m5921p(boolM5920o);
                            }
                            c1897o4.m5786q().m5588m();
                            c1897o4.f10065P.m5768w();
                            c1897o4.f10065P.m5767v();
                            c1959v3.m5898b(j10);
                            c1977x3.m5914b(null);
                        }
                        String strM5531n3 = c1897o4.m5785p().m5531n();
                        c1986y4.mo5748g();
                        SharedPreferences.Editor editorEdit5 = c1986y4.m5917l().edit();
                        editorEdit5.putString("gmp_app_id", strM5531n3);
                        editorEdit5.apply();
                        C1788c3 c1788c3M5785p5 = c1897o4.m5785p();
                        c1788c3M5785p5.m5851h();
                        String str3 = c1788c3M5785p5.f9700H;
                        c1986y4.mo5748g();
                        SharedPreferences.Editor editorEdit6 = c1986y4.m5917l().edit();
                        editorEdit6.putString("admob_app_id", str3);
                        editorEdit6.apply();
                    }
                    if (!c1986y4.m5919n().m5597f(zzah.ANALYTICS_STORAGE)) {
                        c1977x3.m5914b(null);
                    }
                    C1897o4.m5775j(c1934s5);
                    c1934s5.f10193g.set(c1977x3.m5913a());
                    ((InterfaceC2732k9) C2718j9.f14273b.f14274a.zza()).zza();
                    if (c1802e2.m5582q(null, C1985y2.f10348e0)) {
                        C1897o4.m5774i(c1900o8);
                        try {
                            ((C1897o4) c1900o8.f10430a).f10076a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                        } catch (ClassNotFoundException unused) {
                            C1977x3 c1977x4 = c1986y4.f10397O;
                            if (!TextUtils.isEmpty(c1977x4.m5913a())) {
                                C1897o4.m5776k(c1860k4);
                                c1860k4.f9945i.m5623a("Remote config removed with active feature rollouts");
                                c1977x4.m5914b(null);
                            }
                        }
                    }
                    if (TextUtils.isEmpty(c1897o4.m5785p().m5531n())) {
                        C1788c3 c1788c3M5785p6 = c1897o4.m5785p();
                        c1788c3M5785p6.m5851h();
                        if (!TextUtils.isEmpty(c1788c3M5785p6.f9700H)) {
                            zM5779g = c1897o4.m5779g();
                            sharedPreferences = c1986y4.f10401c;
                            if (sharedPreferences == null) {
                                zContains = false;
                            } else {
                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                            }
                            if (!zContains && !c1802e2.m5584s()) {
                                c1986y4.m5922q(!zM5779g);
                            }
                            if (zM5779g) {
                                C1897o4.m5775j(c1934s5);
                                c1934s5.m5867D();
                            }
                            C1971w6 c1971w6 = c1897o4.f10088k;
                            C1897o4.m5775j(c1971w6);
                            c1971w6.f10278d.m5900a();
                            c1897o4.m5788t().m5769x(new AtomicReference());
                            C1881m6 c1881m6M5788t = c1897o4.m5788t();
                            Bundle bundleM5893a = c1986y4.f10400R.m5893a();
                            c1881m6M5788t.mo5748g();
                            c1881m6M5788t.m5851h();
                            c1881m6M5788t.m5766t(new RunnableC1994z3(3, c1881m6M5788t, c1881m6M5788t.m5763q(false), bundleM5893a));
                        }
                    } else {
                        zM5779g = c1897o4.m5779g();
                        sharedPreferences = c1986y4.f10401c;
                        if (sharedPreferences == null) {
                            zContains = false;
                        } else {
                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                        }
                        if (!zContains) {
                            c1986y4.m5922q(!zM5779g);
                        }
                        if (zM5779g) {
                            C1897o4.m5775j(c1934s5);
                            c1934s5.m5867D();
                        }
                        C1971w6 c1971w7 = c1897o4.f10088k;
                        C1897o4.m5775j(c1971w7);
                        c1971w7.f10278d.m5900a();
                        c1897o4.m5788t().m5769x(new AtomicReference());
                        C1881m6 c1881m6M5788t2 = c1897o4.m5788t();
                        Bundle bundleM5893a2 = c1986y4.f10400R.m5893a();
                        c1881m6M5788t2.mo5748g();
                        c1881m6M5788t2.m5851h();
                        c1881m6M5788t2.m5766t(new RunnableC1994z3(3, c1881m6M5788t2, c1881m6M5788t2.m5763q(false), bundleM5893a2));
                    }
                    break;
                } else if (c1897o4.m5779g()) {
                    C1897o4.m5774i(c1900o8);
                    if (!c1900o8.m5821Q("android.permission.INTERNET")) {
                        C1897o4.m5776k(c1860k4);
                        c1860k4.f9942f.m5623a("App is missing INTERNET permission");
                    }
                    if (!c1900o8.m5821Q("android.permission.ACCESS_NETWORK_STATE")) {
                        C1897o4.m5776k(c1860k4);
                        c1860k4.f9942f.m5623a("App is missing ACCESS_NETWORK_STATE permission");
                    }
                    Context context = c1897o4.f10076a;
                    if (!C8032b.m15902a(context).m15901c() && !c1802e2.m5586u()) {
                        if (!C1900o7.m5794X(context)) {
                            C1897o4.m5776k(c1860k4);
                            c1860k4.f9942f.m5623a("AppMeasurementReceiver not registered/enabled");
                        }
                        try {
                            PackageManager packageManager = context.getPackageManager();
                            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null && serviceInfo.enabled) {
                                z10 = true;
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                        if (!z10) {
                            C1897o4.m5776k(c1860k4);
                            c1860k4.f9942f.m5623a("AppMeasurementService not registered/enabled");
                        }
                    }
                    C1897o4.m5776k(c1860k4);
                    c1860k4.f9942f.m5623a("Uploading is not possible. App measurement disabled");
                }
                c1986y4.f10390H.m5889a(true);
                return;
            case 1:
                synchronized (((AtomicReference) this.f10033b)) {
                    try {
                        AtomicReference atomicReference = (AtomicReference) this.f10033b;
                        Object obj = this.f10034c;
                        atomicReference.set(Long.valueOf(((C1897o4) ((C1934s5) obj).f10430a).f10084g.m5579n(((C1897o4) ((C1934s5) obj).f10430a).m5785p().m5530m(), C1985y2.f10326N)));
                        ((AtomicReference) this.f10033b).notify();
                    } catch (Throwable th2) {
                        ((AtomicReference) this.f10033b).notify();
                        throw th2;
                    }
                }
                return;
            case 2:
                ((C1934s5) this.f10034c).m5881y((Boolean) this.f10033b, true);
                return;
            case 3:
                Object obj2 = this.f10033b;
                C1881m6 c1881m7 = (C1881m6) this.f10034c;
                InterfaceC1779b3 interfaceC1779b3 = c1881m7.f10007d;
                if (interfaceC1779b3 == null) {
                    C1860k3 c1860k5 = ((C1897o4) c1881m7.f10430a).f10086i;
                    C1897o4.m5776k(c1860k5);
                    c1860k5.f9942f.m5623a("Failed to reset data on the service: not connected to service");
                    return;
                }
                try {
                    C6272i.m12915i((zzq) obj2);
                    interfaceC1779b3.mo5501F0((zzq) obj2);
                    break;
                } catch (RemoteException e10) {
                    C1860k3 c1860k6 = ((C1897o4) c1881m7.f10430a).f10086i;
                    C1897o4.m5776k(c1860k6);
                    c1860k6.f9942f.m5624b(e10, "Failed to reset data on the service: remote exception");
                }
                c1881m7.m5765s();
                return;
            case 4:
                Object obj3 = this.f10034c;
                C1881m6 c1881m8 = (C1881m6) obj3;
                InterfaceC1779b3 interfaceC1779b4 = c1881m8.f10007d;
                InterfaceC1781b5 interfaceC1781b6 = c1881m8.f10430a;
                if (interfaceC1779b4 == null) {
                    C1860k3 c1860k7 = ((C1897o4) interfaceC1781b6).f10086i;
                    C1897o4.m5776k(c1860k7);
                    c1860k7.f9942f.m5623a("Failed to send current screen to service");
                    return;
                }
                try {
                    C1988y5 c1988y5 = (C1988y5) this.f10033b;
                    if (c1988y5 == null) {
                        interfaceC1779b4.mo5508o0(0L, null, null, ((C1897o4) interfaceC1781b6).f10076a.getPackageName());
                    } else {
                        interfaceC1779b4.mo5508o0(c1988y5.f10416c, c1988y5.f10414a, c1988y5.f10415b, ((C1897o4) interfaceC1781b6).f10076a.getPackageName());
                    }
                    ((C1881m6) obj3).m5765s();
                    return;
                } catch (RemoteException e11) {
                    C1860k3 c1860k8 = ((C1897o4) c1881m8.f10430a).f10086i;
                    C1897o4.m5776k(c1860k8);
                    c1860k8.f9942f.m5624b(e11, "Failed to send current screen to the service");
                    return;
                }
            default:
                synchronized (((ServiceConnectionC1872l6) this.f10034c)) {
                    ((ServiceConnectionC1872l6) this.f10034c).f9982a = false;
                    if (!((ServiceConnectionC1872l6) this.f10034c).f9984c.m5760n()) {
                        C1860k3 c1860k9 = ((C1897o4) ((ServiceConnectionC1872l6) this.f10034c).f9984c.f10430a).f10086i;
                        C1897o4.m5776k(c1860k9);
                        c1860k9.f9938I.m5623a("Connected to service");
                        C1881m6 c1881m9 = ((ServiceConnectionC1872l6) this.f10034c).f9984c;
                        InterfaceC1779b3 interfaceC1779b5 = (InterfaceC1779b3) this.f10033b;
                        c1881m9.mo5748g();
                        C6272i.m12915i(interfaceC1779b5);
                        c1881m9.f10007d = interfaceC1779b5;
                        c1881m9.m5765s();
                        c1881m9.m5764r();
                    }
                    break;
                }
                return;
        }
    }
}
