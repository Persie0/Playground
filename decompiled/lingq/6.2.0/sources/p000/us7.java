package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class us7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final e28 f64296a;

    public us7(e28 e28Var) {
        e28Var.getClass();
        this.f64296a = e28Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof us7) && fa4.m11650l(this.f64296a, ((us7) obj).f64296a);
    }

    public final int hashCode() {
        return this.f64296a.hashCode();
    }

    public final String toString() {
        return "SentenceModePositioned(bounds=" + this.f64296a + ")";
    }
}
