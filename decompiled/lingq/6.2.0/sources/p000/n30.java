package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n30 extends lq1 {

    /* JADX INFO: renamed from: a */
    public final o30 f52251a;

    /* JADX INFO: renamed from: b */
    public final List f52252b;

    /* JADX INFO: renamed from: c */
    public final List f52253c;

    /* JADX INFO: renamed from: d */
    public final Boolean f52254d;

    /* JADX INFO: renamed from: e */
    public final kq1 f52255e;

    /* JADX INFO: renamed from: f */
    public final List f52256f;

    /* JADX INFO: renamed from: g */
    public final int f52257g;

    public n30(o30 o30Var, List list, List list2, Boolean bool, kq1 kq1Var, List list3, int i) {
        this.f52251a = o30Var;
        this.f52252b = list;
        this.f52253c = list2;
        this.f52254d = bool;
        this.f52255e = kq1Var;
        this.f52256f = list3;
        this.f52257g = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lq1)) {
            return false;
        }
        n30 n30Var = (n30) ((lq1) obj);
        if (!this.f52251a.equals(n30Var.f52251a)) {
            return false;
        }
        List list = n30Var.f52252b;
        List list2 = this.f52252b;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        List list3 = n30Var.f52253c;
        List list4 = this.f52253c;
        if (list4 == null) {
            if (list3 != null) {
                return false;
            }
        } else if (!list4.equals(list3)) {
            return false;
        }
        Boolean bool = n30Var.f52254d;
        Boolean bool2 = this.f52254d;
        if (bool2 == null) {
            if (bool != null) {
                return false;
            }
        } else if (!bool2.equals(bool)) {
            return false;
        }
        kq1 kq1Var = n30Var.f52255e;
        kq1 kq1Var2 = this.f52255e;
        if (kq1Var2 == null) {
            if (kq1Var != null) {
                return false;
            }
        } else if (!kq1Var2.equals(kq1Var)) {
            return false;
        }
        List list5 = n30Var.f52256f;
        List list6 = this.f52256f;
        if (list6 == null) {
            if (list5 != null) {
                return false;
            }
        } else if (!list6.equals(list5)) {
            return false;
        }
        return this.f52257g == n30Var.f52257g;
    }

    public final int hashCode() {
        int iHashCode = (this.f52251a.hashCode() ^ 1000003) * 1000003;
        List list = this.f52252b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f52253c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f52254d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        kq1 kq1Var = this.f52255e;
        int iHashCode5 = (iHashCode4 ^ (kq1Var == null ? 0 : kq1Var.hashCode())) * 1000003;
        List list3 = this.f52256f;
        return this.f52257g ^ ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.f52251a);
        sb.append(", customAttributes=");
        sb.append(this.f52252b);
        sb.append(", internalKeys=");
        sb.append(this.f52253c);
        sb.append(", background=");
        sb.append(this.f52254d);
        sb.append(", currentProcessDetails=");
        sb.append(this.f52255e);
        sb.append(", appProcessDetails=");
        sb.append(this.f52256f);
        sb.append(", uiOrientation=");
        return wq1.m24123s(sb, this.f52257g, "}");
    }
}
