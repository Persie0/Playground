package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class vc3 implements t89 {

    /* JADX INFO: renamed from: a */
    public final t89 f65181a;

    public vc3(t89 t89Var) {
        t89Var.getClass();
        this.f65181a = t89Var;
    }

    @Override // p000.t89
    /* JADX INFO: renamed from: X */
    public void mo471X(aj0 aj0Var, long j) {
        this.f65181a.mo471X(aj0Var, j);
    }

    @Override // p000.t89, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        this.f65181a.close();
    }

    @Override // p000.t89, java.io.Flushable
    public void flush() {
        this.f65181a.flush();
    }

    @Override // p000.t89
    /* JADX INFO: renamed from: i */
    public final c1a mo484i() {
        return this.f65181a.mo484i();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f65181a + ')';
    }
}
