package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eax {

    /* JADX INFO: renamed from: a */
    public final float f13147a;

    /* JADX INFO: renamed from: b */
    public final float f13148b;

    /* JADX INFO: renamed from: c */
    public final float f13149c;

    public eax() {
    }

    public eax(float f, float f2, float f3) {
        this.f13147a = f;
        this.f13148b = f2;
        this.f13149c = f3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eax) {
            eax eaxVar = (eax) obj;
            if (Float.floatToIntBits(this.f13147a) == Float.floatToIntBits(eaxVar.f13147a) && Float.floatToIntBits(this.f13148b) == Float.floatToIntBits(eaxVar.f13148b) && Float.floatToIntBits(this.f13149c) == Float.floatToIntBits(eaxVar.f13149c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Float.floatToIntBits(this.f13147a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f13148b)) * 1000003) ^ Float.floatToIntBits(this.f13149c);
    }

    public final String toString() {
        return "AutoNightSightTriggerThresholds{easeInLogSb=" + this.f13147a + ", easeOutLogSb=" + this.f13148b + ", fullNightSightLogSb=" + this.f13149c + "}";
    }
}
