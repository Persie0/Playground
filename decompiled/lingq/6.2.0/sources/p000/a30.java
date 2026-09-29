package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a30 extends xp1 {

    /* JADX INFO: renamed from: a */
    public final int f154a;

    /* JADX INFO: renamed from: b */
    public final String f155b;

    /* JADX INFO: renamed from: c */
    public final int f156c;

    /* JADX INFO: renamed from: d */
    public final int f157d;

    /* JADX INFO: renamed from: e */
    public final long f158e;

    /* JADX INFO: renamed from: f */
    public final long f159f;

    /* JADX INFO: renamed from: g */
    public final long f160g;

    /* JADX INFO: renamed from: h */
    public final String f161h;

    /* JADX INFO: renamed from: i */
    public final List f162i;

    public a30(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, List list) {
        this.f154a = i;
        this.f155b = str;
        this.f156c = i2;
        this.f157d = i3;
        this.f158e = j;
        this.f159f = j2;
        this.f160g = j3;
        this.f161h = str2;
        this.f162i = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xp1) {
            a30 a30Var = (a30) ((xp1) obj);
            if (this.f154a == a30Var.f154a && this.f155b.equals(a30Var.f155b) && this.f156c == a30Var.f156c && this.f157d == a30Var.f157d && this.f158e == a30Var.f158e && this.f159f == a30Var.f159f && this.f160g == a30Var.f160g) {
                String str = a30Var.f161h;
                String str2 = this.f161h;
                if (str2 != null ? str2.equals(str) : str == null) {
                    List list = a30Var.f162i;
                    List list2 = this.f162i;
                    if (list2 != null ? list2.equals(list) : list == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f154a ^ 1000003) * 1000003) ^ this.f155b.hashCode()) * 1000003) ^ this.f156c) * 1000003) ^ this.f157d) * 1000003;
        long j = this.f158e;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f159f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f160g;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f161h;
        int iHashCode2 = (i3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f162i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApplicationExitInfo{pid=");
        sb.append(this.f154a);
        sb.append(", processName=");
        sb.append(this.f155b);
        sb.append(", reasonCode=");
        sb.append(this.f156c);
        sb.append(", importance=");
        sb.append(this.f157d);
        sb.append(", pss=");
        sb.append(this.f158e);
        sb.append(", rss=");
        sb.append(this.f159f);
        sb.append(", timestamp=");
        sb.append(this.f160g);
        sb.append(", traceFile=");
        sb.append(this.f161h);
        sb.append(", buildIdMappingForArch=");
        return hn1.m13356f(sb, this.f162i, "}");
    }
}
