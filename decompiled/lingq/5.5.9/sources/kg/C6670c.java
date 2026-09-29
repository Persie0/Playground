package kg;

import android.os.Handler;
import com.kochava.core.task.action.internal.TaskFailedException;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.core.task.internal.TaskState;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p201jg.C6476a;
import p201jg.InterfaceC6477b;
import p243lg.C7360b;
import p243lg.RunnableC7359a;

/* JADX INFO: renamed from: kg.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6670c implements InterfaceC6671d {

    /* JADX INFO: renamed from: c */
    public final Handler f37744c;

    /* JADX INFO: renamed from: d */
    public final Handler f37745d;

    /* JADX INFO: renamed from: e */
    public final ExecutorService f37746e;

    /* JADX INFO: renamed from: f */
    public final TaskQueue f37747f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC6673f f37748g;

    /* JADX INFO: renamed from: h */
    public final C6476a f37749h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC6672e f37750i;

    /* JADX INFO: renamed from: j */
    public final RunnableC7359a f37751j;

    /* JADX INFO: renamed from: k */
    public final RunnableC7359a f37752k;

    /* JADX INFO: renamed from: l */
    public final RunnableC7359a f37753l;

    /* JADX INFO: renamed from: a */
    public final Object f37742a = new Object();

    /* JADX INFO: renamed from: b */
    public final Object f37743b = new Object();

    /* JADX INFO: renamed from: m */
    public volatile TaskState f37754m = TaskState.Pending;

    /* JADX INFO: renamed from: n */
    public volatile boolean f37755n = false;

    /* JADX INFO: renamed from: o */
    public Future<?> f37756o = null;

    /* JADX INFO: renamed from: kg.c$a */
    public final class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            boolean z11;
            synchronized (C6670c.this.f37742a) {
                if (C6670c.this.m13293e()) {
                    C6670c c6670c = C6670c.this;
                    TaskState taskState = TaskState.Completed;
                    c6670c.f37754m = taskState;
                    C6670c c6670c2 = C6670c.this;
                    synchronized (c6670c2.f37742a) {
                        synchronized (c6670c2.f37742a) {
                            try {
                                z10 = false;
                                z11 = c6670c2.f37754m == taskState;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (z11) {
                            z10 = c6670c2.f37755n;
                        }
                    }
                    InterfaceC6672e interfaceC6672e = C6670c.this.f37750i;
                    if (interfaceC6672e != null) {
                        interfaceC6672e.mo11770c(z10);
                    }
                    C6670c c6670c3 = C6670c.this;
                    ((C7360b) c6670c3.f37748g).m14766c(c6670c3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: kg.c$b */
    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            synchronized (C6670c.this.f37742a) {
                C6670c c6670c = C6670c.this;
                synchronized (c6670c.f37742a) {
                    z10 = c6670c.f37754m == TaskState.Delayed;
                }
                if (z10) {
                    C6670c.this.f37754m = TaskState.Queued;
                }
            }
            C6670c c6670c2 = C6670c.this;
            ((C7360b) c6670c2.f37748g).m14767d(c6670c2);
        }
    }

    /* JADX INFO: renamed from: kg.c$c */
    public final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!C6670c.this.m13293e()) {
                return;
            }
            try {
                synchronized (C6670c.this.f37743b) {
                    try {
                        InterfaceC6477b interfaceC6477b = C6670c.this.f37749h.f37049a;
                        if (interfaceC6477b != null) {
                            interfaceC6477b.mo11769b();
                        }
                        if (C6670c.this.m13293e()) {
                            C6670c.this.f37755n = true;
                            C6670c c6670c = C6670c.this;
                            c6670c.f37744c.post(c6670c.f37753l);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (TaskFailedException unused) {
                C6670c.this.f37755n = false;
            } catch (Throwable th3) {
                C6670c.this.f37755n = false;
                ((C7360b) C6670c.this.f37748g).m14768e(Thread.currentThread(), th3);
            }
        }
    }

    public C6670c(Handler handler, Handler handler2, ExecutorService executorService, TaskQueue taskQueue, InterfaceC6673f interfaceC6673f, C6476a c6476a, InterfaceC6672e interfaceC6672e) {
        this.f37744c = handler;
        this.f37745d = handler2;
        this.f37746e = executorService;
        this.f37747f = taskQueue;
        this.f37748g = interfaceC6673f;
        this.f37749h = c6476a;
        this.f37750i = interfaceC6672e;
        c cVar = new c();
        C7360b c7360b = (C7360b) interfaceC6673f;
        c7360b.getClass();
        this.f37751j = new RunnableC7359a(c7360b, cVar);
        this.f37752k = new RunnableC7359a(c7360b, new b());
        this.f37753l = new RunnableC7359a(c7360b, new a());
    }

    @Override // kg.InterfaceC6671d
    /* JADX INFO: renamed from: a */
    public final void mo13289a() {
        synchronized (this.f37742a) {
            if (mo13290b()) {
                this.f37754m = TaskState.Started;
                if (this.f37747f == TaskQueue.UI) {
                    this.f37745d.post(this.f37751j);
                } else {
                    this.f37756o = this.f37746e.submit(this.f37751j);
                }
            }
        }
    }

    @Override // kg.InterfaceC6671d
    /* JADX INFO: renamed from: b */
    public final boolean mo13290b() {
        boolean z10;
        synchronized (this.f37742a) {
            z10 = this.f37754m == TaskState.Queued;
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public final void m13291c() {
        boolean z10;
        boolean z11;
        synchronized (this.f37742a) {
            try {
                synchronized (this.f37742a) {
                    try {
                        z10 = true;
                        z11 = this.f37754m == TaskState.Pending;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (!z11) {
                    synchronized (this.f37742a) {
                        try {
                            if (this.f37754m != TaskState.Delayed) {
                                z10 = false;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (!z10 && !mo13290b() && !m13293e()) {
                        return;
                    }
                }
                m13292d();
                this.f37754m = TaskState.Completed;
                RunnableC6669b runnableC6669b = new RunnableC6669b(this);
                C7360b c7360b = (C7360b) this.f37748g;
                c7360b.getClass();
                this.f37744c.post(new RunnableC7359a(c7360b, runnableC6669b));
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final void m13292d() {
        synchronized (this.f37742a) {
            this.f37754m = TaskState.Pending;
            this.f37755n = false;
            synchronized (this.f37749h) {
            }
            this.f37744c.removeCallbacks(this.f37752k);
            this.f37744c.removeCallbacks(this.f37753l);
            this.f37745d.removeCallbacks(this.f37751j);
            Future<?> future = this.f37756o;
            if (future != null) {
                future.cancel(false);
                this.f37756o = null;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m13293e() {
        boolean z10;
        synchronized (this.f37742a) {
            z10 = this.f37754m == TaskState.Started;
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: f */
    public final void m13294f(long j10) {
        boolean z10;
        boolean z11;
        synchronized (this.f37742a) {
            synchronized (this.f37742a) {
                z10 = true;
                z11 = this.f37754m == TaskState.Pending;
            }
            if (!z11) {
                synchronized (this.f37742a) {
                    try {
                        if (this.f37754m != TaskState.Completed) {
                            z10 = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z10) {
                }
            }
            synchronized (this.f37749h) {
            }
            if (j10 <= 0) {
                this.f37754m = TaskState.Queued;
                RunnableC6668a runnableC6668a = new RunnableC6668a(this);
                C7360b c7360b = (C7360b) this.f37748g;
                c7360b.getClass();
                this.f37744c.post(new RunnableC7359a(c7360b, runnableC6668a));
            } else {
                this.f37754m = TaskState.Delayed;
                this.f37744c.postDelayed(this.f37752k, j10);
            }
        }
    }
}
