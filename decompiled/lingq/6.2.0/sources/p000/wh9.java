package p000;

/* JADX INFO: loaded from: classes.dex */
public final class wh9 implements aoa {

    /* JADX INFO: renamed from: a */
    public final Object f66834a;

    public wh9(Object obj) {
        this.f66834a = obj;
    }

    @Override // p000.aoa
    /* JADX INFO: renamed from: a */
    public final Object mo367a(l77 l77Var) {
        return this.f66834a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wh9) && fa4.m11650l(this.f66834a, ((wh9) obj).f66834a);
    }

    public final int hashCode() {
        Object obj = this.f66834a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f66834a + ')';
    }
}
