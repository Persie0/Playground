package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ft3 {

    /* JADX INFO: renamed from: a */
    public final String f39611a;

    /* JADX INFO: renamed from: b */
    public final float f39612b;

    /* JADX INFO: renamed from: c */
    public final int f39613c;

    /* JADX INFO: renamed from: d */
    public final int f39614d;

    public ft3(String str, float f, int i, int i2) {
        str.getClass();
        this.f39611a = str;
        this.f39612b = f;
        this.f39613c = i;
        this.f39614d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft3)) {
            return false;
        }
        ft3 ft3Var = (ft3) obj;
        return fa4.m11650l(this.f39611a, ft3Var.f39611a) && Float.compare(this.f39612b, ft3Var.f39612b) == 0 && this.f39613c == ft3Var.f39613c && this.f39614d == ft3Var.f39614d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39614d) + wq1.m24106b(this.f39613c, wq1.m24105a(this.f39611a.hashCode() * 31, this.f39612b, 31), 31);
    }

    public final String toString() {
        return "ScriptRenderData(scriptText=" + this.f39611a + ", scriptWidth=" + this.f39612b + ", chunkStart=" + this.f39613c + ", chunkEnd=" + this.f39614d + ")";
    }
}
