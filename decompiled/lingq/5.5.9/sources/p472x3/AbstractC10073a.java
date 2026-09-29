package p472x3;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.os.OperationCanceledException;
import androidx.loader.content.ModernAsyncTask;
import com.google.android.gms.common.api.AbstractC2544c;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p070db.C5125e;
import p447w3.C9809b;

/* JADX INFO: renamed from: x3.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10073a<D> extends C10074b<D> {

    /* JADX INFO: renamed from: g */
    public final Executor f51117g;

    /* JADX INFO: renamed from: h */
    public volatile AbstractC10073a<D>.a f51118h;

    /* JADX INFO: renamed from: i */
    public volatile AbstractC10073a<D>.a f51119i;

    /* JADX INFO: renamed from: x3.a$a */
    public final class a extends ModernAsyncTask<Void, Void, D> implements Runnable {

        /* JADX INFO: renamed from: h */
        public final CountDownLatch f51120h = new CountDownLatch(1);

        public a() {
        }

        @Override // androidx.loader.content.ModernAsyncTask
        /* JADX INFO: renamed from: a */
        public final void mo3967a(Object[] objArr) {
            try {
                AbstractC10073a.this.m18917d();
            } catch (OperationCanceledException e10) {
                if (!this.f6708d.get()) {
                    throw e10;
                }
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        /* JADX INFO: renamed from: b */
        public final void mo3968b(D d10) {
            CountDownLatch countDownLatch = this.f51120h;
            try {
                AbstractC10073a abstractC10073a = AbstractC10073a.this;
                if (abstractC10073a.f51119i == this) {
                    SystemClock.uptimeMillis();
                    abstractC10073a.f51119i = null;
                    abstractC10073a.m18916c();
                }
                countDownLatch.countDown();
            } catch (Throwable th2) {
                countDownLatch.countDown();
                throw th2;
            }
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0046  */
        @Override // androidx.loader.content.ModernAsyncTask
        /* JADX INFO: renamed from: c */
        public final void mo3969c(D d10) {
            try {
                AbstractC10073a abstractC10073a = AbstractC10073a.this;
                if (abstractC10073a.f51118h != this) {
                    if (abstractC10073a.f51119i == this) {
                        SystemClock.uptimeMillis();
                        abstractC10073a.f51119i = null;
                        abstractC10073a.m18916c();
                    }
                } else if (!abstractC10073a.f51125d) {
                    SystemClock.uptimeMillis();
                    abstractC10073a.f51118h = null;
                    C10074b.a<D> aVar = abstractC10073a.f51123b;
                    if (aVar != null) {
                        C9809b.a aVar2 = (C9809b.a) aVar;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            aVar2.mo3900i(d10);
                        } else {
                            aVar2.m3963j(d10);
                        }
                    }
                }
                this.f51120h.countDown();
            } catch (Throwable th2) {
                this.f51120h.countDown();
                throw th2;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC10073a.this.m18916c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10073a(Context context) {
        super(context);
        ThreadPoolExecutor threadPoolExecutor = ModernAsyncTask.f6703f;
        this.f51117g = threadPoolExecutor;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public final void m18916c() {
        if (this.f51119i == null && this.f51118h != null) {
            this.f51118h.getClass();
            AbstractC10073a<D>.a aVar = this.f51118h;
            Executor executor = this.f51117g;
            if (aVar.f6707c != ModernAsyncTask.Status.PENDING) {
                int i10 = ModernAsyncTask.C1064d.f6713a[aVar.f6707c.ordinal()];
                if (i10 == 1) {
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                }
                if (i10 == 2) {
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("We should never reach this state");
            }
            aVar.f6707c = ModernAsyncTask.Status.RUNNING;
            aVar.f6705a.f6716a = null;
            executor.execute(aVar.f6706b);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m18917d() {
        C5125e c5125e = (C5125e) this;
        Iterator it = c5125e.f33112k.iterator();
        int i10 = 0;
        while (true) {
            while (true) {
                if (!it.hasNext()) {
                    try {
                        c5125e.f33111j.tryAcquire(i10, 5L, TimeUnit.SECONDS);
                        return;
                    } catch (InterruptedException e10) {
                        Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                if (((AbstractC2544c) it.next()).mo7558f(c5125e)) {
                    i10++;
                }
            }
        }
    }
}
