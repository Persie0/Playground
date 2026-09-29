package p000;

/* JADX INFO: loaded from: classes.dex */
public final class uj3 implements mf1 {

    /* JADX INFO: renamed from: a */
    public final jf1 f63989a;

    public uj3(jf1 jf1Var) {
        this.f63989a = jf1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uj3) {
            return this.f63989a.equals(((uj3) obj).f63989a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f63989a.hashCode() * 31;
    }
}
