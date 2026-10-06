package p000;

import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cti {

    /* JADX INFO: renamed from: a */
    public final keg f9438a;

    /* JADX INFO: renamed from: b */
    public final File f9439b;

    /* JADX INFO: renamed from: c */
    public final gyj f9440c;

    /* JADX INFO: renamed from: d */
    public final gyn f9441d;

    /* JADX INFO: renamed from: e */
    public final kbc f9442e;

    /* JADX INFO: renamed from: f */
    public final long f9443f;

    /* JADX INFO: renamed from: g */
    public final int f9444g;

    /* JADX INFO: renamed from: h */
    public final gyv f9445h;

    /* JADX INFO: renamed from: i */
    private final mrm f9446i;

    /* JADX INFO: renamed from: j */
    private final krd f9447j;

    /* JADX INFO: renamed from: k */
    private final int f9448k;

    /* JADX INFO: renamed from: l */
    private final long f9449l;

    public cti() {
    }

    public cti(keg kegVar, File file, gyj gyjVar, gyn gynVar, mrm mrmVar, krd krdVar, kbc kbcVar, int i, long j, long j2, int i2, gyv gyvVar) {
        this.f9438a = kegVar;
        this.f9439b = file;
        this.f9440c = gyjVar;
        this.f9441d = gynVar;
        this.f9446i = mrmVar;
        this.f9447j = krdVar;
        this.f9442e = kbcVar;
        this.f9448k = i;
        this.f9449l = j;
        this.f9443f = j2;
        this.f9444g = i2;
        this.f9445h = gyvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cti) {
            cti ctiVar = (cti) obj;
            if (this.f9438a.equals(ctiVar.f9438a) && this.f9439b.equals(ctiVar.f9439b) && this.f9440c.equals(ctiVar.f9440c) && this.f9441d.equals(ctiVar.f9441d) && this.f9446i.equals(ctiVar.f9446i) && this.f9447j.equals(ctiVar.f9447j) && this.f9442e.equals(ctiVar.f9442e) && this.f9448k == ctiVar.f9448k && this.f9449l == ctiVar.f9449l && this.f9443f == ctiVar.f9443f && this.f9444g == ctiVar.f9444g && this.f9445h.equals(ctiVar.f9445h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.f9438a.hashCode() ^ 1000003) * 1000003) ^ this.f9439b.hashCode()) * 1000003) ^ this.f9440c.hashCode()) * 1000003) ^ this.f9441d.hashCode()) * 1000003) ^ this.f9446i.hashCode()) * 1000003) ^ this.f9447j.hashCode()) * 1000003) ^ this.f9442e.hashCode()) * 1000003) ^ this.f9448k;
        long j = this.f9449l;
        long j2 = this.f9443f;
        return (((((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f9444g) * 1000003) ^ this.f9445h.hashCode();
    }

    public final String toString() {
        return "CamcorderSnapshot{exifInfo=" + String.valueOf(this.f9438a) + ", filePath=" + String.valueOf(this.f9439b) + ", gcaMediaFile=" + String.valueOf(this.f9440c) + ", gcaMediaGroup=" + String.valueOf(this.f9441d) + ", location=" + String.valueOf(this.f9446i) + ", mimeType=" + String.valueOf(this.f9447j) + ", size=" + String.valueOf(this.f9442e) + ", orientation=" + this.f9448k + ", takenTime=" + this.f9449l + ", requestProcessingTimeMilliseconds=" + this.f9443f + ", retries=" + this.f9444g + ", shotInfo=" + String.valueOf(this.f9445h) + "}";
    }
}
