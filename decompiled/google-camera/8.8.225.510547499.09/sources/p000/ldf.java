package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ldf implements kyx {

    /* JADX INFO: renamed from: a */
    public final lbs f37976a;

    /* JADX INFO: renamed from: b */
    public final int f37977b;

    public ldf(lbs lbsVar, int i) {
        this.f37976a = lbsVar;
        this.f37977b = i;
    }

    @Override // p000.kyx
    /* JADX INFO: renamed from: a */
    public final laa mo15079a() {
        return this.f37976a.mo15079a();
    }

    @Override // p000.kyx, p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f37976a.close();
    }

    public final String toString() {
        return "GLIndexArray{buffer=" + this.f37976a.toString() + ", count=" + this.f37977b + ", glType=5123}";
    }
}
