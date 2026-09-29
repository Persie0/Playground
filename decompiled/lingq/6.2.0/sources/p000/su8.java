package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class su8 extends uu8 {

    /* JADX INFO: renamed from: a */
    public final c39 f61446a;

    public su8(c39 c39Var) {
        this.f61446a = c39Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof su8) && this.f61446a.equals(((su8) obj).f61446a);
    }

    public final int hashCode() {
        return this.f61446a.hashCode();
    }

    public final String toString() {
        return "OnItemSelected(item=" + this.f61446a + ")";
    }
}
