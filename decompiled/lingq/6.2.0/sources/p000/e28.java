package p000;

/* JADX INFO: loaded from: classes.dex */
public final class e28 {

    /* JADX INFO: renamed from: e */
    public static final e28 f36619e = new e28(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a */
    public final float f36620a;

    /* JADX INFO: renamed from: b */
    public final float f36621b;

    /* JADX INFO: renamed from: c */
    public final float f36622c;

    /* JADX INFO: renamed from: d */
    public final float f36623d;

    public e28(float f, float f2, float f3, float f4) {
        this.f36620a = f;
        this.f36621b = f2;
        this.f36622c = f3;
        this.f36623d = f4;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10800a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.f36620a) & (fIntBitsToFloat < this.f36622c) & (fIntBitsToFloat2 >= this.f36621b) & (fIntBitsToFloat2 < this.f36623d);
    }

    /* JADX INFO: renamed from: b */
    public final long m10801b() {
        return (((long) Float.floatToRawIntBits(this.f36620a)) << 32) | (((long) Float.floatToRawIntBits(this.f36623d)) & 4294967295L);
    }

    /* JADX INFO: renamed from: c */
    public final long m10802c() {
        return (((long) Float.floatToRawIntBits(this.f36622c)) << 32) | (((long) Float.floatToRawIntBits(this.f36623d)) & 4294967295L);
    }

    /* JADX INFO: renamed from: d */
    public final long m10803d() {
        float f = this.f36622c;
        float f2 = this.f36620a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.f36623d;
        float f5 = this.f36621b;
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    /* JADX INFO: renamed from: e */
    public final long m10804e() {
        float f = this.f36622c - this.f36620a;
        return (((long) Float.floatToRawIntBits(this.f36623d - this.f36621b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e28)) {
            return false;
        }
        e28 e28Var = (e28) obj;
        return Float.compare(this.f36620a, e28Var.f36620a) == 0 && Float.compare(this.f36621b, e28Var.f36621b) == 0 && Float.compare(this.f36622c, e28Var.f36622c) == 0 && Float.compare(this.f36623d, e28Var.f36623d) == 0;
    }

    /* JADX INFO: renamed from: f */
    public final long m10805f() {
        return (((long) Float.floatToRawIntBits(this.f36620a)) << 32) | (((long) Float.floatToRawIntBits(this.f36621b)) & 4294967295L);
    }

    /* JADX INFO: renamed from: g */
    public final e28 m10806g(e28 e28Var) {
        return new e28(Math.max(this.f36620a, e28Var.f36620a), Math.max(this.f36621b, e28Var.f36621b), Math.min(this.f36622c, e28Var.f36622c), Math.min(this.f36623d, e28Var.f36623d));
    }

    /* JADX INFO: renamed from: h */
    public final boolean m10807h() {
        return (this.f36620a >= this.f36622c) | (this.f36621b >= this.f36623d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f36623d) + wq1.m24105a(wq1.m24105a(Float.hashCode(this.f36620a) * 31, this.f36621b, 31), this.f36622c, 31);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m10808i(e28 e28Var) {
        return (this.f36620a < e28Var.f36622c) & (e28Var.f36620a < this.f36622c) & (this.f36621b < e28Var.f36623d) & (e28Var.f36621b < this.f36623d);
    }

    /* JADX INFO: renamed from: j */
    public final e28 m10809j(float f, float f2) {
        return new e28(this.f36620a + f, this.f36621b + f2, this.f36622c + f, this.f36623d + f2);
    }

    /* JADX INFO: renamed from: k */
    public final e28 m10810k(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new e28(Float.intBitsToFloat(i) + this.f36620a, Float.intBitsToFloat(i2) + this.f36621b, Float.intBitsToFloat(i) + this.f36622c, Float.intBitsToFloat(i2) + this.f36623d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + do7.m10521H(this.f36620a) + ", " + do7.m10521H(this.f36621b) + ", " + do7.m10521H(this.f36622c) + ", " + do7.m10521H(this.f36623d) + ')';
    }
}
