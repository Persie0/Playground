package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class bt7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final zu8 f8991a;

    public bt7(zu8 zu8Var) {
        zu8Var.getClass();
        this.f8991a = zu8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bt7) && fa4.m11650l(this.f8991a, ((bt7) obj).f8991a);
    }

    public final int hashCode() {
        return this.f8991a.hashCode();
    }

    public final String toString() {
        return "TextSelected(selection=" + this.f8991a + ")";
    }
}
