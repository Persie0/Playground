package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class mqz extends mqx {

    /* JADX INFO: renamed from: a */
    private final char f41460a;

    public mqz(char c) {
        this.f41460a = c;
    }

    @Override // p000.mrc
    /* JADX INFO: renamed from: b */
    public final boolean mo16816b(char c) {
        return c == this.f41460a;
    }

    public final String toString() {
        return "CharMatcher.is('" + mrc.m16817c(this.f41460a) + "')";
    }
}
