package p289o5;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;
import cc.BinderC1987y4;
import cc.C1811f;
import cc.C1846i7;
import cc.C1860k3;
import cc.C1881m6;
import cc.C1897o4;
import cc.C1934s5;
import cc.C1985y2;
import cc.InterfaceC1779b3;
import cc.ServiceConnectionC1872l6;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.cloudmessaging.zzq;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C2557c;
import com.google.android.gms.common.internal.InterfaceC2556b;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.internal.play_billing.C2933a;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.signin.internal.zak;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.play.core.assetpacks.C3111b;
import com.google.android.play.core.assetpacks.C3123n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import p071dc.C5143b;
import p115fb.AbstractC5498n;
import p115fb.ServiceConnectionC5495k;
import p136gc.AbstractC5751g;
import p136gc.C5753i;
import p136gc.C5756l;
import p136gc.C5761q;
import p136gc.ExecutorC5760p;
import p136gc.InterfaceC5745a;
import p136gc.InterfaceC5748d;
import p136gc.InterfaceC5750f;
import p152hb.BinderC5973g1;
import p152hb.C6017v0;
import p152hb.InterfaceC5970f1;
import p176ib.C6272i;
import p338qd.C8553k1;
import p338qd.C8593y0;
import p413ud.InterfaceC9518a;

/* JADX INFO: renamed from: o5.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC7933m implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43224a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f43225b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f43226c;

    public /* synthetic */ RunnableC7933m(Object obj, int i10, Object obj2) {
        this.f43224a = i10;
        this.f43225b = obj;
        this.f43226c = obj2;
    }

    public /* synthetic */ RunnableC7933m(Object obj, Object obj2, int i10) {
        this.f43224a = i10;
        this.f43226c = obj;
        this.f43225b = obj2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    private final void m15748a() {
        C3111b c3111b = (C3111b) this.f43225b;
        synchronized (c3111b) {
            Iterator it = new HashSet(c3111b.f49026d).iterator();
            while (it.hasNext()) {
                ((InterfaceC9518a) it.next()).m17980a();
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // java.lang.Runnable
    public final void run() {
        Set<Scope> set;
        C7940t c7940t;
        InterfaceC2556b c2557c = null;
        switch (this.f43224a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                Future future = (Future) this.f43225b;
                Runnable runnable = (Runnable) this.f43226c;
                if (!future.isDone() && !future.isCancelled()) {
                    future.cancel(true);
                    C2933a.m8515g("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                return;
            case 1:
                ServiceConnectionC5495k serviceConnectionC5495k = (ServiceConnectionC5495k) this.f43225b;
                int i10 = ((AbstractC5498n) this.f43226c).f34102a;
                synchronized (serviceConnectionC5495k) {
                    try {
                        AbstractC5498n<?> abstractC5498n = serviceConnectionC5495k.f34098e.get(i10);
                        if (abstractC5498n != null) {
                            StringBuilder sb2 = new StringBuilder(31);
                            sb2.append("Timing out request: ");
                            sb2.append(i10);
                            Log.w("MessengerIpcClient", sb2.toString());
                            serviceConnectionC5495k.f34098e.remove(i10);
                            abstractC5498n.m11724c(new zzq("Timed out waiting for response", null));
                            serviceConnectionC5495k.m11720c();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 2:
                BinderC5973g1 binderC5973g1 = (BinderC5973g1) this.f43226c;
                zak zakVar = (zak) this.f43225b;
                C5143b c5143b = BinderC5973g1.f35486h;
                ConnectionResult connectionResult = zakVar.f14658b;
                if (connectionResult.m7529C()) {
                    zav zavVar = zakVar.f14659c;
                    C6272i.m12915i(zavVar);
                    ConnectionResult connectionResult2 = zavVar.f13977c;
                    if (!connectionResult2.m7529C()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult2)), new Exception());
                        ((C6017v0) binderC5973g1.f35493g).m12468b(connectionResult2);
                        binderC5973g1.f35492f.mo7545i();
                        return;
                    }
                    InterfaceC5970f1 interfaceC5970f1 = binderC5973g1.f35493g;
                    IBinder iBinder = zavVar.f13976b;
                    if (iBinder != null) {
                        int i11 = InterfaceC2556b.a.f13970a;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        c2557c = iInterfaceQueryLocalInterface instanceof InterfaceC2556b ? (InterfaceC2556b) iInterfaceQueryLocalInterface : new C2557c(iBinder);
                    }
                    C6017v0 c6017v0 = (C6017v0) interfaceC5970f1;
                    c6017v0.getClass();
                    if (c2557c == null || (set = binderC5973g1.f35490d) == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        c6017v0.m12468b(new ConnectionResult(4));
                    } else {
                        c6017v0.f35610c = c2557c;
                        c6017v0.f35611d = set;
                        if (c6017v0.f35612e) {
                            c6017v0.f35608a.mo7541e(c2557c, set);
                        }
                    }
                    binderC5973g1.f35492f.mo7545i();
                    return;
                }
                ((C6017v0) binderC5973g1.f35493g).m12468b(connectionResult);
                binderC5973g1.f35492f.mo7545i();
                return;
            case 3:
                BinderC1987y4 binderC1987y4 = (BinderC1987y4) this.f43226c;
                binderC1987y4.f10411a.m5647a();
                C1846i7 c1846i7 = binderC1987y4.f10411a;
                com.google.android.gms.measurement.internal.zzq zzqVar = (com.google.android.gms.measurement.internal.zzq) this.f43225b;
                c1846i7.mo5518f().mo5748g();
                c1846i7.m5648g();
                C6272i.m12912f(zzqVar.f14638a);
                C1811f c1811fM5593b = C1811f.m5593b(zzqVar.f14633Q);
                String str = zzqVar.f14638a;
                C1811f c1811fM5641K = c1846i7.m5641K(str);
                c1846i7.mo5517e().f9938I.m5625c(str, c1811fM5593b, "Setting consent, package, consent");
                c1846i7.m5659r(str, c1811fM5593b);
                if (c1811fM5593b.m5598g(c1811fM5641K, (zzah[]) c1811fM5593b.f9789a.keySet().toArray(new zzah[0]))) {
                    c1846i7.m5657p(zzqVar);
                    return;
                }
                return;
            case 4:
                synchronized (((AtomicReference) this.f43225b)) {
                    try {
                        AtomicReference atomicReference = (AtomicReference) this.f43225b;
                        Object obj = this.f43226c;
                        atomicReference.set(Integer.valueOf(((C1897o4) ((C1934s5) obj).f10430a).f10084g.m5576k(((C1897o4) ((C1934s5) obj).f10430a).m5785p().m5530m(), C1985y2.f10327O)));
                        ((AtomicReference) this.f43225b).notify();
                    } catch (Throwable th3) {
                        ((AtomicReference) this.f43225b).notify();
                        throw th3;
                    }
                }
                return;
            case 5:
                Object obj2 = this.f43225b;
                Object obj3 = this.f43226c;
                C1881m6 c1881m6 = (C1881m6) obj3;
                InterfaceC1779b3 interfaceC1779b3 = c1881m6.f10007d;
                if (interfaceC1779b3 == null) {
                    C1860k3 c1860k3 = ((C1897o4) c1881m6.f10430a).f10086i;
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9942f.m5623a("Failed to send consent settings to service");
                    return;
                }
                try {
                    C6272i.m12915i((com.google.android.gms.measurement.internal.zzq) obj2);
                    interfaceC1779b3.mo5511x0((com.google.android.gms.measurement.internal.zzq) obj2);
                    ((C1881m6) obj3).m5765s();
                    return;
                } catch (RemoteException e10) {
                    C1860k3 c1860k4 = ((C1897o4) c1881m6.f10430a).f10086i;
                    C1897o4.m5776k(c1860k4);
                    c1860k4.f9942f.m5624b(e10, "Failed to send consent settings to the service");
                    return;
                }
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                synchronized (((ServiceConnectionC1872l6) this.f43226c)) {
                    ((ServiceConnectionC1872l6) this.f43226c).f9982a = false;
                    if (!((ServiceConnectionC1872l6) this.f43226c).f9984c.m5760n()) {
                        C1860k3 c1860k5 = ((C1897o4) ((ServiceConnectionC1872l6) this.f43226c).f9984c.f10430a).f10086i;
                        C1897o4.m5776k(c1860k5);
                        c1860k5.f9937H.m5623a("Connected to remote service");
                        C1881m6 c1881m7 = ((ServiceConnectionC1872l6) this.f43226c).f9984c;
                        InterfaceC1779b3 interfaceC1779b4 = (InterfaceC1779b3) this.f43225b;
                        c1881m7.mo5748g();
                        C6272i.m12915i(interfaceC1779b4);
                        c1881m7.f10007d = interfaceC1779b4;
                        c1881m7.m5765s();
                        c1881m7.m5764r();
                    }
                    break;
                }
                return;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                C1934s5 c1934s5 = ((AppMeasurementDynamiteService) this.f43226c).f14599a.f10060K;
                C1897o4.m5775j(c1934s5);
                C7940t c7940t2 = (C7940t) this.f43225b;
                c1934s5.mo5748g();
                c1934s5.m5851h();
                if (c7940t2 != null && c7940t2 != (c7940t = c1934s5.f10190d)) {
                    C6272i.m12917k("EventInterceptor already set.", c7940t == null);
                }
                c1934s5.f10190d = c7940t2;
                return;
            case 8:
                Object obj4 = this.f43225b;
                boolean zMo12109k = ((AbstractC5751g) obj4).mo12109k();
                Object obj5 = this.f43226c;
                if (zMo12109k) {
                    ((C5761q) ((C5756l) obj5).f34827d).m12124r();
                    return;
                }
                try {
                    ((C5761q) ((C5756l) obj5).f34827d).m12123q(((InterfaceC5745a) ((C5756l) obj5).f34826c).mo5485i((AbstractC5751g) obj4));
                    return;
                } catch (RuntimeExecutionException e11) {
                    if (e11.getCause() instanceof Exception) {
                        ((C5761q) ((C5756l) obj5).f34827d).m12122p((Exception) e11.getCause());
                        return;
                    } else {
                        ((C5761q) ((C5756l) obj5).f34827d).m12122p(e11);
                        return;
                    }
                } catch (Exception e12) {
                    ((C5761q) ((C5756l) obj5).f34827d).m12122p(e12);
                    return;
                }
            case 9:
                synchronized (((C5756l) this.f43226c).f34826c) {
                    Object obj6 = ((C5756l) this.f43226c).f34827d;
                    if (((InterfaceC5748d) obj6) != null) {
                        Exception excMo12106h = ((AbstractC5751g) this.f43225b).mo12106h();
                        C6272i.m12915i(excMo12106h);
                        ((InterfaceC5748d) obj6).mo12097b(excMo12106h);
                    }
                    break;
                }
                return;
            case 10:
                Object obj7 = this.f43226c;
                try {
                    AbstractC5751g abstractC5751gMo428f = ((InterfaceC5750f) ((C5756l) obj7).f34826c).mo428f(((AbstractC5751g) this.f43225b).mo12107i());
                    if (abstractC5751gMo428f == null) {
                        ((C5756l) obj7).mo12097b(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    ExecutorC5760p executorC5760p = C5753i.f34814b;
                    C5756l c5756l = (C5756l) obj7;
                    abstractC5751gMo428f.mo12103e(executorC5760p, c5756l);
                    abstractC5751gMo428f.mo12102d(executorC5760p, c5756l);
                    abstractC5751gMo428f.mo12099a(executorC5760p, c5756l);
                    return;
                } catch (RuntimeExecutionException e13) {
                    if (e13.getCause() instanceof Exception) {
                        ((C5756l) obj7).mo12097b((Exception) e13.getCause());
                        return;
                    } else {
                        ((C5756l) obj7).mo12097b(e13);
                        return;
                    }
                } catch (CancellationException unused) {
                    ((C5756l) obj7).mo12096d();
                    return;
                } catch (Exception e14) {
                    ((C5756l) obj7).mo12097b(e14);
                    return;
                }
            case 11:
                m15748a();
                return;
            case 12:
                ((C8593y0) this.f43225b).f46047b.mo8963a((Intent) this.f43226c);
                return;
            default:
                C3123n c3123n = (C3123n) this.f43225b;
                C8553k1 c8553k1 = (C8553k1) this.f43226c;
                c3123n.getClass();
                c3123n.f15957a.m8968a((String) c8553k1.f33657b, c8553k1.f45903d, c8553k1.f45904e);
                return;
        }
    }
}
