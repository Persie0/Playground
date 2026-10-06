package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oqr extends oln {

    /* JADX INFO: renamed from: b */
    public static final olt f46430b = new olt();

    /* JADX INFO: renamed from: a */
    public final String f46431a;

    public oqr(String str) {
        super(f46430b);
        this.f46431a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oqr) && ooc.m18737c(this.f46431a, ((oqr) obj).f46431a);
    }

    public final int hashCode() {
        return this.f46431a.hashCode();
    }

    public final String toString() {
        return "CoroutineName(" + this.f46431a + ")";
    }
}
