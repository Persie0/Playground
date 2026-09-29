package p000;

/* JADX INFO: loaded from: classes.dex */
public final class qe9 extends a84 {

    /* JADX INFO: renamed from: a */
    public int f57659a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pe9 f57660b;

    public qe9(pe9 pe9Var) {
        this.f57660b = pe9Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f57659a < this.f57660b.m19081e();
    }

    @Override // p000.a84
    public final int nextInt() {
        int i = this.f57659a;
        this.f57659a = i + 1;
        return this.f57660b.m19079c(i);
    }
}
