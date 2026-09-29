package p000;

/* JADX INFO: loaded from: classes.dex */
public final class rl1 {

    /* JADX INFO: renamed from: a */
    public final long f59464a;

    /* JADX INFO: renamed from: b */
    public final long f59465b;

    /* JADX INFO: renamed from: c */
    public final long f59466c;

    /* JADX INFO: renamed from: d */
    public final long f59467d;

    /* JADX INFO: renamed from: e */
    public final long f59468e;

    public rl1(long j, long j2, long j3, long j4, long j5) {
        this.f59464a = j;
        this.f59465b = j2;
        this.f59466c = j3;
        this.f59467d = j4;
        this.f59468e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof rl1)) {
            return false;
        }
        rl1 rl1Var = (rl1) obj;
        return aa1.m199c(this.f59464a, rl1Var.f59464a) && aa1.m199c(this.f59465b, rl1Var.f59465b) && aa1.m199c(this.f59466c, rl1Var.f59466c) && aa1.m199c(this.f59467d, rl1Var.f59467d) && aa1.m199c(this.f59468e, rl1Var.f59468e);
    }

    public final int hashCode() {
        int i = aa1.f413l;
        return Long.hashCode(this.f59468e) + ux5.m22981d(this.f59467d, ux5.m22981d(this.f59466c, ux5.m22981d(this.f59465b, Long.hashCode(this.f59464a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        ux5.m23002y(this.f59464a, ", textColor=", sb);
        ux5.m23002y(this.f59465b, ", iconColor=", sb);
        ux5.m23002y(this.f59466c, ", disabledTextColor=", sb);
        ux5.m23002y(this.f59467d, ", disabledIconColor=", sb);
        sb.append((Object) aa1.m205i(this.f59468e));
        sb.append(')');
        return sb.toString();
    }
}
