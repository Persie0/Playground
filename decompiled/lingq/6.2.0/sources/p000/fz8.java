package p000;

/* JADX INFO: loaded from: classes.dex */
public final class fz8 {

    /* JADX INFO: renamed from: a */
    public final String f39963a;

    /* JADX INFO: renamed from: b */
    public final String f39964b;

    /* JADX INFO: renamed from: c */
    public final int f39965c;

    /* JADX INFO: renamed from: d */
    public final long f39966d;

    /* JADX INFO: renamed from: e */
    public final wz1 f39967e;

    /* JADX INFO: renamed from: f */
    public final String f39968f;

    /* JADX INFO: renamed from: g */
    public final String f39969g;

    public fz8(String str, String str2, int i, long j, wz1 wz1Var, String str3, String str4) {
        ux5.m22974A(str, str2, str4);
        this.f39963a = str;
        this.f39964b = str2;
        this.f39965c = i;
        this.f39966d = j;
        this.f39967e = wz1Var;
        this.f39968f = str3;
        this.f39969g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz8)) {
            return false;
        }
        fz8 fz8Var = (fz8) obj;
        return fa4.m11650l(this.f39963a, fz8Var.f39963a) && fa4.m11650l(this.f39964b, fz8Var.f39964b) && this.f39965c == fz8Var.f39965c && this.f39966d == fz8Var.f39966d && this.f39967e.equals(fz8Var.f39967e) && this.f39968f.equals(fz8Var.f39968f) && fa4.m11650l(this.f39969g, fz8Var.f39969g);
    }

    public final int hashCode() {
        return this.f39969g.hashCode() + ux5.m22980c((this.f39967e.hashCode() + ux5.m22981d(this.f39966d, wq1.m24106b(this.f39965c, ux5.m22980c(this.f39963a.hashCode() * 31, this.f39964b, 31), 31), 31)) * 31, this.f39968f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.f39963a);
        sb.append(", firstSessionId=");
        sb.append(this.f39964b);
        sb.append(", sessionIndex=");
        sb.append(this.f39965c);
        sb.append(", eventTimestampUs=");
        sb.append(this.f39966d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.f39967e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f39968f);
        sb.append(", firebaseAuthenticationToken=");
        return ux5.m22992o(sb, this.f39969g, ')');
    }
}
