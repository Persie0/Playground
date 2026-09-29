package p000;

/* JADX INFO: renamed from: zw */
/* JADX INFO: loaded from: classes.dex */
public final class C3848zw {

    /* JADX INFO: renamed from: a */
    public final x78 f72291a;

    public C3848zw(x78 x78Var) {
        this.f72291a = x78Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3848zw) && fa4.m11650l(this.f72291a, ((C3848zw) obj).f72291a);
    }

    public final int hashCode() {
        return this.f72291a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.f72291a + ", loaderKey=null)";
    }
}
