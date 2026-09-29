package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class at8 extends ct8 {

    /* JADX INFO: renamed from: a */
    public final sp8 f7471a;

    public at8(sp8 sp8Var) {
        sp8Var.getClass();
        this.f7471a = sp8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof at8) && fa4.m11650l(this.f7471a, ((at8) obj).f7471a);
    }

    public final int hashCode() {
        return this.f7471a.hashCode();
    }

    public final String toString() {
        return "OnFilterPageAction(action=" + this.f7471a + ")";
    }
}
