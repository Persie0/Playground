package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class yp8 extends zp8 {

    /* JADX INFO: renamed from: a */
    public final iv8 f70262a;

    public yp8(iv8 iv8Var) {
        this.f70262a = iv8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yp8) && this.f70262a.equals(((yp8) obj).f70262a);
    }

    public final int hashCode() {
        return this.f70262a.hashCode();
    }

    public final String toString() {
        return "SharedByUser(selectionUser=" + this.f70262a + ")";
    }
}
