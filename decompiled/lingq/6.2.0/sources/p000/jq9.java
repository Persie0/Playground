package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class jq9 {

    /* JADX INFO: renamed from: a */
    public final float f46013a;

    /* JADX INFO: renamed from: b */
    public final float f46014b;

    /* JADX INFO: renamed from: c */
    public final float f46015c;

    public jq9(float f, float f2, float f3) {
        this.f46013a = f;
        this.f46014b = f2;
        this.f46015c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq9)) {
            return false;
        }
        jq9 jq9Var = (jq9) obj;
        return xj2.m24560b(this.f46013a, jq9Var.f46013a) && xj2.m24560b(this.f46014b, jq9Var.f46014b) && xj2.m24560b(this.f46015c, jq9Var.f46015c);
    }

    public final int hashCode() {
        return Float.hashCode(this.f46015c) + wq1.m24105a(Float.hashCode(this.f46013a) * 31, this.f46014b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        float f = this.f46013a;
        sb.append((Object) xj2.m24561c(f));
        sb.append(", right=");
        float f2 = this.f46014b;
        sb.append((Object) xj2.m24561c(f + f2));
        sb.append(", width=");
        sb.append((Object) xj2.m24561c(f2));
        sb.append(", contentWidth=");
        sb.append((Object) xj2.m24561c(this.f46015c));
        sb.append(')');
        return sb.toString();
    }
}
