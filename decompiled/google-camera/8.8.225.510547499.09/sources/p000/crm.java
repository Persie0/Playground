package p000;

import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class crm {

    /* JADX INFO: renamed from: a */
    public final boolean f9141a;

    /* JADX INFO: renamed from: b */
    public final boolean f9142b;

    /* JADX INFO: renamed from: c */
    public final long f9143c;

    /* JADX INFO: renamed from: d */
    public final int f9144d;

    /* JADX INFO: renamed from: e */
    public final int f9145e;

    /* JADX INFO: renamed from: f */
    public final float f9146f;

    public crm() {
    }

    public crm(boolean z, boolean z2, long j, int i, int i2, float f) {
        this.f9141a = z;
        this.f9142b = z2;
        this.f9143c = j;
        this.f9144d = i;
        this.f9145e = i2;
        this.f9146f = f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof crm) {
            crm crmVar = (crm) obj;
            if (this.f9141a == crmVar.f9141a && this.f9142b == crmVar.f9142b && this.f9143c == crmVar.f9143c && this.f9144d == crmVar.f9144d && this.f9145e == crmVar.f9145e && Float.floatToIntBits(this.f9146f) == Float.floatToIntBits(crmVar.f9146f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.f9141a ? 1237 : 1231;
        int i2 = true == this.f9142b ? 1231 : 1237;
        long j = this.f9143c;
        return ((((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f9144d) * 1000003) ^ this.f9145e) * 1000003) ^ Float.floatToIntBits(this.f9146f);
    }

    public final String toString() {
        return "CocktailPartyStats{isAudioFallback=" + this.f9141a + ", isMouthCovered=" + this.f9142b + ", getAudioFrameCount=" + this.f9143c + hsSUWRJfoeC.HvEUUYWpAFM + this.f9144d + ", getAudioMaxFrameDropCount=" + this.f9145e + ", getNoiseFraction=" + this.f9146f + "}";
    }
}
