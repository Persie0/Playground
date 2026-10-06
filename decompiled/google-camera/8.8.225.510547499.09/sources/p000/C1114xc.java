package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: xc */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1114xc implements Cloneable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f47989a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long[] f47990b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f47991c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f47992d;

    public C1114xc() {
        this(10);
    }

    /* JADX INFO: renamed from: a */
    public final int m19543a(long j) {
        if (this.f47989a) {
            int i = this.f47992d;
            long[] jArr = this.f47990b;
            Object[] objArr = this.f47991c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != C1115xd.f47993a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f47989a = false;
            this.f47992d = i2;
        }
        return C1120xi.m19569b(this.f47990b, this.f47992d, j);
    }

    /* JADX INFO: renamed from: b */
    public final int m19544b() {
        if (this.f47989a) {
            int i = this.f47992d;
            long[] jArr = this.f47990b;
            Object[] objArr = this.f47991c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != C1115xd.f47993a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f47989a = false;
            this.f47992d = i2;
        }
        return this.f47992d;
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        C1114xc c1114xc = (C1114xc) objClone;
        c1114xc.f47990b = (long[]) this.f47990b.clone();
        c1114xc.f47991c = (Object[]) this.f47991c.clone();
        return c1114xc;
    }

    /* JADX INFO: renamed from: d */
    public final Object m19546d(long j) {
        Object obj;
        int iM19569b = C1120xi.m19569b(this.f47990b, this.f47992d, j);
        if (iM19569b < 0 || (obj = this.f47991c[iM19569b]) == C1115xd.f47993a) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: f */
    public final void m19548f() {
        int i = this.f47992d;
        Object[] objArr = this.f47991c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f47992d = 0;
        this.f47989a = false;
    }

    /* JADX INFO: renamed from: g */
    public final void m19549g(long j, Object obj) {
        int iM19569b = C1120xi.m19569b(this.f47990b, this.f47992d, j);
        if (iM19569b >= 0) {
            this.f47991c[iM19569b] = obj;
            return;
        }
        int iM19569b2 = iM19569b ^ (-1);
        int i = this.f47992d;
        if (iM19569b2 < i) {
            Object[] objArr = this.f47991c;
            if (objArr[iM19569b2] == C1115xd.f47993a) {
                this.f47990b[iM19569b2] = j;
                objArr[iM19569b2] = obj;
                return;
            }
        }
        if (this.f47989a) {
            long[] jArr = this.f47990b;
            if (i >= jArr.length) {
                Object[] objArr2 = this.f47991c;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    Object obj2 = objArr2[i3];
                    if (obj2 != C1115xd.f47993a) {
                        if (i3 != i2) {
                            jArr[i2] = jArr[i3];
                            objArr2[i2] = obj2;
                            objArr2[i3] = null;
                        }
                        i2++;
                    }
                }
                this.f47989a = false;
                this.f47992d = i2;
                iM19569b2 = C1120xi.m19569b(this.f47990b, i2, j) ^ (-1);
            }
        }
        int i4 = this.f47992d;
        long[] jArr2 = this.f47990b;
        if (i4 >= jArr2.length) {
            int iM19572e = C1120xi.m19572e(i4 + 1);
            long[] jArrCopyOf = Arrays.copyOf(jArr2, iM19572e);
            jArrCopyOf.getClass();
            this.f47990b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f47991c, iM19572e);
            objArrCopyOf.getClass();
            this.f47991c = objArrCopyOf;
        }
        int i5 = this.f47992d - iM19569b2;
        if (i5 != 0) {
            long[] jArr3 = this.f47990b;
            int i6 = iM19569b2 + 1;
            jArr3.getClass();
            jArr3.getClass();
            System.arraycopy(jArr3, iM19569b2, jArr3, i6, i5);
            Object[] objArr3 = this.f47991c;
            omn.m18693ag(objArr3, objArr3, i6, iM19569b2, this.f47992d);
        }
        this.f47990b[iM19569b2] = j;
        this.f47991c[iM19569b2] = obj;
        this.f47992d++;
    }

    public final String toString() {
        if (m19544b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f47992d * 28);
        sb.append('{');
        int i = this.f47992d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m19545c(i2));
            sb.append('=');
            Object objM19547e = m19547e(i2);
            if (objM19547e != sb) {
                sb.append(objM19547e);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C1114xc(int i) {
        if (i == 0) {
            this.f47990b = C1120xi.f48011b;
            this.f47991c = C1120xi.f48012c;
        } else {
            int iM19572e = C1120xi.m19572e(i);
            this.f47990b = new long[iM19572e];
            this.f47991c = new Object[iM19572e];
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m19545c(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f47992d)) {
            throw new IllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        if (this.f47989a) {
            long[] jArr = this.f47990b;
            Object[] objArr = this.f47991c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != C1115xd.f47993a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f47989a = false;
            this.f47992d = i3;
        }
        return this.f47990b[i];
    }

    /* JADX INFO: renamed from: e */
    public final Object m19547e(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f47992d)) {
            throw new IllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        if (this.f47989a) {
            long[] jArr = this.f47990b;
            Object[] objArr = this.f47991c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != C1115xd.f47993a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f47989a = false;
            this.f47992d = i3;
        }
        return this.f47991c[i];
    }
}
