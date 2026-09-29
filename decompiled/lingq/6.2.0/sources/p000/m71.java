package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class m71 extends n71 {

    /* JADX INFO: renamed from: a */
    public final p91 f50694a;

    public m71(p91 p91Var) {
        this.f50694a = p91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m71) && this.f50694a.equals(((m71) obj).f50694a);
    }

    public final int hashCode() {
        return this.f50694a.f55799a.hashCode();
    }

    public final String toString() {
        return "SortFilter(state=" + this.f50694a + ")";
    }
}
