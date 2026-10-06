package p000;

import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hiu {

    /* JADX INFO: renamed from: a */
    public final int f27956a;

    /* JADX INFO: renamed from: b */
    public final int f27957b;

    /* JADX INFO: renamed from: c */
    public final double f27958c;

    /* JADX INFO: renamed from: d */
    public final int f27959d;

    public hiu() {
    }

    public hiu(int i, int i2, double d, int i3) {
        this.f27956a = i;
        this.f27957b = i2;
        this.f27958c = d;
        this.f27959d = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hiu)) {
            return false;
        }
        hiu hiuVar = (hiu) obj;
        if (this.f27956a == hiuVar.f27956a && this.f27957b == hiuVar.f27957b && Double.doubleToLongBits(this.f27958c) == Double.doubleToLongBits(hiuVar.f27958c)) {
            int i = this.f27959d;
            int i2 = hiuVar.f27959d;
            if (i == 0) {
                throw null;
            }
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.f27956a ^ 1000003) * 1000003) ^ this.f27957b;
        long jDoubleToLongBits = (Double.doubleToLongBits(this.f27958c) >>> 32) ^ Double.doubleToLongBits(this.f27958c);
        int i2 = this.f27959d;
        if (i2 == 0) {
            throw null;
        }
        return (((i * 1000003) ^ ((int) jDoubleToLongBits)) * 1000003) ^ i2;
    }

    public final String toString() {
        String str;
        int i = this.f27956a;
        int i2 = this.f27957b;
        double d = this.f27958c;
        switch (this.f27959d) {
            case 1:
                str = "AUDIO_VISUAL";
                break;
            case 2:
                str = "AUDIO_ONLY";
                break;
            default:
                str = "null";
                break;
        }
        return "CocktailPartyConfig{sampleRate=" + i + ", numberOfChannels=" + i2 + ", noiseFraction=" + d + ", inputType=" + str + aJFPpVSaoDO.NICi;
    }
}
