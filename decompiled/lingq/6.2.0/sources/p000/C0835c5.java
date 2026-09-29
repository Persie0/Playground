package p000;

/* JADX INFO: renamed from: c5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0835c5 extends AbstractC2952e5 {

    /* JADX INFO: renamed from: a */
    public final wy5 f9500a;

    public C0835c5(wy5 wy5Var) {
        this.f9500a = wy5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0835c5) && this.f9500a.equals(((C0835c5) obj).f9500a);
    }

    public final int hashCode() {
        return this.f9500a.hashCode();
    }

    public final String toString() {
        return "LevelMilestone(level=" + this.f9500a + ")";
    }
}
