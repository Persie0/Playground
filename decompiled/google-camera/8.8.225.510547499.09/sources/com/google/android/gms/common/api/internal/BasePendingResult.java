package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000.jec;
import p000.jef;
import p000.jeg;
import p000.jej;
import p000.jel;
import p000.jeu;
import p000.jfb;
import p000.jfc;
import p000.jfd;
import p000.jfn;
import p000.jgi;
import p000.jib;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class BasePendingResult extends jeg {

    /* JADX INFO: renamed from: c */
    public static final ThreadLocal f7611c = new jfb();

    /* JADX INFO: renamed from: d */
    public jel f7614d;

    /* JADX INFO: renamed from: h */
    private Status f7618h;

    /* JADX INFO: renamed from: i */
    private volatile boolean f7619i;

    /* JADX INFO: renamed from: j */
    private boolean f7620j;

    /* JADX INFO: renamed from: k */
    private volatile jeu f7621k;
    private jfd mResultGuardian;

    /* JADX INFO: renamed from: a */
    private final Object f7612a = new Object();

    /* JADX INFO: renamed from: b */
    private final CountDownLatch f7613b = new CountDownLatch(1);

    /* JADX INFO: renamed from: f */
    private final ArrayList f7616f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private final AtomicReference f7617g = new AtomicReference();

    /* JADX INFO: renamed from: e */
    public boolean f7615e = false;

    @Deprecated
    BasePendingResult() {
        new jfc(Looper.getMainLooper());
        new WeakReference(null);
    }

    /* JADX INFO: renamed from: h */
    public static void m4646h(jel jelVar) {
        if (jelVar instanceof jej) {
            try {
                ((jej) jelVar).mo12970ck();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(String.valueOf(jelVar))), e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected abstract jel mo4647a(Status status);

    @Deprecated
    /* JADX INFO: renamed from: g */
    public final void m4648g(Status status) {
        synchronized (this.f7612a) {
            if (!m4650j()) {
                m4649i(mo4647a(status));
                this.f7620j = true;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m4649i(jel jelVar) {
        synchronized (this.f7612a) {
            if (this.f7620j) {
                m4646h(jelVar);
                return;
            }
            m4650j();
            jib.m13202g(!m4650j(), "Results have already been set");
            jib.m13202g(!this.f7619i, "Result has already been consumed");
            this.f7614d = jelVar;
            this.f7618h = jelVar.mo4644a();
            this.f7613b.countDown();
            if (this.f7614d instanceof jej) {
                this.mResultGuardian = new jfd(this);
            }
            ArrayList arrayList = this.f7616f;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((jef) arrayList.get(i)).mo12969a(this.f7618h);
            }
            this.f7616f.clear();
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4650j() {
        return this.f7613b.getCount() == 0;
    }

    @Override // p000.jeg
    /* JADX INFO: renamed from: k */
    public final void mo4651k(jef jefVar) {
        jib.m13197b(jefVar != null, "Callback cannot be null.");
        synchronized (this.f7612a) {
            if (m4650j()) {
                jefVar.mo12969a(this.f7618h);
            } else {
                this.f7616f.add(jefVar);
            }
        }
    }

    @Override // p000.jeg
    /* JADX INFO: renamed from: l */
    public final jel mo4652l(TimeUnit timeUnit) {
        jel jelVar;
        jib.m13202g(!this.f7619i, "Result has already been consumed.");
        jib.m13202g(true, "Cannot await if then() has been called.");
        try {
            if (!this.f7613b.await(0L, timeUnit)) {
                m4648g(Status.f7604d);
            }
        } catch (InterruptedException e) {
            m4648g(Status.f7602b);
        }
        jib.m13202g(m4650j(), "Result is not ready.");
        synchronized (this.f7612a) {
            jib.m13202g(!this.f7619i, "Result has already been consumed.");
            jib.m13202g(m4650j(), "Result is not ready.");
            jelVar = this.f7614d;
            this.f7614d = null;
            this.f7619i = true;
        }
        jgi jgiVar = (jgi) this.f7617g.getAndSet(null);
        if (jgiVar != null) {
            jgiVar.m13133a();
        }
        jib.m13205j(jelVar);
        return jelVar;
    }

    protected BasePendingResult(jec jecVar) {
        new jfc(jecVar != null ? ((jfn) jecVar).f33909a.f33824g : Looper.getMainLooper());
        new WeakReference(jecVar);
    }
}
