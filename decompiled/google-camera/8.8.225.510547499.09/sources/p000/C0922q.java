package p000;

/* JADX INFO: renamed from: q */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C0922q {

    /* JADX INFO: renamed from: a */
    @Deprecated
    public final C0895p f47460a;

    /* JADX INFO: renamed from: b */
    @Deprecated
    public final C0895p f47461b;

    @Deprecated
    public C0922q(C0895p c0895p, C0895p c0895p2) {
        if (c0895p.f47133b == c0895p2.f47133b) {
            this.f47460a = c0895p;
            this.f47461b = c0895p2;
            return;
        }
        throw new IllegalArgumentException("Ranges must have the same number of visible decimals: " + c0895p.toString() + "~" + c0895p2.toString());
    }

    @Deprecated
    public final String toString() {
        String string = this.f47460a.toString();
        C0895p c0895p = this.f47461b;
        return string.concat(c0895p == this.f47460a ? "" : "~".concat(c0895p.toString()));
    }
}
