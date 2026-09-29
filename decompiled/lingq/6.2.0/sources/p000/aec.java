package p000;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class aec implements rbd, js6, yr6, sr6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f561a;

    /* JADX INFO: renamed from: b */
    public final Executor f562b;

    /* JADX INFO: renamed from: c */
    public final Object f563c;

    /* JADX INFO: renamed from: d */
    public final Object f564d;

    public aec(Executor executor, sr6 sr6Var) {
        this.f561a = 0;
        this.f563c = new Object();
        this.f562b = executor;
        this.f564d = sr6Var;
    }

    @Override // p000.rbd
    /* JADX INFO: renamed from: a */
    public final void mo318a(Task task) {
        switch (this.f561a) {
            case 0:
                if (task.mo5969k()) {
                    synchronized (this.f563c) {
                        try {
                            if (((sr6) this.f564d) != null) {
                                this.f562b.execute(new RunnableC3468pp(this, 27));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            case 1:
                synchronized (this.f563c) {
                    break;
                }
                this.f562b.execute(new u62(6, this, task));
                return;
            case 2:
                if (task.mo5971m() || task.mo5969k()) {
                    return;
                }
                synchronized (this.f563c) {
                    try {
                        if (((yr6) this.f564d) != null) {
                            this.f562b.execute(new u62(8, this, task));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 3:
                if (task.mo5971m()) {
                    synchronized (this.f563c) {
                        try {
                            if (((js6) this.f564d) != null) {
                                this.f562b.execute(new u62(10, this, task));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return;
                }
                return;
            default:
                this.f562b.execute(new u62(14, this, task));
                return;
        }
    }

    @Override // p000.sr6
    /* JADX INFO: renamed from: b */
    public void mo319b() {
        ((tld) this.f564d).m22204s();
    }

    @Override // p000.js6
    /* JADX INFO: renamed from: g */
    public void mo320g(Object obj) {
        ((tld) this.f564d).m22201p(obj);
    }

    @Override // p000.yr6
    /* JADX INFO: renamed from: m */
    public void mo321m(Exception exc) {
        ((tld) this.f564d).m22203r(exc);
    }

    public aec(Executor executor, tr6 tr6Var) {
        this.f561a = 1;
        this.f563c = new Object();
        this.f562b = executor;
        this.f564d = tr6Var;
    }

    public aec(Executor executor, yr6 yr6Var) {
        this.f561a = 2;
        this.f563c = new Object();
        this.f562b = executor;
        this.f564d = yr6Var;
    }

    public aec(Executor executor, js6 js6Var) {
        this.f561a = 3;
        this.f563c = new Object();
        this.f562b = executor;
        this.f564d = js6Var;
    }

    public aec(Executor executor, fn9 fn9Var, tld tldVar) {
        this.f561a = 4;
        this.f562b = executor;
        this.f563c = fn9Var;
        this.f564d = tldVar;
    }
}
