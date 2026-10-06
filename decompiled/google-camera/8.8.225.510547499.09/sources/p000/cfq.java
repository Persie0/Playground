package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cfq {

    /* JADX INFO: renamed from: a */
    public final float f5513a;

    /* JADX INFO: renamed from: b */
    public final float f5514b;

    /* JADX INFO: renamed from: c */
    public final float f5515c;

    public cfq() {
    }

    public cfq(byte[] bArr) {
        this.f5513a = 0.5f;
        this.f5514b = 0.29f;
        this.f5515c = -17.0f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cfq) {
            cfq cfqVar = (cfq) obj;
            if (Float.floatToIntBits(this.f5513a) == Float.floatToIntBits(cfqVar.f5513a) && Float.floatToIntBits(this.f5514b) == Float.floatToIntBits(cfqVar.f5514b) && Float.floatToIntBits(this.f5515c) == Float.floatToIntBits(cfqVar.f5515c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Float.floatToIntBits(this.f5513a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f5514b)) * 1000003) ^ Float.floatToIntBits(this.f5515c);
    }

    public final String toString() {
        return "DirtyLensConstants{dirtyRawScoreThreshold=" + this.f5513a + ", frameInfluenceDecayRate=" + this.f5514b + ", initialScore=" + this.f5515c + "}";
    }
}
