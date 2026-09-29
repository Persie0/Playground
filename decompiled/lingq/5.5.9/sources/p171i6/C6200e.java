package p171i6;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p003a2.C0009a;
import p192j6.InterfaceC6418g;
import p258m6.C7492l;

/* JADX INFO: renamed from: i6.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6200e<R> implements InterfaceFutureC6198c<R>, InterfaceC6201f<R> {

    /* JADX INFO: renamed from: a */
    public final int f36086a = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b */
    public final int f36087b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public R f36088c;

    /* JADX INFO: renamed from: d */
    public InterfaceC6199d f36089d;

    /* JADX INFO: renamed from: e */
    public boolean f36090e;

    /* JADX INFO: renamed from: f */
    public boolean f36091f;

    /* JADX INFO: renamed from: g */
    public boolean f36092g;

    /* JADX INFO: renamed from: h */
    public GlideException f36093h;

    /* JADX INFO: renamed from: i6.e$a */
    public static class a {
    }

    static {
        new a();
    }

    @Override // com.bumptech.glide.manager.InterfaceC2153i
    /* JADX INFO: renamed from: a */
    public final void mo6252a() {
    }

    @Override // com.bumptech.glide.manager.InterfaceC2153i
    /* JADX INFO: renamed from: b */
    public final void mo6253b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p171i6.InterfaceC6201f
    /* JADX INFO: renamed from: c */
    public final synchronized void mo9953c(Object obj, Object obj2) {
        try {
            this.f36091f = true;
            this.f36088c = obj;
            notifyAll();
        } finally {
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f36090e = true;
                notifyAll();
                InterfaceC6199d interfaceC6199d = null;
                if (z10) {
                    InterfaceC6199d interfaceC6199d2 = this.f36089d;
                    this.f36089d = null;
                    interfaceC6199d = interfaceC6199d2;
                }
                if (interfaceC6199d != null) {
                    interfaceC6199d.clear();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p171i6.InterfaceC6201f
    /* JADX INFO: renamed from: d */
    public final synchronized void mo9954d(GlideException glideException) {
        this.f36092g = true;
        this.f36093h = glideException;
        notifyAll();
    }

    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: e */
    public final synchronized void mo6262e(Object obj) {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: g */
    public final synchronized void mo12735g(InterfaceC6199d interfaceC6199d) {
        try {
            this.f36089d = interfaceC6199d;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.util.concurrent.Future
    public final R get() throws ExecutionException, InterruptedException {
        try {
            return m12739n(null);
        } catch (TimeoutException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // java.util.concurrent.Future
    public final R get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return m12739n(Long.valueOf(timeUnit.toMillis(j10)));
    }

    @Override // com.bumptech.glide.manager.InterfaceC2153i
    /* JADX INFO: renamed from: h */
    public final void mo6257h() {
    }

    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: i */
    public final void mo12736i(InterfaceC6418g interfaceC6418g) {
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f36090e;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        boolean z10;
        if (!this.f36090e && !this.f36091f) {
            if (!this.f36092g) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: j */
    public final synchronized void mo6263j(Drawable drawable) {
    }

    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: k */
    public final void mo12737k(Drawable drawable) {
    }

    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: l */
    public final void mo11551l(Drawable drawable) {
    }

    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: m */
    public final void mo12738m(InterfaceC6418g interfaceC6418g) {
        interfaceC6418g.mo6388b(this.f36086a, this.f36087b);
    }

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    /* JADX INFO: renamed from: n */
    public final synchronized R m12739n(Long l10) throws ExecutionException, InterruptedException, TimeoutException {
        try {
            if (!isDone() && !C7492l.m14887h()) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
            if (this.f36090e) {
                throw new CancellationException();
            }
            if (this.f36092g) {
                throw new ExecutionException(this.f36093h);
            }
            if (this.f36091f) {
                return this.f36088c;
            }
            if (l10 == null) {
                wait(0L);
            } else if (l10.longValue() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = l10.longValue() + jCurrentTimeMillis;
                while (!isDone() && jCurrentTimeMillis < jLongValue) {
                    wait(jLongValue - jCurrentTimeMillis);
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.f36092g) {
                throw new ExecutionException(this.f36093h);
            }
            if (this.f36090e) {
                throw new CancellationException();
            }
            if (!this.f36091f) {
                throw new TimeoutException();
            }
            return this.f36088c;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: p */
    public final synchronized InterfaceC6199d mo12740p() {
        return this.f36089d;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final String toString() {
        InterfaceC6199d interfaceC6199d;
        String str;
        String strM23l = C0009a.m23l(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            try {
                interfaceC6199d = null;
                if (this.f36090e) {
                    str = "CANCELLED";
                } else if (this.f36092g) {
                    str = "FAILURE";
                } else if (this.f36091f) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    interfaceC6199d = this.f36089d;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (interfaceC6199d == null) {
            return C0009a.m21i(strM23l, str, "]");
        }
        return strM23l + str + ", request=[" + interfaceC6199d + "]]";
    }
}
