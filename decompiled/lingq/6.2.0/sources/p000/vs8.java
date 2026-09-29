package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class vs8 extends ws8 {

    /* JADX INFO: renamed from: a */
    public final uq8 f65863a;

    public vs8(uq8 uq8Var) {
        this.f65863a = uq8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vs8) && this.f65863a.equals(((vs8) obj).f65863a);
    }

    public final int hashCode() {
        return this.f65863a.hashCode();
    }

    public final String toString() {
        return "OnReportLesson(item=" + this.f65863a + ")";
    }
}
