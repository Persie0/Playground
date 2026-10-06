package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ldr implements ldq {

    /* JADX INFO: renamed from: b */
    public int f37998b;

    public ldr(int i) {
        this.f37998b = i;
    }

    @Override // p000.kyx
    /* JADX INFO: renamed from: a */
    public final laa mo15079a() {
        close();
        return kzz.f37797a;
    }

    /* JADX INFO: renamed from: c */
    protected abstract void mo15202c();

    @Override // p000.kyx, p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f37998b != 0) {
            mo15202c();
            this.f37998b = 0;
        }
    }
}
