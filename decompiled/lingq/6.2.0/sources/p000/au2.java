package p000;

/* JADX INFO: loaded from: classes.dex */
public final class au2 extends bu2 {

    /* JADX INFO: renamed from: c */
    public final Runnable f7506c;

    public au2(Runnable runnable, long j) {
        super(j);
        this.f7506c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7506c.run();
    }

    @Override // p000.bu2
    public final String toString() {
        return super.toString() + this.f7506c;
    }
}
