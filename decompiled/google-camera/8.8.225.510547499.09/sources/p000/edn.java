package p000;

import com.google.android.apps.camera.jni.tracking.yRU.CswIK;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class edn {

    /* JADX INFO: renamed from: a */
    public final String f13502a;

    /* JADX INFO: renamed from: b */
    public final String f13503b;

    /* JADX INFO: renamed from: c */
    public final dzk f13504c;

    /* JADX INFO: renamed from: d */
    public final boolean f13505d;

    /* JADX INFO: renamed from: e */
    public final float f13506e;

    /* JADX INFO: renamed from: f */
    public final float f13507f;

    /* JADX INFO: renamed from: g */
    public final float f13508g;

    /* JADX INFO: renamed from: h */
    public final int f13509h;

    public edn() {
    }

    public edn(String str, String str2, dzk dzkVar, boolean z, float f, float f2, float f3, int i) {
        this.f13502a = str;
        this.f13503b = str2;
        this.f13504c = dzkVar;
        this.f13505d = z;
        this.f13506e = f;
        this.f13507f = f2;
        this.f13508g = f3;
        this.f13509h = i;
    }

    /* JADX INFO: renamed from: a */
    public static eay m7176a() {
        eay eayVar = new eay();
        eayVar.m7034f(false);
        eayVar.m7030b(-1.0f);
        eayVar.m7032d(-1.0f);
        eayVar.m7031c(-1.0f);
        eayVar.m7033e(0);
        return eayVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof edn)) {
            return false;
        }
        edn ednVar = (edn) obj;
        String str = this.f13502a;
        if (str != null ? str.equals(ednVar.f13502a) : ednVar.f13502a == null) {
            String str2 = this.f13503b;
            if (str2 != null ? str2.equals(ednVar.f13503b) : ednVar.f13503b == null) {
                dzk dzkVar = this.f13504c;
                if (dzkVar != null ? dzkVar.equals(ednVar.f13504c) : ednVar.f13504c == null) {
                    if (this.f13505d == ednVar.f13505d && Float.floatToIntBits(this.f13506e) == Float.floatToIntBits(ednVar.f13506e) && Float.floatToIntBits(this.f13507f) == Float.floatToIntBits(ednVar.f13507f) && Float.floatToIntBits(this.f13508g) == Float.floatToIntBits(ednVar.f13508g) && this.f13509h == ednVar.f13509h) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        return "Options{exifSoftwareSuffix=" + this.f13502a + CswIK.NQhxJdDjDn + this.f13503b + ", specialType=" + String.valueOf(this.f13504c) + ", secondary=" + this.f13505d + ", boostBigOption=" + this.f13506e + ", boostMidOption=" + this.f13507f + ", boostLittleOption=" + this.f13508g + ", cpuAffinityMask=" + this.f13509h + "}";
    }

    public final int hashCode() {
        String str = this.f13502a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f13503b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = iHashCode ^ 1000003;
        dzk dzkVar = this.f13504c;
        return (((((((((((((i * 1000003) ^ iHashCode2) * 1000003) ^ (dzkVar != null ? dzkVar.hashCode() : 0)) * 1000003) ^ (true != this.f13505d ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.f13506e)) * 1000003) ^ Float.floatToIntBits(this.f13507f)) * 1000003) ^ Float.floatToIntBits(this.f13508g)) * 1000003) ^ this.f13509h;
    }
}
