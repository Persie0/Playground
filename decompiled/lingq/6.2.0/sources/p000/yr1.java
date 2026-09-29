package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class yr1 {

    /* JADX INFO: renamed from: a */
    public final float[] f70312a;

    public yr1(float[] fArr) {
        this.f70312a = fArr;
        if (fArr.length == 8) {
            return;
        }
        C3386nv.m17626m("Points array size should be 8");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final float m25288a() {
        return this.f70312a[6];
    }

    /* JADX INFO: renamed from: b */
    public final float m25289b() {
        return this.f70312a[7];
    }

    /* JADX INFO: renamed from: c */
    public final q56 m25290c(eg7 eg7Var) {
        float[] fArr = new float[8];
        q56 q56Var = new q56(fArr);
        float[] fArr2 = this.f70312a;
        System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
        q56Var.m19660e(eg7Var, 0);
        q56Var.m19660e(eg7Var, 2);
        q56Var.m19660e(eg7Var, 4);
        q56Var.m19660e(eg7Var, 6);
        return q56Var;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m25291d() {
        float[] fArr = this.f70312a;
        return Math.abs(fArr[0] - m25288a()) < 1.0E-4f && Math.abs(fArr[1] - m25289b()) < 1.0E-4f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr1)) {
            return false;
        }
        return Arrays.equals(this.f70312a, ((yr1) obj).f70312a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f70312a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("anchor0: (");
        float[] fArr = this.f70312a;
        sb.append(fArr[0]);
        sb.append(", ");
        sb.append(fArr[1]);
        sb.append(") control0: (");
        sb.append(fArr[2]);
        sb.append(", ");
        sb.append(fArr[3]);
        sb.append("), control1: (");
        sb.append(fArr[4]);
        sb.append(", ");
        sb.append(fArr[5]);
        sb.append("), anchor1: (");
        sb.append(m25288a());
        sb.append(", ");
        sb.append(m25289b());
        sb.append(')');
        return sb.toString();
    }
}
