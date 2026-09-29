package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class lc5 {

    /* JADX INFO: renamed from: a */
    public final String f49472a;

    /* JADX INFO: renamed from: b */
    public final float f49473b;

    /* JADX INFO: renamed from: c */
    public final float f49474c;

    public lc5(String str, float f, float f2) {
        str.getClass();
        this.f49472a = str;
        this.f49473b = f;
        this.f49474c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc5)) {
            return false;
        }
        lc5 lc5Var = (lc5) obj;
        return fa4.m11650l(this.f49472a, lc5Var.f49472a) && Float.compare(this.f49473b, lc5Var.f49473b) == 0 && Float.compare(this.f49474c, lc5Var.f49474c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f49474c) + wq1.m24105a(this.f49472a.hashCode() * 31, this.f49473b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineGraphCoordinates(title=");
        sb.append(this.f49472a);
        sb.append(", xCoordinate=");
        sb.append(this.f49473b);
        sb.append(", yCoordinate=");
        return wq1.m24121q(sb, this.f49474c, ")");
    }
}
