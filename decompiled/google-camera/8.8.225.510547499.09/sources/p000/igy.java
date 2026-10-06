package p000;

import android.net.ConnectivityManager;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class igy implements kba {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f30892a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f30893b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f30894c;

    public /* synthetic */ igy(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback, int i) {
        this.f30894c = i;
        this.f30892a = connectivityManager;
        this.f30893b = networkCallback;
    }

    public /* synthetic */ igy(igz igzVar, ViewTreeObserver viewTreeObserver, int i) {
        this.f30894c = i;
        this.f30892a = igzVar;
        this.f30893b = viewTreeObserver;
    }

    public igy(jwf jwfVar, juu juuVar, int i) {
        this.f30894c = i;
        this.f30892a = jwfVar;
        this.f30893b = juuVar;
    }

    public /* synthetic */ igy(jxa jxaVar, AtomicBoolean atomicBoolean, int i) {
        this.f30894c = i;
        this.f30893b = jxaVar;
        this.f30892a = atomicBoolean;
    }

    public /* synthetic */ igy(kba kbaVar, kba kbaVar2, int i) {
        this.f30894c = i;
        this.f30893b = kbaVar;
        this.f30892a = kbaVar2;
    }

    public /* synthetic */ igy(kdx kdxVar, kea keaVar, int i) {
        this.f30894c = i;
        this.f30893b = kdxVar;
        this.f30892a = keaVar;
    }

    public /* synthetic */ igy(kgt kgtVar, Runnable runnable, int i) {
        this.f30894c = i;
        this.f30893b = kgtVar;
        this.f30892a = runnable;
    }

    public /* synthetic */ igy(kjm kjmVar, Runnable runnable, int i) {
        this.f30894c = i;
        this.f30893b = kjmVar;
        this.f30892a = runnable;
    }

    public /* synthetic */ igy(kjm kjmVar, jvb jvbVar, int i) {
        this.f30894c = i;
        this.f30892a = kjmVar;
        this.f30893b = jvbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewTreeObserver$OnScrollChangedListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kba] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kba] */
    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        switch (this.f30894c) {
            case 0:
                ?? r0 = this.f30892a;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f30893b;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(r0);
                    return;
                }
                return;
            case 1:
                ?? r1 = this.f30892a;
                ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) this.f30893b;
                if (viewTreeObserver2.isAlive()) {
                    viewTreeObserver2.removeOnGlobalLayoutListener(r1);
                    return;
                }
                return;
            case 2:
                ((ConnectivityManager) this.f30892a).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) this.f30893b);
                return;
            case 3:
                ((jwf) this.f30892a).f34940b.remove(this.f30893b);
                return;
            case 4:
                Object obj = this.f30893b;
                if (((AtomicBoolean) this.f30892a).getAndSet(true)) {
                    return;
                }
                jxa jxaVar = (jxa) obj;
                jxaVar.f34941c.execute(new juz(jxaVar, 11));
                return;
            case 5:
                Object obj2 = this.f30893b;
                Object obj3 = this.f30892a;
                synchronized (obj2) {
                    ((kdx) obj2).f35703a.remove(obj3);
                    break;
                }
                return;
            case 6:
                Object obj4 = this.f30893b;
                Object obj5 = this.f30892a;
                synchronized (obj4) {
                    ((kgt) obj4).f35966b.remove(obj5);
                    break;
                }
                return;
            case 7:
                ((kjm) this.f30892a).f36280i.post(new jzq((jvb) this.f30893b, 12));
                return;
            case 8:
                Object obj6 = this.f30893b;
                Object obj7 = this.f30892a;
                kkk kkkVar = ((kjm) obj6).f36275d;
                synchronized (kkkVar.f36371b) {
                    kkkVar.f36371b.remove(obj7);
                    break;
                }
                return;
            default:
                ?? r2 = this.f30893b;
                ?? r3 = this.f30892a;
                r2.close();
                r3.close();
                return;
        }
    }
}
