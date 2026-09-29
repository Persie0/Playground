package p000;

/* JADX INFO: loaded from: classes.dex */
public final class m30 extends rq1 {

    /* JADX INFO: renamed from: a */
    public final long f50482a;

    /* JADX INFO: renamed from: b */
    public final String f50483b;

    /* JADX INFO: renamed from: c */
    public final lq1 f50484c;

    /* JADX INFO: renamed from: d */
    public final mq1 f50485d;

    /* JADX INFO: renamed from: e */
    public final nq1 f50486e;

    /* JADX INFO: renamed from: f */
    public final qq1 f50487f;

    public m30(long j, String str, lq1 lq1Var, mq1 mq1Var, nq1 nq1Var, qq1 qq1Var) {
        this.f50482a = j;
        this.f50483b = str;
        this.f50484c = lq1Var;
        this.f50485d = mq1Var;
        this.f50486e = nq1Var;
        this.f50487f = qq1Var;
    }

    /* JADX INFO: renamed from: a */
    public final l30 m16606a() {
        l30 l30Var = new l30();
        l30Var.f48952a = this.f50482a;
        l30Var.f48953b = this.f50483b;
        l30Var.f48954c = this.f50484c;
        l30Var.f48955d = this.f50485d;
        l30Var.f48956e = this.f50486e;
        l30Var.f48957f = this.f50487f;
        l30Var.f48958g = (byte) 1;
        return l30Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rq1) {
            m30 m30Var = (m30) ((rq1) obj);
            if (this.f50482a == m30Var.f50482a && this.f50483b.equals(m30Var.f50483b) && this.f50484c.equals(m30Var.f50484c) && this.f50485d.equals(m30Var.f50485d)) {
                nq1 nq1Var = m30Var.f50486e;
                nq1 nq1Var2 = this.f50486e;
                if (nq1Var2 != null ? nq1Var2.equals(nq1Var) : nq1Var == null) {
                    qq1 qq1Var = m30Var.f50487f;
                    qq1 qq1Var2 = this.f50487f;
                    if (qq1Var2 != null ? qq1Var2.equals(qq1Var) : qq1Var == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f50482a;
        int iHashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f50483b.hashCode()) * 1000003) ^ this.f50484c.hashCode()) * 1000003) ^ this.f50485d.hashCode()) * 1000003;
        nq1 nq1Var = this.f50486e;
        int iHashCode2 = (iHashCode ^ (nq1Var == null ? 0 : nq1Var.hashCode())) * 1000003;
        qq1 qq1Var = this.f50487f;
        return iHashCode2 ^ (qq1Var != null ? qq1Var.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f50482a + ", type=" + this.f50483b + ", app=" + this.f50484c + ", device=" + this.f50485d + ", log=" + this.f50486e + ", rollouts=" + this.f50487f + "}";
    }
}
