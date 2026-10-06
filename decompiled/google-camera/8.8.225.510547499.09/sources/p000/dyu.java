package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dyu {

    /* JADX INFO: renamed from: a */
    public final int f12933a;

    /* JADX INFO: renamed from: b */
    public final float f12934b;

    /* JADX INFO: renamed from: c */
    public final mrm f12935c;

    /* JADX INFO: renamed from: d */
    public final float f12936d;

    public dyu() {
    }

    public dyu(int i, float f, mrm mrmVar, float f2) {
        this.f12933a = i;
        this.f12934b = f;
        this.f12935c = mrmVar;
        this.f12936d = f2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyu) {
            dyu dyuVar = (dyu) obj;
            if (this.f12933a == dyuVar.f12933a && Float.floatToIntBits(this.f12934b) == Float.floatToIntBits(dyuVar.f12934b) && this.f12935c.equals(dyuVar.f12935c) && Float.floatToIntBits(this.f12936d) == Float.floatToIntBits(dyuVar.f12936d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f12933a ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f12934b)) * 1000003) ^ this.f12935c.hashCode()) * 1000003) ^ Float.floatToIntBits(this.f12936d);
    }

    public final String toString() {
        return "FrequentFaceTrueTone{id=" + this.f12933a + ", score=" + this.f12934b + ", toneProbabilities=" + String.valueOf(this.f12935c) + ", toneConfidence=" + this.f12936d + "}";
    }
}
