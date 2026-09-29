package p000;

/* JADX INFO: loaded from: classes.dex */
public final class oj4 {

    /* JADX INFO: renamed from: a */
    public final Float f54460a;

    /* JADX INFO: renamed from: b */
    public go2 f54461b;

    public oj4(Float f, go2 go2Var) {
        this.f54460a = f;
        this.f54461b = go2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oj4)) {
            return false;
        }
        oj4 oj4Var = (oj4) obj;
        return oj4Var.f54460a.equals(this.f54460a) && fa4.m11650l(oj4Var.f54461b, this.f54461b);
    }

    public final int hashCode() {
        return this.f54461b.hashCode() + wq1.m24106b(0, this.f54460a.hashCode() * 31, 31);
    }
}
