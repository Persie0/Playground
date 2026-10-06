package p000;

import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bzz implements bzv, caa {

    /* JADX INFO: renamed from: a */
    private Object f4868a;

    /* JADX INFO: renamed from: b */
    private bzw f4869b;

    /* JADX INFO: renamed from: c */
    private boolean f4870c;

    /* JADX INFO: renamed from: d */
    private boolean f4871d;

    /* JADX INFO: renamed from: e */
    private boolean f4872e;

    /* JADX INFO: renamed from: f */
    private bsv f4873f;

    /* JADX INFO: renamed from: n */
    private final synchronized Object m3336n(Long l) {
        if (!isDone() && !cbi.m3390k()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
        if (this.f4870c) {
            throw new CancellationException();
        }
        if (this.f4872e) {
            throw new ExecutionException(this.f4873f);
        }
        if (this.f4871d) {
            return this.f4868a;
        }
        if (l == null) {
            wait(0L);
        } else if (l.longValue() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = l.longValue() + jCurrentTimeMillis;
            while (!isDone() && jCurrentTimeMillis < jLongValue) {
                wait(jLongValue - jCurrentTimeMillis);
                jCurrentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.f4872e) {
            throw new ExecutionException(this.f4873f);
        }
        if (this.f4870c) {
            throw new CancellationException();
        }
        if (!this.f4871d) {
            throw new TimeoutException();
        }
        return this.f4868a;
    }

    @Override // p000.cal
    /* JADX INFO: renamed from: a */
    public final void mo3191a(Drawable drawable) {
    }

    @Override // p000.cal
    /* JADX INFO: renamed from: b */
    public final synchronized void mo3192b(Object obj) {
    }

    @Override // p000.cal
    /* JADX INFO: renamed from: c */
    public final synchronized bzw mo3337c() {
        return this.f4869b;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.f4870c = true;
            notifyAll();
            bzw bzwVar = null;
            if (z) {
                bzw bzwVar2 = this.f4869b;
                this.f4869b = null;
                bzwVar = bzwVar2;
            }
            if (bzwVar != null) {
                bzwVar.mo3323c();
            }
            return true;
        }
    }

    @Override // p000.cal
    /* JADX INFO: renamed from: d */
    public final void mo3338d(cak cakVar) {
        cakVar.mo3358g(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p000.cal
    /* JADX INFO: renamed from: e */
    public final synchronized void mo3339e(Drawable drawable) {
    }

    @Override // p000.cal
    /* JADX INFO: renamed from: f */
    public final void mo3340f(Drawable drawable) {
    }

    @Override // p000.bza
    /* JADX INFO: renamed from: g */
    public final void mo2867g() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return m3336n(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p000.bza
    /* JADX INFO: renamed from: h */
    public final void mo2868h() {
    }

    @Override // p000.bza
    /* JADX INFO: renamed from: i */
    public final void mo2869i() {
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.f4870c;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        return this.f4870c || this.f4871d || this.f4872e;
    }

    @Override // p000.cal
    /* JADX INFO: renamed from: j */
    public final void mo3341j(cak cakVar) {
    }

    @Override // p000.cal
    /* JADX INFO: renamed from: k */
    public final synchronized void mo3342k(bzw bzwVar) {
        this.f4869b = bzwVar;
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: l */
    public final synchronized void mo3343l(bsv bsvVar) {
        this.f4872e = true;
        this.f4873f = bsvVar;
        notifyAll();
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: m */
    public final synchronized void mo3344m(Object obj) {
        this.f4871d = true;
        this.f4868a = obj;
        notifyAll();
    }

    public final String toString() {
        bzw bzwVar;
        String str;
        String strValueOf = String.valueOf(super.toString());
        synchronized (this) {
            bzwVar = null;
            if (this.f4870c) {
                str = "CANCELLED";
            } else if (this.f4872e) {
                str = "FAILURE";
            } else if (this.f4871d) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                bzwVar = this.f4869b;
            }
        }
        String strConcat = strValueOf.concat("[status=");
        if (bzwVar == null) {
            return strConcat + str + "]";
        }
        return strConcat + str + ", request=[" + bzwVar.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return m3336n(Long.valueOf(timeUnit.toMillis(j)));
    }
}
