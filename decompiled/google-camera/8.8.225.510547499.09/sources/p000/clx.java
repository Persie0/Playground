package p000;

import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class clx {

    /* JADX INFO: renamed from: a */
    public final long f6182a;

    /* JADX INFO: renamed from: b */
    public final long f6183b;

    /* JADX INFO: renamed from: c */
    public final int f6184c;

    /* JADX INFO: renamed from: d */
    public final int f6185d;

    /* JADX INFO: renamed from: e */
    public final int f6186e;

    /* JADX INFO: renamed from: f */
    public final float f6187f;

    /* JADX INFO: renamed from: g */
    public final odh f6188g;

    public clx(long j, long j2, int i, int i2, int i3, float f, odh odhVar) {
        this.f6182a = j;
        this.f6183b = j2;
        this.f6184c = i;
        this.f6185d = i2;
        this.f6186e = i3;
        this.f6187f = f;
        if (odhVar == null) {
            throw new NullPointerException("Null frameMetadata");
        }
        this.f6188g = odhVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof clx) {
            clx clxVar = (clx) obj;
            if (this.f6182a == clxVar.f6182a && this.f6183b == clxVar.f6183b && this.f6184c == clxVar.f6184c && this.f6185d == clxVar.f6185d && this.f6186e == clxVar.f6186e && Float.floatToIntBits(this.f6187f) == Float.floatToIntBits(clxVar.f6187f) && this.f6188g.equals(clxVar.f6188g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM18134L;
        long j = this.f6182a;
        long j2 = this.f6183b;
        int iFloatToIntBits = ((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f6184c) * 1000003) ^ this.f6185d) * 1000003) ^ this.f6186e) * 1000003) ^ Float.floatToIntBits(this.f6187f);
        odh odhVar = this.f6188g;
        if (odhVar.m18142ac()) {
            iM18134L = odhVar.m18134L();
        } else {
            int iM18134L2 = odhVar.f44820aG;
            if (iM18134L2 == 0) {
                iM18134L2 = odhVar.m18134L();
                odhVar.f44820aG = iM18134L2;
            }
            iM18134L = iM18134L2;
        }
        return (iFloatToIntBits * 1000003) ^ iM18134L;
    }

    public final String toString() {
        return "CaptureReport{durationSinceLastCaptureMs=" + this.f6182a + ", durationFromCandidatetoSavingMs=" + this.f6183b + hsSUWRJfoeC.DraCeLL + this.f6184c + ", framesAnalyzedBeforeCandidate=" + this.f6185d + ", framesAnalyzedAfterCandidate=" + this.f6186e + ", analysisScore=" + this.f6187f + ", frameMetadata=" + this.f6188g.toString() + "}";
    }

    public clx() {
    }
}
