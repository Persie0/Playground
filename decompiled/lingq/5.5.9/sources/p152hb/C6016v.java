package p152hb;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C2542a;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
import p176ib.AbstractC6251a;
import p176ib.C6272i;

/* JADX INFO: renamed from: hb.v */
/* JADX INFO: loaded from: classes.dex */
public final class C6016v implements AbstractC6251a.c {

    /* JADX INFO: renamed from: a */
    public final WeakReference<C5966e0> f35605a;

    /* JADX INFO: renamed from: b */
    public final C2542a<?> f35606b;

    /* JADX INFO: renamed from: c */
    public final boolean f35607c;

    public C6016v(C5966e0 c5966e0, C2542a<?> c2542a, boolean z10) {
        this.f35605a = new WeakReference<>(c5966e0);
        this.f35606b = c2542a;
        this.f35607c = z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p176ib.AbstractC6251a.c
    /* JADX INFO: renamed from: a */
    public final void mo12467a(ConnectionResult connectionResult) {
        C5966e0 c5966e0 = this.f35605a.get();
        if (c5966e0 == null) {
            return;
        }
        C6272i.m12917k("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == c5966e0.f35463a.f35542m.f35513g);
        Lock lock = c5966e0.f35464b;
        lock.lock();
        try {
            if (!c5966e0.m12420n(0)) {
                lock.unlock();
                return;
            }
            if (!connectionResult.m7529C()) {
                c5966e0.m12418l(connectionResult, this.f35606b, this.f35607c);
            }
            if (c5966e0.m12421o()) {
                c5966e0.m12419m();
            }
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }
}
