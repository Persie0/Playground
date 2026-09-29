package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class t11 {

    /* JADX INFO: renamed from: a */
    public final e28 f61737a;

    /* JADX INFO: renamed from: b */
    public final float f61738b;

    /* JADX INFO: renamed from: c */
    public final float f61739c;

    public t11(e28 e28Var, float f, float f2) {
        this.f61737a = e28Var;
        this.f61738b = f;
        this.f61739c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t11)) {
            return false;
        }
        t11 t11Var = (t11) obj;
        return this.f61737a.equals(t11Var.f61737a) && Float.compare(this.f61738b, t11Var.f61738b) == 0 && Float.compare(this.f61739c, t11Var.f61739c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f61739c) + wq1.m24105a(this.f61737a.hashCode() * 31, this.f61738b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChunkAnchor(rect=");
        sb.append(this.f61737a);
        sb.append(", centerX=");
        sb.append(this.f61738b);
        sb.append(", width=");
        return wq1.m24121q(sb, this.f61739c, ")");
    }
}
