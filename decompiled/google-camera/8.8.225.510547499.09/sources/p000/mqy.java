package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class mqy extends mqx {

    /* JADX INFO: renamed from: a */
    private final char f41458a;

    /* JADX INFO: renamed from: b */
    private final char f41459b;

    public mqy(char c, char c2) {
        lku.m15669w(c2 >= c);
        this.f41458a = c;
        this.f41459b = c2;
    }

    @Override // p000.mrc
    /* JADX INFO: renamed from: b */
    public final boolean mo16816b(char c) {
        return this.f41458a <= c && c <= this.f41459b;
    }

    public final String toString() {
        return "CharMatcher.inRange('" + mrc.m16817c(this.f41458a) + "', '" + mrc.m16817c(this.f41459b) + "')";
    }
}
