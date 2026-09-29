package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class yc8 implements ad8 {

    /* JADX INFO: renamed from: a */
    public final fg8 f69637a;

    public yc8(fg8 fg8Var) {
        this.f69637a = fg8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yc8) && this.f69637a.equals(((yc8) obj).f69637a);
    }

    public final int hashCode() {
        return this.f69637a.hashCode();
    }

    public final String toString() {
        return "Speaking(state=" + this.f69637a + ")";
    }
}
