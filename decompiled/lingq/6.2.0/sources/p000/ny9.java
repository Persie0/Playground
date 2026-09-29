package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ny9 extends xy9 {

    /* JADX INFO: renamed from: a */
    public final yz7 f53418a;

    public ny9(yz7 yz7Var) {
        yz7Var.getClass();
        this.f53418a = yz7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ny9) && fa4.m11650l(this.f53418a, ((ny9) obj).f53418a);
    }

    public final int hashCode() {
        return this.f53418a.hashCode();
    }

    public final String toString() {
        return "UpdateReaderTheme(readerTheme=" + this.f53418a + ")";
    }
}
