package com.google.android.exoplayer2;

import android.os.Looper;
import java.util.concurrent.TimeoutException;
import p479xa.C10129a;
import p479xa.C10145n;
import p479xa.InterfaceC10133c;

/* JADX INFO: renamed from: com.google.android.exoplayer2.w */
/* JADX INFO: loaded from: classes.dex */
public final class C2534w {

    /* JADX INFO: renamed from: a */
    public final b f13776a;

    /* JADX INFO: renamed from: b */
    public final a f13777b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC10133c f13778c;

    /* JADX INFO: renamed from: d */
    public int f13779d;

    /* JADX INFO: renamed from: e */
    public Object f13780e;

    /* JADX INFO: renamed from: f */
    public final Looper f13781f;

    /* JADX INFO: renamed from: g */
    public boolean f13782g;

    /* JADX INFO: renamed from: h */
    public boolean f13783h;

    /* JADX INFO: renamed from: i */
    public boolean f13784i;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.w$a */
    public interface a {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.w$b */
    public interface b {
        /* JADX INFO: renamed from: q */
        void mo6889q(int i10, Object obj) throws ExoPlaybackException;
    }

    public C2534w(C2415l c2415l, b bVar, AbstractC2382c0 abstractC2382c0, int i10, InterfaceC10133c interfaceC10133c, Looper looper) {
        this.f13777b = c2415l;
        this.f13776a = bVar;
        this.f13781f = looper;
        this.f13778c = interfaceC10133c;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m7515a(long j10) throws InterruptedException, TimeoutException {
        boolean z10;
        try {
            C10129a.m18992d(this.f13782g);
            C10129a.m18992d(this.f13781f.getThread() != Thread.currentThread());
            long jMo19015d = this.f13778c.mo19015d() + j10;
            while (true) {
                z10 = this.f13784i;
                if (z10 || j10 <= 0) {
                    break;
                }
                this.f13778c.mo19014c();
                wait(j10);
                j10 = jMo19015d - this.f13778c.mo19015d();
            }
            if (!z10) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m7516b(boolean z10) {
        try {
            this.f13783h = z10 | this.f13783h;
            this.f13784i = true;
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final void m7517c() {
        C10129a.m18992d(!this.f13782g);
        this.f13782g = true;
        C2415l c2415l = (C2415l) this.f13777b;
        synchronized (c2415l) {
            try {
                if (!c2415l.f12363U && c2415l.f12387j.getThread().isAlive()) {
                    c2415l.f12383h.mo19085k(14, this).m19164a();
                } else {
                    C10145n.m19099g("ExoPlayerImplInternal", "Ignoring messages sent after release.");
                    m7516b(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7518d(Object obj) {
        C10129a.m18992d(!this.f13782g);
        this.f13780e = obj;
    }

    /* JADX INFO: renamed from: e */
    public final void m7519e(int i10) {
        C10129a.m18992d(!this.f13782g);
        this.f13779d = i10;
    }
}
