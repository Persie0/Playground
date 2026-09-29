package p136gc;

import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p176ib.C6272i;
import p402u0.C9369l;

/* JADX INFO: renamed from: gc.q */
/* JADX INFO: loaded from: classes.dex */
public final class C5761q<TResult> extends AbstractC5751g<TResult> {

    /* JADX INFO: renamed from: a */
    public final Object f34835a = new Object();

    /* JADX INFO: renamed from: b */
    public final C5759o f34836b = new C5759o();

    /* JADX INFO: renamed from: c */
    public boolean f34837c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f34838d;

    /* JADX INFO: renamed from: e */
    public Object f34839e;

    /* JADX INFO: renamed from: f */
    public Exception f34840f;

    @Override // p136gc.AbstractC5751g
    /* JADX INFO: renamed from: a */
    public final void mo12099a(ExecutorC5760p executorC5760p, InterfaceC5746b interfaceC5746b) {
        this.f34836b.m12119a(new C5756l(executorC5760p, interfaceC5746b));
        m12126t();
    }

    @Override // p136gc.AbstractC5751g
    /* JADX INFO: renamed from: b */
    public final void mo12100b(InterfaceC5747c interfaceC5747c) {
        this.f34836b.m12119a(new C5757m(C5753i.f34813a, interfaceC5747c));
        m12126t();
    }

    @Override // p136gc.AbstractC5751g
    /* JADX INFO: renamed from: c */
    public final void mo12101c(Executor executor, InterfaceC5747c interfaceC5747c) {
        this.f34836b.m12119a(new C5757m(executor, interfaceC5747c));
        m12126t();
    }

    @Override // p136gc.AbstractC5751g
    /* JADX INFO: renamed from: d */
    public final C5761q mo12102d(ExecutorC5760p executorC5760p, InterfaceC5748d interfaceC5748d) {
        this.f34836b.m12119a(new C5756l(executorC5760p, interfaceC5748d));
        m12126t();
        return this;
    }

    @Override // p136gc.AbstractC5751g
    /* JADX INFO: renamed from: e */
    public final C5761q mo12103e(Executor executor, InterfaceC5749e interfaceC5749e) {
        this.f34836b.m12119a(new C5757m(executor, interfaceC5749e));
        m12126t();
        return this;
    }

    @Override // p136gc.AbstractC5751g
    /* JADX INFO: renamed from: f */
    public final <TContinuationResult> AbstractC5751g<TContinuationResult> mo12104f(Executor executor, InterfaceC5745a<TResult, TContinuationResult> interfaceC5745a) {
        C5761q c5761q = new C5761q();
        this.f34836b.m12119a(new C5756l(executor, interfaceC5745a, c5761q, 0));
        m12126t();
        return c5761q;
    }

    @Override // p136gc.AbstractC5751g
    /* JADX INFO: renamed from: g */
    public final <TContinuationResult> AbstractC5751g<TContinuationResult> mo12105g(Executor executor, InterfaceC5745a<TResult, AbstractC5751g<TContinuationResult>> interfaceC5745a) {
        C5761q c5761q = new C5761q();
        this.f34836b.m12119a(new C5757m(executor, interfaceC5745a, c5761q));
        m12126t();
        return c5761q;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p136gc.AbstractC5751g
    /* JADX INFO: renamed from: h */
    public final Exception mo12106h() {
        Exception exc;
        synchronized (this.f34835a) {
            exc = this.f34840f;
        }
        return exc;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p136gc.AbstractC5751g
    /* JADX INFO: renamed from: i */
    public final TResult mo12107i() {
        TResult tresult;
        synchronized (this.f34835a) {
            C6272i.m12917k("Task is not yet complete", this.f34837c);
            if (this.f34838d) {
                throw new CancellationException("Task is already canceled.");
            }
            Exception exc = this.f34840f;
            if (exc != null) {
                throw new RuntimeExecutionException(exc);
            }
            tresult = (TResult) this.f34839e;
        }
        return tresult;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // p136gc.AbstractC5751g
    /* JADX INFO: renamed from: j */
    public final <X extends Throwable> TResult mo12108j(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f34835a) {
            C6272i.m12917k("Task is not yet complete", this.f34837c);
            if (this.f34838d) {
                throw new CancellationException("Task is already canceled.");
            }
            if (cls.isInstance(this.f34840f)) {
                throw cls.cast(this.f34840f);
            }
            Exception exc = this.f34840f;
            if (exc != null) {
                throw new RuntimeExecutionException(exc);
            }
            tresult = (TResult) this.f34839e;
        }
        return tresult;
    }

    @Override // p136gc.AbstractC5751g
    /* JADX INFO: renamed from: k */
    public final boolean mo12109k() {
        return this.f34838d;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p136gc.AbstractC5751g
    /* JADX INFO: renamed from: l */
    public final boolean mo12110l() {
        boolean z10;
        synchronized (this.f34835a) {
            z10 = this.f34837c;
        }
        return z10;
    }

    @Override // p136gc.AbstractC5751g
    /* JADX INFO: renamed from: m */
    public final boolean mo12111m() {
        boolean z10;
        synchronized (this.f34835a) {
            z10 = false;
            if (this.f34837c && !this.f34838d && this.f34840f == null) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // p136gc.AbstractC5751g
    /* JADX INFO: renamed from: n */
    public final <TContinuationResult> AbstractC5751g<TContinuationResult> mo12112n(Executor executor, InterfaceC5750f<TResult, TContinuationResult> interfaceC5750f) {
        C5761q c5761q = new C5761q();
        this.f34836b.m12119a(new C5756l(executor, interfaceC5750f, c5761q, 3));
        m12126t();
        return c5761q;
    }

    /* JADX INFO: renamed from: o */
    public final void m12121o(C9369l c9369l) {
        mo12104f(C5753i.f34813a, c9369l);
    }

    /* JADX INFO: renamed from: p */
    public final void m12122p(Exception exc) {
        if (exc == null) {
            throw new NullPointerException("Exception must not be null");
        }
        synchronized (this.f34835a) {
            try {
                m12125s();
                this.f34837c = true;
                this.f34840f = exc;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f34836b.m12120b(this);
    }

    /* JADX INFO: renamed from: q */
    public final void m12123q(Object obj) {
        synchronized (this.f34835a) {
            try {
                m12125s();
                this.f34837c = true;
                this.f34839e = obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f34836b.m12120b(this);
    }

    /* JADX INFO: renamed from: r */
    public final void m12124r() {
        synchronized (this.f34835a) {
            try {
                if (this.f34837c) {
                    return;
                }
                this.f34837c = true;
                this.f34838d = true;
                this.f34836b.m12120b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m12125s() {
        String strConcat;
        if (this.f34837c) {
            int i10 = DuplicateTaskCompletionException.f14660a;
            if (!mo12110l()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excMo12106h = mo12106h();
            if (excMo12106h != null) {
                strConcat = "failure";
            } else if (mo12111m()) {
                strConcat = "result ".concat(String.valueOf(mo12107i()));
            } else {
                strConcat = this.f34838d ? "cancellation" : "unknown issue";
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m12126t() {
        synchronized (this.f34835a) {
            if (this.f34837c) {
                this.f34836b.m12120b(this);
            }
        }
    }
}
