package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class lu0 extends az3 {

    /* JADX INFO: renamed from: b */
    public final String f50129b;

    /* JADX INFO: renamed from: c */
    public final int f50130c;

    /* JADX INFO: renamed from: d */
    public final int f50131d;

    /* JADX INFO: renamed from: e */
    public final long f50132e;

    /* JADX INFO: renamed from: f */
    public final long f50133f;

    /* JADX INFO: renamed from: g */
    public final az3[] f50134g;

    public lu0(String str, int i, int i2, long j, long j2, az3[] az3VarArr) {
        super("CHAP");
        this.f50129b = str;
        this.f50130c = i;
        this.f50131d = i2;
        this.f50132e = j;
        this.f50133f = j2;
        this.f50134g = az3VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lu0.class != obj.getClass()) {
            return false;
        }
        lu0 lu0Var = (lu0) obj;
        return this.f50130c == lu0Var.f50130c && this.f50131d == lu0Var.f50131d && this.f50132e == lu0Var.f50132e && this.f50133f == lu0Var.f50133f && this.f50129b.equals(lu0Var.f50129b) && Arrays.equals(this.f50134g, lu0Var.f50134g);
    }

    public final int hashCode() {
        return this.f50129b.hashCode() + ((((((((527 + this.f50130c) * 31) + this.f50131d) * 31) + ((int) this.f50132e)) * 31) + ((int) this.f50133f)) * 31);
    }
}
