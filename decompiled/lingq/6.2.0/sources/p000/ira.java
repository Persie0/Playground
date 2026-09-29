package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ira extends qra {

    /* JADX INFO: renamed from: a */
    public final zu8 f44463a;

    public ira(zu8 zu8Var) {
        zu8Var.getClass();
        this.f44463a = zu8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ira) && fa4.m11650l(this.f44463a, ((ira) obj).f44463a);
    }

    public final int hashCode() {
        return this.f44463a.hashCode();
    }

    public final String toString() {
        return "TextSelected(selection=" + this.f44463a + ")";
    }
}
