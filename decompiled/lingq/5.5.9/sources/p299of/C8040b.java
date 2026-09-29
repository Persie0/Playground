package p299of;

/* JADX INFO: renamed from: of.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8040b {

    /* JADX INFO: renamed from: a */
    public final C8039a f43703a;

    /* JADX INFO: renamed from: b */
    public final int[] f43704b;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C8040b(C8039a c8039a, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f43703a = c8039a;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.f43704b = iArr;
            return;
        }
        int i10 = 1;
        while (i10 < length && iArr[i10] == 0) {
            i10++;
        }
        if (i10 == length) {
            this.f43704b = new int[]{0};
            return;
        }
        int i11 = length - i10;
        int[] iArr2 = new int[i11];
        this.f43704b = iArr2;
        System.arraycopy(iArr, i10, iArr2, 0, i11);
    }

    /* JADX INFO: renamed from: a */
    public final C8040b m15923a(C8040b c8040b) {
        C8039a c8039a = c8040b.f43703a;
        C8039a c8039a2 = this.f43703a;
        if (!c8039a2.equals(c8039a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m15924b()) {
            return c8040b;
        }
        if (c8040b.m15924b()) {
            return this;
        }
        int[] iArr = this.f43704b;
        int length = iArr.length;
        int[] iArr2 = c8040b.f43704b;
        if (length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length2 = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length2);
        for (int i10 = length2; i10 < iArr.length; i10++) {
            iArr3[i10] = iArr2[i10 - length2] ^ iArr[i10];
        }
        return new C8040b(c8039a2, iArr3);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m15924b() {
        return this.f43704b[0] == 0;
    }

    /* JADX INFO: renamed from: c */
    public final C8040b m15925c(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        C8039a c8039a = this.f43703a;
        if (i11 == 0) {
            return c8039a.f43699c;
        }
        int[] iArr = this.f43704b;
        int length = iArr.length;
        int[] iArr2 = new int[i10 + length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr2[i12] = c8039a.m15922a(iArr[i12], i11);
        }
        return new C8040b(c8039a, iArr2);
    }

    public final String toString() {
        int[] iArr = this.f43704b;
        StringBuilder sb2 = new StringBuilder((iArr.length - 1) * 8);
        int length = iArr.length;
        while (true) {
            while (true) {
                length--;
                if (length < 0) {
                    return sb2.toString();
                }
                int i10 = iArr[(iArr.length - 1) - length];
                if (i10 != 0) {
                    if (i10 < 0) {
                        sb2.append(" - ");
                        i10 = -i10;
                    } else if (sb2.length() > 0) {
                        sb2.append(" + ");
                    }
                    if (length == 0 || i10 != 1) {
                        C8039a c8039a = this.f43703a;
                        if (i10 == 0) {
                            c8039a.getClass();
                            throw new IllegalArgumentException();
                        }
                        int i11 = c8039a.f43698b[i10];
                        if (i11 == 0) {
                            sb2.append('1');
                        } else if (i11 == 1) {
                            sb2.append('a');
                        } else {
                            sb2.append("a^");
                            sb2.append(i11);
                        }
                    }
                    if (length == 0) {
                        break;
                    }
                    if (length == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(length);
                    }
                } else {
                    break;
                }
            }
        }
    }
}
