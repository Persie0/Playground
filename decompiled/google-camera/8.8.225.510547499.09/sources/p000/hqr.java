package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hqr {

    /* JADX INFO: renamed from: a */
    public final jxn f29179a;

    /* JADX INFO: renamed from: b */
    public final jxp f29180b;

    /* JADX INFO: renamed from: c */
    public final mrm f29181c;

    /* JADX INFO: renamed from: d */
    public final ctp f29182d;

    /* JADX INFO: renamed from: e */
    public final mrm f29183e;

    /* JADX INFO: renamed from: f */
    public final hqo f29184f;

    /* JADX INFO: renamed from: g */
    public final long f29185g;

    /* JADX INFO: renamed from: h */
    public final long f29186h;

    /* JADX INFO: renamed from: i */
    public final long f29187i;

    /* JADX INFO: renamed from: j */
    public final long f29188j;

    /* JADX INFO: renamed from: k */
    public final int f29189k;

    /* JADX INFO: renamed from: l */
    public final String f29190l;

    /* JADX INFO: renamed from: m */
    public final boolean f29191m;

    /* JADX INFO: renamed from: n */
    public final gyv f29192n;

    public hqr() {
    }

    public hqr(jxn jxnVar, jxp jxpVar, mrm mrmVar, ctp ctpVar, mrm mrmVar2, hqo hqoVar, long j, long j2, long j3, long j4, int i, String str, boolean z, gyv gyvVar) {
        this.f29179a = jxnVar;
        this.f29180b = jxpVar;
        this.f29181c = mrmVar;
        this.f29182d = ctpVar;
        this.f29183e = mrmVar2;
        this.f29184f = hqoVar;
        this.f29185g = j;
        this.f29186h = j2;
        this.f29187i = j3;
        this.f29188j = j4;
        this.f29189k = i;
        this.f29190l = str;
        this.f29191m = z;
        this.f29192n = gyvVar;
    }

    /* JADX INFO: renamed from: a */
    public static hqq m10635a() {
        hqq hqqVar = new hqq(null);
        hqqVar.m10629j(0L);
        hqqVar.m10627h(0L);
        hqqVar.m10622c(0L);
        hqqVar.m10623d(0L);
        return hqqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hqr) {
            hqr hqrVar = (hqr) obj;
            if (this.f29179a.equals(hqrVar.f29179a) && this.f29180b.equals(hqrVar.f29180b) && this.f29181c.equals(hqrVar.f29181c) && this.f29182d.equals(hqrVar.f29182d) && this.f29183e.equals(hqrVar.f29183e) && this.f29184f.equals(hqrVar.f29184f) && this.f29185g == hqrVar.f29185g && this.f29186h == hqrVar.f29186h && this.f29187i == hqrVar.f29187i && this.f29188j == hqrVar.f29188j && this.f29189k == hqrVar.f29189k && this.f29190l.equals(hqrVar.f29190l) && this.f29191m == hqrVar.f29191m && this.f29192n.equals(hqrVar.f29192n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.f29179a.hashCode() ^ 1000003) * 1000003) ^ this.f29180b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.f29182d.hashCode()) * 1000003) ^ this.f29183e.hashCode()) * 1000003) ^ this.f29184f.hashCode();
        long j = this.f29185g;
        long j2 = this.f29186h;
        long j3 = this.f29187i;
        long j4 = this.f29188j;
        return (((((((((((((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ this.f29189k) * 1000003) ^ this.f29190l.hashCode()) * 1000003) ^ (true != this.f29191m ? 1237 : 1231)) * 1000003) ^ this.f29192n.hashCode();
    }

    public final String toString() {
        return "TimelapseVideoFile{camcorderCaptureRate=" + String.valueOf(this.f29179a) + ", camcorderVideoResolution=" + String.valueOf(this.f29180b) + ", videoFile=" + String.valueOf(this.f29181c) + ", outputVideo=" + String.valueOf(this.f29182d) + ", location=" + String.valueOf(this.f29183e) + ", timelapseMode=" + String.valueOf(this.f29184f) + ", recordingDurationMs=" + this.f29185g + ", outputDurationMs=" + this.f29186h + ", frameCount=" + this.f29187i + ", frameDropped=" + this.f29188j + ", orientation=" + this.f29189k + ", title=" + this.f29190l + ", isSecureVideo=" + this.f29191m + ", shotInfo=" + String.valueOf(this.f29192n) + "}";
    }
}
