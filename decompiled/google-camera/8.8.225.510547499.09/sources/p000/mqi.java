package p000;

import java.nio.ByteBuffer;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mqi {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f41377a;

    /* JADX INFO: renamed from: b */
    public final int f41378b;

    /* JADX INFO: renamed from: c */
    public final int f41379c;

    /* JADX INFO: renamed from: d */
    public final mpz f41380d;

    /* JADX INFO: renamed from: e */
    public final Optional f41381e;

    /* JADX INFO: renamed from: f */
    private final Optional f41382f;

    public mqi() {
    }

    public mqi(ByteBuffer byteBuffer, int i, int i2, mpz mpzVar, Optional optional, Optional optional2) {
        this.f41377a = byteBuffer;
        this.f41378b = i;
        this.f41379c = i2;
        this.f41380d = mpzVar;
        this.f41382f = optional;
        this.f41381e = optional2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mqi) {
            mqi mqiVar = (mqi) obj;
            if (this.f41377a.equals(mqiVar.f41377a) && this.f41378b == mqiVar.f41378b && this.f41379c == mqiVar.f41379c && this.f41380d.equals(mqiVar.f41380d) && this.f41382f.equals(mqiVar.f41382f) && this.f41381e.equals(mqiVar.f41381e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.f41377a.hashCode() ^ 1000003) * 1000003) ^ this.f41378b) * 1000003) ^ this.f41379c) * 1000003) ^ this.f41380d.hashCode()) * (-721379959)) ^ this.f41382f.hashCode()) * 1000003) ^ this.f41381e.hashCode();
    }

    public final String toString() {
        return "VideoFrame{imageBuffer=" + String.valueOf(this.f41377a) + ", widthPixels=" + this.f41378b + ", heightPixels=" + this.f41379c + ", colorspace=" + String.valueOf(this.f41380d) + ", rotationDegrees=0, syncedAudioSampleNumber=" + String.valueOf(this.f41382f) + ", face=" + String.valueOf(this.f41381e) + "}";
    }
}
