package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class b46 {

    /* JADX INFO: renamed from: a */
    public final int f7925a;

    /* JADX INFO: renamed from: b */
    public final int f7926b;

    /* JADX INFO: renamed from: c */
    public final float f7927c;

    public b46(int i, float f, int i2) {
        this.f7925a = i;
        this.f7926b = i2;
        this.f7927c = f;
    }

    /* JADX INFO: renamed from: a */
    public static b46 m3286a(int i) {
        int i2 = (i >> 13) & 7;
        if (i2 == 0) {
            return null;
        }
        return new b46(i2, ((i & 511) * ((i & 512) != 0 ? -1 : 1)) / 10.0f, (i >> 10) & 7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b46)) {
            return false;
        }
        b46 b46Var = (b46) obj;
        return this.f7925a == b46Var.f7925a && this.f7926b == b46Var.f7926b && Float.compare(this.f7927c, b46Var.f7927c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7927c) + (((this.f7925a * 31) + this.f7926b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GainField{name=");
        sb.append(this.f7925a);
        sb.append(", originator=");
        sb.append(this.f7926b);
        sb.append(", gain=");
        return AbstractC3393o1.m17737l(sb, this.f7927c, '}');
    }
}
