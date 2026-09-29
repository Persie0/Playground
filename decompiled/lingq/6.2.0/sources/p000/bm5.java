package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class bm5 {

    /* JADX INFO: renamed from: e */
    public static final Executor f8685e;

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f8686a = new LinkedHashSet(1);

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f8687b = new LinkedHashSet(1);

    /* JADX INFO: renamed from: c */
    public final Handler f8688c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    public volatile zl5 f8689d = null;

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            f8685e = new ExecutorC3014fu(1);
        } else {
            f8685e = Executors.newCachedThreadPool(new cm5());
        }
    }

    public bm5(Callable callable, boolean z) {
        if (z) {
            try {
                m3876d((zl5) callable.call());
                return;
            } catch (Throwable th) {
                m3876d(new zl5(th));
                return;
            }
        }
        Executor executor = f8685e;
        am5 am5Var = new am5(callable);
        am5Var.f828b = this;
        executor.execute(am5Var);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m3873a(xl5 xl5Var) {
        Throwable th;
        try {
            zl5 zl5Var = this.f8689d;
            if (zl5Var != null && (th = zl5Var.f71702b) != null) {
                xl5Var.onResult(th);
            }
            this.f8687b.add(xl5Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m3874b(xl5 xl5Var) {
        gl5 gl5Var;
        try {
            zl5 zl5Var = this.f8689d;
            if (zl5Var != null && (gl5Var = zl5Var.f71701a) != null) {
                xl5Var.onResult(gl5Var);
            }
            this.f8686a.add(xl5Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3875c() {
        zl5 zl5Var = this.f8689d;
        if (zl5Var == null) {
            return;
        }
        gl5 gl5Var = zl5Var.f71701a;
        if (gl5Var != null) {
            synchronized (this) {
                Iterator it = new ArrayList(this.f8686a).iterator();
                while (it.hasNext()) {
                    ((xl5) it.next()).onResult(gl5Var);
                }
            }
            return;
        }
        Throwable th = zl5Var.f71702b;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.f8687b);
            if (arrayList.isEmpty()) {
                tj5.m22152d("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((xl5) it2.next()).onResult(th);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3876d(zl5 zl5Var) {
        if (this.f8689d != null) {
            C3386nv.m17633t("A task may only be set once.");
            return;
        }
        this.f8689d = zl5Var;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m3875c();
        } else {
            this.f8688c.post(new RunnableC3781y2(this, 27));
        }
    }

    public bm5(gl5 gl5Var) {
        m3876d(new zl5(gl5Var));
    }
}
