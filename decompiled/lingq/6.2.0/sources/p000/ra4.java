package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ra4 {

    /* JADX INFO: renamed from: a */
    public final int f58962a;

    /* JADX INFO: renamed from: b */
    public final int f58963b;

    /* JADX INFO: renamed from: c */
    public final List f58964c;

    /* JADX INFO: renamed from: d */
    public final String f58965d;

    public ra4(int i, int i2, List list, String str) {
        list.getClass();
        str.getClass();
        this.f58962a = i;
        this.f58963b = i2;
        this.f58964c = list;
        this.f58965d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra4)) {
            return false;
        }
        ra4 ra4Var = (ra4) obj;
        return this.f58962a == ra4Var.f58962a && this.f58963b == ra4Var.f58963b && fa4.m11650l(this.f58964c, ra4Var.f58964c) && fa4.m11650l(this.f58965d, ra4Var.f58965d);
    }

    public final int hashCode() {
        return this.f58965d.hashCode() + ux5.m22979b(wq1.m24106b(this.f58963b, Integer.hashCode(this.f58962a) * 31, 31), 31, this.f58964c);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f58962a, this.f58963b, "InviteFriendsScreenState(signups=", ", points=", ", referrals=");
        sbM22994q.append(this.f58964c);
        sbM22994q.append(", referralLink=");
        sbM22994q.append(this.f58965d);
        sbM22994q.append(")");
        return sbM22994q.toString();
    }
}
