package p000;

/* JADX INFO: loaded from: classes.dex */
public final class e95 extends h95 {

    /* JADX INFO: renamed from: b */
    public final float f36877b;

    /* JADX INFO: renamed from: c */
    public final String f36878c;

    public e95(String str, float f) {
        super(str);
        this.f36877b = f;
        this.f36878c = str;
    }

    @Override // p000.h95
    /* JADX INFO: renamed from: a */
    public final String mo188a() {
        return this.f36878c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e95)) {
            return false;
        }
        e95 e95Var = (e95) obj;
        return xj2.m24560b(this.f36877b, e95Var.f36877b) && fa4.m11650l(this.f36878c, e95Var.f36878c);
    }

    public final int hashCode() {
        return this.f36878c.hashCode() + (Float.hashCode(this.f36877b) * 31);
    }

    public final String toString() {
        return ux5.m22991n("SpaceVertical(height=", xj2.m24561c(this.f36877b), ", key=", this.f36878c, ")");
    }
}
