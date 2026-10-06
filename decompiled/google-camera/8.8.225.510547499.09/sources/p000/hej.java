package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hej {

    /* JADX INFO: renamed from: a */
    public hev f27464a;

    /* JADX INFO: renamed from: b */
    private int f27465b;

    /* JADX INFO: renamed from: c */
    private int f27466c;

    /* JADX INFO: renamed from: d */
    private byte f27467d;

    /* JADX INFO: renamed from: a */
    public final hek m10154a() {
        hev hevVar;
        if (this.f27467d == 3 && (hevVar = this.f27464a) != null) {
            return new hek(this.f27465b, this.f27466c, hevVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f27467d & 1) == 0) {
            sb.append(" samplingPeriod");
        }
        if ((this.f27467d & 2) == 0) {
            sb.append(" successiveSamplesRequired");
        }
        if (this.f27464a == null) {
            sb.append(" suggestion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m10155b(int i) {
        this.f27465b = i;
        this.f27467d = (byte) (this.f27467d | 1);
    }

    /* JADX INFO: renamed from: c */
    public final void m10156c(int i) {
        this.f27466c = i;
        this.f27467d = (byte) (this.f27467d | 2);
    }
}
