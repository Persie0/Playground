package p218k9;

/* JADX INFO: renamed from: k9.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6631a {

    /* JADX INFO: renamed from: a */
    public int f37591a;

    /* JADX INFO: renamed from: l */
    public final void m13268l(int i10) {
        this.f37591a = i10 | this.f37591a;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m13269m(int i10) {
        return (this.f37591a & i10) == i10;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m13270o() {
        return m13269m(Integer.MIN_VALUE);
    }
}
