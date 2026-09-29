package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class hs7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final e28 f42890a;

    public hs7(e28 e28Var) {
        this.f42890a = e28Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hs7) && this.f42890a.equals(((hs7) obj).f42890a);
    }

    public final int hashCode() {
        return this.f42890a.hashCode();
    }

    public final String toString() {
        return "PagerAnchorReady(bounds=" + this.f42890a + ")";
    }
}
