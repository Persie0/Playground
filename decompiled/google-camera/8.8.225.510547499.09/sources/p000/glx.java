package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class glx {

    /* JADX INFO: renamed from: a */
    public final float f25567a;

    /* JADX INFO: renamed from: b */
    public final float f25568b;

    public glx() {
    }

    public glx(float f, float f2) {
        this.f25567a = f;
        this.f25568b = f2;
    }

    /* JADX INFO: renamed from: a */
    public static glx m9482a(float f, float f2) {
        return new glx(f, f2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof glx) {
            glx glxVar = (glx) obj;
            if (Float.floatToIntBits(this.f25567a) == Float.floatToIntBits(glxVar.f25567a) && Float.floatToIntBits(this.f25568b) == Float.floatToIntBits(glxVar.f25568b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f25567a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f25568b);
    }

    public final String toString() {
        return "DualEvKnobPositions{brightness=" + this.f25567a + ", shadow=" + this.f25568b + "}";
    }
}
