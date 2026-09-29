package p000;

/* JADX INFO: loaded from: classes.dex */
public final class x30 {

    /* JADX INFO: renamed from: a */
    public Double f67687a;

    /* JADX INFO: renamed from: b */
    public int f67688b;

    /* JADX INFO: renamed from: c */
    public boolean f67689c;

    /* JADX INFO: renamed from: d */
    public int f67690d;

    /* JADX INFO: renamed from: e */
    public long f67691e;

    /* JADX INFO: renamed from: f */
    public long f67692f;

    /* JADX INFO: renamed from: g */
    public byte f67693g;

    /* JADX INFO: renamed from: a */
    public final y30 m24252a() {
        if (this.f67693g == 31) {
            return new y30(this.f67687a, this.f67688b, this.f67689c, this.f67690d, this.f67691e, this.f67692f);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f67693g & 1) == 0) {
            sb.append(" batteryVelocity");
        }
        if ((this.f67693g & 2) == 0) {
            sb.append(" proximityOn");
        }
        if ((this.f67693g & 4) == 0) {
            sb.append(" orientation");
        }
        if ((this.f67693g & 8) == 0) {
            sb.append(" ramUsed");
        }
        if ((this.f67693g & 16) == 0) {
            sb.append(" diskUsed");
        }
        C3386nv.m17633t(wq1.m24120p("Missing required properties:", sb));
        return null;
    }
}
