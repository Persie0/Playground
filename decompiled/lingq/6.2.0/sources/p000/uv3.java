package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class uv3 {

    /* JADX INFO: renamed from: a */
    public final String f64398a;

    /* JADX INFO: renamed from: b */
    public final int f64399b;

    public uv3(String str, int i) {
        this.f64398a = str;
        this.f64399b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv3)) {
            return false;
        }
        uv3 uv3Var = (uv3) obj;
        return this.f64398a.equals(uv3Var.f64398a) && this.f64399b == uv3Var.f64399b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f64399b) + (this.f64398a.hashCode() * 31);
    }

    public final String toString() {
        return "HowToLearnBullet(emoji=" + this.f64398a + ", textRes=" + this.f64399b + ")";
    }
}
