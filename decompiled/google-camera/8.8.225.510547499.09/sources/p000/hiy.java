package p000;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hiy {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f27960a;

    /* JADX INFO: renamed from: b */
    public final int f27961b;

    /* JADX INFO: renamed from: c */
    public final int f27962c;

    /* JADX INFO: renamed from: d */
    public final mpz f27963d;

    /* JADX INFO: renamed from: e */
    public final mrm f27964e;

    /* JADX INFO: renamed from: f */
    public final mrm f27965f;

    public hiy() {
    }

    public hiy(ByteBuffer byteBuffer, int i, int i2, mpz mpzVar, mrm mrmVar, mrm mrmVar2) {
        this.f27960a = byteBuffer;
        this.f27961b = i;
        this.f27962c = i2;
        this.f27963d = mpzVar;
        this.f27964e = mrmVar;
        this.f27965f = mrmVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hiy) {
            hiy hiyVar = (hiy) obj;
            if (this.f27960a.equals(hiyVar.f27960a) && this.f27961b == hiyVar.f27961b && this.f27962c == hiyVar.f27962c && this.f27963d.equals(hiyVar.f27963d) && this.f27964e.equals(hiyVar.f27964e) && this.f27965f.equals(hiyVar.f27965f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.f27960a.hashCode() ^ 1000003) * 1000003) ^ this.f27961b) * 1000003) ^ this.f27962c) * 1000003) ^ this.f27963d.hashCode()) * (-721379959)) ^ this.f27964e.hashCode()) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "VideoFrameInfo{imageBuffer=" + String.valueOf(this.f27960a) + ", widthPixels=" + this.f27961b + ", heightPixels=" + this.f27962c + ", colorspace=" + String.valueOf(this.f27963d) + ", rotationDegrees=0, syncedAudioSampleNumber=" + String.valueOf(this.f27964e) + ", face=" + String.valueOf(this.f27965f) + "}";
    }
}
