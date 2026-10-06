package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class moj implements Runnable, mor {

    /* JADX INFO: renamed from: a */
    private moq f41187a;

    /* JADX INFO: renamed from: b */
    private moq f41188b;

    /* JADX INFO: renamed from: c */
    private final boolean f41189c = lij.m15456z(null);

    /* JADX INFO: renamed from: d */
    private boolean f41190d;

    /* JADX INFO: renamed from: e */
    private boolean f41191e;

    /* JADX INFO: renamed from: f */
    private boolean f41192f;

    public moj(moq moqVar, boolean z) {
        this.f41192f = false;
        this.f41187a = moqVar;
        this.f41188b = moqVar;
        this.f41192f = z;
    }

    /* JADX INFO: renamed from: b */
    private final void m16708b() {
        this.f41190d = true;
        if (this.f41189c && !this.f41191e) {
            lij.m15455y();
        }
        this.f41187a = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m16709a(nps npsVar) {
        if (this.f41190d) {
            throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        }
        if (this.f41191e) {
            throw new IllegalStateException("Signal is already attached to future");
        }
        this.f41191e = true;
        npsVar.mo2282d(this, not.INSTANCE);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f41190d || !this.f41191e) {
            lij.m15454x(lcg.f37918c);
        } else {
            m16708b();
        }
    }

    @Override // p000.mor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        moq moqVar = this.f41188b;
        try {
            this.f41188b = null;
            if (!this.f41191e) {
                if (this.f41190d) {
                    throw new IllegalStateException("Span was already closed!");
                }
                m16708b();
            }
            if (moqVar != null) {
                moqVar.close();
            }
            if (this.f41192f) {
                moz.m16725c((moy) moz.f41223b.get(), moi.f41185a);
            }
        } catch (Throwable th) {
            if (moqVar != null) {
                try {
                    moqVar.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception e) {
                    }
                }
            }
            throw th;
        }
    }
}
