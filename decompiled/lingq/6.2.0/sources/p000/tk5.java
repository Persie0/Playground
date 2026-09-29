package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class tk5 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f62442a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long[] f62443b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f62444c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f62445d;

    public tk5(int i) {
        if (i == 0) {
            this.f62443b = AbstractC3423or.f54765c;
            this.f62444c = AbstractC3423or.f54766d;
            return;
        }
        int i2 = i * 8;
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
        }
        int i5 = i2 / 8;
        this.f62443b = new long[i5];
        this.f62444c = new Object[i5];
    }

    /* JADX INFO: renamed from: a */
    public final void m22175a() {
        int i = this.f62445d;
        Object[] objArr = this.f62444c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f62445d = 0;
        this.f62442a = false;
    }

    /* JADX INFO: renamed from: b */
    public final Object m22176b(long j) {
        Object obj;
        int iM18262k = AbstractC3423or.m18262k(this.f62443b, this.f62445d, j);
        if (iM18262k < 0 || (obj = this.f62444c[iM18262k]) == do7.f35955d) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public final int m22177c(long j) {
        if (this.f62442a) {
            int i = this.f62445d;
            long[] jArr = this.f62443b;
            Object[] objArr = this.f62444c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != do7.f35955d) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f62442a = false;
            this.f62445d = i2;
        }
        return AbstractC3423or.m18262k(this.f62443b, this.f62445d, j);
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        tk5 tk5Var = (tk5) objClone;
        tk5Var.f62443b = (long[]) this.f62443b.clone();
        tk5Var.f62444c = (Object[]) this.f62444c.clone();
        return tk5Var;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m22178d() {
        return m22182h() == 0;
    }

    /* JADX INFO: renamed from: e */
    public final long m22179e(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f62445d)) {
            C3386nv.m17626m(ux5.m22988k(i, "Expected index to be within 0..size()-1, but was "));
            return 0L;
        }
        if (this.f62442a) {
            long[] jArr = this.f62443b;
            Object[] objArr = this.f62444c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != do7.f35955d) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f62442a = false;
            this.f62445d = i3;
        }
        return this.f62443b[i];
    }

    /* JADX INFO: renamed from: f */
    public final void m22180f(Object obj, long j) {
        Object obj2 = do7.f35955d;
        int iM18262k = AbstractC3423or.m18262k(this.f62443b, this.f62445d, j);
        if (iM18262k >= 0) {
            this.f62444c[iM18262k] = obj;
            return;
        }
        int i = ~iM18262k;
        int i2 = this.f62445d;
        if (i < i2) {
            Object[] objArr = this.f62444c;
            if (objArr[i] == obj2) {
                this.f62443b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f62442a) {
            long[] jArr = this.f62443b;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.f62444c;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.f62442a = false;
                this.f62445d = i3;
                i = ~AbstractC3423or.m18262k(this.f62443b, i3, j);
            }
        }
        int i5 = this.f62445d;
        if (i5 >= this.f62443b.length) {
            int i6 = (i5 + 1) * 8;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 8;
            this.f62443b = Arrays.copyOf(this.f62443b, i9);
            this.f62444c = Arrays.copyOf(this.f62444c, i9);
        }
        int i10 = this.f62445d;
        if (i10 - i != 0) {
            long[] jArr2 = this.f62443b;
            int i11 = i + 1;
            AbstractC3550rv.m20828V(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.f62444c;
            AbstractC3550rv.m20826T(i11, i, this.f62445d, objArr3, objArr3);
        }
        this.f62443b[i] = j;
        this.f62444c[i] = obj;
        this.f62445d++;
    }

    /* JADX INFO: renamed from: g */
    public final void m22181g(long j) {
        int iM18262k = AbstractC3423or.m18262k(this.f62443b, this.f62445d, j);
        if (iM18262k >= 0) {
            Object[] objArr = this.f62444c;
            Object obj = objArr[iM18262k];
            Object obj2 = do7.f35955d;
            if (obj != obj2) {
                objArr[iM18262k] = obj2;
                this.f62442a = true;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m22182h() {
        if (this.f62442a) {
            int i = this.f62445d;
            long[] jArr = this.f62443b;
            Object[] objArr = this.f62444c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != do7.f35955d) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f62442a = false;
            this.f62445d = i2;
        }
        return this.f62445d;
    }

    /* JADX INFO: renamed from: i */
    public final Object m22183i(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f62445d)) {
            C3386nv.m17626m(ux5.m22988k(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        if (this.f62442a) {
            long[] jArr = this.f62443b;
            Object[] objArr = this.f62444c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != do7.f35955d) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f62442a = false;
            this.f62445d = i3;
        }
        return this.f62444c[i];
    }

    public final String toString() {
        if (m22182h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f62445d * 28);
        sb.append('{');
        int i = this.f62445d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m22179e(i2));
            sb.append('=');
            Object objM22183i = m22183i(i2);
            if (objM22183i != sb) {
                sb.append(objM22183i);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ tk5(Object obj) {
        this(10);
    }
}
