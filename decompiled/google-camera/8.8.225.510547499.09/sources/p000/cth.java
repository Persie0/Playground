package p000;

import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cth {

    /* JADX INFO: renamed from: a */
    public keg f9425a;

    /* JADX INFO: renamed from: b */
    public File f9426b;

    /* JADX INFO: renamed from: c */
    public gyj f9427c;

    /* JADX INFO: renamed from: d */
    public gyn f9428d;

    /* JADX INFO: renamed from: e */
    public mrm f9429e;

    /* JADX INFO: renamed from: f */
    public krd f9430f;

    /* JADX INFO: renamed from: g */
    public kbc f9431g;

    /* JADX INFO: renamed from: h */
    public int f9432h;

    /* JADX INFO: renamed from: i */
    public long f9433i;

    /* JADX INFO: renamed from: j */
    public gyv f9434j;

    /* JADX INFO: renamed from: k */
    public byte f9435k;

    /* JADX INFO: renamed from: l */
    private long f9436l;

    /* JADX INFO: renamed from: m */
    private int f9437m;

    public cth() {
    }

    public cth(byte[] bArr) {
        this.f9429e = mqu.f41450a;
    }

    /* JADX INFO: renamed from: a */
    public final cti m5492a() {
        keg kegVar;
        File file;
        gyj gyjVar;
        gyn gynVar;
        krd krdVar;
        kbc kbcVar;
        gyv gyvVar;
        if (this.f9435k == 15 && (kegVar = this.f9425a) != null && (file = this.f9426b) != null && (gyjVar = this.f9427c) != null && (gynVar = this.f9428d) != null && (krdVar = this.f9430f) != null && (kbcVar = this.f9431g) != null && (gyvVar = this.f9434j) != null) {
            return new cti(kegVar, file, gyjVar, gynVar, this.f9429e, krdVar, kbcVar, this.f9432h, this.f9433i, this.f9436l, this.f9437m, gyvVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f9425a == null) {
            sb.append(" exifInfo");
        }
        if (this.f9426b == null) {
            sb.append(" filePath");
        }
        if (this.f9427c == null) {
            sb.append(" gcaMediaFile");
        }
        if (this.f9428d == null) {
            sb.append(" gcaMediaGroup");
        }
        if (this.f9430f == null) {
            sb.append(" mimeType");
        }
        if (this.f9431g == null) {
            sb.append(" size");
        }
        if ((this.f9435k & 1) == 0) {
            sb.append(" orientation");
        }
        if ((this.f9435k & 2) == 0) {
            sb.append(" takenTime");
        }
        if ((this.f9435k & 4) == 0) {
            sb.append(" requestProcessingTimeMilliseconds");
        }
        if ((this.f9435k & 8) == 0) {
            sb.append(" retries");
        }
        if (this.f9434j == null) {
            sb.append(" shotInfo");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m5493b(long j) {
        this.f9436l = j;
        this.f9435k = (byte) (this.f9435k | 4);
    }

    /* JADX INFO: renamed from: c */
    public final void m5494c(int i) {
        this.f9437m = i;
        this.f9435k = (byte) (this.f9435k | 8);
    }
}
