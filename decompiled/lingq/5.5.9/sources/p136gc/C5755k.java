package p136gc;

import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: gc.k */
/* JADX INFO: loaded from: classes.dex */
public final class C5755k<T> implements InterfaceC5749e, InterfaceC5748d, InterfaceC5746b {

    /* JADX INFO: renamed from: a */
    public final Object f34816a = new Object();

    /* JADX INFO: renamed from: b */
    public final int f34817b;

    /* JADX INFO: renamed from: c */
    public final C5761q f34818c;

    /* JADX INFO: renamed from: d */
    public int f34819d;

    /* JADX INFO: renamed from: e */
    public int f34820e;

    /* JADX INFO: renamed from: f */
    public int f34821f;

    /* JADX INFO: renamed from: g */
    public Exception f34822g;

    /* JADX INFO: renamed from: h */
    public boolean f34823h;

    public C5755k(int i10, C5761q c5761q) {
        this.f34817b = i10;
        this.f34818c = c5761q;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p136gc.InterfaceC5749e
    /* JADX INFO: renamed from: a */
    public final void mo12098a(T t10) {
        synchronized (this.f34816a) {
            this.f34819d++;
            m12117c();
        }
    }

    @Override // p136gc.InterfaceC5748d
    /* JADX INFO: renamed from: b */
    public final void mo12097b(Exception exc) {
        synchronized (this.f34816a) {
            this.f34820e++;
            this.f34822g = exc;
            m12117c();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12117c() {
        int i10 = this.f34819d + this.f34820e + this.f34821f;
        int i11 = this.f34817b;
        if (i10 == i11) {
            Exception exc = this.f34822g;
            C5761q c5761q = this.f34818c;
            if (exc == null) {
                if (this.f34823h) {
                    c5761q.m12124r();
                    return;
                } else {
                    c5761q.m12123q(null);
                    return;
                }
            }
            c5761q.m12122p(new ExecutionException(this.f34820e + " out of " + i11 + " underlying tasks failed", this.f34822g));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p136gc.InterfaceC5746b
    /* JADX INFO: renamed from: d */
    public final void mo12096d() {
        synchronized (this.f34816a) {
            this.f34821f++;
            this.f34823h = true;
            m12117c();
        }
    }
}
