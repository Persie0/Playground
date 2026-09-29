package cc;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.internal.measurement.C2586a3;
import com.google.android.gms.internal.measurement.C2600b3;
import com.google.android.gms.internal.measurement.C2642e3;
import com.google.android.gms.internal.measurement.C2656f3;
import com.google.android.gms.internal.measurement.InterfaceC2695i0;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzq;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.z3 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1994z3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10426a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f10427b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f10428c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f10429d;

    public /* synthetic */ RunnableC1994z3(int i10, Object obj, Object obj2, Object obj3) {
        this.f10426a = i10;
        this.f10429d = obj;
        this.f10427b = obj2;
        this.f10428c = obj3;
    }

    public /* synthetic */ RunnableC1994z3(BinderC1987y4 binderC1987y4, String str, Bundle bundle) {
        this.f10426a = 1;
        this.f10427b = binderC1987y4;
        this.f10428c = str;
        this.f10429d = bundle;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // java.lang.Runnable
    public final void run() {
        zzau zzauVar;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        switch (this.f10426a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ServiceConnectionC1771a4 serviceConnectionC1771a4 = (ServiceConnectionC1771a4) this.f10429d;
                C1780b4 c1780b4 = serviceConnectionC1771a4.f9671b;
                InterfaceC2695i0 interfaceC2695i0 = (InterfaceC2695i0) this.f10427b;
                C1897o4 c1897o4 = c1780b4.f9684a;
                C1879m4 c1879m4 = c1897o4.f10087j;
                C1897o4.m5776k(c1879m4);
                c1879m4.mo5748g();
                Bundle bundle = new Bundle();
                bundle.putString("package_name", serviceConnectionC1771a4.f9670a);
                try {
                    if (interfaceC2695i0.mo7830e(bundle) == null) {
                        C1860k3 c1860k3 = c1897o4.f10086i;
                        C1897o4.m5776k(c1860k3);
                        c1860k3.f9942f.m5623a("Install Referrer Service returned a null response");
                        break;
                    }
                } catch (Exception e10) {
                    C1860k3 c1860k4 = c1897o4.f10086i;
                    C1897o4.m5776k(c1860k4);
                    c1860k4.f9942f.m5624b(e10.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                C1879m4 c1879m5 = c1897o4.f10087j;
                C1897o4.m5776k(c1879m5);
                c1879m5.mo5748g();
                throw new IllegalStateException("Unexpected call on client side");
            case 1:
                BinderC1987y4 binderC1987y4 = (BinderC1987y4) this.f10427b;
                String str = (String) this.f10428c;
                Bundle bundle2 = (Bundle) this.f10429d;
                C1847j c1847j = binderC1987y4.f10411a.f9893c;
                C1846i7.m5629H(c1847j);
                c1847j.mo5748g();
                c1847j.m5494h();
                InterfaceC1781b5 interfaceC1781b5 = c1847j.f10430a;
                C1897o4 c1897o5 = (C1897o4) interfaceC1781b5;
                C6272i.m12912f(str);
                C6272i.m12912f("dep");
                TextUtils.isEmpty("");
                if (bundle2 == null || bundle2.isEmpty()) {
                    zzauVar = new zzau(new Bundle());
                } else {
                    Bundle bundle3 = new Bundle(bundle2);
                    Iterator<String> it = bundle3.keySet().iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (next == null) {
                            C1860k3 c1860k5 = c1897o5.f10086i;
                            C1897o4.m5776k(c1860k5);
                            c1860k5.f9942f.m5623a("Param name can't be null");
                            it.remove();
                        } else {
                            C1900o7 c1900o7 = c1897o5.f10089l;
                            C1897o4.m5774i(c1900o7);
                            Object objM5833l = c1900o7.m5833l(bundle3.get(next), next);
                            if (objM5833l == null) {
                                C1860k3 c1860k6 = c1897o5.f10086i;
                                C1897o4.m5776k(c1860k6);
                                c1860k6.f9945i.m5624b(c1897o5.f10057H.m5604e(next), "Param value can't be null");
                                it.remove();
                            } else {
                                C1900o7 c1900o8 = c1897o5.f10089l;
                                C1897o4.m5774i(c1900o8);
                                c1900o8.m5847z(bundle3, next, objM5833l);
                            }
                        }
                    }
                    zzauVar = new zzau(bundle3);
                }
                C1864k7 c1864k7 = c1847j.f10436b.f9897g;
                C1846i7.m5629H(c1864k7);
                C2586a3 c2586a3M7672x = C2600b3.m7672x();
                c2586a3M7672x.m7899j();
                C2600b3.m7671J(0L, (C2600b3) c2586a3M7672x.f14271b);
                for (String str2 : zzauVar.f14612a.keySet()) {
                    C2642e3 c2642e3M7811x = C2656f3.m7811x();
                    c2642e3M7811x.m7766m(str2);
                    Object obj = zzauVar.f14612a.get(str2);
                    C6272i.m12915i(obj);
                    c1864k7.m5730F(c2642e3M7811x, obj);
                    c2586a3M7672x.m7638n(c2642e3M7811x);
                }
                byte[] bArrM8066g = ((C2600b3) c2586a3M7672x.m7897h()).m8066g();
                C1860k3 c1860k7 = c1897o5.f10086i;
                C1897o4.m5776k(c1860k7);
                c1860k7.f9938I.m5625c(c1897o5.f10057H.m5603d(str), Integer.valueOf(bArrM8066g.length), "Saving default event parameters, appId, data size");
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("parameters", bArrM8066g);
                try {
                    if (c1847j.m5667A().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        C1860k3 c1860k8 = ((C1897o4) interfaceC1781b5).f10086i;
                        C1897o4.m5776k(c1860k8);
                        c1860k8.f9942f.m5624b(C1860k3.m5700q(str), "Failed to insert default event parameters (got -1). appId");
                        return;
                    }
                    return;
                } catch (SQLiteException e11) {
                    C1860k3 c1860k9 = c1897o5.f10086i;
                    C1897o4.m5776k(c1860k9);
                    c1860k9.f9942f.m5625c(C1860k3.m5700q(str), e11, "Error storing default event parameters. appId");
                    return;
                }
            case 2:
                synchronized (((AtomicReference) this.f10427b)) {
                    try {
                        try {
                            C1986y3 c1986y3 = ((C1897o4) ((C1881m6) this.f10429d).f10430a).f10085h;
                            C1897o4.m5774i(c1986y3);
                            if (c1986y3.m5919n().m5597f(zzah.ANALYTICS_STORAGE)) {
                                C1881m6 c1881m6 = (C1881m6) this.f10429d;
                                InterfaceC1779b3 interfaceC1779b3 = c1881m6.f10007d;
                                if (interfaceC1779b3 != null) {
                                    C6272i.m12915i((zzq) this.f10428c);
                                    ((AtomicReference) this.f10427b).set(interfaceC1779b3.mo5503K((zzq) this.f10428c));
                                    String str3 = (String) ((AtomicReference) this.f10427b).get();
                                    if (str3 != null) {
                                        C1934s5 c1934s5 = ((C1897o4) ((C1881m6) this.f10429d).f10430a).f10060K;
                                        C1897o4.m5775j(c1934s5);
                                        c1934s5.f10193g.set(str3);
                                        C1986y3 c1986y4 = ((C1897o4) ((C1881m6) this.f10429d).f10430a).f10085h;
                                        C1897o4.m5774i(c1986y4);
                                        c1986y4.f10404f.m5914b(str3);
                                    }
                                    ((C1881m6) this.f10429d).m5765s();
                                    atomicReference = (AtomicReference) this.f10427b;
                                    atomicReference.notify();
                                    return;
                                }
                                C1860k3 c1860k10 = ((C1897o4) c1881m6.f10430a).f10086i;
                                C1897o4.m5776k(c1860k10);
                                c1860k10.f9942f.m5623a("Failed to get app instance id");
                                atomicReference2 = (AtomicReference) this.f10427b;
                            } else {
                                C1860k3 c1860k11 = ((C1897o4) ((C1881m6) this.f10429d).f10430a).f10086i;
                                C1897o4.m5776k(c1860k11);
                                c1860k11.f9947k.m5623a("Analytics storage consent denied; will not get app instance id");
                                C1934s5 c1934s6 = ((C1897o4) ((C1881m6) this.f10429d).f10430a).f10060K;
                                C1897o4.m5775j(c1934s6);
                                c1934s6.f10193g.set(null);
                                C1986y3 c1986y5 = ((C1897o4) ((C1881m6) this.f10429d).f10430a).f10085h;
                                C1897o4.m5774i(c1986y5);
                                c1986y5.f10404f.m5914b(null);
                                ((AtomicReference) this.f10427b).set(null);
                                atomicReference2 = (AtomicReference) this.f10427b;
                            }
                            atomicReference2.notify();
                            return;
                        } catch (Throwable th2) {
                            ((AtomicReference) this.f10427b).notify();
                            throw th2;
                        }
                    } catch (RemoteException e12) {
                        C1860k3 c1860k12 = ((C1897o4) ((C1881m6) this.f10429d).f10430a).f10086i;
                        C1897o4.m5776k(c1860k12);
                        c1860k12.f9942f.m5624b(e12, "Failed to get app instance id");
                        atomicReference = (AtomicReference) this.f10427b;
                    }
                }
                break;
            default:
                Object obj2 = this.f10427b;
                C1881m6 c1881m7 = (C1881m6) this.f10429d;
                InterfaceC1779b3 interfaceC1779b4 = c1881m7.f10007d;
                if (interfaceC1779b4 == null) {
                    C1860k3 c1860k13 = ((C1897o4) c1881m7.f10430a).f10086i;
                    C1897o4.m5776k(c1860k13);
                    c1860k13.f9942f.m5623a("Failed to send default event parameters to service");
                    return;
                }
                try {
                    C6272i.m12915i((zzq) obj2);
                    interfaceC1779b4.mo5510v((Bundle) this.f10428c, (zzq) obj2);
                    return;
                } catch (RemoteException e13) {
                    C1860k3 c1860k14 = ((C1897o4) c1881m7.f10430a).f10086i;
                    C1897o4.m5776k(c1860k14);
                    c1860k14.f9942f.m5624b(e13, "Failed to send default event parameters to service");
                    return;
                }
        }
    }
}
