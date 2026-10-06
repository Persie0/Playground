package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fkg {

    /* JADX INFO: renamed from: a */
    public final int f22370a;

    /* JADX INFO: renamed from: b */
    public final float f22371b;

    /* JADX INFO: renamed from: c */
    public final float f22372c;

    public fkg() {
    }

    public fkg(int i, float f, float f2) {
        this.f22370a = i;
        this.f22371b = f;
        this.f22372c = f2;
    }

    /* JADX INFO: renamed from: a */
    public static fkg m8506a(dtg dtgVar) {
        lku.m15669w(dtgVar.f12554a.length == 3);
        return new fkg((int) dtgVar.m6724b(0), dtgVar.m6724b(1), dtgVar.m6724b(2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fkg) {
            fkg fkgVar = (fkg) obj;
            if (this.f22370a == fkgVar.f22370a && Float.floatToIntBits(this.f22371b) == Float.floatToIntBits(fkgVar.f22371b) && Float.floatToIntBits(this.f22372c) == Float.floatToIntBits(fkgVar.f22372c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f22370a ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f22371b)) * 1000003) ^ Float.floatToIntBits(this.f22372c);
    }

    public final String toString() {
        return "CameraOrientation{deviceRotationDegrees=" + this.f22370a + ", pitchDegrees=" + this.f22371b + ", rollDegrees=" + this.f22372c + "}";
    }
}
