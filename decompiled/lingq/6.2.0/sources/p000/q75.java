package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class q75 {

    /* JADX INFO: renamed from: a */
    public final r75 f57350a;

    public q75(r75 r75Var) {
        this.f57350a = r75Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q75) && this.f57350a.equals(((q75) obj).f57350a);
    }

    public final int hashCode() {
        return this.f57350a.hashCode();
    }

    public final String toString() {
        return "OnLevelSelected(level=" + this.f57350a + ")";
    }
}
