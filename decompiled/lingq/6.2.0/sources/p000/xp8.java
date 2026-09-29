package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class xp8 extends zp8 {

    /* JADX INFO: renamed from: a */
    public final ev8 f68500a;

    public xp8(ev8 ev8Var) {
        this.f68500a = ev8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xp8) && this.f68500a.equals(((xp8) obj).f68500a);
    }

    public final int hashCode() {
        return this.f68500a.hashCode();
    }

    public final String toString() {
        return "Selection(selectionItem=" + this.f68500a + ")";
    }
}
