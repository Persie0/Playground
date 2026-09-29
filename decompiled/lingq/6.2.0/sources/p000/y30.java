package p000;

/* JADX INFO: loaded from: classes.dex */
public final class y30 extends mq1 {

    /* JADX INFO: renamed from: a */
    public final Double f69197a;

    /* JADX INFO: renamed from: b */
    public final int f69198b;

    /* JADX INFO: renamed from: c */
    public final boolean f69199c;

    /* JADX INFO: renamed from: d */
    public final int f69200d;

    /* JADX INFO: renamed from: e */
    public final long f69201e;

    /* JADX INFO: renamed from: f */
    public final long f69202f;

    public y30(Double d, int i, boolean z, int i2, long j, long j2) {
        this.f69197a = d;
        this.f69198b = i;
        this.f69199c = z;
        this.f69200d = i2;
        this.f69201e = j;
        this.f69202f = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mq1) {
            mq1 mq1Var = (mq1) obj;
            Double d = this.f69197a;
            if (d != null ? d.equals(((y30) mq1Var).f69197a) : ((y30) mq1Var).f69197a == null) {
                y30 y30Var = (y30) mq1Var;
                if (this.f69198b == y30Var.f69198b && this.f69199c == y30Var.f69199c && this.f69200d == y30Var.f69200d && this.f69201e == y30Var.f69201e && this.f69202f == y30Var.f69202f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d = this.f69197a;
        int iHashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.f69198b) * 1000003) ^ (this.f69199c ? 1231 : 1237)) * 1000003) ^ this.f69200d) * 1000003;
        long j = this.f69201e;
        long j2 = this.f69202f;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.f69197a);
        sb.append(", batteryVelocity=");
        sb.append(this.f69198b);
        sb.append(", proximityOn=");
        sb.append(this.f69199c);
        sb.append(", orientation=");
        sb.append(this.f69200d);
        sb.append(", ramUsed=");
        sb.append(this.f69201e);
        sb.append(", diskUsed=");
        return wq1.m24113i(this.f69202f, "}", sb);
    }
}
