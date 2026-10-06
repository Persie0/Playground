package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class muv extends muz {

    /* JADX INFO: renamed from: a */
    public static final muv f41670a = new muv();
    private static final long serialVersionUID = 0;

    private muv() {
        super("");
    }

    private Object readResolve() {
        return f41670a;
    }

    @Override // p000.muz
    /* JADX INFO: renamed from: a */
    public final int compareTo(muz muzVar) {
        return muzVar == this ? 0 : 1;
    }

    @Override // p000.muz
    /* JADX INFO: renamed from: b */
    public final Comparable mo17001b() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override // p000.muz
    /* JADX INFO: renamed from: c */
    public final Comparable mo17002c(mve mveVar) {
        return mveVar.mo17019b();
    }

    @Override // p000.muz, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((muz) obj);
    }

    @Override // p000.muz
    /* JADX INFO: renamed from: d */
    public final Comparable mo17003d(mve mveVar) {
        throw new AssertionError();
    }

    @Override // p000.muz
    /* JADX INFO: renamed from: e */
    public final void mo17004e(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // p000.muz
    /* JADX INFO: renamed from: f */
    public final void mo17005f(StringBuilder sb) {
        sb.append("+∞)");
    }

    @Override // p000.muz
    /* JADX INFO: renamed from: g */
    public final boolean mo17006g(Comparable comparable) {
        return false;
    }

    @Override // p000.muz
    /* JADX INFO: renamed from: h */
    public final muz mo17007h(mve mveVar) {
        throw new AssertionError("this statement should be unreachable");
    }

    @Override // p000.muz
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // p000.muz
    /* JADX INFO: renamed from: i */
    public final muz mo17008i(mve mveVar) {
        throw new IllegalStateException();
    }

    public final String toString() {
        return "+∞";
    }
}
