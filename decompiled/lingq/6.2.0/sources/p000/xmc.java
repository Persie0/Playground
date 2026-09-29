package p000;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.C1045d;
import com.google.android.gms.measurement.internal.zzr;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xmc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68361a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f68362b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f68363c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f68364d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f68365e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f68366f;

    public xmc(v4d v4dVar, String str, String str2, zzr zzrVar, oub oubVar) {
        this.f68361a = 2;
        this.f68362b = str;
        this.f68364d = str2;
        this.f68363c = zzrVar;
        this.f68365e = oubVar;
        this.f68366f = v4dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        rad radVar;
        switch (this.f68361a) {
            case 0:
                eoc eocVar = (eoc) this.f68364d;
                zzr zzrVar = (zzr) this.f68363c;
                Bundle bundle = (Bundle) this.f68365e;
                cac cacVar = (cac) this.f68366f;
                String str = (String) this.f68362b;
                C1045d c1045d = eocVar.f37647f;
                c1045d.m5902V();
                try {
                    cacVar.mo4481y(c1045d.m5914d0(bundle, zzrVar));
                    return;
                } catch (RemoteException e) {
                    c1045d.mo5909b().f68080f.m17925c("Failed to return trigger URIs for app", str, e);
                    return;
                }
            case 1:
                AtomicReference atomicReference2 = (AtomicReference) this.f68364d;
                synchronized (atomicReference2) {
                    try {
                        try {
                            v4d v4dVar = (v4d) this.f68366f;
                            q9c q9cVar = v4dVar.f64866d;
                            if (q9cVar == null) {
                                xcc xccVar = ((kjc) v4dVar.f60774a).f47438f;
                                kjc.m15280l(xccVar);
                                xccVar.f68080f.m17926d("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.f68362b, (String) this.f68365e);
                                atomicReference2.set(Collections.EMPTY_LIST);
                                atomicReference2.notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                atomicReference2.set(q9cVar.mo11285C((String) this.f68362b, (String) this.f68365e, (zzr) this.f68363c));
                            } else {
                                atomicReference2.set(q9cVar.mo11296k(null, (String) this.f68362b, (String) this.f68365e));
                            }
                            v4dVar.m23116Q();
                            atomicReference = (AtomicReference) this.f68364d;
                            atomicReference.notify();
                            return;
                        } catch (RemoteException e2) {
                            xcc xccVar2 = ((kjc) ((v4d) this.f68366f).f60774a).f47438f;
                            kjc.m15280l(xccVar2);
                            xccVar2.f68080f.m17926d("(legacy) Failed to get conditional properties; remote exception", null, (String) this.f68362b, e2);
                            ((AtomicReference) this.f68364d).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f68364d;
                        }
                    } catch (Throwable th) {
                        ((AtomicReference) this.f68364d).notify();
                        throw th;
                    }
                }
                break;
            case 2:
                oub oubVar = (oub) this.f68365e;
                String str2 = (String) this.f68364d;
                String str3 = (String) this.f68362b;
                v4d v4dVar2 = (v4d) this.f68366f;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        q9c q9cVar2 = v4dVar2.f64866d;
                        if (q9cVar2 == null) {
                            kjc kjcVar = (kjc) v4dVar2.f60774a;
                            xcc xccVar3 = kjcVar.f47438f;
                            kjc.m15280l(xccVar3);
                            xccVar3.f68080f.m17925c("Failed to get conditional properties; not connected to service", str3, str2);
                            radVar = kjcVar.f47441i;
                        } else {
                            arrayList = rad.m20512w0(q9cVar2.mo11285C(str3, str2, (zzr) this.f68363c));
                            v4dVar2.m23116Q();
                            radVar = ((kjc) v4dVar2.f60774a).f47441i;
                        }
                    } catch (Throwable th2) {
                        rad radVar2 = ((kjc) v4dVar2.f60774a).f47441i;
                        kjc.m15278j(radVar2);
                        radVar2.m20557v0(oubVar, arrayList);
                        throw th2;
                    }
                } catch (RemoteException e3) {
                    xcc xccVar4 = ((kjc) v4dVar2.f60774a).f47438f;
                    kjc.m15280l(xccVar4);
                    xccVar4.f68080f.m17926d("Failed to get conditional properties; remote exception", str3, str2, e3);
                }
                kjc.m15278j(radVar);
                radVar.m20557v0(oubVar, arrayList);
                return;
            default:
                kx9 kx9Var = (kx9) this.f68364d;
                gw9 gw9Var = (gw9) this.f68363c;
                m58 m58Var = (m58) this.f68365e;
                Callable callable = (Callable) this.f68366f;
                wr9 wr9Var = (wr9) this.f68362b;
                try {
                    if (((tld) gw9Var.f41432b).mo5970l()) {
                        m58Var.m16641d();
                        return;
                    }
                    try {
                        if (!kx9Var.f48562c.get()) {
                            synchronized (kx9Var) {
                                kx9Var.f48563d.zzb();
                            }
                            kx9Var.f48562c.set(true);
                        }
                        if (((tld) gw9Var.f41432b).mo5970l()) {
                            m58Var.m16641d();
                            return;
                        }
                        Object objCall = callable.call();
                        if (((tld) gw9Var.f41432b).mo5970l()) {
                            m58Var.m16641d();
                            return;
                        } else {
                            wr9Var.m24138b(objCall);
                            return;
                        }
                    } catch (RuntimeException e4) {
                        throw new MlKitException("Internal error has occurred when executing ML Kit tasks", e4);
                    }
                } catch (Exception e5) {
                    if (((tld) gw9Var.f41432b).mo5970l()) {
                        m58Var.m16641d();
                        return;
                    } else {
                        wr9Var.m24137a(e5);
                        return;
                    }
                }
        }
    }

    public /* synthetic */ xmc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f68361a = i;
        this.f68364d = obj;
        this.f68363c = obj2;
        this.f68365e = obj3;
        this.f68366f = obj4;
        this.f68362b = obj5;
    }

    public xmc(v4d v4dVar, AtomicReference atomicReference, String str, String str2, zzr zzrVar) {
        this.f68361a = 1;
        this.f68364d = atomicReference;
        this.f68362b = str;
        this.f68365e = str2;
        this.f68363c = zzrVar;
        this.f68366f = v4dVar;
    }
}
