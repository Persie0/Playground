package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class fl3 {

    /* JADX INFO: renamed from: a */
    public final el3 f39245a;

    /* JADX INFO: renamed from: b */
    public final int[] f39246b;

    public fl3(el3 el3Var, int[] iArr) {
        if (iArr.length == 0) {
            ij6.m13959q();
            throw null;
        }
        this.f39245a = el3Var;
        int length = iArr.length;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f39246b = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.f39246b = new int[]{0};
            return;
        }
        int i2 = length - i;
        int[] iArr2 = new int[i2];
        this.f39246b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, i2);
    }

    /* JADX INFO: renamed from: a */
    public final fl3 m11932a(fl3 fl3Var) {
        el3 el3Var = fl3Var.f39245a;
        el3 el3Var2 = this.f39245a;
        if (!el3Var2.equals(el3Var)) {
            C3386nv.m17626m("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        int[] iArr = this.f39246b;
        if (iArr[0] == 0) {
            return fl3Var;
        }
        int[] iArr2 = fl3Var.f39246b;
        if (iArr2[0] == 0) {
            return this;
        }
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = iArr2[i - length] ^ iArr[i];
        }
        return new fl3(el3Var2, iArr3);
    }

    /* JADX INFO: renamed from: b */
    public final int m11933b() {
        return this.f39246b.length - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(m11933b() * 8);
        for (int iM11933b = m11933b(); iM11933b >= 0; iM11933b--) {
            int[] iArr = this.f39246b;
            int i = iArr[(iArr.length - 1) - iM11933b];
            if (i != 0) {
                if (i < 0) {
                    sb.append(" - ");
                    i = -i;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iM11933b == 0 || i != 1) {
                    el3 el3Var = this.f39245a;
                    if (i == 0) {
                        el3Var.getClass();
                        ij6.m13959q();
                        return null;
                    }
                    int i2 = el3Var.f37425b[i];
                    if (i2 == 0) {
                        sb.append('1');
                    } else if (i2 == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i2);
                    }
                }
                if (iM11933b != 0) {
                    if (iM11933b == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iM11933b);
                    }
                }
            }
        }
        return sb.toString();
    }
}
