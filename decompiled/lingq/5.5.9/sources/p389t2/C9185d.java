package p389t2;

/* JADX INFO: renamed from: t2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9185d {

    /* JADX INFO: renamed from: a */
    public boolean f47724a;

    /* JADX INFO: renamed from: b */
    public a f47725b;

    /* JADX INFO: renamed from: c */
    public boolean f47726c;

    /* JADX INFO: renamed from: t2.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo3694a();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public final void m17519a() {
        synchronized (this) {
            try {
                if (this.f47724a) {
                    return;
                }
                this.f47724a = true;
                this.f47726c = true;
                a aVar = this.f47725b;
                if (aVar != null) {
                    try {
                        aVar.mo3694a();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            try {
                                this.f47726c = false;
                                notifyAll();
                                throw th2;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
                synchronized (this) {
                    this.f47726c = false;
                    notifyAll();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m17520b(a aVar) {
        synchronized (this) {
            while (this.f47726c) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f47725b == aVar) {
                return;
            }
            this.f47725b = aVar;
            if (this.f47724a) {
                aVar.mo3694a();
            }
        }
    }
}
