package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class glt {

    /* JADX INFO: renamed from: a */
    public final float f25532a;

    /* JADX INFO: renamed from: b */
    public final float f25533b;

    /* JADX INFO: renamed from: c */
    public final float f25534c;

    /* JADX INFO: renamed from: d */
    public final int f25535d;

    public glt() {
    }

    public glt(float f, float f2, float f3, int i) {
        this.f25532a = f;
        this.f25533b = f2;
        this.f25534c = f3;
        this.f25535d = i;
    }

    /* JADX INFO: renamed from: a */
    public static glt m9449a(float f, float f2, float f3, int i) {
        return new glt(f, f2, f3, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof glt) {
            glt gltVar = (glt) obj;
            if (Float.floatToIntBits(this.f25532a) == Float.floatToIntBits(gltVar.f25532a) && Float.floatToIntBits(this.f25533b) == Float.floatToIntBits(gltVar.f25533b) && Float.floatToIntBits(this.f25534c) == Float.floatToIntBits(gltVar.f25534c) && this.f25535d == gltVar.f25535d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.f25532a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f25533b)) * 1000003) ^ Float.floatToIntBits(this.f25534c)) * 1000003) ^ this.f25535d;
    }

    public final String toString() {
        return "DualEvHdrSettings{shortTet=" + this.f25532a + ", longTet=" + this.f25533b + ", portraitTet=" + this.f25534c + ", exposureCompensationSteps=" + this.f25535d + "}";
    }
}
