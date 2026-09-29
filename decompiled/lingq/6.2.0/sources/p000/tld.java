package p000;

import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class tld extends Task {

    /* JADX INFO: renamed from: a */
    public final Object f62490a = new Object();

    /* JADX INFO: renamed from: b */
    public final x44 f62491b = new x44(4);

    /* JADX INFO: renamed from: c */
    public boolean f62492c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f62493d;

    /* JADX INFO: renamed from: e */
    public Object f62494e;

    /* JADX INFO: renamed from: f */
    public Exception f62495f;

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: a */
    public final void mo5959a(Executor executor, sr6 sr6Var) {
        this.f62491b.m24268e(new aec(executor, sr6Var));
        m22205t();
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: b */
    public final void mo5960b(Executor executor, tr6 tr6Var) {
        this.f62491b.m24268e(new aec(executor, tr6Var));
        m22205t();
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: c */
    public final tld mo5961c(yr6 yr6Var) {
        mo5962d(xr9.f68587a, yr6Var);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: d */
    public final tld mo5962d(Executor executor, yr6 yr6Var) {
        this.f62491b.m24268e(new aec(executor, yr6Var));
        m22205t();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: e */
    public final tld mo5963e(Executor executor, js6 js6Var) {
        this.f62491b.m24268e(new aec(executor, js6Var));
        m22205t();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: f */
    public final Task mo5964f(Executor executor, bm1 bm1Var) {
        tld tldVar = new tld();
        this.f62491b.m24268e(new wvb(executor, bm1Var, tldVar, 0));
        m22205t();
        return tldVar;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: g */
    public final Task mo5965g(Executor executor, bm1 bm1Var) {
        tld tldVar = new tld();
        this.f62491b.m24268e(new wvb(executor, bm1Var, tldVar, 1));
        m22205t();
        return tldVar;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: h */
    public final Exception mo5966h() {
        Exception exc;
        synchronized (this.f62490a) {
            exc = this.f62495f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: i */
    public final Object mo5967i() {
        Object obj;
        synchronized (this.f62490a) {
            try {
                lda.m16132r("Task is not yet complete", this.f62492c);
                if (this.f62493d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f62495f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.f62494e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: j */
    public final Object mo5968j() {
        Object obj;
        synchronized (this.f62490a) {
            try {
                lda.m16132r("Task is not yet complete", this.f62492c);
                if (this.f62493d) {
                    throw new CancellationException("Task is already canceled.");
                }
                boolean zIsInstance = IOException.class.isInstance(this.f62495f);
                Exception exc = this.f62495f;
                if (zIsInstance) {
                    throw ((Throwable) IOException.class.cast(exc));
                }
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.f62494e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: k */
    public final boolean mo5969k() {
        return this.f62493d;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: l */
    public final boolean mo5970l() {
        boolean z;
        synchronized (this.f62490a) {
            z = this.f62492c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: m */
    public final boolean mo5971m() {
        boolean z;
        synchronized (this.f62490a) {
            try {
                z = false;
                if (this.f62492c && !this.f62493d && this.f62495f == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: n */
    public final Task mo5972n(Executor executor, fn9 fn9Var) {
        tld tldVar = new tld();
        this.f62491b.m24268e(new aec(executor, fn9Var, tldVar));
        m22205t();
        return tldVar;
    }

    /* JADX INFO: renamed from: o */
    public final Task m22200o(tr6 tr6Var) {
        this.f62491b.m24268e(new aec(xr9.f68587a, tr6Var));
        m22205t();
        return this;
    }

    /* JADX INFO: renamed from: p */
    public final void m22201p(Object obj) {
        synchronized (this.f62490a) {
            if (this.f62492c) {
                throw DuplicateTaskCompletionException.m5958a(this);
            }
            this.f62492c = true;
            this.f62494e = obj;
        }
        this.f62491b.m24269f(this);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m22202q(Object obj) {
        synchronized (this.f62490a) {
            try {
                if (this.f62492c) {
                    return false;
                }
                this.f62492c = true;
                this.f62494e = obj;
                this.f62491b.m24269f(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m22203r(Exception exc) {
        lda.m16131q(exc, "Exception must not be null");
        synchronized (this.f62490a) {
            if (this.f62492c) {
                throw DuplicateTaskCompletionException.m5958a(this);
            }
            this.f62492c = true;
            this.f62495f = exc;
        }
        this.f62491b.m24269f(this);
    }

    /* JADX INFO: renamed from: s */
    public final void m22204s() {
        synchronized (this.f62490a) {
            try {
                if (this.f62492c) {
                    return;
                }
                this.f62492c = true;
                this.f62493d = true;
                this.f62491b.m24269f(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m22205t() {
        synchronized (this.f62490a) {
            try {
                if (this.f62492c) {
                    this.f62491b.m24269f(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
