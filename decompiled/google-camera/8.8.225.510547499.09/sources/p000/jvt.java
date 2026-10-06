package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jvt implements kba {

    /* JADX INFO: renamed from: b */
    public Runnable f34916b;

    /* JADX INFO: renamed from: c */
    private final jvs f34917c;

    /* JADX INFO: renamed from: a */
    public final Object f34915a = new Object();

    /* JADX INFO: renamed from: d */
    private final Runnable f34918d = new juz(this, 5);

    public jvt(jvs jvsVar) {
        this.f34917c = jvsVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m13586a() {
        synchronized (this.f34915a) {
            this.f34916b = null;
            this.f34917c.m13585b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13587b(Runnable runnable) {
        synchronized (this.f34915a) {
            this.f34916b = runnable;
            this.f34917c.execute(this.f34918d);
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f34915a) {
            if (this.f34916b != null) {
                this.f34916b = null;
            }
        }
        this.f34917c.close();
    }
}
