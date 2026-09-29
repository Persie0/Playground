package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class zc8 implements ad8 {

    /* JADX INFO: renamed from: a */
    public final ug8 f71366a;

    public zc8(ug8 ug8Var) {
        this.f71366a = ug8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zc8) && this.f71366a.equals(((zc8) obj).f71366a);
    }

    public final int hashCode() {
        return this.f71366a.hashCode();
    }

    public final String toString() {
        return "Unscramble(state=" + this.f71366a + ")";
    }
}
