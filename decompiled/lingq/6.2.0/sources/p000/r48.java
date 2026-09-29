package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r48 {

    /* JADX INFO: renamed from: a */
    public final long f58696a;

    /* JADX INFO: renamed from: b */
    public final long f58697b;

    /* JADX INFO: renamed from: c */
    public final long f58698c;

    /* JADX INFO: renamed from: d */
    public final long f58699d;

    /* JADX INFO: renamed from: e */
    public final long f58700e;

    /* JADX INFO: renamed from: f */
    public final float[] f58701f;

    /* JADX INFO: renamed from: g */
    public final d16 f58702g;

    public r48(long j, long j2, long j3, long j4, long j5, float[] fArr, d16 d16Var) {
        this.f58696a = j;
        this.f58697b = j2;
        this.f58698c = j3;
        this.f58699d = j4;
        this.f58700e = j5;
        this.f58701f = fArr;
        this.f58702g = d16Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && r48.class == obj.getClass()) {
                r48 r48Var = (r48) obj;
                if (this.f58696a == r48Var.f58696a && this.f58697b == r48Var.f58697b && this.f58700e == r48Var.f58700e && f84.m11593b(this.f58698c, r48Var.f58698c) && f84.m11593b(this.f58699d, r48Var.f58699d)) {
                    float[] fArr = r48Var.f58701f;
                    float[] fArr2 = this.f58701f;
                    if (fArr2 == null) {
                        if (fArr == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (fArr == null) {
                        zEquals = false;
                    } else {
                        zEquals = fArr2.equals(fArr);
                    }
                    if (zEquals && this.f58702g.equals(r48Var.f58702g)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iM22981d = ux5.m22981d(this.f58699d, ux5.m22981d(this.f58698c, ux5.m22981d(this.f58700e, ux5.m22981d(this.f58697b, Long.hashCode(this.f58696a) * 31, 31), 31), 31), 31);
        float[] fArr = this.f58701f;
        return this.f58702g.hashCode() + ((iM22981d + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
