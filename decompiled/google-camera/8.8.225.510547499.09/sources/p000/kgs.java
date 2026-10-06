package p000;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kgs implements kfc {

    /* JADX INFO: renamed from: a */
    public final Executor f35951a;

    /* JADX INFO: renamed from: b */
    public final Deque f35952b;

    /* JADX INFO: renamed from: c */
    public final Deque f35953c;

    /* JADX INFO: renamed from: d */
    public final Deque f35954d;

    /* JADX INFO: renamed from: e */
    public final List f35955e;

    /* JADX INFO: renamed from: f */
    public final List f35956f;

    /* JADX INFO: renamed from: g */
    public boolean f35957g = false;

    /* JADX INFO: renamed from: h */
    public final kho f35958h;

    /* JADX INFO: renamed from: i */
    private final int f35959i;

    /* JADX INFO: renamed from: j */
    private final kgt f35960j;

    /* JADX INFO: renamed from: k */
    private int f35961k;

    /* JADX INFO: renamed from: l */
    private final Collection f35962l;

    /* JADX INFO: renamed from: m */
    private kfa f35963m;

    /* JADX INFO: renamed from: n */
    private final lpe f35964n;

    public kgs(kgt kgtVar, Executor executor, kho khoVar, lpe lpeVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int i2;
        this.f35960j = kgtVar;
        this.f35951a = executor;
        this.f35958h = khoVar;
        this.f35964n = lpeVar;
        this.f35961k = m14219w(khoVar, i);
        synchronized (kiu.class) {
            i2 = kiu.f36219b;
            kiu.f36219b = i2 + 1;
        }
        this.f35959i = i2;
        this.f35955e = new ArrayList();
        this.f35956f = new ArrayList();
        this.f35952b = new ArrayDeque(i);
        this.f35953c = new ArrayDeque(i);
        ArrayDeque arrayDeque = new ArrayDeque(i);
        this.f35962l = Collections.unmodifiableCollection(arrayDeque);
        this.f35954d = arrayDeque;
        ((kja) lpeVar.f38884c).f36238d.m14852d(new Object[0]);
    }

    /* JADX INFO: renamed from: u */
    private final kiq m14217u() {
        kiq kiqVarMo9781a = null;
        if (this.f35963m != null && !this.f35954d.isEmpty()) {
            kiqVarMo9781a = this.f35963m.mo9781a(this.f35962l);
            lku.m15659m(this.f35954d.contains(kiqVarMo9781a), "Trim filter returned frame not in buffer", new Object[0]);
        }
        return (this.f35954d.isEmpty() || kiqVarMo9781a != null) ? kiqVarMo9781a : (kiq) this.f35954d.peekFirst();
    }

    /* JADX INFO: renamed from: v */
    private final boolean m14218v(kiq kiqVar) {
        if (kiqVar == null) {
            return false;
        }
        lku.m15659m(this.f35954d.remove(kiqVar), "Cannot remove missing frameReference!", new Object[0]);
        kiqVar.m14359c();
        this.f35953c.addLast(kiqVar);
        return true;
    }

    /* JADX INFO: renamed from: w */
    private static int m14219w(kho khoVar, int i) {
        int i2 = khoVar.f36069e;
        return i2 == -1 ? i : Math.min(i2, i);
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: a */
    public final synchronized int mo9401a() {
        return this.f35961k;
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: b */
    public final synchronized int mo9402b() {
        return this.f35954d.size();
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: c */
    public final synchronized key mo9403c() {
        if (!this.f35957g && !this.f35954d.isEmpty()) {
            kiq kiqVar = (kiq) this.f35954d.peekFirst();
            if (kiqVar == null) {
                return null;
            }
            return kiqVar.m14357a();
        }
        return null;
    }

    @Override // p000.kfc, p000.kba, java.lang.AutoCloseable
    public final void close() {
        boolean zRemove;
        synchronized (this) {
            if (this.f35957g) {
                return;
            }
            this.f35957g = true;
            Iterator it = this.f35954d.iterator();
            while (it.hasNext()) {
                ((kiq) it.next()).m14359c();
            }
            this.f35954d.clear();
            this.f35953c.clear();
            this.f35952b.clear();
            kgt kgtVar = this.f35960j;
            synchronized (kgtVar) {
                kgtVar.f35967c.m14256v(this);
                zRemove = kgtVar.f35965a.remove(this);
            }
            if (zRemove) {
                kgtVar.m14224c();
            }
            ((kja) this.f35964n.f38884c).f36239e.m14852d(new Object[0]);
        }
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: d */
    public final synchronized key mo9404d(mrp mrpVar) {
        if (!this.f35957g && !this.f35954d.isEmpty()) {
            for (kiq kiqVar : this.f35954d) {
                if (mrpVar.mo8324a(kiqVar)) {
                    return kiqVar.m14357a();
                }
            }
            return null;
        }
        return null;
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: e */
    public final synchronized key mo9405e() {
        if (!this.f35957g && !this.f35954d.isEmpty()) {
            kiq kiqVar = (kiq) this.f35954d.peekLast();
            if (kiqVar == null) {
                return null;
            }
            return kiqVar.m14357a();
        }
        return null;
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: f */
    public final synchronized key mo9406f(mrp mrpVar) {
        if (!this.f35957g && !this.f35954d.isEmpty()) {
            for (kiq kiqVar : new ope(this.f35954d, 1)) {
                if (mrpVar.mo8324a(kiqVar)) {
                    return kiqVar.m14357a();
                }
            }
            return null;
        }
        return null;
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: g */
    public final synchronized key mo9407g() {
        if (!this.f35957g && !this.f35954d.isEmpty()) {
            kiq kiqVar = (kiq) this.f35954d.peekFirst();
            if (kiqVar == null) {
                return null;
            }
            key keyVarM14357a = kiqVar.m14357a();
            m14218v(kiqVar);
            return keyVarM14357a;
        }
        return null;
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: h */
    public final synchronized key mo9408h() {
        if (!this.f35957g && !this.f35954d.isEmpty()) {
            kiq kiqVar = (kiq) this.f35954d.peekLast();
            if (kiqVar == null) {
                return null;
            }
            key keyVarM14357a = kiqVar.m14357a();
            m14218v(kiqVar);
            return keyVarM14357a;
        }
        return null;
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: i */
    public final synchronized List mo9409i() {
        if (!this.f35957g && !this.f35954d.isEmpty()) {
            mwn mwnVarM17091f = mws.m17091f(this.f35954d.size());
            Iterator it = this.f35954d.iterator();
            while (it.hasNext()) {
                key keyVarM14357a = ((kiq) it.next()).m14357a();
                if (keyVarM14357a != null) {
                    mwnVarM17091f.m17082g(keyVarM14357a);
                }
            }
            return mwnVarM17091f.m17081f();
        }
        int i = mws.f41739d;
        return mzr.f41857a;
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: j */
    public final synchronized List mo9410j() {
        if (!this.f35957g && !this.f35954d.isEmpty()) {
            mwn mwnVarM17091f = mws.m17091f(this.f35954d.size());
            for (kiq kiqVar : this.f35954d) {
                key keyVarM14357a = kiqVar.m14357a();
                if (keyVarM14357a != null) {
                    mwnVarM17091f.m17082g(keyVarM14357a);
                }
                this.f35953c.addLast(kiqVar);
                kiqVar.m14359c();
            }
            this.f35954d.clear();
            return mwnVarM17091f.m17081f();
        }
        int i = mws.f41739d;
        return mzr.f41857a;
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: k */
    public final void mo9411k(kfb kfbVar) {
        if (kfbVar instanceof kez) {
            synchronized (this.f35956f) {
                this.f35956f.add((kez) kfbVar);
            }
        } else {
            synchronized (this.f35955e) {
                this.f35955e.add(kfbVar);
            }
        }
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: l */
    public final void mo9412l(kfb kfbVar) {
        if (kfbVar instanceof kez) {
            synchronized (this.f35956f) {
                this.f35956f.remove(kfbVar);
            }
        } else {
            synchronized (this.f35955e) {
                this.f35955e.remove(kfbVar);
            }
        }
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: m */
    public final synchronized void mo9413m(int i) {
        int i2 = this.f35961k;
        int iM14219w = m14219w(this.f35958h, i);
        this.f35961k = iM14219w;
        if (iM14219w < i2) {
            m14221s();
        }
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: n */
    public final synchronized void mo9414n(kfa kfaVar) {
        this.f35963m = kfaVar;
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: o */
    public final synchronized boolean mo9415o(kfd kfdVar) {
        kiq kiqVar;
        if (!this.f35957g && !this.f35954d.isEmpty()) {
            Iterator it = this.f35954d.iterator();
            do {
                if (!it.hasNext()) {
                    kiqVar = null;
                    break;
                }
                kiqVar = (kiq) it.next();
            } while (!mpw.m16768g(kiqVar.m14358b(), kfdVar));
            return m14218v(kiqVar);
        }
        return false;
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: p */
    public final synchronized boolean mo9416p() {
        if (!this.f35957g && !this.f35954d.isEmpty()) {
            for (kiq kiqVar : this.f35954d) {
                this.f35953c.addLast(kiqVar);
                kiqVar.m14359c();
            }
            this.f35954d.clear();
            return true;
        }
        return false;
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ kho mo9417q() {
        return this.f35958h;
    }

    /* JADX INFO: renamed from: r */
    public final synchronized long m14220r() {
        return this.f35958h.f36070f * ((long) this.f35954d.size());
    }

    /* JADX INFO: renamed from: s */
    public final void m14221s() {
        while (!this.f35952b.isEmpty() && this.f35952b.size() > this.f35961k) {
            if (this.f35953c.isEmpty()) {
                kiq kiqVarM14217u = m14217u();
                this.f35954d.remove(kiqVarM14217u);
                this.f35952b.remove(kiqVarM14217u);
                if (kiqVarM14217u != null) {
                    kiqVarM14217u.m14359c();
                }
            } else {
                kiq kiqVar = (kiq) this.f35953c.removeFirst();
                this.f35952b.remove(kiqVar);
                kiqVar.m14359c();
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final synchronized boolean m14222t() {
        return m14218v(m14217u());
    }

    public final String toString() {
        return "FrameBuffer-" + this.f35959i;
    }
}
