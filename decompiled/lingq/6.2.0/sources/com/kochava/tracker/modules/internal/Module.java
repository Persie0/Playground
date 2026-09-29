package com.kochava.tracker.modules.internal;

import android.content.Context;
import com.kochava.core.job.job.internal.JobType;
import java.util.ArrayDeque;
import p000.bd4;
import p000.dm1;
import p000.j16;
import p000.mb2;
import p000.r46;
import p000.sq5;

/* JADX INFO: loaded from: classes.dex */
public abstract class Module<T extends j16> {

    /* JADX INFO: renamed from: b */
    public final sq5 f14120b;

    /* JADX INFO: renamed from: f */
    public j16 f14124f;

    /* JADX INFO: renamed from: a */
    public final Object f14119a = new Object();

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f14121c = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public final ArrayDeque f14122d = new ArrayDeque();

    /* JADX INFO: renamed from: e */
    public boolean f14123e = false;

    public Module(sq5 sq5Var) {
        this.f14120b = sq5Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m6982a() {
        j16 j16Var = this.f14124f;
        if (j16Var == null || !this.f14123e) {
            return;
        }
        while (true) {
            mb2 mb2Var = (mb2) this.f14121c.poll();
            if (mb2Var != null) {
                try {
                    dm1 dm1Var = (dm1) j16Var;
                    synchronized (dm1Var) {
                        try {
                            dm1Var.f35815f.m25090k(mb2Var);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    sq5 sq5Var = this.f14120b;
                    r46.m20374Q(sq5Var, "flushQueue.dependency", "unknown exception occurred");
                    sq5Var.m21557F(th2);
                }
            } else {
                while (true) {
                    bd4 bd4Var = (bd4) this.f14122d.poll();
                    if (bd4Var == null) {
                        return;
                    }
                    try {
                        ((dm1) j16Var).m10461c(bd4Var);
                    } catch (Throwable th3) {
                        sq5 sq5Var2 = this.f14120b;
                        r46.m20374Q(sq5Var2, "flushQueue.job", "unknown exception occurred");
                        sq5Var2.m21557F(th3);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6983b(mb2 mb2Var) {
        synchronized (this.f14119a) {
            this.f14121c.offer(mb2Var);
            m6982a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6984c(bd4 bd4Var) {
        synchronized (this.f14119a) {
            try {
                JobType jobType = bd4Var.f8371d;
                JobType jobType2 = JobType.Persistent;
                ArrayDeque arrayDeque = this.f14122d;
                if (jobType == jobType2) {
                    arrayDeque.offerFirst(bd4Var);
                } else {
                    arrayDeque.offer(bd4Var);
                }
                m6982a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo6975d();

    /* JADX INFO: renamed from: e */
    public abstract void mo6976e(Context context);

    public final T getController() {
        T t;
        synchronized (this.f14119a) {
            t = (T) this.f14124f;
        }
        return t;
    }

    public final void setController(T t) {
        synchronized (this.f14119a) {
            try {
                this.f14124f = t;
                if (t != null) {
                    mo6976e(((dm1) t).f35816g.f35077a);
                    this.f14123e = true;
                    m6982a();
                } else {
                    this.f14123e = false;
                    mo6975d();
                    this.f14121c.clear();
                    this.f14122d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
