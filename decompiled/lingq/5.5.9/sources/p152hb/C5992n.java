package p152hb;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C2548c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C2542a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC2546a;
import gb.InterfaceC5740d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import p176ib.C6254b;
import p176ib.C6272i;
import p289o5.RunnableC7930j;
import p290o6.C7967l0;
import p326q.AbstractC8451g;
import p326q.C8446b;
import p387t0.C9166r;
import p412ub.C9516e;
import p412ub.HandlerC9517f;

/* JADX INFO: renamed from: hb.n */
/* JADX INFO: loaded from: classes.dex */
public final class C5992n implements InterfaceC5951a1 {

    /* JADX INFO: renamed from: a */
    public final Context f35547a;

    /* JADX INFO: renamed from: b */
    public final C5978i0 f35548b;

    /* JADX INFO: renamed from: c */
    public final Looper f35549c;

    /* JADX INFO: renamed from: d */
    public final C5990m0 f35550d;

    /* JADX INFO: renamed from: e */
    public final C5990m0 f35551e;

    /* JADX INFO: renamed from: f */
    public final Map<C2542a.b<?>, C5990m0> f35552f;

    /* JADX INFO: renamed from: h */
    public final C2542a.e f35554h;

    /* JADX INFO: renamed from: i */
    public Bundle f35555i;

    /* JADX INFO: renamed from: m */
    public final Lock f35559m;

    /* JADX INFO: renamed from: g */
    public final Set<InterfaceC5983k> f35553g = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: j */
    public ConnectionResult f35556j = null;

    /* JADX INFO: renamed from: k */
    public ConnectionResult f35557k = null;

    /* JADX INFO: renamed from: l */
    public boolean f35558l = false;

    /* JADX INFO: renamed from: n */
    public int f35560n = 0;

    public C5992n(Context context, C5978i0 c5978i0, Lock lock, Looper looper, C2548c c2548c, C8446b c8446b, C8446b c8446b2, C6254b c6254b, C2542a.a aVar, C2542a.e eVar, ArrayList arrayList, ArrayList arrayList2, C8446b c8446b3, C8446b c8446b4) {
        this.f35547a = context;
        this.f35548b = c5978i0;
        this.f35559m = lock;
        this.f35549c = looper;
        this.f35554h = eVar;
        this.f35550d = new C5990m0(context, c5978i0, lock, looper, c2548c, c8446b2, null, c8446b4, null, arrayList2, new C9166r(this));
        this.f35551e = new C5990m0(context, c5978i0, lock, looper, c2548c, c8446b, c6254b, c8446b3, aVar, arrayList, new C7967l0(this));
        C8446b c8446b5 = new C8446b();
        Iterator it = ((AbstractC8451g.c) c8446b2.keySet()).iterator();
        while (it.hasNext()) {
            c8446b5.put((C2542a.b) it.next(), this.f35550d);
        }
        Iterator it2 = ((AbstractC8451g.c) c8446b.keySet()).iterator();
        while (it2.hasNext()) {
            c8446b5.put((C2542a.b) it2.next(), this.f35551e);
        }
        this.f35552f = Collections.unmodifiableMap(c8446b5);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ void m12444j(C5992n c5992n, int i10, boolean z10) {
        c5992n.f35548b.mo12425c(i10, z10);
        c5992n.f35557k = null;
        c5992n.f35556j = null;
    }

    /* JADX INFO: renamed from: k */
    public static void m12445k(C5992n c5992n) {
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2 = c5992n.f35556j;
        boolean z10 = true;
        boolean z11 = connectionResult2 != null && connectionResult2.m7529C();
        C5990m0 c5990m0 = c5992n.f35550d;
        if (!z11) {
            ConnectionResult connectionResult3 = c5992n.f35556j;
            C5990m0 c5990m1 = c5992n.f35551e;
            if (connectionResult3 != null) {
                ConnectionResult connectionResult4 = c5992n.f35557k;
                if (connectionResult4 == null || !connectionResult4.m7529C()) {
                    z10 = false;
                }
                if (z10) {
                    c5990m1.mo12391f();
                    ConnectionResult connectionResult5 = c5992n.f35556j;
                    C6272i.m12915i(connectionResult5);
                    c5992n.m12446h(connectionResult5);
                    return;
                }
            }
            ConnectionResult connectionResult6 = c5992n.f35556j;
            if (connectionResult6 == null || (connectionResult = c5992n.f35557k) == null) {
                return;
            }
            if (c5990m1.f35541l < c5990m0.f35541l) {
                connectionResult6 = connectionResult;
            }
            c5992n.m12446h(connectionResult6);
            return;
        }
        ConnectionResult connectionResult7 = c5992n.f35557k;
        if (!(connectionResult7 != null && connectionResult7.m7529C())) {
            ConnectionResult connectionResult8 = c5992n.f35557k;
            if (!(connectionResult8 != null && connectionResult8.f13857b == 4)) {
                if (connectionResult8 != null) {
                    if (c5992n.f35560n == 1) {
                        c5992n.m12447i();
                        return;
                    } else {
                        c5992n.m12446h(connectionResult8);
                        c5990m0.mo12391f();
                        return;
                    }
                }
                return;
            }
        }
        int i10 = c5992n.f35560n;
        if (i10 == 1) {
            c5992n.m12447i();
        } else if (i10 != 2) {
            Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
        } else {
            C5978i0 c5978i0 = c5992n.f35548b;
            C6272i.m12915i(c5978i0);
            c5978i0.mo12424b(c5992n.f35555i);
            c5992n.m12447i();
        }
        c5992n.f35560n = 0;
    }

    @Override // p152hb.InterfaceC5951a1
    /* JADX INFO: renamed from: a */
    public final void mo12386a() {
        this.f35560n = 2;
        this.f35558l = false;
        this.f35557k = null;
        this.f35556j = null;
        this.f35550d.mo12386a();
        this.f35551e.mo12386a();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p152hb.InterfaceC5951a1
    /* JADX INFO: renamed from: b */
    public final boolean mo12387b(InterfaceC5983k interfaceC5983k) {
        this.f35559m.lock();
        try {
            Lock lock = this.f35559m;
            lock.lock();
            try {
                boolean z10 = this.f35560n == 2;
                lock.unlock();
                if ((!z10 && !mo12388c()) || (this.f35551e.f35540k instanceof C6013u)) {
                    this.f35559m.unlock();
                    return false;
                }
                this.f35553g.add(interfaceC5983k);
                if (this.f35560n == 0) {
                    this.f35560n = 1;
                }
                this.f35557k = null;
                this.f35551e.mo12386a();
                this.f35559m.unlock();
                return true;
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f35559m.unlock();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p152hb.InterfaceC5951a1
    /* JADX INFO: renamed from: c */
    public final boolean mo12388c() {
        this.f35559m.lock();
        try {
            boolean z10 = false;
            if (this.f35550d.f35540k instanceof C6013u) {
                if (this.f35551e.f35540k instanceof C6013u) {
                    z10 = true;
                } else {
                    ConnectionResult connectionResult = this.f35557k;
                    if ((connectionResult != null && connectionResult.f13857b == 4) || this.f35560n == 1) {
                        z10 = true;
                    }
                }
            }
            this.f35559m.unlock();
            return z10;
        } catch (Throwable th2) {
            this.f35559m.unlock();
            throw th2;
        }
    }

    @Override // p152hb.InterfaceC5951a1
    /* JADX INFO: renamed from: d */
    public final <A, T extends AbstractC2546a<? extends InterfaceC5740d, A>> T mo12389d(T t10) {
        PendingIntent activity;
        C5990m0 c5990m0 = this.f35552f.get(t10.f13914m);
        C6272i.m12916j(c5990m0, "GoogleApiClient is not configured to use the API required for this call.");
        if (!c5990m0.equals(this.f35551e)) {
            C5990m0 c5990m1 = this.f35550d;
            c5990m1.getClass();
            t10.m7570i();
            return (T) c5990m1.f35540k.mo12413g(t10);
        }
        ConnectionResult connectionResult = this.f35557k;
        if (!(connectionResult != null && connectionResult.f13857b == 4)) {
            C5990m0 c5990m2 = this.f35551e;
            c5990m2.getClass();
            t10.m7570i();
            return (T) c5990m2.f35540k.mo12413g(t10);
        }
        C2542a.e eVar = this.f35554h;
        if (eVar == null) {
            activity = null;
        } else {
            activity = PendingIntent.getActivity(this.f35547a, System.identityHashCode(this.f35548b), eVar.mo7552r(), C9516e.f49021a | 134217728);
        }
        t10.m7581l(new Status(4, activity, null));
        return t10;
    }

    @Override // p152hb.InterfaceC5951a1
    /* JADX INFO: renamed from: e */
    public final void mo12390e() {
        Lock lock = this.f35559m;
        lock.lock();
        try {
            lock.lock();
            try {
                boolean z10 = this.f35560n == 2;
                lock.unlock();
                this.f35551e.mo12391f();
                int i10 = 4;
                this.f35557k = new ConnectionResult(4);
                if (z10) {
                    new HandlerC9517f(this.f35549c).post(new RunnableC7930j(i10, this));
                } else {
                    m12447i();
                }
                lock.unlock();
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            lock.unlock();
            throw th3;
        }
    }

    @Override // p152hb.InterfaceC5951a1
    /* JADX INFO: renamed from: f */
    public final void mo12391f() {
        this.f35557k = null;
        this.f35556j = null;
        this.f35560n = 0;
        this.f35550d.mo12391f();
        this.f35551e.mo12391f();
        m12447i();
    }

    @Override // p152hb.InterfaceC5951a1
    /* JADX INFO: renamed from: g */
    public final void mo12392g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f35551e.mo12392g(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f35550d.mo12392g(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: renamed from: h */
    public final void m12446h(ConnectionResult connectionResult) {
        int i10 = this.f35560n;
        if (i10 == 1) {
            m12447i();
        } else if (i10 != 2) {
            Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
        } else {
            this.f35548b.mo12426i(connectionResult);
            m12447i();
        }
        this.f35560n = 0;
    }

    /* JADX INFO: renamed from: i */
    public final void m12447i() {
        Set<InterfaceC5983k> set = this.f35553g;
        Iterator<InterfaceC5983k> it = set.iterator();
        while (it.hasNext()) {
            it.next().mo10910a();
        }
        set.clear();
    }
}
