package p115fb;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.datastore.preferences.PreferencesProto$Value;
import cc.BinderC1987y4;
import cc.C1775b;
import cc.C1780b4;
import cc.C1788c3;
import cc.C1802e;
import cc.C1834h4;
import cc.C1846i7;
import cc.C1847j;
import cc.C1860k3;
import cc.C1881m6;
import cc.C1897o4;
import cc.C1899o6;
import cc.C1900o7;
import cc.C1932s3;
import cc.C1934s5;
import cc.C1959v3;
import cc.C1971w6;
import cc.C1979x5;
import cc.C1985y2;
import cc.C1986y3;
import cc.C1989y6;
import cc.InterfaceC1779b3;
import cc.InterfaceC1781b5;
import cc.ServiceConnectionC1872l6;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.internal.measurement.C2692hb;
import com.google.android.gms.internal.measurement.InterfaceC2706ib;
import com.google.android.gms.internal.measurement.InterfaceC2843t0;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzli;
import com.google.android.gms.measurement.internal.zzq;
import com.google.android.play.core.assetpacks.C3121l;
import com.google.android.play.core.tasks.RuntimeExecutionException;
import java.util.ArrayList;
import p081e0.C5298b1;
import p176ib.C6272i;
import p260m8.C7499b;
import p289o5.RunnableC7943w;
import p338qd.C8538f1;
import p457wd.C9904e;
import p457wd.C9907h;
import p457wd.C9910k;
import p457wd.InterfaceC9901b;
import td.C9262j;

/* JADX INFO: renamed from: fb.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5494j implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34091a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f34092b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f34093c;

    public RunnableC5494j(C1846i7 c1846i7, Runnable runnable) {
        this.f34091a = 7;
        this.f34092b = c1846i7;
        this.f34093c = runnable;
    }

    public /* synthetic */ RunnableC5494j(Object obj, int i10, Object obj2) {
        this.f34091a = i10;
        this.f34092b = obj;
        this.f34093c = obj2;
    }

    public /* synthetic */ RunnableC5494j(Object obj, Object obj2, int i10) {
        this.f34091a = i10;
        this.f34093c = obj;
        this.f34092b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:142:0x0216 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0203  */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Long lValueOf;
        Object obj2;
        int i10 = 1;
        switch (this.f34091a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ServiceConnectionC5495k serviceConnectionC5495k = (ServiceConnectionC5495k) this.f34092b;
                IBinder iBinder = (IBinder) this.f34093c;
                synchronized (serviceConnectionC5495k) {
                    try {
                        if (iBinder == null) {
                            serviceConnectionC5495k.m11718a("Null service connection", 0);
                        } else {
                            try {
                                serviceConnectionC5495k.f34096c = new C5496l(iBinder);
                                serviceConnectionC5495k.f34094a = 2;
                                serviceConnectionC5495k.f34099f.f34108b.execute(new RunnableC7943w(i10, serviceConnectionC5495k));
                            } catch (RemoteException e10) {
                                serviceConnectionC5495k.m11718a(e10.getMessage(), 0);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                BinderC1987y4 binderC1987y4 = (BinderC1987y4) this.f34093c;
                binderC1987y4.f10411a.m5647a();
                C1846i7 c1846i7 = binderC1987y4.f10411a;
                zzq zzqVar = (zzq) this.f34092b;
                c1846i7.mo5518f().mo5748g();
                c1846i7.m5648g();
                C6272i.m12912f(zzqVar.f14638a);
                c1846i7.m5639I(zzqVar);
                return;
            case 2:
                C1934s5 c1934s5 = (C1934s5) this.f34092b;
                String str = (String) this.f34093c;
                C1788c3 c1788c3M5785p = ((C1897o4) c1934s5.f10430a).m5785p();
                String str2 = c1788c3M5785p.f9703K;
                i10 = (str2 == null || str2.equals(str)) ? 0 : 1;
                c1788c3M5785p.f9703K = str;
                if (i10 != 0) {
                    ((C1897o4) c1934s5.f10430a).m5785p().m5532o();
                    return;
                }
                return;
            case 3:
                C1934s5 c1934s6 = (C1934s5) this.f34093c;
                Bundle bundle = (Bundle) this.f34092b;
                c1934s6.mo5748g();
                c1934s6.m5851h();
                C6272i.m12915i(bundle);
                String string = bundle.getString("name");
                C6272i.m12912f(string);
                InterfaceC1781b5 interfaceC1781b5 = c1934s6.f10430a;
                C1897o4 c1897o4 = (C1897o4) interfaceC1781b5;
                if (!c1897o4.m5779g()) {
                    C1860k3 c1860k3 = c1897o4.f10086i;
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9938I.m5623a("Conditional property not cleared since app measurement is disabled");
                    return;
                } else {
                    zzli zzliVar = new zzli(0L, null, string, "");
                    try {
                        C1900o7 c1900o7 = ((C1897o4) interfaceC1781b5).f10089l;
                        C1897o4.m5774i(c1900o7);
                        bundle.getString("app_id");
                        c1897o4.m5788t().m5759m(new zzac(bundle.getString("app_id"), "", zzliVar, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), c1900o7.m5840p0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true)));
                        return;
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
            case 4:
                C1934s5 c1934s7 = (C1934s5) this.f34093c;
                C1971w6 c1971w6 = ((C1897o4) c1934s7.f10430a).f10088k;
                C1897o4.m5775j(c1971w6);
                ((InterfaceC2706ib) C2692hb.f14242b.f14243a.zza()).zza();
                boolean zM5582q = ((C1897o4) c1971w6.f10430a).f10084g.m5582q(null, C1985y2.f10370p0);
                InterfaceC1781b5 interfaceC1781b6 = c1971w6.f10430a;
                if (zM5582q) {
                    C1897o4 c1897o5 = (C1897o4) interfaceC1781b6;
                    C1986y3 c1986y3 = c1897o5.f10085h;
                    C1897o4.m5774i(c1986y3);
                    if (c1986y3.m5919n().m5597f(zzah.ANALYTICS_STORAGE)) {
                        C1986y3 c1986y4 = c1897o5.f10085h;
                        C1897o4.m5774i(c1986y4);
                        c1897o5.f10058I.getClass();
                        if (!c1986y4.m5923r(System.currentTimeMillis())) {
                            C1986y3 c1986y5 = c1897o5.f10085h;
                            C1897o4.m5774i(c1986y5);
                            if (c1986y5.f10392J.m5897a() != 0) {
                                C1986y3 c1986y6 = c1897o5.f10085h;
                                C1897o4.m5774i(c1986y6);
                                lValueOf = Long.valueOf(c1986y6.f10392J.m5897a());
                            }
                        }
                        obj2 = this.f34092b;
                        if (lValueOf == null) {
                            C1900o7 c1900o8 = ((C1897o4) c1934s7.f10430a).f10089l;
                            C1897o4.m5774i(c1900o8);
                            c1900o8.m5810F((InterfaceC2843t0) obj2, lValueOf.longValue());
                            return;
                        } else {
                            try {
                                ((InterfaceC2843t0) obj2).mo8058U(null);
                                return;
                            } catch (RemoteException e11) {
                                C1860k3 c1860k4 = ((C1897o4) c1934s7.f10430a).f10086i;
                                C1897o4.m5776k(c1860k4);
                                c1860k4.f9942f.m5624b(e11, "getSessionId failed with exception");
                                return;
                            }
                        }
                    }
                    C1860k3 c1860k5 = c1897o5.f10086i;
                    C1897o4.m5776k(c1860k5);
                    c1860k5.f9947k.m5623a("Analytics storage consent denied; will not get session id");
                } else {
                    C1860k3 c1860k6 = ((C1897o4) interfaceC1781b6).f10086i;
                    C1897o4.m5776k(c1860k6);
                    c1860k6.f9947k.m5623a("getSessionId has been disabled.");
                }
                lValueOf = null;
                obj2 = this.f34092b;
                if (lValueOf == null) {
                    ((InterfaceC2843t0) obj2).mo8058U(null);
                    return;
                }
                C1900o7 c1900o9 = ((C1897o4) c1934s7.f10430a).f10089l;
                C1897o4.m5774i(c1900o9);
                c1900o9.m5810F((InterfaceC2843t0) obj2, lValueOf.longValue());
                return;
            case 5:
                Object obj3 = this.f34092b;
                Object obj4 = this.f34093c;
                C1881m6 c1881m6 = (C1881m6) obj4;
                InterfaceC1779b3 interfaceC1779b3 = c1881m6.f10007d;
                if (interfaceC1779b3 == null) {
                    C1860k3 c1860k7 = ((C1897o4) c1881m6.f10430a).f10086i;
                    C1897o4.m5776k(c1860k7);
                    c1860k7.f9942f.m5623a("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    C6272i.m12915i((zzq) obj3);
                    interfaceC1779b3.mo5509q((zzq) obj3);
                    ((C1881m6) obj4).m5765s();
                    return;
                } catch (RemoteException e12) {
                    C1860k3 c1860k8 = ((C1897o4) c1881m6.f10430a).f10086i;
                    C1897o4.m5776k(c1860k8);
                    c1860k8.f9942f.m5624b(e12, "Failed to send measurementEnabled to the service");
                    return;
                }
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                C1881m6.m5757u(((ServiceConnectionC1872l6) this.f34093c).f9984c, (ComponentName) this.f34092b);
                return;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                C1846i7 c1846i8 = (C1846i7) this.f34092b;
                c1846i8.m5647a();
                Runnable runnable = (Runnable) this.f34093c;
                c1846i8.mo5518f().mo5748g();
                if (c1846i8.f9875K == null) {
                    c1846i8.f9875K = new ArrayList();
                }
                c1846i8.f9875K.add(runnable);
                c1846i8.m5661t();
                return;
            case 8:
                C1846i7 c1846i9 = (C1846i7) this.f34093c;
                c1846i9.mo5518f().mo5748g();
                c1846i9.f9901k = new C1780b4(c1846i9);
                C1847j c1847j = new C1847j(c1846i9);
                c1847j.m5495j();
                c1846i9.f9893c = c1847j;
                C1802e c1802eM5640J = c1846i9.m5640J();
                C1834h4 c1834h4 = c1846i9.f9891a;
                C6272i.m12915i(c1834h4);
                c1802eM5640J.f9764c = c1834h4;
                C1899o6 c1899o6 = new C1899o6(c1846i9);
                c1899o6.m5495j();
                c1846i9.f9899i = c1899o6;
                C1775b c1775b = new C1775b(c1846i9);
                c1775b.m5495j();
                c1846i9.f9896f = c1775b;
                C1979x5 c1979x5 = new C1979x5(c1846i9);
                c1979x5.m5495j();
                c1846i9.f9898h = c1979x5;
                C1989y6 c1989y6 = new C1989y6(c1846i9);
                c1989y6.m5495j();
                c1846i9.f9895e = c1989y6;
                c1846i9.f9894d = new C1932s3(c1846i9);
                if (c1846i9.f9876L != c1846i9.f9877M) {
                    c1846i9.mo5517e().f9942f.m5625c(Integer.valueOf(c1846i9.f9876L), Integer.valueOf(c1846i9.f9877M), "Not all upload components initialized");
                }
                c1846i9.f9872H = true;
                c1846i9.mo5518f().mo5748g();
                C1847j c1847j2 = c1846i9.f9893c;
                C1846i7.m5629H(c1847j2);
                c1847j2.m5683Q();
                if (c1846i9.f9899i.f10096g.m5897a() == 0) {
                    C1959v3 c1959v3 = c1846i9.f9899i.f10096g;
                    ((C7499b) c1846i9.mo5514b()).getClass();
                    c1959v3.m5898b(System.currentTimeMillis());
                }
                c1846i9.m5635C();
                return;
            case 9:
                C3121l c3121l = (C3121l) this.f34092b;
                C8538f1 c8538f1 = (C8538f1) this.f34093c;
                c3121l.getClass();
                c3121l.f15947a.m8968a((String) c8538f1.f33657b, c8538f1.f45842c, c8538f1.f45843d);
                return;
            case 10:
                synchronized (((C9904e) this.f34093c).f50536c) {
                    Object obj5 = ((C9904e) this.f34093c).f50537d;
                    if (((C5298b1) obj5) != null) {
                        C5298b1 c5298b1 = (C5298b1) obj5;
                        C9262j c9262j = (C9262j) c5298b1.f33572a;
                        C9907h c9907h = (C9907h) c5298b1.f33573b;
                        synchronized (c9262j.f47957f) {
                            c9262j.f47956e.remove(c9907h);
                        }
                    }
                    break;
                }
                return;
            default:
                synchronized (((C9904e) this.f34093c).f50536c) {
                    Object obj6 = ((C9904e) this.f34093c).f50537d;
                    if (((InterfaceC9901b) obj6) != null) {
                        InterfaceC9901b interfaceC9901b = (InterfaceC9901b) obj6;
                        C9910k c9910k = (C9910k) this.f34092b;
                        synchronized (c9910k.f50543a) {
                            if (!c9910k.f50545c) {
                                throw new IllegalStateException("Task is not yet complete");
                            }
                            Exception exc = c9910k.f50547e;
                            if (exc != null) {
                                throw new RuntimeExecutionException(exc);
                            }
                            obj = c9910k.f50546d;
                        }
                        interfaceC9901b.mo11402a(obj);
                    }
                }
                return;
        }
    }
}
