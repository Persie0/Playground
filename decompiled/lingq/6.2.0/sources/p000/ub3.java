package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ub3 implements sb3 {

    /* JADX INFO: renamed from: a */
    public final float[] f63668a;

    /* JADX INFO: renamed from: b */
    public final float[] f63669b;

    public ub3(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            C3386nv.m17626m("Array lengths must match and be nonzero");
            throw null;
        }
        this.f63668a = fArr;
        this.f63669b = fArr2;
    }

    @Override // p000.sb3
    /* JADX INFO: renamed from: a */
    public final float mo21205a(float f) {
        return gz8.m12974f(f, this.f63669b, this.f63668a);
    }

    @Override // p000.sb3
    /* JADX INFO: renamed from: b */
    public final float mo21206b(float f) {
        return gz8.m12974f(f, this.f63668a, this.f63669b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ub3)) {
            return false;
        }
        ub3 ub3Var = (ub3) obj;
        return Arrays.equals(this.f63668a, ub3Var.f63668a) && Arrays.equals(this.f63669b, ub3Var.f63669b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f63669b) + (Arrays.hashCode(this.f63668a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f63668a);
        string.getClass();
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.f63669b);
        string2.getClass();
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
