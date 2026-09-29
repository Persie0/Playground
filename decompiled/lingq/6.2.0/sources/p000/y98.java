package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class y98 extends cb8 {

    /* JADX INFO: renamed from: a */
    public final rc8 f69513a;

    public y98(rc8 rc8Var) {
        rc8Var.getClass();
        this.f69513a = rc8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y98) && fa4.m11650l(this.f69513a, ((y98) obj).f69513a);
    }

    public final int hashCode() {
        return this.f69513a.hashCode();
    }

    public final String toString() {
        return "OnChoiceSelected(option=" + this.f69513a + ")";
    }
}
