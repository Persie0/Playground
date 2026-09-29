package p000;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import androidx.loader.content.ModernAsyncTask$Status;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class leb {

    /* JADX INFO: renamed from: a */
    public ih5 f49565a;

    /* JADX INFO: renamed from: b */
    public boolean f49566b = false;

    /* JADX INFO: renamed from: c */
    public boolean f49567c = false;

    /* JADX INFO: renamed from: d */
    public boolean f49568d = true;

    /* JADX INFO: renamed from: e */
    public boolean f49569e = false;

    /* JADX INFO: renamed from: f */
    public Executor f49570f;

    /* JADX INFO: renamed from: g */
    public volatile RunnableC3700vw f49571g;

    /* JADX INFO: renamed from: h */
    public volatile RunnableC3700vw f49572h;

    /* JADX INFO: renamed from: i */
    public final Semaphore f49573i;

    /* JADX INFO: renamed from: j */
    public final Set f49574j;

    public leb(Context context, Set set) {
        context.getApplicationContext();
        this.f49573i = new Semaphore(0);
        this.f49574j = set;
    }

    /* JADX INFO: renamed from: a */
    public final void m16152a() {
        if (this.f49571g != null) {
            boolean z = this.f49566b;
            if (!z) {
                if (z) {
                    m16154c();
                } else {
                    this.f49569e = true;
                }
            }
            RunnableC3700vw runnableC3700vw = this.f49572h;
            RunnableC3700vw runnableC3700vw2 = this.f49571g;
            if (runnableC3700vw != null) {
                runnableC3700vw2.getClass();
                this.f49571g = null;
                return;
            }
            runnableC3700vw2.getClass();
            RunnableC3700vw runnableC3700vw3 = this.f49571g;
            runnableC3700vw3.f65999c.set(true);
            if (runnableC3700vw3.f65997a.cancel(false)) {
                this.f49572h = this.f49571g;
            }
            this.f49571g = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m16153b() {
        if (this.f49572h != null || this.f49571g == null) {
            return;
        }
        this.f49571g.getClass();
        if (this.f49570f == null) {
            this.f49570f = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        RunnableC3700vw runnableC3700vw = this.f49571g;
        Executor executor = this.f49570f;
        if (runnableC3700vw.f65998b == ModernAsyncTask$Status.PENDING) {
            runnableC3700vw.f65998b = ModernAsyncTask$Status.RUNNING;
            executor.execute(runnableC3700vw.f65997a);
            return;
        }
        int i = a16.f64a[runnableC3700vw.f65998b.ordinal()];
        if (i == 1) {
            C3386nv.m17633t("Cannot execute task: the task is already running.");
        } else if (i != 2) {
            C3386nv.m17633t("We should never reach this state");
        } else {
            C3386nv.m17633t("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m16154c() {
        m16152a();
        this.f49571g = new RunnableC3700vw(this);
        m16153b();
    }

    /* JADX INFO: renamed from: d */
    public final void m16155d() {
        Iterator it = this.f49574j.iterator();
        if (it.hasNext()) {
            ((vcb) it.next()).getClass();
            ij6.m13946b();
            return;
        }
        try {
            this.f49573i.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=0}");
        return sb.toString();
    }
}
